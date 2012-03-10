package com.guidewire.accel.deployment;

/**
 * User: afogleson
 * Date: 3/10/12
 * Time: 12:26 PM
 * <p/>
 * an exception for invalid components
 */
public class InvalidComponentException extends Exception {

  public InvalidComponentException() {
    super();
  }

  public InvalidComponentException(String msg) {
    super(msg);
  }

  public InvalidComponentException(String msg, Throwable t) {
    super(msg, t);
  }

  public InvalidComponentException(Throwable t) {
    super(t);
  }
}
