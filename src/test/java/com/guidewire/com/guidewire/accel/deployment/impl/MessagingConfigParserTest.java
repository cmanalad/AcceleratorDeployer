package com.guidewire.com.guidewire.accel.deployment.impl;

import com.guidewire.accel.parser.Messaging.MessagingConfigParser;
import com.guidewire.accel.parser.Messaging.pojo.Destination;
import com.guidewire.accel.parser.Messaging.pojo.MessagingConfig;
import junit.framework.TestCase;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: tp23161
 * Date: 12/03/12
 * Time: 14:05
 * To change this template use File | Settings | File Templates.
 */
public class MessagingConfigParserTest extends TestCase {

  private File configDir = new File("src/test/resources/product/");

  public void testMessageParsing() {
    MessagingConfigParser parser = new MessagingConfigParser(configDir);
    MessagingConfig config = parser.getMessageConfig();
    assertNotNull(config);
    assertEquals(9, config.getDestinations().size());
  }

  public void testGetDestinationByID() {
    MessagingConfigParser parser = new MessagingConfigParser(configDir);
    MessagingConfig config = parser.getMessageConfig();
    assertNotNull(config);
    Destination d = config.getDestinationById(1);
    assertNotNull(d);
    assertEquals("MyDest", d.getName());
    assertEquals(3, d.getNumSenderThreads());
    assertEquals("MyMessageRequest", d.getRequestPlugin());
    assertNull(d.getReplyPlugin());
    assertEquals("MyTransportPlugin", d.getTransportPlugin());
    assertEquals(8, d.getEvents().size());
  }
}
