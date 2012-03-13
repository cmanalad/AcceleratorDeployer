package com.guidewire.com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.DeployableComponent;
import com.guidewire.accel.deployment.impl.DataExtensionComponent;
import com.guidewire.accel.deployment.impl.PluginComponent;
import com.guidewire.accel.deployment.impl.WebServiceComponent;
import com.guidewire.accel.deployment.util.ComponentList;
import junit.framework.TestCase;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: afogleson
 * Date: 3/12/12
 * Time: 9:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class ComponentListTest extends TestCase {

  public void testAddComponent() {
    ComponentList list = new ComponentList();
    DeployableComponent component = new DataExtensionComponent();
    list.addComponent(component);
    component = new WebServiceComponent();
    list.addComponent(component);
    component = new PluginComponent();
    list.addComponent(component);
    List<DeployableComponent> components = list.getComponentList(component.getComponentName());
    assertNotNull(components);
    assertEquals(1, components.size());
    DeployableComponent listComponent = components.get(0);
    assertNotNull(listComponent);
    assertTrue(listComponent instanceof PluginComponent);
    components = list.getComponentList("mavenBuildComponent");
    assertNull(components);
  }

  public void testGetAllComponents() {
    ComponentList list = new ComponentList();
    DeployableComponent component = new DataExtensionComponent();
    list.addComponent(component);
    component = new WebServiceComponent();
    list.addComponent(component);
    component = new PluginComponent();
    list.addComponent(component);
    DeployableComponent[] allComponents = list.getAllComponents();
    assertEquals(3, allComponents.length);
  }

}
