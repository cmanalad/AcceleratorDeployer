package com.guidewire.accel.parser.Messaging.pojo;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: tp23161
 * Date: 12/03/12
 * Time: 14:10
 * To change this template use File | Settings | File Templates.
 */
public class Event implements Serializable {

    private String name;

    public Event(String eventName) {
        this.name = eventName;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String asXML() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n      <event\n        name=\"");
        sb.append(name);
        sb.append("\"/>");
        return sb.toString();
    }
}
