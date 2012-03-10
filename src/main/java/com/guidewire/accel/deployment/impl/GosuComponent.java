package com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.DeployableComponent;

import java.io.File;

/**
 * User: afogleson
 * Date: 3/10/12
 * Time: 1:55 PM
 */
public class GosuComponent implements DeployableComponent {

  private File gosuFile;
  private boolean isGunit = false;

  public GosuComponent(File gosuFile, boolean isGunit) {
    this.gosuFile = gosuFile;
    this.isGunit = isGunit;
  }

  public GosuComponent(File gosuFile) {
    this.gosuFile = gosuFile;
  }

  @Override
  public boolean deploy() {
    return false;  //To change body of implemented methods use File | Settings | File Templates.
  }
}
