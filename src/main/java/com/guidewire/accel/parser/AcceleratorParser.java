package com.guidewire.accel.parser;

import com.guidewire.accel.deployment.DeployableComponent;

import java.io.File;
import java.util.ArrayList;

/**
 * User: afogleson
 * Date: 3/10/12
 * Time: 6:24 PM
 */
public class AcceleratorParser {

  private File accelRoot;
  private ArrayList<DeployableComponent> components;

  public AcceleratorParser(File accelRoot) {
    this.accelRoot = accelRoot;
  }

  public ArrayList<DeployableComponent> getAcceleratorComponents() {
    return components;
  }

  public void parseAccelerator() {
    //parse through the deployment descriptor, add all the components to the list

  }

}
