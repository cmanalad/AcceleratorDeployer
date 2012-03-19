package com.guidewire.accel.parser.model;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: tp23161
 * Date: 14/03/12
 * Time: 13:26
 * To change this template use File | Settings | File Templates.
 */
public class Field implements Serializable {

  private String name;
  private String value;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
