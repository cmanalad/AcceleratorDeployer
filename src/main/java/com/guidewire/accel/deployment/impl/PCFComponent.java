package com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.DeployableComponent;
import com.guidewire.accel.util.AccleratorHelper;
import com.guidewire.accel.util.FileUtil;

import java.io.File;

/**
 * User: afogleson
 * Date: 3/10/12
 * Time: 1:39 PM
 */
public class PCFComponent implements DeployableComponent {

  private File pcfPage;
  private File accelConfigRoot;

  public PCFComponent(File page, File accelConfigRoot) {
    pcfPage = page;
    this.accelConfigRoot = accelConfigRoot;
  }

  @Override
  public boolean deploy() {
    boolean deployed = false;
    try {
      AccleratorHelper helper = AccleratorHelper.getInstance();
      String pcfRoot = helper.getPCFRoot().getAbsolutePath();
      String accelConfigPathBase = accelConfigRoot.getAbsolutePath();
      String pathToPCFFromRoot = pcfPage.getAbsolutePath().substring(accelConfigPathBase.length());
      File pcfFile = new File(helper.getPCFRoot().getAbsolutePath() + File.separator + pathToPCFFromRoot);
      if (pcfFile.exists()) {
        System.out.println("File Exists. move it to our backup");
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
        File backup = new File(pcfFile.getAbsolutePath() + File.separator + "orig.bak");
        FileUtil.copyFileToFile(pcfFile, backup);
        System.out.println("and delete it");
        //You have to create the file again if you are going to delete it
        String path = pcfFile.getAbsolutePath();
        pcfFile.delete();
        pcfFile = new File(path);
      }
      //Now that we have any possible backup made, lets go ahead and move this one over.
      FileUtil.copyFileToFile(pcfPage, pcfFile);
    }
    catch (Throwable t) {
      t.printStackTrace();
    }
    return deployed;
  }
}
