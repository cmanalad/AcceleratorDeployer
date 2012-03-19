/*
 * An XML document type.
 * Localname: keyfilter
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.KeyfilterDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one keyfilter(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class KeyfilterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.KeyfilterDocument
{
    private static final long serialVersionUID = 1L;
    
    public KeyfilterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYFILTER$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "keyfilter");
    
    
    /**
     * Gets the "keyfilter" element
     */
    public com.guidewire.datamodel.KeyfilterDocument.Keyfilter getKeyfilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.KeyfilterDocument.Keyfilter target = null;
            target = (com.guidewire.datamodel.KeyfilterDocument.Keyfilter)get_store().find_element_user(KEYFILTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "keyfilter" element
     */
    public void setKeyfilter(com.guidewire.datamodel.KeyfilterDocument.Keyfilter keyfilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.KeyfilterDocument.Keyfilter target = null;
            target = (com.guidewire.datamodel.KeyfilterDocument.Keyfilter)get_store().find_element_user(KEYFILTER$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.KeyfilterDocument.Keyfilter)get_store().add_element_user(KEYFILTER$0);
            }
            target.set(keyfilter);
        }
    }
    
    /**
     * Appends and returns a new empty "keyfilter" element
     */
    public com.guidewire.datamodel.KeyfilterDocument.Keyfilter addNewKeyfilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.KeyfilterDocument.Keyfilter target = null;
            target = (com.guidewire.datamodel.KeyfilterDocument.Keyfilter)get_store().add_element_user(KEYFILTER$0);
            return target;
        }
    }
    /**
     * An XML keyfilter(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class KeyfilterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.KeyfilterDocument.Keyfilter
    {
        private static final long serialVersionUID = 1L;
        
        public KeyfilterImpl(org.apache.xmlbeans.SchemaType sType)
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
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
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
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
                }
                target.set(name);
            }
        }
    }
}
