package com.guidewire.accel.parser.webservice.rpc.pojo;

/**
 * Created with IntelliJ IDEA.
 * User: afogleson
 * Date: 3/18/12
 * Time: 10:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class WebServiceSetting {

  private String authenticationType;
  private int callTimeout = 0;
  private String env;
  private String server;
  private boolean overrideEnabled = false;
  private String overrideUrl;
  private String serviceName;
  private String username;
  private String password;

  public String asXML() {
    StringBuilder sb = new StringBuilder();
    sb.append("  <settings");
    if(authenticationType != null && authenticationType.trim().length() > 0) {
      sb.append("\n    authentication-type=\"");
      sb.append(authenticationType);
      sb.append("\"");
    }
    if(callTimeout != 0) {
      sb.append("\n    call-timeout=\"");
      sb.append(callTimeout);
      sb.append("\"");
    }
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
    sb.append(">\n");
    if(authenticationType != null && authenticationType.trim().length() > 0) {
      sb.append("    <http-authentication");
      sb.append("\n      password=\"");
      sb.append(password);
      sb.append("\"\n      username=\"");
      sb.append(username);
      sb.append("\"/>\n");
    }
    if(overrideEnabled || (overrideUrl != null && overrideUrl.trim().length() > 0)) {
      sb.append("    <service\n      override-enable=\"");
      sb.append(overrideEnabled);
      sb.append("\"");
      sb.append("\n      override-url=\"");
      sb.append(overrideUrl);
      sb.append("\"");
      sb.append("\n      service-name=\"");
      sb.append(serviceName);
      sb.append("\"/>\n");
    }
    sb.append("  </settings>\n");

    return sb.toString();
  }


  public String getAuthenticationType() {
    return authenticationType;
  }

  public void setAuthenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
  }

  public int getCallTimeout() {
    return callTimeout;
  }

  public void setCallTimeout(int callTimeout) {
    this.callTimeout = callTimeout;
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

  public boolean isOverrideEnabled() {
    return overrideEnabled;
  }

  public void setOverrideEnabled(boolean overrideEnbaled) {
    this.overrideEnabled = overrideEnbaled;
  }

  public String getOverrideUrl() {
    return overrideUrl;
  }

  public void setOverrideUrl(String overrideUrl) {
    this.overrideUrl = overrideUrl;
  }

  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
