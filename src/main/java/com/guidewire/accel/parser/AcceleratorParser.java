package com.guidewire.accel.parser;

import com.guidewire.accel.deployment.DeployableComponent;
import com.guidewire.accel.deployment.impl.*;
import com.guidewire.accel.deployment.util.ComponentList;
import com.guidewire.accel.parser.plugin.pojo.GosuPlugin;
import com.guidewire.accel.parser.plugin.pojo.JavaPlugin;
import com.guidewire.accel.parser.webservice.rpc.pojo.WebService;
import com.guidewire.accel.parser.webservice.rpc.pojo.WebServiceSetting;
import com.guidewire.accel.util.FileUtil;
import com.guidewire.accel.util.PluginParam;
import com.guidewire.accelerator.deployment.Accelerator;
import com.guidewire.accelerator.deployment.AcceleratorDocument;
import java.io.File;

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
          GosuComponent component = new GosuComponent(f, new File(gosuDirPath));
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
          GosuComponent component = new GosuComponent(f, new File(gosuDirPath), true);
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
          component.setRequestType(comp.getMessageRequest().getRequestType().toString());
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
            component.setTransportType(comp.getMessageTransport().getTransportType().toString());
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
            component.setReplyType(comp.getMessageReply().getReplyType().toString());
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
      for(Accelerator.Library libComp : accel.getLibraryArray()) {
        File f = new File(accelRoot.getAbsolutePath() + File.separator + libComp.getDirectory());
        LibraryComponent component = null;
        if(libComp.getPluginDirectory() == null || libComp.getPluginDirectory().trim().length() == 0) {
          component = new LibraryComponent(f);
        }
        else {
          component = new LibraryComponent(f, libComp.getPluginDirectory());
        }
        addToComponents(component);
      }
      for(Accelerator.Plugin plugin : accel.getPluginArray()) {

        PluginComponent component = new PluginComponent();
        //TODO: Need to set up the plugin component and do the parsing in here.
        component.setPluginName(plugin.getName());
        for(Accelerator.Plugin.Java jp : plugin.getJavaArray()) {
          JavaPlugin jPlugin = new JavaPlugin();
          jPlugin.setDisabled(jp.getDisabled());
          jPlugin.setEnv(jp.getEnv());
          jPlugin.setJavaClass(jp.getClassname());
          jPlugin.setPluginDir(jp.getPlugindir());
          jPlugin.setServer(jp.getServer());
          if(jp.getPluginParamArray() != null && jp.getPluginParamArray().length > 0) {
            for(com.guidewire.accelerator.deployment.PluginParam param : jp.getPluginParamArray()) {
              PluginParam parameter = new PluginParam();
              parameter.setServer(param.getServer());
              parameter.setEnv(param.getEnv());
              parameter.setName(param.getName());
              parameter.setValue(param.getValue());
              jPlugin.addParameter(parameter);
            }
          }
          component.addJavaPlugin(jPlugin);
        }
        for(Accelerator.Plugin.Gosu gp : plugin.getGosuArray()) {
          GosuPlugin gPlugin = new GosuPlugin();
          gPlugin.setDisabled(gp.getDisabled());
          gPlugin.setEnv(gp.getEnv());
          gPlugin.setGosuClass(gp.getClassname());
          gPlugin.setServer(gp.getServer());
          if(gp.getPluginParamArray() != null && gp.getPluginParamArray().length > 0) {
            for(com.guidewire.accelerator.deployment.PluginParam param : gp.getPluginParamArray()) {
              PluginParam parameter = new PluginParam();
              parameter.setServer(param.getServer());
              parameter.setEnv(param.getEnv());
              parameter.setName(param.getName());
              parameter.setValue(param.getValue());
              gPlugin.addParameter(parameter);
            }
          }
          component.addGosuPlugin(gPlugin);
        }
        addToComponents(component);
      }
      for(Accelerator.RpcWebService ws : accel.getRpcWebServiceArray()) {
        RpcWebServiceComponent component = new RpcWebServiceComponent();
        WebService service = new WebService();
        service.setName(ws.getName());
        service.setWsdlLocation(ws.getWsdlLocation());
        if(ws.getSettingArray() != null && ws.getSettingArray().length > 0) {
          for(Accelerator.RpcWebService.Setting s : ws.getSettingArray()) {
            WebServiceSetting setting = new WebServiceSetting();
            setting.setCallTimeout(s.getCallTimeout());
            setting.setEnv(s.getEnv());
            setting.setServer(s.getServer());
            setting.setOverrideEnabled(s.getOverrideEnabled());
            setting.setOverrideUrl(s.getOverrideUrl());
            setting.setServiceName(s.getServiceName());
            setting.setAuthenticationType(s.getAuthentication().getAuthenticationType());
            setting.setUsername(s.getAuthentication().getUsername());
            setting.setPassword(s.getAuthentication().getPassword());
            service.addToSettings(setting);
          }
        }
        component.setWebService(service);
        addToComponents(component);
      }

      if(accel.getDataExtension() != null) {
        Accelerator.DataExtension comp = accel.getDataExtension();
        String directory = accelRoot.getAbsolutePath() + File.separator;
        String filePath = comp.getDirectory();
        File extensionDir = new File(directory + filePath);
        DataExtensionComponent component = new DataExtensionComponent(extensionDir);
        addToComponents(component);
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

  private void addToComponents(DeployableComponent component) {
    components.addComponent(component);
  }
}
