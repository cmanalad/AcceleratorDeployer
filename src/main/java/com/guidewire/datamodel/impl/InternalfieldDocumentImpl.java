/*
 * An XML document type.
 * Localname: internalfield
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.InternalfieldDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one internalfield(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class InternalfieldDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.InternalfieldDocument
{
    private static final long serialVersionUID = 1L;
    
    public InternalfieldDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERNALFIELD$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "internalfield");
    
    
    /**
     * Gets the "internalfield" element
     */
    public com.guidewire.datamodel.InternalfieldDocument.Internalfield getInternalfield()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.InternalfieldDocument.Internalfield target = null;
            target = (com.guidewire.datamodel.InternalfieldDocument.Internalfield)get_store().find_element_user(INTERNALFIELD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "internalfield" element
     */
    public void setInternalfield(com.guidewire.datamodel.InternalfieldDocument.Internalfield internalfield)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.InternalfieldDocument.Internalfield target = null;
            target = (com.guidewire.datamodel.InternalfieldDocument.Internalfield)get_store().find_element_user(INTERNALFIELD$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.InternalfieldDocument.Internalfield)get_store().add_element_user(INTERNALFIELD$0);
            }
            target.set(internalfield);
        }
    }
    
    /**
     * Appends and returns a new empty "internalfield" element
     */
    public com.guidewire.datamodel.InternalfieldDocument.Internalfield addNewInternalfield()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.InternalfieldDocument.Internalfield target = null;
            target = (com.guidewire.datamodel.InternalfieldDocument.Internalfield)get_store().add_element_user(INTERNALFIELD$0);
            return target;
        }
    }
    /**
     * An XML internalfield(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class InternalfieldImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.InternalfieldDocument.Internalfield
    {
        private static final long serialVersionUID = 1L;
        
        public InternalfieldImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
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
        public org.apache.xmlbeans.XmlNMTOKEN xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlNMTOKEN name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(NAME$0);
                }
                target.set(name);
            }
        }
    }
}
