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

  /**
   *
   * The parser is responsible for finding and creating all the components. The deployer is responsible
   * for ordering them, then deploying them in the correct order.
   *
   * @param components a List of all the @DeployableComponents that were found through parsing.
   * @throws InvalidComponentException
   */
  public void deploy(List<DeployableComponent> components) throws InvalidComponentException {

    //I am not sure how to handle a failure mid stream....
    //And we need some ordering here. we should probably not just run through the components
    //Especially since you could have ant/ivy dependent on a maven build, and a library
    //component dependent on ant or maven...
    for (DeployableComponent component : components) {
      component.deploy();
    }
  }
}
