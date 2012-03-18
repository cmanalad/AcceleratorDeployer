package com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.DeployableComponent;
import com.guidewire.accel.util.FileUtil;

import java.io.File;

/**
 * User: afogleson
 * Date: 3/10/12
 * Time: 6:36 PM
 */
public class LibraryComponent implements DeployableComponent {

  private File libraryFile;
  //If pluginDir is null then we will copy to configuration/plugins/shared/lib
  //otherwise you copy them into the plugin dir under configuration/plugins/pluginDir
  private String pluginDir;

  public LibraryComponent(File libraryFile) {
    this.libraryFile = libraryFile;
  }

  public LibraryComponent(File libraryFile, String pluginDir) {
    this.libraryFile = libraryFile;
    this.pluginDir = pluginDir;
  }

  @Override
  public boolean deploy() {
    boolean deployed = true;
    try {
      //If we have a plugindir we deploy to modules/configuration/plugins/$pluginDir/lib
      StringBuilder sb = new StringBuilder();
      sb.append("Modules");
      sb.append(File.separator);
      sb.append("configuration");
      sb.append(File.separator);
      sb.append("plugins");
      sb.append(File.separator);
      if (pluginDir != null && pluginDir.trim().length() > 0) {
        sb.append(pluginDir);
      }
      //Otherwise we deploy to modules/configuration/plugins/shared/lib
      else {
        sb.append("shared");
      }
      sb.append(File.separator);
      sb.append("lib");
      sb.append(File.separator);

      File deployDir = new File(sb.toString());
      if (!deployDir.exists()) {
        deployed = deployDir.mkdirs();
      }
      //if we are still ok...
      if (deployed) {
        //The Library Component points to a directory... so list all the files in there.
        File[] list = libraryFile.listFiles();
        for(File libFile : list) {
          String fileName = libFile.getName();
          File outFile = new File(deployDir.getAbsolutePath() + File.separator + fileName);
          FileUtil.copyFileToFile(libFile, outFile);
        }
      }
    }
    catch (Throwable t) {
      t.printStackTrace();
      deployed = false;
    }
    return deployed;
  }

  @Override
  public boolean isValid() {
    return true;
  }

  @Override
  public String getComponentName() {
    return "libraryComponent";
  }
}
