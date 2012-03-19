package com.guidewire.com.guidewire.accel.deployment.impl;

import com.guidewire.accel.parser.webservice.rpc.pojo.WebServiceSetting;
import junit.framework.TestCase;
import com.guidewire.accel.parser.webservice.rpc.pojo.WebService;

/**
 * Created by IntelliJ IDEA.
 * User: tp23161
 * Date: 19/03/12
 * Time: 07:34
 * To change this template use File | Settings | File Templates.
 */
public class WebServiceModelTest extends TestCase {
  
  public void testAsXMLNoDefault() {
    WebService ws = new WebService();
    ws.setName("test");
    ws.setWsdlLocation("http://wl-gdwdev2gw-middle.group.net:8080/cc/soap/IClaimAPI?wsdl");
    WebServiceSetting setting = new WebServiceSetting();
    setting.setAuthenticationType("Http");
    setting.setCallTimeout(30);
    setting.setUsername("su");
    setting.setPassword("tj");
    setting.setEnv("DEV");
    setting.setServer("local");
    setting.setOverrideEnabled(true);
    setting.setOverrideUrl("http://wl-gdwdev2gw-middle.group.net:8080/cc/soap/IClaimAPI");
    setting.setServiceName("IClaimAPIService");
    ws.addToSettings(setting);
    String valid = "<?xml version=\"1.0\"?>\n" +
      "<endpoint\n" +
      "  name=\"test\"\n" +
      "  wsdl-location=\"http://wl-gdwdev2gw-middle.group.net:8080/cc/soap/IClaimAPI?wsdl\">\n" +
      "  <settings/>\n" +
      "  <settings\n" +
      "    authentication-type=\"Http\"\n" +
      "    call-timeout=\"30\"\n" +
      "    env=\"DEV\"\n" +
      "    server=\"local\">\n" +
      "    <http-authentication\n" +
      "      password=\"tj\"\n" +
      "      username=\"su\"/>\n" +
      "    <service\n" +
      "      override-enable=\"true\"\n" +
      "      override-url=\"http://wl-gdwdev2gw-middle.group.net:8080/cc/soap/IClaimAPI\"\n" +
      "      service-name=\"IClaimAPIService\"/>\n" +
      "  </settings>\n" +
      "</endpoint>";
    assertEquals(valid, ws.asXML().trim());
  }

  public void testAsXMLWithDefault() {
    WebService ws = new WebService();
    ws.setName("test");
    ws.setWsdlLocation("http://wl-gdwdev2gw-middle.group.net:8080/cc/soap/IClaimAPI?wsdl");
    WebServiceSetting setting = new WebServiceSetting();
    setting.setAuthenticationType("Http");
    setting.setCallTimeout(30);
    setting.setUsername("su");
    setting.setPassword("tj");
    setting.setOverrideEnabled(true);
    setting.setOverrideUrl("http://wl-gdwdev2gw-middle.group.net:8080/cc/soap/IClaimAPI");
    setting.setServiceName("IClaimAPIService");
    ws.addToSettings(setting);
    String valid = "<?xml version=\"1.0\"?>\n" +
      "<endpoint\n" +
      "  name=\"test\"\n" +
      "  wsdl-location=\"http://wl-gdwdev2gw-middle.group.net:8080/cc/soap/IClaimAPI?wsdl\">\n" +
      "  <settings\n" +
      "    authentication-type=\"Http\"\n" +
      "    call-timeout=\"30\">\n" +
      "    <http-authentication\n" +
      "      password=\"tj\"\n" +
      "      username=\"su\"/>\n" +
      "    <service\n" +
      "      override-enable=\"true\"\n" +
      "      override-url=\"http://wl-gdwdev2gw-middle.group.net:8080/cc/soap/IClaimAPI\"\n" +
      "      service-name=\"IClaimAPIService\"/>\n" +
      "  </settings>\n" +
      "</endpoint>";
    assertEquals(valid, ws.asXML().trim());


  }
}
