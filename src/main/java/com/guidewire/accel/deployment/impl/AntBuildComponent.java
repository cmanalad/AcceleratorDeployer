package com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.DeployableComponent;

import java.io.File;

/**
 * User: afogleson
 * Date: 3/10/12
 * Time: 1:58 PM
 */
public class AntBuildComponent implements DeployableComponent {

  private File buildFile;
  private File buildDirectory;

  @Override
  public boolean deploy() {
    return false;  //To change body of implemented methods use File | Settings | File Templates.
  }
}
