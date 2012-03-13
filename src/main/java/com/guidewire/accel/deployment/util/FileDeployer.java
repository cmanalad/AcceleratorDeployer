package com.guidewire.accel.deployment.util;

import com.guidewire.accel.util.FileUtil;

import java.io.File;

/**
 * User: afogleson
 * Date: 3/11/12
 * Time: 12:21 AM
 * <p/>
 * This class has the primary responsibility to deploy a file. essentially it is a simple file copy but it
 * employs some backup strategy.
 * <p/>
 */
public class FileDeployer {

  /**
   * deploy a file
   *
   * @param fromDir  The directory where the file is right now
   * @param fileName the filename of the file to deploy
   * @param toDir    the directory to deploy to
   * @return true if the file deploys.
   */
  public static boolean deployFile(File fromDir, String fileName, File toDir) {
    boolean deployed = true;

    try {
      File fromFile = new File(fromDir.getAbsolutePath() + File.separator + fileName);
      if (!toDir.exists()) {
        toDir.mkdirs();
      }
      File toFile = new File(toDir.getAbsolutePath() + File.separator + fileName);
      if (toFile.exists()) {
        /*
           So Addmittedly this is not done well enough yet. I have some thoughts on this...
           namely...
             1) We should detect whether the existing file is the original or not
             2) We should always backup, but leave it to the developer to revert to something other than the original
                a) that may imply a choice at undeployment. revert to original or revert to the one that we are backing up right here.
                b) it gets terribly complicated since we do not know the order of accelerator install this could be a file modified in another accelerator, and so on.
                   so we probably need to warn if this is not the original file.
             3) naming conventions. if it is the "original" that is there is no pcfname.X.BAK then we create pcfname.orig.bak
                otherwise it becomes pcfname.accelname.bak now you can offer choices at undeploy time.
        */
        File backup = new File(toFile.getAbsolutePath() + ".orig.bak");
        FileUtil.copyFileToFile(toFile, backup);
        //You have to create the file again if you are going to delete it
        String path = toFile.getAbsolutePath();
        toFile.delete();
        toFile = new File(path);
      }
      //Now that we have any possible backup made, lets go ahead and move this one over.
      FileUtil.copyFileToFile(fromFile, toFile);
    }
    catch (Throwable t) {
      deployed = false;
    }
    return deployed;
  }
}
