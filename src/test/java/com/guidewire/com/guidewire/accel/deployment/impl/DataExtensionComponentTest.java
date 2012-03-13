package com.guidewire.com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.impl.DataExtensionComponent;
import com.guidewire.accel.util.AcceleratorHelper;
import com.guidewire.accel.util.FileUtil;
import junit.framework.TestCase;

import java.io.File;

/**
 * User: tp23161
 * Date: 13/03/12
 * Time: 11:35
 */
public class DataExtensionComponentTest extends TestCase {

  public void testDataExtensionDeploySuccess() throws Exception {
    AcceleratorHelper helper = AcceleratorHelper.getInstance();
    helper.setProductRoot(new File("src/test/resources/product/"));
    File[] list = FileUtil.listFiles(new File("src/test/resources/product/modules/configuration/config/extensions"));
    if (list != null && list.length > 0) {
      for (File f : list) {
        f.delete();
      }
    }
    //make sure our product dir is empty.
    list = FileUtil.listFiles(new File("src/test/resources/product/modules/configuration/config/extensions"));
    assertNotNull(list);
    assertEquals(0, list.length);
    File extDir = new File("src/test/resources/accelerator/extensions");
    DataExtensionComponent component = new DataExtensionComponent(extDir);
    assertTrue(component.deploy());
    list = FileUtil.listFiles(new File("src/test/resources/product/modules/configuration/config/extensions"));
    assertNotNull(list);
    assertEquals(1, list.length);
    assertEquals("Document.etx", list[0].getName());
  }

}
