package com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.DeployableComponent;
import com.guidewire.accel.deployment.util.FileDeployer;
import com.guidewire.accel.util.AcceleratorHelper;

import java.io.File;

/**
 *
 * User: afogleson
 * Date: 3/10/12
 * Time: 1:55 PM
 *
 */
public class GosuComponent implements DeployableComponent {

  private static String GosuPath = AcceleratorHelper.getInstance().getProductRoot().getAbsolutePath() + File.separator + "modules" + File.separator + "configuration" + File.separator + "gsrc" + File.separator;
  private static String GunitPath = AcceleratorHelper.getInstance().getProductRoot().getAbsolutePath() + File.separator + "modules" + File.separator + "configuration" + File.separator + "gtest" + File.separator;

  private File gosuFile;
  private File accelConfigRoot;
  private boolean isGunit = false;

  public GosuComponent(File gosuFile, File accelConfigRoot) {
    this.gosuFile = gosuFile;
    this.accelConfigRoot = accelConfigRoot;
    this.isGunit = false;
  }

  public GosuComponent(File gosuFile, File accelConfigRoot, boolean isGunit) {
    this.gosuFile = gosuFile;
    this.accelConfigRoot = accelConfigRoot;
    this.isGunit = isGunit;
  }

  public GosuComponent(File gosuFile) {
    this.gosuFile = gosuFile;
  }

  @Override
  public boolean deploy() {
    boolean deployed = true;
    try {
      AcceleratorHelper helper = AcceleratorHelper.getInstance();
      String accelConfigPathBase = accelConfigRoot.getAbsolutePath();
      String pathToGosuFromRoot = gosuFile.getAbsolutePath().substring(accelConfigPathBase.length());
      int index = gosuFile.getAbsolutePath().indexOf(gosuFile.getName());
      String fromDir = gosuFile.getAbsolutePath().substring(0, index);
      String toString = null;
      if(!isGunit) {
        toString = GosuPath + pathToGosuFromRoot;
      }
      else {
        toString = GunitPath + pathToGosuFromRoot;
      }
      index = toString.indexOf(gosuFile.getName());
      toString = toString.substring(0, index);
      File toDir = new File(toString);
      deployed = FileDeployer.deployFile(new File(fromDir), gosuFile.getName(), toDir);
    }
    catch (Throwable t) {
      t.printStackTrace();
      deployed = false;
    }
    return deployed;
  }


  @Override
  public boolean isValid() {
    if(gosuFile == null || accelConfigRoot == null) {
      return false;
    }
    return true;
  }

  @Override
  public String getComponentName() {
    return "gosuComponent";
  }
}
