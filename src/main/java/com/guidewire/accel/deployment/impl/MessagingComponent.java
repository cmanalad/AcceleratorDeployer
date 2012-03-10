package com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.DeployableComponent;

import java.util.ArrayList;

/**
 * User: afogleson
 * Date: 3/10/12
 * Time: 2:00 PM
 */
public class MessagingComponent implements DeployableComponent {

  private String reqquestName;
  private MessageImplementationType requestType;
  private String requestClass;
  private String transportName;
  private MessageImplementationType transportType;
  private String transportClass;
  private String replytName;
  private MessageImplementationType replyType;
  private String replyClass;
  private int pollInterval = 10000;
  private int initialRetryInterval = 1000;
  private int maxRetries = 3;
  private int retyBackoffMultiplier = 2;
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

  public int getRetyBackoffMultiplier() {
    return retyBackoffMultiplier;
  }

  public void setRetyBackoffMultiplier(int retyBackoffMultiplier) {
    this.retyBackoffMultiplier = retyBackoffMultiplier;
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

  @Override
  public boolean deploy() {
    return false;
  }
}
