package com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.DeployableComponent;
import org.apache.maven.shared.invoker.*;

import java.io.File;
import java.util.Collections;

/**
 * User: afogleson
 * Date: 3/11/12
 * Time: 12:52 AM
 * <p/>
 * invoke a maven build process.
 */
public class MavenBuildComponent implements DeployableComponent {

  private File pom;
  private String goals = "package";

  public MavenBuildComponent(File pom, String goals) {
    this.pom = pom;
    this.goals = goals;
  }

  public MavenBuildComponent(File pom) {
    this.pom = pom;
  }

  @Override
  public boolean deploy() {
    boolean deployed = true;
    try {
      InvocationRequest request = new DefaultInvocationRequest();
      request.setPomFile(pom);
      request.setGoals(Collections.singletonList(goals));

      Invoker invoker = new DefaultInvoker();
      InvocationResult result = invoker.execute(request);
      if (result.getExitCode() != 0) {
        deployed = false;
      }
    }
    catch (Throwable t) {
      deployed = false;
    }
    return deployed;
  }
}
