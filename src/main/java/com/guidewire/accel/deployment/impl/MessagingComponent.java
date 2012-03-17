package com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.DeployableComponent;
import com.guidewire.accel.deployment.impl.enums.MessageImplementationType;
import com.guidewire.accel.deployment.util.FileDeployer;
import com.guidewire.accel.parser.Messaging.MessagingConfigParser;
import com.guidewire.accel.parser.Messaging.pojo.Destination;
import com.guidewire.accel.parser.Messaging.pojo.MessagingConfig;
import com.guidewire.accel.util.AcceleratorHelper;
import com.guidewire.accel.util.NameValuePair;

import java.io.File;
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
  private int pollInterval = 0;
  private int initialRetryInterval = 0;
  private int maxRetries = 0;
  private int retryBackoffMultiplier = 0;
  private int numberThreads = 0;
  private int chunkSize = 0;
  private int shutdownTimeout = 0;

  public String getRegistryDir() {
    return registryDir;
  }

  public void setRegistryDir(String registryDir) {
    this.registryDir = registryDir;
  }

  public String getRequestName() {
    return requestName;
  }

  public void setRequestName(String requestName) {
    this.requestName = requestName;
  }

  public String getRequestClass() {
    return requestClass;
  }

  public void setRequestClass(String requestClass) {
    this.requestClass = requestClass;
  }

  public String getRequestPluginDir() {
    return requestPluginDir;
  }

  public void setRequestPluginDir(String requestPluginDir) {
    this.requestPluginDir = requestPluginDir;
  }

  public ArrayList<NameValuePair> getRequestParams() {
    return requestParams;
  }

  public void setRequestParams(ArrayList<NameValuePair> requestParams) {
    this.requestParams = requestParams;
  }

  public String getTransportName() {
    return transportName;
  }

  public void setTransportName(String transportName) {
    this.transportName = transportName;
  }

  public String getTransportClass() {
    return transportClass;
  }

  public void setTransportClass(String transportClass) {
    this.transportClass = transportClass;
  }

  public String getTransportPluginDir() {
    return transportPluginDir;
  }

  public void setTransportPluginDir(String transportPluginDir) {
    this.transportPluginDir = transportPluginDir;
  }

  public ArrayList<NameValuePair> getTransportParams() {
    return transportParams;
  }

  public void setTransportParams(ArrayList<NameValuePair> transportParams) {
    this.transportParams = transportParams;
  }

  public String getReplyName() {
    return replyName;
  }

  public void setReplyName(String replyName) {
    this.replyName = replyName;
  }

  public String getReplyClass() {
    return replyClass;
  }

  public void setReplyClass(String replyClass) {
    this.replyClass = replyClass;
  }

  public String getReplyPluginDir() {
    return replyPluginDir;
  }

  public void setReplyPluginDir(String replyPluginDir) {
    this.replyPluginDir = replyPluginDir;
  }

  public ArrayList<NameValuePair> getReplyParams() {
    return replyParams;
  }

  public void setReplyParams(ArrayList<NameValuePair> replyParams) {
    this.replyParams = replyParams;
  }

  public int getDestination() {
    return destination;
  }

  public void setDestination(int destination) {
    this.destination = destination;
  }

  private int destination = 0;
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
    if (requestParams == null) {
      requestParams = new ArrayList<NameValuePair>();
    }
    requestParams.add(nvp);
  }

  public void addTransportParameter(NameValuePair nvp) {
    if (transportParams == null) {
      transportParams = new ArrayList<NameValuePair>();
    }
    transportParams.add(nvp);
  }

  public void addReplyParameter(NameValuePair nvp) {
    if (replyParams == null) {
      replyParams = new ArrayList<NameValuePair>();
    }
    replyParams.add(nvp);
  }

  /**
   * We need to do something like this....
   * <?xml version="1.0"?>
   * <plugin
   * interface="MessageTransport"
   * name="TestTransport">
   * <plugin-java
   * javaclass="com.lv.nucleus.java.transport.TestTransport"
   * plugindir="pidir"/>
   * </plugin>
   * or
   * <p/>
   * <plugin
   * interface="MessageTransport"
   * name="CueTransportPlugin">
   * <plugin-gosu
   * gosuclass="com.lv.nucleus.cue.messaging.plugins.CUETransportPlugin">
   * <param
   * name="UserName"
   * value="su"/>
   * <param
   * name="Password"
   * value="gw"/>
   * </plugin-gosu>
   * </plugin>
   * <p/>
   * For each of the plugins. we also need to set up the message queue.
   *
   * @return true if we succeed doing all this.
   */

  private String generatePluginXml(String name, String className,
                                   ArrayList<NameValuePair> params, MessageImplementationType type,
                                   String pluginDir, String pluginType) {
    StringBuilder xml = new StringBuilder();
    xml.append("<?xml version=\"1.0\"?>\n");
    xml.append("<plugin\n  interface=\"Message");
    xml.append(pluginType);
    xml.append("\"\n  name=\"");
    xml.append(name);
    xml.append("\">\n");
    if (type == MessageImplementationType.gosu) {
      xml.append("  <plugin-gosu\n    gosuclass=\"");
      xml.append(className);
      xml.append("\">\n");
    }
    else {
      xml.append("  <plugin-java\n    javaclass=\"");
      xml.append(className);
      xml.append("\"");
      if (pluginDir != null) {
        xml.append("\n    plugindir=\"");
        xml.append(pluginDir);
        xml.append("\"");
      }
      xml.append(">\n");
    }
    //Handle parameters
    if (params != null && !params.isEmpty()) {
      for (NameValuePair nvp : params) {
        xml.append("    <param\n      name=\"");
        xml.append(nvp.getName());
        xml.append("\"\n      value=\"");
        xml.append(nvp.getValue());
        xml.append("\"/>\n");
      }
    }
    if (type == MessageImplementationType.gosu) {
      xml.append("</plugin-gosu>\n</plugin>");
    }
    else {
      xml.append("</plugin-java>\n</plugin>");
    }
    return xml.toString();
  }

  @Override
  public boolean deploy() {
    boolean isDeployed = true;
    String requestPluginXml = null;
    String transportPluginXml = null;
    String replyPluginXml = null;

    MessagingConfigParser parser = null;
    MessagingConfig msgConfig = null;
    try {
      //First lets make sure there is an open queue. that is that the selected destination is not already used.
      parser = new MessagingConfigParser(AcceleratorHelper.getInstance().getProductRoot());
      msgConfig = parser.getMessageConfig();
      Destination dest = msgConfig.getDestinationById(getDestination());
      if (dest != null) {
        //What are we going to do on this failure? there are likely efr that rely on this destinationID
        isDeployed = false;
      }
    }
    catch(Throwable t) {
      t.printStackTrace();
      //most likely our illegal argument exception, but in any case we cannot deploy
      isDeployed = false;
    }

    //if we assume we fail when the destinationID is in use.....
    //go ahead and get ready to deploy everything.
    if (isDeployed && requestClass != null) {
      requestPluginXml = generatePluginXml(requestName, requestClass, requestParams, requestType, requestPluginDir, "Request");
    }
    if (isDeployed && transportClass != null) {
      transportPluginXml = generatePluginXml(transportName, transportClass, transportParams, transportType, transportPluginDir, "Transport");
    }
    if (isDeployed && replyClass != null) {
      replyPluginXml = generatePluginXml(replyName, replyClass, replyParams, replyType, replyPluginDir, "Reply");
    }
    //So, now we have all the plugin.xml we need to create a new destination and add it to our messaging config.
    //if we are still valid to deploy
    if(isDeployed) {
      //so lets build one up....
      Destination newDest = new Destination();

      //Then add it to our messaging config
      msgConfig.addToDestinations(newDest);

      //Then save the plugins and messaging config out
      try {
        parser.writeConfig();
        //plugin xml goes in productRoot + /modules/configuration/config/plugins/registry + pluginName + .xml
        String pluginDir = AcceleratorHelper.getInstance().getProductRoot() + File.separator + "modules" +
                File.separator + "configuration" + File.separator + "config" + File.separator +
                "plugins" + File.separator + "registry" + File.separator;
        if(requestPluginXml != null) {
          FileDeployer.writeStringToFile(requestPluginXml , new File(pluginDir + requestName + ".xml"));
        }
        if(transportPluginXml != null) {
          FileDeployer.writeStringToFile(transportPluginXml , new File(pluginDir + transportName + ".xml"));
        }
        if(replyPluginXml != null) {
          FileDeployer.writeStringToFile(replyPluginXml , new File(pluginDir + replyName + ".xml"));
        }
      }
      catch(Throwable t) {
        t.printStackTrace();
        isDeployed = false;
      }
    }
    return isDeployed;
  }

  @Override
  public String getComponentName() {
    return "messagingComponent";
  }
}
