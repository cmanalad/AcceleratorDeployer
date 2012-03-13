package com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.DeployableComponent;
import com.guidewire.accel.util.AcceleratorHelper;
import com.guidewire.accel.util.FileUtil;

import java.io.File;

/**
 *
 * User: afogleson
 * Date: 3/10/12
 * Time: 11:30 PM
 *
 */
public class DataExtensionComponent implements DeployableComponent {

  private File dataDir;
  
  public DataExtensionComponent(File extensionDirectory) {
    this.dataDir = extensionDirectory;
  }

  /**
   * Deploying a data extension is a bit more arduous than just copying an eti or etx file.
   *
   * @return
   * 
   */
  @Override
  public boolean deploy() {
    boolean isDeployed = true;
    /*
     * I don't think this is going to be the easiest thing to do. Potential issues include:
     * 
     * 1) if an extension of an OOTB entity already exists we need to parse the ext file and add the columns and indexes
     * 2) if a custom extension already exists we might not understand in here whether it is the same purpose. (.eti/.tti file)
     * 3) If someone has managed to add a column in an extension that already exists in our configuration.... well you get the idea. 
     * 
     * Essentially I think the easy route here is that if 2 or 3 happens we have to fail.
     *  
     */
    File[] extensions = FileUtil.listFiles(dataDir);
    String productExtDir = AcceleratorHelper.getInstance().getProductRoot().getAbsolutePath() + "/modules/configuration/config/extensions/";
    for(File ext : extensions) {
      //First off for every file in here there are 2 options... 
      // 1) it exists already in the product directory. 
      // 2) it does not. 
      // the easy case is it does not exist. 
      //
      String name = ext.getName();
      File prodFile = new File(productExtDir + name);
      if(prodFile.exists()) {
        // it exists... so we have the hard road.
        if(name.contains(".etx")) {
          //We need to merge an extension.

        }
        else if(name.contains(".ttx")) {
          //we need to merge a typelist extension

        }
        else if(name.contains(".eti")) {
          //we may have a big problem here... so we return false.
          return false;
        }
        else if(name.contains(".tti")) {
          //we may have a big problem here... so we return false.
          return false;
        }


      }
      else {
        try {
          // since there is no file of this name present we can just copy it. 
          FileUtil.copyFileToFile(ext, prodFile);
        }
        catch(Throwable t) {
          isDeployed = false;
        }
      }
    }

    return isDeployed;
  }

  @Override
  public String getComponentName() {
    return "dataExtensionComponent";
  }
}
