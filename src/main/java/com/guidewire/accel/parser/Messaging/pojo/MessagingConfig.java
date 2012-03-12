package com.guidewire.accel.parser.Messaging.pojo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: tp23161
 * Date: 12/03/12
 * Time: 14:13
 * To change this template use File | Settings | File Templates.
 */
public class MessagingConfig implements Serializable {

  private ArrayList<Destination> destinations = new ArrayList<Destination>();

  public MessagingConfig() {
  }

  public void addToDestinations(Destination dest) {
    destinations.add(dest);
  }

  public ArrayList<Destination> getDestinations() {
    return destinations;
  }

  public Destination getDestinationById(int id) {
    for (Destination d : destinations) {
      if (d.getId() == id) {
        return d;
      }
    }
    return null;
  }

  public String asXML() {
    StringBuilder sb = new StringBuilder();
    sb.append("<?xml version=\"1.0\"?>\n<messaging-config\n  xmlns=\"http://guidewire.com/messaging-config\">\n");
    sb.append("  <!--   ==============================================================================\n");
    sb.append("   Messaging Configuration\n");
    sb.append("  ============================================================================== -->\n");
    sb.append("  <messaging>\n");
    for (Destination dest : destinations) {
      sb.append(dest.asXML());
    }
    sb.append("  </messaging>\n</messaging-config>");
    return sb.toString();
  }
}
