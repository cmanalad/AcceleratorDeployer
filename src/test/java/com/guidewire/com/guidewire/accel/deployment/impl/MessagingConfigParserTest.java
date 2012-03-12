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

    private File configDir = new File("C:\\repos/git/ClaimCenter/ClaimCenter"); 
    
    public void testMessageParsing() {
        MessagingConfigParser parser = new MessagingConfigParser(configDir);
        MessagingConfig config = parser.getMessageConfig();
        assertNotNull(config);
        assertEquals(27, config.getDestinations().size());
    }
    
    public void testGetDestinationByID() {
        MessagingConfigParser parser = new MessagingConfigParser(configDir);
        MessagingConfig config = parser.getMessageConfig();
        assertNotNull(config);
        Destination d = config.getDestinationById(1);
        assertNotNull(d);
        assertEquals("CUE", d.getName());
        assertEquals(3, d.getNumSenderThreads());
        assertEquals("CueMessageRequest", d.getRequestPlugin());
        assertNull(d.getReplyPlugin());
        assertEquals("CueTransportPlugin", d.getTransportPlugin());
        assertEquals(8, d.getEvents().size());
    }    
}
