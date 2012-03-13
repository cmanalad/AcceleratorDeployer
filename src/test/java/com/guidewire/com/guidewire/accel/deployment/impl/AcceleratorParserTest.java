package com.guidewire.com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.impl.AntBuildComponent;
import com.guidewire.accel.deployment.impl.MavenBuildComponent;
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
    assertEquals(2, parser.getAcceleratorComponents().getAllComponents().length);
    assertEquals(1, parser.getAcceleratorComponents().getComponentList("antBuildComponent").size());
    assertTrue(parser.getAcceleratorComponents().getComponentList("antBuildComponent").get(0) instanceof AntBuildComponent);
    assertEquals(1, parser.getAcceleratorComponents().getComponentList("mavenBuildComponent").size());
    assertTrue(parser.getAcceleratorComponents().getComponentList("mavenBuildComponent").get(0) instanceof MavenBuildComponent);
    //Shouldnt need this, but lets make sure we are not passing back lists for components we do not have.
    assertNull(parser.getAcceleratorComponents().getComponentList("displayKeyComponent"));
    assertNull(parser.getAcceleratorComponents().getComponentList("dataExtensionComponent"));
    assertNull(parser.getAcceleratorComponents().getComponentList("gosuComponent"));
    assertNull(parser.getAcceleratorComponents().getComponentList("libraryComponent"));
    assertNull(parser.getAcceleratorComponents().getComponentList("messagingComponent"));
    assertNull(parser.getAcceleratorComponents().getComponentList("pcfComponent"));
    assertNull(parser.getAcceleratorComponents().getComponentList("pluginComponent"));
    assertNull(parser.getAcceleratorComponents().getComponentList("webServiceComponent"));

  }
}
