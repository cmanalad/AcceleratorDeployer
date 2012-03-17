package com.guidewire.accel.util;

/**
 * User: afogleson
 * Date: 3/11/12
 * Time: 9:53 PM
 */
public class PluginParam {

  private String name;
  private String value;
  private String env;
  private String server;

  public PluginParam() {
  }

  public String getServer() {
    return server;
  }

  public void setServer(String server) {
    this.server = server;
  }

  public String getEnv() {
    return env;
  }

  public void setEnv(String env) {
    this.env = env;
  }

  public PluginParam(String name, String value) {
    this.name = name;
    this.value = value;
  }

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
