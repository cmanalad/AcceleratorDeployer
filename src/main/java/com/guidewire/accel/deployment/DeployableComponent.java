package com.guidewire.accel.deployment;

/**
 * User: afogleson
 * Date: 3/10/12
 * Time: 12:25 PM
 */
public interface DeployableComponent {

  /**
   * deploy this component.
   *
   * @return true if the component deployed.
   */
  public boolean deploy();

  public boolean isValid();
  public String getComponentName();
}
