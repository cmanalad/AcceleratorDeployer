package com.guidewire.com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.impl.DisplayKeyComponent;
import com.guidewire.accel.util.AcceleratorHelper;
import junit.framework.TestCase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 *
 * User: tp23161
 * Date: 13/03/12
 * Time: 09:07
 *
 */
public class DisplaykeyComponentTest extends TestCase {
  
  public void testDeploySuccess() throws Exception {
    AcceleratorHelper helper = AcceleratorHelper.getInstance();
    helper.setProductRoot(new File("src/test/resources/product/"));
    Properties prodProps = new Properties();
    prodProps.put("test", "Not Modified");
    FileOutputStream out = new FileOutputStream(helper.getProductRoot() + "/modules/configuration/config/locale/en_GB/display.properties");
    prodProps.store(out, null);
    out.flush();
    out.close();
    out = new FileOutputStream(helper.getProductRoot() + "/modules/configuration/config/locale/en_US/display.properties");
    prodProps.store(out, null);
    out.flush();
    out.close();

    File displaykeyFile = new File("src/test/resources/accelerator/displaykeys.properties");
    DisplayKeyComponent component = new DisplayKeyComponent(displaykeyFile);
    assertTrue(component.deploy());
    prodProps = new Properties();
    FileInputStream in = new FileInputStream(helper.getProductRoot() + "/modules/configuration/config/locale/en_GB/display.properties");
    prodProps.load(in);
    in.close();
    assertEquals("This is a test", prodProps.get("test"));
    in = new FileInputStream(helper.getProductRoot() + "/modules/configuration/config/locale/en_US/display.properties");
    prodProps.load(in);
    in.close();
    assertEquals("Not Modified", prodProps.get("test"));
  }

  //Need an unhappy path test.
  public void testDeployFails() throws Exception {
    AcceleratorHelper helper = AcceleratorHelper.getInstance();
    helper.setProductRoot(new File("src/test/resources/nodir/"));
    File displaykeyFile = new File("src/test/resources/accelerator/displaykeys.properties");
    DisplayKeyComponent component = new DisplayKeyComponent(displaykeyFile);
    assertFalse(component.deploy());
  }

}
