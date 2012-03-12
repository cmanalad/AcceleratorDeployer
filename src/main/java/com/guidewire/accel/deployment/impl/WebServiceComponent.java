package com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.DeployableComponent;

/**
 * Created with IntelliJ IDEA.
 * User: afogleson
 * Date: 3/10/12
 * Time: 1:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class WebServiceComponent implements DeployableComponent {

  @Override
  public boolean deploy() {
    return false;
  }

  @Override
  public String getComponentName() {
    return "webServiceComponent";
  }
}
