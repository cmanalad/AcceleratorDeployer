package com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.DeployableComponent;
import com.guidewire.accel.deployment.util.FileDeployer;
import com.guidewire.accel.parser.plugin.pojo.GosuPlugin;
import com.guidewire.accel.parser.plugin.pojo.JavaPlugin;
import com.guidewire.accel.parser.plugin.pojo.Plugin;
import com.guidewire.accel.util.AcceleratorHelper;
import com.guidewire.accel.util.FileUtil;
import com.guidewire.accel.util.PluginParam;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * User: afogleson
 * Date: 3/10/12
 * Time: 1:56 PM
 */
public class PluginComponent implements DeployableComponent {


  private Plugin plugin = new Plugin();

  @Override
  public boolean deploy() {
    boolean deployed = true;
    try {
      //plugins go in productRoot/modules/configuration/config/plugin/registry
      //as pluginName.xml
      String pluginLoc = AcceleratorHelper.getInstance().getProductRoot().getAbsolutePath() + File.separator + "modules" + File.separator + "configuration" + File.separator + "config" + File.separator + "plugin" + File.separator + "registry" + File.separator + plugin.getName() + ".xml";
      FileDeployer.writeStringToFile(plugin.asXML(), new File(pluginLoc));
    }
    catch(Throwable t) {
      deployed = false;
    }
    return deployed;
  }

  @Override
  public boolean isValid() {
    if(plugin == null || plugin.getName() == null || ((plugin.getJavaPlugins() == null || plugin.getJavaPlugins().size() == 0) && (plugin.getGosuPlugins() == null || plugin.getGosuPlugins().size() == 0) )) {
      return false;
    }
    return true;
  }

  @Override
  public String getComponentName() {
    return "pluginComponent";
  }

  public String getPluginName() {
    return plugin.getName();
  }

  public void setPluginName(String pluginName) {
    this.plugin.setName(pluginName);
  }

  public void addJavaPlugin(JavaPlugin javaPlugin) {
    this.plugin.addToPlugins(javaPlugin);
  }

  public void addGosuPlugin(GosuPlugin gosuPlugin) {
    this.plugin.addToPlugins(gosuPlugin);
  }

  public Plugin getPlugin() {
    return plugin;
  }
}
