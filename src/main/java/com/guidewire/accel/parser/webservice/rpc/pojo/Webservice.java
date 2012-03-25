package com.guidewire.accel.parser.webservice.rpc.pojo;

import java.util.ArrayList;

/**
 *
 * User: afogleson
 * Date: 3/18/12
 * Time: 9:59 PM
 *
 */
public class WebService {

  private String name;
  private String wsdlLocation;
  private ArrayList<WebServiceSetting> settings = new ArrayList<WebServiceSetting>();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getWsdlLocation() {
    return wsdlLocation;
  }

  public void setWsdlLocation(String wsdlLocation) {
    this.wsdlLocation = wsdlLocation;
  }

  public void addToSettings(WebServiceSetting setting) {
    settings.add(setting);
  }

  /**
   *
   * Just used internally to decide if we need an empty <settings>
   *
   * @return true if we have added some settings to the default
   *
   */
  private boolean hasDefaultSetting() {
    boolean hasDefault = false;
    for(WebServiceSetting ws : settings) {
      if((ws.getServer() == null || ws.getServer().trim().length() == 0) &&
         (ws.getEnv() == null || ws.getEnv().trim().length() == 0)) {
        hasDefault = true;
      }
    }
    return hasDefault;
  }

  public String asXML() {
    StringBuilder sb = new StringBuilder();
    sb.append("<?xml version=\"1.0\"?>\n<endpoint\n");
    sb.append("  name=\"");
    sb.append(name);
    sb.append("\"\n  wsdl-location=\"");
    sb.append(wsdlLocation);
    sb.append("\">\n");
    if(settings != null && settings.size() > 0 && !hasDefaultSetting()) {
      sb.append("  <settings/>\n");
    }
    for(WebServiceSetting ws : settings) {
      sb.append(ws.asXML());
    }
    sb.append("</endpoint>\n");
    return sb.toString();
  }
}
