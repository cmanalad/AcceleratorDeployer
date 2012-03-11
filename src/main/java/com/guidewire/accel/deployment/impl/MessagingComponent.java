package com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.DeployableComponent;
import com.guidewire.accel.util.NameValuePair;
import com.sun.corba.se.impl.orbutil.fsm.NameBase;

import java.util.ArrayList;

/**
 * User: afogleson
 * Date: 3/10/12
 * Time: 2:00 PM
 */
public class MessagingComponent implements DeployableComponent {

  private String registryDir = "modules/configuration/config/plguin/registry";

  private String requestName;
  private MessageImplementationType requestType;
  private String requestClass;
  private String requestPluginDir;
  private ArrayList<NameValuePair> requestParams;
  private String transportName;
  private MessageImplementationType transportType;
  private String transportClass;
  private String transportPluginDir;
  private ArrayList<NameValuePair> transportParams;
  private String replyName;
  private MessageImplementationType replyType;
  private String replyClass;
  private String replyPluginDir;
  private ArrayList<NameValuePair> replyParams;
  private int pollInterval = 10000;
  private int initialRetryInterval = 1000;
  private int maxRetries = 3;
  private int retryBackoffMultiplier = 2;
  private int numberThreads = 3;
  private int chunkSize = 100000;
  private int shutdownTimeout = 30000;
  private boolean enabled = true;
  private ArrayList<String> events = new ArrayList<String>();

  //Basic setters and getters for the types
  public void setRequestType(String type) {
    requestType = MessageImplementationType.valueOf(type.toLowerCase().trim());
  }

  public MessageImplementationType getRequestType() {
    return requestType;
  }

  public void setTransportType(String type) {
    transportType = MessageImplementationType.valueOf(type.toLowerCase().trim());
  }

  public MessageImplementationType getTransportType() {
    return transportType;
  }

  public void setReplyType(String type) {
    replyType = MessageImplementationType.valueOf(type.toLowerCase().trim());
  }

  public MessageImplementationType getReplyType() {
    return replyType;
  }

  public int getPollInterval() {
    return pollInterval;
  }

  public void setPollInterval(int pollInterval) {
    this.pollInterval = pollInterval;
  }

  public int getInitialRetryInterval() {
    return initialRetryInterval;
  }

  public void setInitialRetryInterval(int initialRetryInterval) {
    this.initialRetryInterval = initialRetryInterval;
  }

  public int getMaxRetries() {
    return maxRetries;
  }

  public void setMaxRetries(int maxRetries) {
    this.maxRetries = maxRetries;
  }

  public int getRetryBackoffMultiplier() {
    return retryBackoffMultiplier;
  }

  public void setRetryBackoffMultiplier(int retryBackoffMultiplier) {
    this.retryBackoffMultiplier = retryBackoffMultiplier;
  }

  public int getNumberThreads() {
    return numberThreads;
  }

  public void setNumberThreads(int numberThreads) {
    this.numberThreads = numberThreads;
  }

  public int getChunkSize() {
    return chunkSize;
  }

  public void setChunkSize(int chunkSize) {
    this.chunkSize = chunkSize;
  }

  public int getShutdownTimeout() {
    return shutdownTimeout;
  }

  public void setShutdownTimeout(int shutdownTimeout) {
    this.shutdownTimeout = shutdownTimeout;
  }

  public boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  public ArrayList<String> getEvents() {
    return events;
  }

  public void setEvents(ArrayList<String> events) {
    this.events = events;
  }

  public void addToEvents(String eventName) {
    events.add(eventName);
  }

  public void removeFromEvents(String eventName) {
    if (events.contains(eventName)) {
      events.remove(eventName);
    }
  }

  public void addRequestParameter(NameValuePair nvp) {
    if(requestParams == null) {
      requestParams = new ArrayList<NameValuePair>();
    }
    requestParams.add(nvp);
  }

  public void addTransportParameter(NameValuePair nvp) {
    if(transportParams == null) {
      transportParams = new ArrayList<NameValuePair>();
    }
    transportParams.add(nvp);
  }
  public void addReplyParameter(NameValuePair nvp) {
    if(replyParams == null) {
      replyParams = new ArrayList<NameValuePair>();
    }
    replyParams.add(nvp);
  }

  /**
   *
   * We need to do something like this....
   * <?xml version="1.0"?>
   * <plugin
   *   interface="MessageTransport"
   *   name="TestTransport">
   *   <plugin-java
   *     javaclass="com.lv.nucleus.java.transport.TestTransport"
   *     plugindir="pidir"/>
   * </plugin>
   * or
   *
   * <plugin
   *   interface="MessageTransport"
   *   name="CueTransportPlugin">
   *   <plugin-gosu
   *     gosuclass="com.lv.nucleus.cue.messaging.plugins.CUETransportPlugin">
   *     <param
   *       name="UserName"
   *       value="su"/>
   *     <param
   *       name="Password"
   *       value="gw"/>
   *   </plugin-gosu>
   * </plugin>
   *
   * For each of the plugins. we also need to set up the message queue.
   *
   * @return true if we succeed doing all this.
   */

  private String generatePluginXml(String name,                     String className,
                                   ArrayList<NameValuePair> params, MessageImplementationType type,
                                   String pluginDir,                String pluginType) {
    StringBuilder xml = new StringBuilder();
    xml.append("<?xml version=\"1.0\"?>\n");
    xml.append("<plugin\n  interface=\"Message");
    xml.append(pluginType);
    xml.append("\"\n  name=\"");
    xml.append(name);
    xml.append("\">\n");
    if(type == MessageImplementationType.gosu) {
      xml.append("  <plugin-gosu\n    gosuclass=\"");
      xml.append(className);
      xml.append("\">\n");
    }
    else {
      xml.append("  <plugin-java\n    javaclass=\"");
      xml.append(className);
      xml.append("\"");
      if(pluginDir != null) {
        xml.append("\n    plugindir=\"");
        xml.append(pluginDir);
        xml.append("\"");
      }
      xml.append(">\n");
    }
    //Handle parameters
    if(params != null && !params.isEmpty()) {
      for(NameValuePair nvp : params) {
        xml.append("    <param\n      name=\"");
        xml.append(nvp.getName());
        xml.append("\"\n      value=\"");
        xml.append(nvp.getValue());
        xml.append("\"/>\n");
      }
    }
    if(type == MessageImplementationType.gosu) {
      xml.append("</plugin-gosu>\n</plugin>");
    }
    else {
      xml.append("</plugin-java>\n</plugin>");
    }
    return xml.toString();
  }


  @Override
  public boolean deploy() {
    String requestPluginXml   = null;
    String transportPluginXml = null;
    String replyPluginXml     = null;

    if(requestClass != null) {
      requestPluginXml = generatePluginXml(requestName, requestClass, requestParams, requestType, requestPluginDir, "Request");
    }
    if(transportClass != null) {
      transportPluginXml = generatePluginXml(transportName, transportClass, transportParams, transportType, transportPluginDir, "Transport");
    }
    if(replyClass != null) {
      replyPluginXml = generatePluginXml(replyName, replyClass, replyParams, replyType, replyPluginDir, "Reply");
    }

    //plugins go in productRoot + registrydir + pluginName + .xml


    return false;
  }
}
