package com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.DeployableComponent;

import java.io.File;

/**
 *
 * User: afogleson
 * Date: 3/11/12
 * Time: 12:52 AM
 *
 */
public class MavenBuildComponent implements DeployableComponent {

  private File pom;
  private String goals = "package";

  public MavenBuildComponent(File pom, String goals) {
    this.pom = pom;
    this.goals = goals;
  }

  public MavenBuildComponent(File pom) {
    this.pom = pom;
  }

  @Override
  public boolean deploy() {
    return false;
  }
}
