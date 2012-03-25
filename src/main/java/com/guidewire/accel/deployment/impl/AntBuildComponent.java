package com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.DeployableComponent;
import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;

import java.io.File;

/**
 * User: afogleson
 * Date: 3/10/12
 * Time: 1:58 PM
 */
public class AntBuildComponent implements DeployableComponent {

  private File buildFile;
  private String buildTarget;

  public AntBuildComponent(File buildFile, String target) {
    this.buildFile = buildFile;
    this.buildTarget = target;
  }

  @Override
  public boolean deploy() {
    boolean success = true;
    Project p = new Project();
    p.setUserProperty("ant.file", buildFile.getAbsolutePath());
    DefaultLogger consoleLogger = new DefaultLogger();
    consoleLogger.setErrorPrintStream(System.err);
    consoleLogger.setOutputPrintStream(System.out);
    consoleLogger.setMessageOutputLevel(Project.MSG_INFO);
    p.addBuildListener(consoleLogger);

    try {
      p.fireBuildStarted();
      p.init();
      ProjectHelper helper = ProjectHelper.getProjectHelper();
      p.addReference("ant.projectHelper", helper);
      helper.parse(p, buildFile);
      p.executeTarget(buildTarget);
      p.fireBuildFinished(null);
    }
    catch (Throwable t) {
      p.fireBuildFinished(t);
      success = false;
    }
    return success;
  }

  @Override
  public boolean isValid() {
    if(buildFile.exists()) {
      return true;
    }
    return false;
  }

  @Override
  public String getComponentName() {
    return "antBuildComponent";
  }
}
