package com.guidewire.com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.impl.PCFComponent;
import com.guidewire.accel.util.AcceleratorHelper;
import junit.framework.TestCase;

import java.io.File;
import java.io.FileOutputStream;

/**
 *
 * User: afogleson
 * Date: 3/10/12
 * Time: 10:08 PM
 *
 */
public class PCFDeployerTest extends TestCase {

  private String accelRootPath = "accelRoot/configuration/";
  private String pcfPath       = "/modules/configuration/config/web/pcf/";


  public void testPCFPageNoBackup() throws Exception {
    AcceleratorHelper helper = AcceleratorHelper.getInstance();
    helper.setProductRoot(new File("prodRoot/"));
    if(!helper.getProductRoot().exists()) {
      helper.getProductRoot().mkdirs();
    }
    File pcfDir  = new File(accelRootPath + "Claim/");
    pcfDir.mkdirs();
    File pcfPage = new File(pcfDir.getAbsolutePath() + "/sample.pcf");
    FileOutputStream out = new FileOutputStream(pcfPage);
    out.write("This is a sample page not a real pcf".getBytes());
    out.flush();
    out.close();
    helper.getProductRoot().mkdirs();
    PCFComponent component = new PCFComponent(pcfPage, new File(accelRootPath) );
    component.deploy();
    File copied = new File(helper.getProductRoot().getAbsolutePath() + pcfPath + "Claim/sample.pcf");
    File backup = new File(helper.getProductRoot().getAbsolutePath() + pcfPath + "Claim/sample.pcf.orig.bak");
    assertTrue("File was not found or did not deploy", copied.exists());
    assertTrue("File was not found or did not deploy", !backup.exists());
    copied.delete();
    pcfPage.delete();
  }

  public void testPCFPageWithBackup() throws Exception {
    AcceleratorHelper helper = AcceleratorHelper.getInstance();
    helper.setProductRoot(new File("prodRoot/"));
    if(!helper.getProductRoot().exists()) {
      helper.getProductRoot().mkdirs();
    }
    File pcfDir  = new File(accelRootPath + "Claim/");
    pcfDir.mkdirs();
    File bakDir  = new File(helper.getProductRoot().getAbsolutePath() + pcfPath + "Claim/");
    bakDir.mkdirs();
    File copied = new File(helper.getProductRoot().getAbsolutePath() + pcfPath + "Claim/sample.pcf");
    FileOutputStream out = new FileOutputStream(copied);
    out.write("This is a sample page not a real pcf".getBytes());
    out.flush();
    out.close();
    File pcfPage = new File(pcfDir.getAbsolutePath() + "/sample.pcf");
    out = new FileOutputStream(pcfPage);
    out.write("This is a sample page not a real pcf".getBytes());
    out.flush();
    out.close();
    helper.getProductRoot().mkdirs();
    PCFComponent component = new PCFComponent(pcfPage, new File(accelRootPath) );
    component.deploy();
    File backup = new File(helper.getProductRoot().getAbsolutePath() + pcfPath + "Claim/sample.pcf.orig.bak");
    assertTrue("File was not found or did not deploy", copied.exists());
    assertTrue("File was not found or did not deploy", backup.exists());
    copied.delete();
    backup.delete();
    pcfPage.delete();
  }

}
