package com.guidewire.com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.impl.MavenBuildComponent;
import junit.framework.TestCase;

import java.io.File;

/**
 * User: afogleson
 * Date: 3/11/12
 * Time: 1:21 AM
 */
public class MavenBuildComponentTest extends TestCase {

  public void testMavenBuildFailure() {
    File pom = new File("src/test/resources/pom.xml");
    MavenBuildComponent component = new MavenBuildComponent(pom);
    assertFalse(component.deploy());
  }

  public void testMavenBuildSuccess() {
    File pom = new File("src/test/resources/sample/pom.xml");
    String goals = "clean";
    MavenBuildComponent component = new MavenBuildComponent(pom, goals);
    assertTrue(component.deploy());
  }
}
