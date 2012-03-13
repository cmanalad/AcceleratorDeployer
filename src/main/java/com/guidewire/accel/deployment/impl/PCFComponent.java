package com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.DeployableComponent;
import com.guidewire.accel.deployment.util.FileDeployer;
import com.guidewire.accel.util.AcceleratorHelper;

import java.io.File;

/**
 * User: afogleson
 * Date: 3/10/12
 * Time: 1:39 PM
 */
public class PCFComponent implements DeployableComponent {

  private File pcfPage;
  private File accelConfigRoot;

  public PCFComponent(File page, File accelConfigRoot) {
    pcfPage = page;
    this.accelConfigRoot = accelConfigRoot;
  }

  @Override
  public boolean deploy() {
    boolean deployed = true;
    try {
      AcceleratorHelper helper = AcceleratorHelper.getInstance();
      String pcfRoot = helper.getPCFRoot().getAbsolutePath();
      String accelConfigPathBase = accelConfigRoot.getAbsolutePath();
      String pathToPCFFromRoot = pcfPage.getAbsolutePath().substring(accelConfigPathBase.length());
      int index = pcfPage.getAbsolutePath().indexOf(pcfPage.getName());
      String fromDir = pcfPage.getAbsolutePath().substring(0, index);
      String toString = helper.getPCFRoot().getAbsolutePath() + File.separator + pathToPCFFromRoot;
      index = toString.indexOf(pcfPage.getName());
      toString = toString.substring(0, index);
      File toDir = new File(toString);
      deployed = FileDeployer.deployFile(new File(fromDir), pcfPage.getName(), toDir);
    } catch (Throwable t) {
      t.printStackTrace();
      deployed = false;
    }
    return deployed;
  }

  @Override
  public String getComponentName() {
    return "pcfComponent";
  }
}
