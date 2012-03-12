package com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.DeployableComponent;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: afogleson
 * Date: 3/12/12
 * Time: 10:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class DisplayKeyComponent implements DeployableComponent {

  private File displaykeys;

  /**
   * this is not that hard... the hardest thing is determining the available locales
   *
   * @return true if the displaykeys have been added/modified.
   *
   */
  @Override
  public boolean deploy() {
    //figure out our displaykeys. Need to check for locales.

    try {
      Properties props = new Properties();
      FileInputStream in = new FileInputStream(displaykeys);
      props.load(in);
      in.close();
      Properties prodKeys = new Properties();


      //we now have our displaykeys.

    }
    catch(Throwable t) {

    }
    return false;  //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public String getComponentName() {
    return "displayKeyComponent";
  }
}
