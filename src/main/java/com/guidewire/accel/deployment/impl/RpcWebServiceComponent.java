package com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.DeployableComponent;
import com.guidewire.accel.deployment.util.FileDeployer;
import com.guidewire.accel.parser.webservice.rpc.pojo.WebService;
import com.guidewire.accel.util.AcceleratorHelper;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: afogleson
 * Date: 3/10/12
 * Time: 1:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class RpcWebServiceComponent implements DeployableComponent {

  private WebService webService;
  
  @Override
  public boolean deploy() {
    boolean deployed = true;
    //webServices deploy to $PRODUCT_ROOT/modules/configuration/config/webservices/$NAME.xml
    StringBuilder sb = new StringBuilder();
    sb.append(AcceleratorHelper.getInstance().getProductRoot().getAbsolutePath());
    sb.append(File.separator);
    sb.append("modules");
    sb.append(File.separator);
    sb.append("configuration");
    sb.append(File.separator);
    sb.append("config");
    sb.append(File.separator);
    sb.append("webservices");
    sb.append(File.separator);
    
    File outDir = new File(sb.toString());
    if(!outDir.exists()) {
      try {
        outDir.mkdirs();
      }
      catch (Throwable t) {
        t.printStackTrace();
        deployed = false;
      }
    }
    if(deployed) {
      try {
        File outFile = new File(outDir.getAbsolutePath() + File.separator + webService.getName() + ".xml");
        String xml = webService.asXML();
        FileDeployer.writeStringToFile(xml, outFile);
      }
      catch (Throwable t) {
        t.printStackTrace();
        deployed = false;
      }
    }
    return deployed;
  }

  @Override
  public boolean isValid() {
    return true;
  }

  @Override
  public String getComponentName() {
    return "rpcWebServiceComponent";
  }
  
  public void setWebService(WebService webService) {
    this.webService = webService;
  }
}
