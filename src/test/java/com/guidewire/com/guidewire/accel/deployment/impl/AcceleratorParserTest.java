package com.guidewire.com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.impl.*;
import com.guidewire.accel.deployment.impl.enums.PluginImplementationType;
import com.guidewire.accel.parser.AcceleratorParser;
import junit.framework.TestCase;

import java.io.File;

/**
 * User: afogleson
 * Date: 3/11/12
 * Time: 10:42 AM
 */
public class AcceleratorParserTest extends TestCase {

  public void testParser() {
    AcceleratorParser parser = new AcceleratorParser(new File("src/test/resources/accelerator/"));
    parser.parseAccelerator();
    assertNotNull(parser.getAcceleratorComponents());
    assertEquals(5, parser.getAcceleratorComponents().getAllComponents().length);

    //Check the pcfComponent
    assertEquals(1, parser.getAcceleratorComponents().getComponentList("pcfComponent").size());
    assertTrue(parser.getAcceleratorComponents().getComponentList("pcfComponent").get(0) instanceof PCFComponent);

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



    //Shouldnt need this, but lets make sure we are not passing back lists for components we do not have.
    assertNull(parser.getAcceleratorComponents().getComponentList("dataExtensionComponent"));
    assertNull(parser.getAcceleratorComponents().getComponentList("gosuComponent"));
    assertNull(parser.getAcceleratorComponents().getComponentList("libraryComponent"));
    assertNull(parser.getAcceleratorComponents().getComponentList("pluginComponent"));
    assertNull(parser.getAcceleratorComponents().getComponentList("webServiceComponent"));

  }
}
