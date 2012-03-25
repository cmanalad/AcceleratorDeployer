package com.guidewire.accel.parser.plugin.pojo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * User: afogleson
 * Date: 3/18/12
 * Time: 8:28 PM
 *
 */
public class Plugin implements Serializable {

  private String name;
  private ArrayList<JavaPlugin> javaPlugins = new ArrayList<JavaPlugin>();
  private ArrayList<GosuPlugin> gosuPlugins = new ArrayList<GosuPlugin>();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<JavaPlugin> getJavaPlugins() {
    return javaPlugins;
  }

  public ArrayList<GosuPlugin> getGosuPlugins() {
    return gosuPlugins;
  }

  public void addToPlugins(JavaPlugin plugin) {
    javaPlugins.add(plugin);
  }

  public void addToPlugins(GosuPlugin plugin) {
    gosuPlugins.add(plugin);
  }

  public String asXML() {
    StringBuilder sb = new StringBuilder();
    sb.append("<?xml version=\"1.0\"?>\n<plugin\n  name=\"");
    sb.append(name);
    sb.append("\">\n");
    for(JavaPlugin jp : javaPlugins) {
      sb.append(jp.asXML());
    }
    for(GosuPlugin gp : gosuPlugins) {
      sb.append(gp.asXML());
    }
    sb.append("</plugin>\n");
    return sb.toString();
  }

}
