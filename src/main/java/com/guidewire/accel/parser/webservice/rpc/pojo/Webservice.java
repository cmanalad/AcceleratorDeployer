package com.guidewire.accel.parser.webservice.rpc.pojo;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: afogleson
 * Date: 3/18/12
 * Time: 9:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class Webservice {

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

  public String asXML() {
    StringBuilder sb = new StringBuilder();
    sb.append("<?xml version=\"1.0\"?>\n<endpoint\n");
    sb.append("  name=\"");
    sb.append(name);
    sb.append("\"\n  wsdl-location=\"");
    sb.append(wsdlLocation);
    sb.append("\">\n");
    for(WebServiceSetting ws : settings) {
      sb.append(ws.asXML());
    }
    sb.append("</endpoint>\n");
    return sb.toString();
  }
}
