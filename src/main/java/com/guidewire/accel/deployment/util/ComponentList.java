package com.guidewire.accel.deployment.util;

import com.guidewire.accel.deployment.DeployableComponent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * User: afogleson
 * Date: 3/12/12
 * Time: 9:37 PM
 */
public class ComponentList {

  HashMap<String, List<DeployableComponent>> componentList = new HashMap<String, List<DeployableComponent>>();

  public void addComponent(DeployableComponent component) {
    String key = component.getComponentName();
    List<DeployableComponent> l = componentList.get(key);
    if (l == null) {
      l = new ArrayList<DeployableComponent>();
    }
    l.add(component);
    componentList.remove(key);
    componentList.put(key, l);
  }

  public List<DeployableComponent> getComponentList(String componentName) {
    return componentList.get(componentName);
  }

  public DeployableComponent[] getAllComponents() {
    ArrayList<DeployableComponent> list = new ArrayList<DeployableComponent>();
    Set<String> keys = componentList.keySet();
    for (String key : keys) {
      List<DeployableComponent> components = componentList.get(key);
      list.addAll(components);
    }
    return list.toArray(new DeployableComponent[list.size()]);
  }
}
