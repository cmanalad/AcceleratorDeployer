package com.guidewire.accel.parser.locale;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: tp23161
 * Date: 13/03/12
 * Time: 08:15
 * To change this template use File | Settings | File Templates.
 */
public class LocalizationsParser {

  private LocalizationsParser() {
  }

  public static String getLocaleFromLocalizationsXml(File localizationsFile) {
    String retval = "en_US";
    try {
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      factory.setValidating(false);
      factory.setNamespaceAware(false);
      DocumentBuilder builder = factory.newDocumentBuilder();
      Document locales = builder.parse(localizationsFile);
      //Now we have a dom...

      NodeList nodes = locales.getElementsByTagName("Localization");
      for (int i = 0; i < nodes.getLength(); i++) {
        Node n = nodes.item(i);
        if (n.getNodeName().equals("Localization")) {
          NodeList possibleLocales = n.getChildNodes();
          for (int j = 0; j < possibleLocales.getLength(); j++) {
            Node localeNode = possibleLocales.item(j);
            if (localeNode.getNodeName().endsWith("Locale")) {
              String possibleLocaleValue = localeNode.getAttributes().getNamedItem("code").getNodeValue();
              if (possibleLocaleValue != null && possibleLocaleValue.trim().length() > 0) {
                retval = possibleLocaleValue.trim();
              }
            }
          }
        }
      }
    } catch (Throwable t) {
    }
    return retval;
  }
}
