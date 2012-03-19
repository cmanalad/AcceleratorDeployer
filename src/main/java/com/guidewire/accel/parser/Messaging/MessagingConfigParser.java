package com.guidewire.accel.parser.Messaging;

import com.guidewire.accel.deployment.util.FileDeployer;
import com.guidewire.accel.parser.Messaging.pojo.Destination;
import com.guidewire.accel.parser.Messaging.pojo.Event;
import com.guidewire.accel.parser.Messaging.pojo.MessagingConfig;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.IOException;

/**
 * User: tp23161
 * Date: 12/03/12
 * Time: 13:53
 */
public class MessagingConfigParser {

  private Document messageConfig = null;
  private MessagingConfig msgConfig;
  private File msgConfigFile = null;

  public MessagingConfigParser(File productRoot) {
    StringBuilder sb = new StringBuilder();
    sb.append(productRoot.getAbsolutePath());
    sb.append(File.separator);
    sb.append("modules");
    sb.append(File.separator);
    sb.append("configuration");
    sb.append(File.separator);
    sb.append("config");
    sb.append(File.separator);
    sb.append("messaging");
    sb.append(File.separator);
    sb.append("messaging-config.xml");
    msgConfigFile = new File(sb.toString());
    if (!msgConfigFile.exists()) {
      throw new IllegalArgumentException("Messaging config could not be found at " + sb.toString());
    }

    try {
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      // Turn on validation, and turn off namespaces
      factory.setValidating(false);
      factory.setNamespaceAware(false);

      DocumentBuilder builder = factory.newDocumentBuilder();

      messageConfig = builder.parse(msgConfigFile);

      NodeList nodes = messageConfig.getElementsByTagName("destination");
      msgConfig = new MessagingConfig();
      for (int i = 0; i < nodes.getLength(); i++) {
        Node n = nodes.item(i);
        Destination dest = new Destination();
        dest.setId(Integer.parseInt(n.getAttributes().getNamedItem("id").getNodeValue()));
        dest.setName(n.getAttributes().getNamedItem("name").getNodeValue());
        if (n.getAttributes().getNamedItem("disabled") != null &&
                n.getAttributes().getNamedItem("disabled").getNodeValue() != null) {
          if (n.getAttributes().getNamedItem("disabled").getNodeValue().toLowerCase().equals("true")) {
            dest.setEnabled(false);
          }
        }
        if (n.getAttributes().getNamedItem("numsenderthreads") != null &&
                n.getAttributes().getNamedItem("numsenderthreads").getNodeValue() != null) {
          dest.setNumSenderThreads(Integer.parseInt(n.getAttributes().getNamedItem("numsenderthreads").getNodeValue()));
        }
        if (n.getAttributes().getNamedItem("pollinterval") != null &&
                n.getAttributes().getNamedItem("pollinterval").getNodeValue() != null) {
          dest.setPollInterval(Long.parseLong(n.getAttributes().getNamedItem("pollinterval").getNodeValue()));
        }
        if (n.getAttributes().getNamedItem("retrybackoffmultiplier") != null &&
                n.getAttributes().getNamedItem("retrybackoffmultiplier").getNodeValue() != null) {
          dest.setRetryBackoffMultiplier(Integer.parseInt(n.getAttributes().getNamedItem("retrybackoffmultiplier").getNodeValue()));
        }
        if (n.getAttributes().getNamedItem("maxretries") != null &&
                n.getAttributes().getNamedItem("maxretries").getNodeValue() != null) {
          dest.setMaxRetries(Integer.parseInt(n.getAttributes().getNamedItem("maxretries").getNodeValue()));
        }
        if (n.getAttributes().getNamedItem("requestplugin") != null &&
                n.getAttributes().getNamedItem("requestplugin").getNodeValue() != null) {
          dest.setRequestPlugin(n.getAttributes().getNamedItem("requestplugin").getNodeValue());
        }
        if (n.getAttributes().getNamedItem("replyplugin") != null &&
                n.getAttributes().getNamedItem("replyplugin").getNodeValue() != null) {
          dest.setReplyPlugin(n.getAttributes().getNamedItem("replyplugin").getNodeValue());
        }
        if (n.getAttributes().getNamedItem("transportplugin") != null &&
                n.getAttributes().getNamedItem("transportplugin").getNodeValue() != null) {
          dest.setTransportPlugin(n.getAttributes().getNamedItem("transportplugin").getNodeValue());
        }
        if (n.getAttributes().getNamedItem("chunksize") != null &&
                n.getAttributes().getNamedItem("chunksize").getNodeValue() != null) {
          dest.setChunkSize(Long.parseLong(n.getAttributes().getNamedItem("chunksize").getNodeValue()));
        }
        if (n.getAttributes().getNamedItem("shutdowntimeout") != null &&
                n.getAttributes().getNamedItem("shutdowntimeout").getNodeValue() != null) {
          dest.setShutdownTimeout(Long.parseLong(n.getAttributes().getNamedItem("shutdowntimeout").getNodeValue()));
        }
        //Now check for events....
        if (n.getChildNodes() != null && n.getChildNodes().getLength() > 0) {
          NodeList children = n.getChildNodes();
          for (int j = 0; j < children.getLength(); j++) {
            Node event = children.item(j);
            if (event.getNodeName() != null && event.getNodeName().equals("event")) {
              String eventName = event.getAttributes().getNamedItem("name").getNodeValue();
              if (eventName != null && eventName.trim().length() > 0) {
                Event eventPojo = new Event(eventName);
                dest.addToEvents(eventPojo);
              }
            }
          }
        }
        msgConfig.addToDestinations(dest);
      }
    }
    catch (Throwable t) {
    }
  }

  public void writeConfig() throws IOException {
    FileDeployer.writeStringToFile(msgConfig.asXML(), msgConfigFile);
  }

  public MessagingConfig getMessageConfig() {
    return msgConfig;
  }
}
