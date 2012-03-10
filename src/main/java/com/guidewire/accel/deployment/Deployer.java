package com.guidewire.accel.deployment;

import java.util.List;

/**
 * User: afogleson
 * Date: 3/10/12
 * Time: 12:21 PM
 * <p/>
 * This is essentially a chain of installers to do the various installs needed for an accelerator.
 * Essentially you pass in a list of components and this chain will work through that list deploying them
 */
public class Deployer {

  public void deploy(List<DeployableComponent> components) throws InvalidComponentException {
    //I am not sure how to handle a failure mid stream....
    for (DeployableComponent component : components) {
      component.deploy();
    }
  }


}
