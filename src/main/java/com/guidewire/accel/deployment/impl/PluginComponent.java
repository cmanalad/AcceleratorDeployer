package com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.DeployableComponent;

import java.util.HashMap;

/**
 * User: afogleson
 * Date: 3/10/12
 * Time: 1:56 PM
 */
public class PluginComponent implements DeployableComponent {

  private HashMap<String, String> paramValues;

  @Override
  public boolean deploy() {
    return false;  //To change body of implemented methods use File | Settings | File Templates.
  }
}
