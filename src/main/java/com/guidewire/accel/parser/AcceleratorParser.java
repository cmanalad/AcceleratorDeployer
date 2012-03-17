package com.guidewire.accel.parser;

import com.guidewire.accel.deployment.DeployableComponent;
import com.guidewire.accel.deployment.impl.*;
import com.guidewire.accel.deployment.util.ComponentList;
import com.guidewire.accel.util.FileUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
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
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      // Turn on validation, and turn off namespaces
      factory.setValidating(false);
      factory.setNamespaceAware(false);

      DocumentBuilder builder = factory.newDocumentBuilder();

      Document doc = builder.parse(getDeploymentDescriptor());

      // Print the document from the DOM tree and
      //   feed it an initial indentation of nothing
      NodeList elements = doc.getChildNodes();
      for (int i = 0; i < elements.getLength(); i++) {
        Node node = elements.item(i);
        if (node.getNodeName().trim().equals("accelerator")) {
          NodeList list = node.getChildNodes();
          for (int j = 0; j < list.getLength(); j++) {
            parse(list.item(j));
          }
        }

      }
    }
    catch (ParserConfigurationException e) {
      System.out.println("The underlying parser does not support the requested features.");
    }
    catch (FactoryConfigurationError e) {
      System.out.println("Error occurred obtaining Document Builder Factory.");
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void parse(Node node) {
    //For every node except accelerator we should be creating a deployable component.
    if (node.getNodeName().equals("mavenBuild")) {
      String directory = accelRoot.getAbsolutePath() + File.separator;
      String goals = "";
      NodeList children = node.getChildNodes();
      for (int i = 0; i < children.getLength(); i++) {
        Node n = children.item(i);
        if (n.getNodeName().trim().equals("directory")) {
          directory = directory + n.getFirstChild().getNodeValue().trim() + File.separator;
        }
        else if (n.getNodeName().trim().equals("goals")) {
          goals = n.getFirstChild().getNodeValue();
        }
      }
      MavenBuildComponent component = new MavenBuildComponent(new File(directory), goals);
      addToComponents(component);
    }
    else if (node.getNodeName().equals("antBuild")) {
      String directory = accelRoot.getAbsolutePath() + File.separator;
      File buildFile = new File(directory + "build.xml");
      String target = "";
      NodeList children = node.getChildNodes();
      for (int i = 0; i < children.getLength(); i++) {
        Node n = children.item(i);
        if (n.getNodeName().trim().equals("target")) {
          target = n.getFirstChild().getNodeValue().trim();
        }
        else if (n.getNodeName().trim().equals("buildFile")) {
          directory = directory + n.getFirstChild().getNodeValue().trim();
          buildFile = new File(directory);
        }
      }
      AntBuildComponent component = new AntBuildComponent(buildFile, target);
      addToComponents(component);
    }
    else if (node.getNodeName().equals("pcfRoot")) {
      String directory = accelRoot.getAbsolutePath() + File.separator;
      NodeList childDirs = node.getChildNodes();
      for (int i = 0; i < childDirs.getLength(); i++) {
        Node pcfDir = childDirs.item(i);
        if (node.getNodeName().equals("directory")) {
          String pcfDirPath = node.getFirstChild().getNodeValue().trim();
          File pcfDirectory = new File(directory + pcfDirPath);
          //Get every file in the config directory....
          File[] pcfFiles = FileUtil.listFiles(pcfDirectory);
          for (File f : pcfFiles) {
            PCFComponent component = new PCFComponent(f, new File(pcfDirPath));
            addToComponents(component);
          }
        }
      }
    }
    else if (node.getNodeName().trim().equals("gosuRoot")) {
      String directory = accelRoot.getAbsolutePath() + File.separator;
      NodeList childDirs = node.getChildNodes();
      for (int i = 0; i < childDirs.getLength(); i++) {
        Node gosuDir = childDirs.item(i);
        if (node.getNodeName().equals("directory")) {
          String gosuDirPath = node.getFirstChild().getNodeValue().trim();
          File gosuDirectory = new File(directory + gosuDirPath);
          //Get every file in the config directory....
          File[] gosuFiles = FileUtil.listFiles(gosuDirectory);
          for (File f : gosuFiles) {
            GosuComponent component = new GosuComponent(f, false);
            addToComponents(component);
          }
        }
      }
    }
    else if (node.getNodeName().trim().equals("gunitRoot")) {
      String directory = accelRoot.getAbsolutePath() + File.separator;
      NodeList childDirs = node.getChildNodes();
      for (int i = 0; i < childDirs.getLength(); i++) {
        Node gosuDir = childDirs.item(i);
        if (node.getNodeName().equals("directory")) {
          String gosuDirPath = node.getFirstChild().getNodeValue().trim();
          File gosuDirectory = new File(directory + gosuDirPath);
          //Get every file in the config directory....
          File[] gunitFiles = FileUtil.listFiles(gosuDirectory);
          for (File f : gunitFiles) {
            GosuComponent component = new GosuComponent(f, true);
            addToComponents(component);
          }
        }
      }
    }
    else if (node.getNodeName().trim().equals("displaykey")) {
      String directory = accelRoot.getAbsolutePath() + File.separator;
      NodeList childDirs = node.getChildNodes();
      for (int i = 0; i < childDirs.getLength(); i++) {
        Node displaykeyFile = childDirs.item(i);
        if (node.getNodeName().equals("file")) {
          String filePath = node.getNodeValue();
          File displaykeys = new File(directory + filePath);
          DisplayKeyComponent component = new DisplayKeyComponent(displaykeys);
          addToComponents(component);
        }
      }
    }
    else if (node.getNodeName().trim().equals("messageQueue")) {
      //Every messaging component has to have at least a transport and a destination so....
      boolean hasTransport = false;
      boolean hasDestination = false;
      MessagingComponent component = new MessagingComponent();
      NodeList childNodes = node.getChildNodes();
      for (int i = 0; i < childNodes.getLength(); i++) {
        Node n = childNodes.item(i);
        String name = n.getNodeName();
        if(name.equals("messageRequest")) {

        }
        else if(name.equals("messageTransport")) {

          hasTransport = true;
        }
        else if(name.equals("messageReply")) {

        }
        else if(name.equals("disabled")) {
          boolean val = Boolean.valueOf(node.getNodeValue().trim());
          component.setEnabled(!val);
        }
        else if(name.equals("pollInterval")) {
          int val = Integer.parseInt(node.getNodeValue().trim());
          component.setPollInterval(val);
        }
        else if(name.equals("initialRetryInterval")) {
          int val = Integer.parseInt(node.getNodeValue().trim());
          component.setInitialRetryInterval(val);
        }
        else if(name.equals("maxRetries")) {

        }
        else if(name.equals("retryBackoffMultiplier")) {

        }
        else if(name.equals("numberThreads")) {

        }
        else if(name.equals("chunkSize")) {

        }
        else if(name.equals("shutdownTimeout")) {

        }
        else if(name.equals("destination")) {

          hasDestination = true;
        }
      }
      if(hasTransport && hasDestination) {
        addToComponents(component);
      }
      else {
        if(hasDestination) {
          //inform of the missing transport
          throw new IllegalArgumentException("Your accelerator deployment descriptor has a messaging component without a message transport. You cannot deploy this accelerator");
        }
        else if(hasTransport) {
          //inform of the missing destination
          throw new IllegalArgumentException("Your accelerator deployment descriptor has a messaging component without a destination. You cannot deploy this accelerator");
        }
        else {
          //inform of both
          throw new IllegalArgumentException("Your accelerator deployment descriptor has a messaging component without a message transport or destination. You cannot deploy this accelerator");
        }
      }
    }
  }

  private void addToComponents(DeployableComponent component) {
    components.addComponent(component);
  }
}
