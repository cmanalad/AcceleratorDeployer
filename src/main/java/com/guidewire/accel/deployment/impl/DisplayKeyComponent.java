package com.guidewire.accel.deployment.impl;

import com.guidewire.accel.deployment.DeployableComponent;
import com.guidewire.accel.parser.locale.LocalizationsParser;
import com.guidewire.accel.util.AcceleratorHelper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.Set;

/**
 * User: afogleson
 * Date: 3/12/12
 * Time: 10:29 PM
 */
public class DisplayKeyComponent implements DeployableComponent {

  private File displaykeys;

  public DisplayKeyComponent(File displaykeyFile) {
    displaykeys = displaykeyFile;
  }

  /**
   * this is not that hard... the hardest thing is determining the available locales
   *
   * @return true if the displaykeys have been added/modified.
   */
  @Override
  public boolean deploy() {
    //figure out our displaykeys. Need to check for locales. find the right display.properties and then modify it.
    File productRoot = AcceleratorHelper.getInstance().getProductRoot();
    String localeBaseDir = "modules" + File.separator + "configuration" + File.separator + "config" + File.separator + "locale";
    File localeDir = new File(productRoot.getAbsolutePath() + File.separator + localeBaseDir);
    File[] localeFiles = localeDir.listFiles();
    String localeFound = "en_US";
    if (localeFiles != null && localeFiles.length > 0) {
      for (File f : localeFiles) {
        if (!f.isDirectory() && f.getName().equals("localization.xml")) {
          //Now we just have to do some minimal parsing to find the actual locale to use.
          String possibleLocale = LocalizationsParser.getLocaleFromLocalizationsXml(f);
          if (possibleLocale != null && possibleLocale.trim().length() > 0) {
            //if a display.properties file exists then we can use this file.
            File possibleLocaleFile = new File(localeDir + File.separator + possibleLocale + File.separator + "display.properties");
            if (possibleLocaleFile.exists()) {
              localeFound = possibleLocale;
            }
          }
        }
        //if we havent found one note that we will just continue on our way with the US default file.
      }
    }
    else {
      //Huh? must be a bad product dir.
      return false;
    }
    File productKeyFile = new File(localeDir + File.separator + localeFound + File.separator + "display.properties");
    if (!productKeyFile.exists()) {
      if (localeFound.endsWith("_US")) {
        //return a false we cannot move on. this should never happen. 
        return false;
      }
      localeFound = "en_US";
      productKeyFile = new File(localeDir + File.separator + localeFound + File.separator + "display.properties");
      if (!productKeyFile.exists()) {
        System.out.println("Cannot handle display keys as the file is not present.");
        return false;
      }
    }

    FileInputStream in = null;
    FileOutputStream out = null;

    try {
      Properties props = new Properties();
      in = new FileInputStream(displaykeys);
      props.load(in);
      in.close();
      Properties prodKeys = new Properties();
      in = new FileInputStream(productKeyFile);
      prodKeys.load(in);
      in.close();

      //we now have our displaykeys.
      Set<Object> keys = props.keySet();
      for (Object key : keys) {
        Object val = props.get(key);
        prodKeys.put(key, val);
      }
      out = new FileOutputStream(productKeyFile);
      prodKeys.store(out, null);
      out.flush();
    }
    catch (Throwable t) {
      System.out.println("Cannot handle display keys due to error: " + t.getLocalizedMessage());
      return false;
    }
    finally {
      try {
        in.close();
      }
      catch (Throwable t) {
      }
      try {
        out.close();
      }
      catch (Throwable t) {
      }
    }
    return true;
  }

  @Override
  public String getComponentName() {
    return "displayKeyComponent";
  }
}
