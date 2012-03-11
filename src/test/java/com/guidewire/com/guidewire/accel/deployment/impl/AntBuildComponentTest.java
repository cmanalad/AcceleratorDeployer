package com.guidewire.com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.impl.AntBuildComponent;
import junit.framework.TestCase;

import java.io.File;

/**
 *
 * User: afogleson
 * Date: 3/11/12
 * Time: 12:04 AM
 *
 */
public class AntBuildComponentTest extends TestCase {

  public void testAntBuild() {
    File buildFile = new File("src/test/resources/build.xml");
    String target = "test";
    AntBuildComponent component = new AntBuildComponent(buildFile, target);
    assertTrue(component.deploy());
  }

  public void testAntBuildInvalidTarget() {
    File buildFile = new File("src/test/resources/build.xml");
    String target = "test2";
    AntBuildComponent component = new AntBuildComponent(buildFile, target);
    assertFalse(component.deploy());
  }
}

