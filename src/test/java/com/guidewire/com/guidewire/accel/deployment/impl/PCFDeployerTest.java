package com.guidewire.com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.impl.PCFComponent;
import com.guidewire.accel.util.AcceleratorHelper;
import junit.framework.TestCase;

import java.io.File;
import java.io.FileOutputStream;

/**
 * User: afogleson
 * Date: 3/10/12
 * Time: 10:08 PM
 */
public class PCFDeployerTest extends TestCase {

  private String accelRootPath = "src/test/resources/accelerator/configuration/";
  private String pcfPath = "/modules/configuration/config/web/pcf/";
  private File prodRoot = new File("src/test/resources/product/");

  public void testPCFPageNoBackup() throws Exception {
    AcceleratorHelper helper = AcceleratorHelper.getInstance();
    helper.setProductRoot(prodRoot);
    if (!helper.getProductRoot().exists()) {
      helper.getProductRoot().mkdirs();
    }
    File pcfDir = new File(accelRootPath + "Claim/");
    pcfDir.mkdirs();
    File pcfPage = new File(pcfDir.getAbsolutePath() + "/product.pcf");
    FileOutputStream out = new FileOutputStream(pcfPage);
    out.write("This is a product page not a real pcf".getBytes());
    out.flush();
    out.close();
    helper.getProductRoot().mkdirs();
    PCFComponent component = new PCFComponent(pcfPage, new File(accelRootPath));
    assertTrue(component.deploy());
    File copied = new File(helper.getProductRoot().getAbsolutePath() + pcfPath + "Claim/product.pcf");
    File backup = new File(helper.getProductRoot().getAbsolutePath() + pcfPath + "Claim/product.pcf.orig.bak");
    assertTrue("File was not found or did not deploy", copied.exists());
    assertTrue("File was not found or did not deploy", !backup.exists());
    copied.delete();
    pcfPage.delete();
  }

  public void testPCFPageWithBackup() throws Exception {
    AcceleratorHelper helper = AcceleratorHelper.getInstance();
    helper.setProductRoot(prodRoot);
    if (!helper.getProductRoot().exists()) {
      helper.getProductRoot().mkdirs();
    }
    File pcfDir = new File(accelRootPath + "Claim/");
    pcfDir.mkdirs();
    File bakDir = new File(helper.getProductRoot().getAbsolutePath() + pcfPath + "Claim/");
    bakDir.mkdirs();
    File copied = new File(helper.getProductRoot().getAbsolutePath() + pcfPath + "Claim/product.pcf");
    FileOutputStream out = new FileOutputStream(copied);
    out.write("This is a product page not a real pcf".getBytes());
    out.flush();
    out.close();
    File pcfPage = new File(pcfDir.getAbsolutePath() + "/product.pcf");
    out = new FileOutputStream(pcfPage);
    out.write("This is a product page not a real pcf".getBytes());
    out.flush();
    out.close();
    helper.getProductRoot().mkdirs();
    PCFComponent component = new PCFComponent(pcfPage, new File(accelRootPath));
    assertTrue(component.deploy());
    File backup = new File(helper.getProductRoot().getAbsolutePath() + pcfPath + "Claim/product.pcf.orig.bak");
    assertTrue("File was not found or did not deploy", copied.exists());
    assertTrue("File was not found or did not deploy", backup.exists());
    copied.delete();
    backup.delete();
    pcfPage.delete();
  }

}
