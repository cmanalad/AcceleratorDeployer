/*
 * An XML document type.
 * Localname: events
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.EventsDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one events(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class EventsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.EventsDocument
{
    private static final long serialVersionUID = 1L;
    
    public EventsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENTS$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "events");
    
    
    /**
     * Gets the "events" element
     */
    public com.guidewire.datamodel.EventsDocument.Events getEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.EventsDocument.Events target = null;
            target = (com.guidewire.datamodel.EventsDocument.Events)get_store().find_element_user(EVENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "events" element
     */
    public void setEvents(com.guidewire.datamodel.EventsDocument.Events events)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.EventsDocument.Events target = null;
            target = (com.guidewire.datamodel.EventsDocument.Events)get_store().find_element_user(EVENTS$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.EventsDocument.Events)get_store().add_element_user(EVENTS$0);
            }
            target.set(events);
        }
    }
    
    /**
     * Appends and returns a new empty "events" element
     */
    public com.guidewire.datamodel.EventsDocument.Events addNewEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.EventsDocument.Events target = null;
            target = (com.guidewire.datamodel.EventsDocument.Events)get_store().add_element_user(EVENTS$0);
            return target;
        }
    }
    /**
     * An XML events(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class EventsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.EventsDocument.Events
    {
        private static final long serialVersionUID = 1L;
        
        public EventsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EVENT$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "event");
        
        
        /**
         * Gets array of all "event" elements
         */
        public com.guidewire.datamodel.EventDocument.Event[] getEventArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EVENT$0, targetList);
                com.guidewire.datamodel.EventDocument.Event[] result = new com.guidewire.datamodel.EventDocument.Event[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "event" element
         */
        public com.guidewire.datamodel.EventDocument.Event getEventArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.EventDocument.Event target = null;
                target = (com.guidewire.datamodel.EventDocument.Event)get_store().find_element_user(EVENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "event" element
         */
        public int sizeOfEventArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EVENT$0);
            }
        }
        
        /**
         * Sets array of all "event" element
         */
        public void setEventArray(com.guidewire.datamodel.EventDocument.Event[] eventArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(eventArray, EVENT$0);
            }
        }
        
        /**
         * Sets ith "event" element
         */
        public void setEventArray(int i, com.guidewire.datamodel.EventDocument.Event event)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.EventDocument.Event target = null;
                target = (com.guidewire.datamodel.EventDocument.Event)get_store().find_element_user(EVENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(event);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "event" element
         */
        public com.guidewire.datamodel.EventDocument.Event insertNewEvent(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.EventDocument.Event target = null;
                target = (com.guidewire.datamodel.EventDocument.Event)get_store().insert_element_user(EVENT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "event" element
         */
        public com.guidewire.datamodel.EventDocument.Event addNewEvent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.EventDocument.Event target = null;
                target = (com.guidewire.datamodel.EventDocument.Event)get_store().add_element_user(EVENT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "event" element
         */
        public void removeEvent(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EVENT$0, i);
            }
        }
    }
}
