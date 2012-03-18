package com.guidewire.accel.parser;

import com.guidewire.accel.deployment.DeployableComponent;
import com.guidewire.accel.deployment.impl.*;
import com.guidewire.accel.deployment.util.ComponentList;
import com.guidewire.accel.util.FileUtil;
import com.guidewire.accel.util.PluginParam;
import com.guidewire.accelerator.deployment.Accelerator;
import com.guidewire.accelerator.deployment.AcceleratorDocument;
import org.apache.xmlbeans.XmlException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * User: afogleson
 * Date: 3/10/12
 * Time: 6:24 PM
 */
public class AcceleratorParser {

  private File accelRoot;
  private ComponentList components = new ComponentList();

  public AcceleratorParser(File accelRoot) {
    this.accelRoot = accelRoot;
  }

  public ComponentList getAcceleratorComponents() {
    return components;
  }

  public File getDeploymentDescriptor() {
    return new File(accelRoot.getAbsolutePath() + File.separator + "deployment.xml");
  }

  public void parseAccelerator() {
    //parse through the deployment descriptor, add all the components to the list
    try {

      AcceleratorDocument accelDoc = AcceleratorDocument.Factory.parse(getDeploymentDescriptor());
      Accelerator accel = accelDoc.getAccelerator();
      for(Accelerator.MavenBuild comp : accel.getMavenBuildArray()) {
        String directory = accelRoot.getAbsolutePath() + File.separator + comp.getDirectory() + File.separator;
        String goals = comp.getGoals();
        MavenBuildComponent component = new MavenBuildComponent(new File(directory), goals);
        addToComponents(component);
      }
      for(Accelerator.AntBuild comp : accel.getAntBuildArray()) {
        String directory = accelRoot.getAbsolutePath() + File.separator;
        File buildFile = new File(directory + "build.xml");
        String target = comp.getTarget();
        if(comp.getBuildFile() != null) {
          buildFile = new File(comp.getBuildFile());
        }
        AntBuildComponent component = new AntBuildComponent(buildFile, target);
        addToComponents(component);
      }
      for(Accelerator.PcfRoot comp : accel.getPcfRootArray()) {
        String directory = accelRoot.getAbsolutePath() + File.separator;
        String pcfDirPath = comp.getDirectory();
        File pcfDirectory = new File(directory + pcfDirPath);
        //Get every file in the config directory....
        File[] pcfFiles = FileUtil.listFiles(pcfDirectory);
        for (File f : pcfFiles) {
          PCFComponent component = new PCFComponent(f, new File(pcfDirPath));
          addToComponents(component);
        }
      }
      for(Accelerator.GosuRoot comp : accel.getGosuRootArray()) {
        String directory = accelRoot.getAbsolutePath() + File.separator;
        String gosuDirPath = comp.getDirectory();
        File gosuDirectory = new File(directory + gosuDirPath);
        //Get every file in the config directory....
        File[] gosuFiles = FileUtil.listFiles(gosuDirectory);
        for (File f : gosuFiles) {
          GosuComponent component = new GosuComponent(f, false);
          addToComponents(component);
        }
      }
      for(Accelerator.GunitRoot comp : accel.getGunitRootArray()) {
        String directory = accelRoot.getAbsolutePath() + File.separator;
        String gosuDirPath = comp.getDirectory();
        File gosuDirectory = new File(directory + gosuDirPath);
        //Get every file in the config directory....
        File[] gunitFiles = FileUtil.listFiles(gosuDirectory);
        for (File f : gunitFiles) {
          GosuComponent component = new GosuComponent(f, true);
          addToComponents(component);
        }
      }
      for(Accelerator.MessageQueue comp : accel.getMessageQueueArray()) {
        boolean hasTransport = false;
        boolean hasDestination = false;
        MessagingComponent component = new MessagingComponent();
        if(comp.getMessageRequest() != null) {
          component.setRequestName(comp.getMessageRequest().getRequestName());
          component.setRequestClass(comp.getMessageRequest().getRequestClass());
          component.setRequestType(comp.getMessageRequest().getRequestType());
          if(comp.getMessageRequest().getRequestParameters() != null) {
            for(com.guidewire.accelerator.deployment.PluginParam p : comp.getMessageRequest().getRequestParameters().getParameterArray()) {
              PluginParam param = new PluginParam();
              param.setEnv(p.getEnv());
              param.setName(p.getName());
              param.setServer(p.getServer());
              param.setValue(p.getValue());
              component.addRequestParameter(param);
            }
          }
        }
        if(comp.getMessageTransport() != null) {
            component.setTransportName(comp.getMessageTransport().getTransportName());
            component.setTransportClass(comp.getMessageTransport().getTransportClass());
            component.setTransportType(comp.getMessageTransport().getTransportType());
            if(comp.getMessageTransport().getTransportParameters() != null) {
              for(com.guidewire.accelerator.deployment.PluginParam p : comp.getMessageTransport().getTransportParameters().getParameterArray()) {
                PluginParam param = new PluginParam();
                param.setEnv(p.getEnv());
                param.setName(p.getName());
                param.setServer(p.getServer());
                param.setValue(p.getValue());
                component.addTransportParameter(param);
              }
            }
            hasTransport = true;
          }
          if(comp.getMessageReply() != null) {
            component.setReplyName(comp.getMessageReply().getReplyName());
            component.setReplyClass(comp.getMessageReply().getReplyClass());
            component.setReplyType(comp.getMessageReply().getReplyType());
            if(comp.getMessageReply().getReplyParameters() != null) {
              for(com.guidewire.accelerator.deployment.PluginParam p : comp.getMessageReply().getReplyParameters().getParameterArray()) {
                PluginParam param = new PluginParam();
                param.setEnv(p.getEnv());
                param.setName(p.getName());
                param.setServer(p.getServer());
                param.setValue(p.getValue());
                component.addReplyParameter(param);
              }
            }
          }
          component.setEnabled(!comp.getDisabled());
          if(comp.getChunkSize() != 0) {
            component.setChunkSize(comp.getChunkSize());
          }
          if(comp.getDestination() != null) {
            component.setDestination(comp.getDestination().intValue());
            hasDestination = true;
          }
          if(comp.getInitialRetryInterval() != 0) {
            component.setInitialRetryInterval(comp.getInitialRetryInterval());
          }
          if(comp.getMaxRetries() != 0) {
            component.setMaxRetries(comp.getMaxRetries());
          }
          if(comp.getNumberThreads() != 0) {
            component.setNumberThreads(comp.getNumberThreads());
          }
          if(comp.getPollInterval() != 0) {
            component.setPollInterval(comp.getPollInterval());
        }
        if(comp.getRetryBackoffMultiplier() != 0) {
          component.setRetryBackoffMultiplier(comp.getRetryBackoffMultiplier());
        }
        if(comp.getShutdownTimeout() != 0) {
          component.setShutdownTimeout(comp.getShutdownTimeout());
        }
        if(hasTransport && hasDestination) {
          addToComponents(component);
        }
      }
      if(accel.getDisplaykey() != null) {
        Accelerator.Displaykey comp = accel.getDisplaykey();
        String directory = accelRoot.getAbsolutePath() + File.separator;
        String filePath = comp.getFile();
        File displaykeys = new File(directory + filePath);
        DisplayKeyComponent component = new DisplayKeyComponent(displaykeys);
        addToComponents(component);
      }
    }
    catch (Throwable e) {
      e.printStackTrace();
    }
  }

  private void parse(Node node) {
    //For every node except accelerator we should be creating a deployable component.
    if(node.getNodeName().trim().equals("")) {

    }
  }

  private void addToComponents(DeployableComponent component) {
    components.addComponent(component);
  }
}
