package com.guidewire.com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.impl.*;
import com.guidewire.accel.deployment.impl.enums.PluginImplementationType;
import com.guidewire.accel.parser.AcceleratorParser;
import com.guidewire.accel.util.AcceleratorHelper;
import junit.framework.TestCase;

import java.io.File;

/**
 * User: afogleson
 * Date: 3/11/12
 * Time: 10:42 AM
 */
public class AcceleratorParserTest extends TestCase {

  public void testParser() {
    AcceleratorHelper.getInstance().setProductRoot(new File("src/test/resources/product/"));
    AcceleratorParser parser = new AcceleratorParser(new File("src/test/resources/accelerator/"));
    parser.parseAccelerator();

    assertNotNull(parser.getAcceleratorComponents());
    assertEquals(12, parser.getAcceleratorComponents().getAllComponents().length);

    //Check the pcfComponent
    assertEquals(1, parser.getAcceleratorComponents().getComponentList("pcfComponent").size());
    assertTrue(parser.getAcceleratorComponents().getComponentList("pcfComponent").get(0) instanceof PCFComponent);

    //Check the gosuComponents
    assertEquals(2, parser.getAcceleratorComponents().getComponentList("gosuComponent").size());
    assertTrue(parser.getAcceleratorComponents().getComponentList("gosuComponent").get(0) instanceof GosuComponent);
    assertTrue(parser.getAcceleratorComponents().getComponentList("gosuComponent").get(1) instanceof GosuComponent);

    //Check the antBuildComponent
    assertEquals(1, parser.getAcceleratorComponents().getComponentList("antBuildComponent").size());
    assertTrue(parser.getAcceleratorComponents().getComponentList("antBuildComponent").get(0) instanceof AntBuildComponent);

    //check the mavenBuildComponent
    assertEquals(1, parser.getAcceleratorComponents().getComponentList("mavenBuildComponent").size());
    assertTrue(parser.getAcceleratorComponents().getComponentList("mavenBuildComponent").get(0) instanceof MavenBuildComponent);

    //Check the messagingComponent
    assertEquals(1, parser.getAcceleratorComponents().getComponentList("messagingComponent").size());
    assertTrue(parser.getAcceleratorComponents().getComponentList("messagingComponent").get(0) instanceof MessagingComponent);
    MessagingComponent comp = (MessagingComponent)parser.getAcceleratorComponents().getComponentList("messagingComponent").get(0);
    assertTrue(comp.isValid());
    assertTrue(comp.isEnabled());
    assertEquals(PluginImplementationType.gosu, comp.getTransportType());
    assertEquals("MyTransport", comp.getTransportName());
    assertEquals("gwservices.MyTransport", comp.getTransportClass());
    assertEquals(3, comp.getTransportParams().size());
    assertNull(comp.getRequestParams());
    assertNull(comp.getReplyParams());
    assertEquals(2000, comp.getPollInterval());
    assertEquals(10000, comp.getInitialRetryInterval());
    assertEquals(3, comp.getMaxRetries());
    assertEquals(1, comp.getRetryBackoffMultiplier());
    assertEquals(5, comp.getNumberThreads());
    assertEquals(15, comp.getDestination());

    //check the displaykeyComponent
    assertEquals(1, parser.getAcceleratorComponents().getComponentList("displayKeyComponent").size());
    assertTrue(parser.getAcceleratorComponents().getComponentList("displayKeyComponent").get(0) instanceof DisplayKeyComponent);

    //Check the dataExtensionComponent has been instantiated.
    assertEquals(1, parser.getAcceleratorComponents().getComponentList("dataExtensionComponent").size());
    assertTrue(parser.getAcceleratorComponents().getComponentList("dataExtensionComponent").get(0) instanceof DataExtensionComponent);

    //Check the LibraryComponent
    assertEquals(2, parser.getAcceleratorComponents().getComponentList("libraryComponent").size());
    assertTrue(parser.getAcceleratorComponents().getComponentList("libraryComponent").get(0) instanceof LibraryComponent);
    assertTrue(parser.getAcceleratorComponents().getComponentList("libraryComponent").get(1) instanceof LibraryComponent);

    //Check the PluginComponent
    assertEquals(1, parser.getAcceleratorComponents().getComponentList("pluginComponent").size());
    assertTrue(parser.getAcceleratorComponents().getComponentList("pluginComponent").get(0) instanceof PluginComponent);

    String valid = "<?xml version=\"1.0\"?>\n" +
            "<plugin\n" +
            "  name=\"AuthenticationSourceCreatorPlugin\">\n" +
            "  <plugin-java\n" +
            "    javaclass=\"com.guidewire.pl.web.auth.DefaultAuthenticationSourceCreatorPlugin\"\n" +
            "    plugindir=\"authenticationsourcecreator\"/>\n" +
            "</plugin>".trim();
    assertEquals(valid, ((PluginComponent) parser.getAcceleratorComponents().getComponentList("pluginComponent").get(0)).getPlugin().asXML().trim());

    //Check the RPC web service
    assertEquals(1, parser.getAcceleratorComponents().getComponentList("rpcWebServiceComponent").size());
    assertTrue(parser.getAcceleratorComponents().getComponentList("rpcWebServiceComponent").get(0) instanceof RpcWebServiceComponent);
  }
}
