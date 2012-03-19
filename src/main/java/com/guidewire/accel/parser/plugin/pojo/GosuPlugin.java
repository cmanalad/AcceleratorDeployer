package com.guidewire.accel.parser.plugin.pojo;

import com.guidewire.accel.util.PluginParam;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: afogleson
 * Date: 3/18/12
 * Time: 8:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class GosuPlugin implements Serializable {

  private boolean disabled = false;
  private String env;
  private String server;
  private String gosuClass;
  private ArrayList<PluginParam> params = new ArrayList<PluginParam>();

  public boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(boolean disabled) {
    this.disabled = disabled;
  }

  public String getEnv() {
    return env;
  }

  public void setEnv(String env) {
    this.env = env;
  }

  public String getServer() {
    return server;
  }

  public void setServer(String server) {
    this.server = server;
  }

  public String getGosuClass() {
    return gosuClass;
  }

  public void setGosuClass(String javaClass) {
    this.gosuClass = javaClass;
  }

  public ArrayList<PluginParam> getParams() {
    return params;
  }

  public void addParameter(PluginParam param) {
    params.add(param);
  }

  public String asXML() {
    StringBuilder sb = new StringBuilder();
    sb.append("  <plugin-java");
    if(isDisabled()) {
      sb.append("\n    disabled=\"true\"");
    }
    sb.append("\n    javaclass=\"");
    sb.append(gosuClass);
    sb.append("\"");
    if(env != null && env.trim().length() > 0) {
      sb.append("\n    env=\"");
      sb.append(env);
      sb.append("\"");
    }
    if(server != null && server.trim().length() > 0) {
      sb.append("\n    server=\"");
      sb.append(server);
      sb.append("\"");
    }
    if(params != null && params.size() > 0) {
      sb.append(">\n");
      for(PluginParam p : params) {
        sb.append(p.asXML());
      }
    }
    else {
      sb.append("/>\n");
    }
    return sb.toString();
  }
}
