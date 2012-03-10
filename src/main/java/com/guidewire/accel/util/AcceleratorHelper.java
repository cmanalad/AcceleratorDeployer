package com.guidewire.accel.util;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: afogleson
 * Date: 3/9/12
 * Time: 1:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class AcceleratorHelper {

  private static AcceleratorHelper instance = new AcceleratorHelper();

  private File productRoot;
  private File accelerator;

  private AcceleratorHelper() {
  }

  public static AcceleratorHelper getInstance() {
    return instance;
  }

  public File getProductRoot() {
    return productRoot;
  }

  public void setProductRoot(File productRoot) {
    this.productRoot = productRoot;
  }

  public File getAccelerator() {
    return accelerator;
  }

  public void setAccelerator(File accelerator) {
    this.accelerator = accelerator;
  }

  public File getPCFRoot() {
    return new File(productRoot.getAbsolutePath() + File.separator + "modules" + File.separator + "configuration" + File.separator + "config" + File.separator + "web" + File.separator + "pcf");
  }
}
