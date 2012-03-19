package com.guidewire.accel.deployment;

import com.guidewire.accel.deployment.impl.*;
import com.guidewire.accel.deployment.util.ComponentList;
import com.guidewire.accel.parser.AcceleratorParser;

import java.util.List;

/**
 * User: afogleson
 * Date: 3/10/12
 * Time: 12:21 PM
 *
 */
public class Deployer {

  /**
   * The parser is responsible for finding and creating all the components. The ComponentList is responsible
   * for ordering them, then the deployer is responsible for deploying them in the correct order.
   *
   * @param components a @see ComponentList of all the @see DeployableComponents that were found through parsing.
   * @Return True is the accelerator deployed, else false.
   * @throws InvalidComponentException
   */
  public boolean deploy(ComponentList components) throws InvalidComponentException {

    //I am not sure how to handle a failure mid stream....
    //And we need some ordering here. we should probably not just run through the components
    //Especially since you could have ant/ivy dependent on a maven build, and a library
    //component dependent on ant or maven...
    
    //first get all the maven build components and deploy them.
    boolean isDeployed = true;
    for(DeployableComponent component : components.getComponentList("mavenBuildComponent")) {
      if(isDeployed) {
        isDeployed = component.deploy();
      }
    }
    //then do all our ant components 
    for(DeployableComponent component : components.getComponentList("antBuildComponent")) {
      if(isDeployed) {
        isDeployed = component.deploy();
      }
    }
    //deploy the libraries created from these
    for(DeployableComponent component : components.getComponentList("libraryComponent")) {
      if(isDeployed) {
        isDeployed = component.deploy();
      }
    }
    //the remainder are less important, but do the ones with the highest possibility of failure
    for(DeployableComponent component : components.getComponentList("dataExtensionComponent")) {
      if(isDeployed) {
        isDeployed = component.deploy();
      }
    }
    for(DeployableComponent component : components.getComponentList("messagingComponent")) {
      if(isDeployed) {
        isDeployed = component.deploy();
      }
    }
    for(DeployableComponent component : components.getComponentList("pluginComponent")) {
      if(isDeployed) {
        isDeployed = component.deploy();
      }
    }
    for(DeployableComponent component : components.getComponentList("rpcWebServiceComponent")) {
      if(isDeployed) {
        isDeployed = component.deploy();
      }
    }
    for(DeployableComponent component : components.getComponentList("displayKeyComponent")) {
      if(isDeployed) {
        isDeployed = component.deploy();
      }
    }
    for(DeployableComponent component : components.getComponentList("gosuComponent")) {
      if(isDeployed) {
        isDeployed = component.deploy();
      }
    }
    for(DeployableComponent component : components.getComponentList("pcfComponent")) {
      if(isDeployed) {
        isDeployed = component.deploy();
      }
    }
    return  isDeployed;
  }
}
