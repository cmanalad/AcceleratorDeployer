package com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.DeployableComponent;

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
    return false;
  }


}
