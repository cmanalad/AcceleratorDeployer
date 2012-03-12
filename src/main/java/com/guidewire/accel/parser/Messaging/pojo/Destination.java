package com.guidewire.accel.parser.Messaging.pojo;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: tp23161
 * Date: 12/03/12
 * Time: 14:10
 * To change this template use File | Settings | File Templates.
 */
public class Destination {

  private int id;
  private boolean enabled = true;
  private String name;
  private String requestPlugin;
  private String replyPlugin;
  private String transportPlugin;
  private int numSenderThreads = 0;
  private long initialRetryInterval = 0;
  private int maxRetries = 0;
  private long pollInterval = 0;
  private int retryBackoffMultiplier = 0;
  private long chunkSize = 0;
  private long shutdownTimeout = 0;

  private ArrayList<Event> events = new ArrayList<Event>();

  public long getChunkSize() {
    return chunkSize;
  }

  public void setChunkSize(long chunkSize) {
    this.chunkSize = chunkSize;
  }

  public long getShutdownTimeout() {
    return shutdownTimeout;
  }

  public void setShutdownTimeout(long shutdownTimeout) {
    this.shutdownTimeout = shutdownTimeout;
  }

  public ArrayList<Event> getEvents() {
    return events;
  }

  public boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRequestPlugin() {
    return requestPlugin;
  }

  public void setRequestPlugin(String requestPlugin) {
    this.requestPlugin = requestPlugin;
  }

  public String getReplyPlugin() {
    return replyPlugin;
  }

  public void setReplyPlugin(String replyPlugin) {
    this.replyPlugin = replyPlugin;
  }

  public String getTransportPlugin() {
    return transportPlugin;
  }

  public void setTransportPlugin(String transportPlugin) {
    this.transportPlugin = transportPlugin;
  }

  public int getNumSenderThreads() {
    return numSenderThreads;
  }

  public void setNumSenderThreads(int numSenderThreads) {
    this.numSenderThreads = numSenderThreads;
  }

  public long getInitialRetryInterval() {
    return initialRetryInterval;
  }

  public void setInitialRetryInterval(long initialRetryInterval) {
    this.initialRetryInterval = initialRetryInterval;
  }

  public int getMaxRetries() {
    return maxRetries;
  }

  public void setMaxRetries(int maxRetries) {
    this.maxRetries = maxRetries;
  }

  public long getPollInterval() {
    return pollInterval;
  }

  public void setPollInterval(long pollInterval) {
    this.pollInterval = pollInterval;
  }

  public int getRetryBackoffMultiplier() {
    return retryBackoffMultiplier;
  }

  public void setRetryBackoffMultiplier(int retryBackoffMultiplier) {
    this.retryBackoffMultiplier = retryBackoffMultiplier;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void addToEvents(Event event) {
    events.add(event);
  }

  public String asXML() {
    StringBuilder sb = new StringBuilder();
    sb.append("    <destination\n");
    sb.append("      id=\"");
    sb.append(id);
    sb.append("\"\n      ");
    sb.append("name=\"");
    sb.append(name);
    sb.append("\"");
    if (!enabled) {
      sb.append("\n      disabled=\"true\"");
    }
    if (numSenderThreads > 0) {
      sb.append("\n      numsenderthreads=\"");
      sb.append(numSenderThreads);
      sb.append("\"");
    }
    if (pollInterval > 0) {
      sb.append("\n      pollinterval=\"");
      sb.append(pollInterval);
      sb.append("\"");
    }
    if (retryBackoffMultiplier > 0) {
      sb.append("\n      retrybackoffmultiplier=\"");
      sb.append(retryBackoffMultiplier);
      sb.append("\"");
    }
    if (maxRetries > 0) {
      sb.append("\n      maxretries=\"");
      sb.append(maxRetries);
      sb.append("\"");
    }
    if (chunkSize > 0) {
      sb.append("\n      chunksize=\"");
      sb.append(chunkSize);
      sb.append("\"");
    }
    if (shutdownTimeout > 0) {
      sb.append("\n      shutdowntimeout=\"");
      sb.append(shutdownTimeout);
      sb.append("\"");
    }
    sb.append(">");
    if (events != null && events.size() > 0) {
      for (Event e : events) {
        sb.append(e.asXML());
      }
      sb.append("\n");
    } else {
      sb.append("\n");
    }
    sb.append("    </destination>\n");
    return sb.toString();
  }
}
