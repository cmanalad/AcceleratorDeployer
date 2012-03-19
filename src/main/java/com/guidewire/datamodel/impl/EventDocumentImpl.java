/*
 * An XML document type.
 * Localname: event
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.EventDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one event(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class EventDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.EventDocument
{
    private static final long serialVersionUID = 1L;
    
    public EventDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENT$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "event");
    
    
    /**
     * Gets the "event" element
     */
    public com.guidewire.datamodel.EventDocument.Event getEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.EventDocument.Event target = null;
            target = (com.guidewire.datamodel.EventDocument.Event)get_store().find_element_user(EVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "event" element
     */
    public void setEvent(com.guidewire.datamodel.EventDocument.Event event)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.EventDocument.Event target = null;
            target = (com.guidewire.datamodel.EventDocument.Event)get_store().find_element_user(EVENT$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.EventDocument.Event)get_store().add_element_user(EVENT$0);
            }
            target.set(event);
        }
    }
    
    /**
     * Appends and returns a new empty "event" element
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
     * An XML event(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class EventImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.EventDocument.Event
    {
        private static final long serialVersionUID = 1L;
        
        public EventImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DESCRIPTION$0 = 
            new javax.xml.namespace.QName("", "description");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        
        
        /**
         * Gets the "description" attribute
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "description" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$0);
                return target;
            }
        }
        
        /**
         * Sets the "description" attribute
         */
        public void setDescription(java.lang.String description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$0);
                }
                target.setStringValue(description);
            }
        }
        
        /**
         * Sets (as xml) the "description" attribute
         */
        public void xsetDescription(org.apache.xmlbeans.XmlString description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTION$0);
                }
                target.set(description);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                return target;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
                }
                target.set(name);
            }
        }
    }
}
