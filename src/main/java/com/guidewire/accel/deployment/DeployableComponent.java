package com.guidewire.accel.deployment;

/**
 * Created with IntelliJ IDEA.
 * User: afogleson
 * Date: 3/10/12
 * Time: 12:25 PM
 * To change this template use File | Settings | File Templates.
 */
public interface DeployableComponent {

  /**
   * deploy this component.
   *
   * @return true if the component deployed.
   */
  public boolean deploy();
}
