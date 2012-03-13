package com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.DeployableComponent;

/**
 * User: afogleson
 * Date: 3/10/12
 * Time: 11:30 PM
 */
public class DataExtensionComponent implements DeployableComponent {

  /**
   * Deploying a data extension is a bit more arduous than just copying an eti or etx file.
   *
   * @return
   */
  @Override
  public boolean deploy() {
    return false;
  }

  @Override
  public String getComponentName() {
    return "dataExtensionComponent";
  }
}
