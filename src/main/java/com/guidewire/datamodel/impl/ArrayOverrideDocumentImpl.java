/*
 * An XML document type.
 * Localname: array-override
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.ArrayOverrideDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one array-override(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class ArrayOverrideDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ArrayOverrideDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOverrideDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOVERRIDE$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "array-override");
    
    
    /**
     * Gets the "array-override" element
     */
    public com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride getArrayOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride target = null;
            target = (com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride)get_store().find_element_user(ARRAYOVERRIDE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "array-override" element
     */
    public void setArrayOverride(com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride arrayOverride)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride target = null;
            target = (com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride)get_store().find_element_user(ARRAYOVERRIDE$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride)get_store().add_element_user(ARRAYOVERRIDE$0);
            }
            target.set(arrayOverride);
        }
    }
    
    /**
     * Appends and returns a new empty "array-override" element
     */
    public com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride addNewArrayOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride target = null;
            target = (com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride)get_store().add_element_user(ARRAYOVERRIDE$0);
            return target;
        }
    }
    /**
     * An XML array-override(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class ArrayOverrideImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride
    {
        private static final long serialVersionUID = 1L;
        
        public ArrayOverrideImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName TRIGGERSVALIDATION$2 = 
            new javax.xml.namespace.QName("", "triggersValidation");
        
        
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
        
        /**
         * Gets the "triggersValidation" attribute
         */
        public boolean getTriggersValidation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRIGGERSVALIDATION$2);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "triggersValidation" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetTriggersValidation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRIGGERSVALIDATION$2);
                return target;
            }
        }
        
        /**
         * True if has "triggersValidation" attribute
         */
        public boolean isSetTriggersValidation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TRIGGERSVALIDATION$2) != null;
            }
        }
        
        /**
         * Sets the "triggersValidation" attribute
         */
        public void setTriggersValidation(boolean triggersValidation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRIGGERSVALIDATION$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRIGGERSVALIDATION$2);
                }
                target.setBooleanValue(triggersValidation);
            }
        }
        
        /**
         * Sets (as xml) the "triggersValidation" attribute
         */
        public void xsetTriggersValidation(org.apache.xmlbeans.XmlBoolean triggersValidation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRIGGERSVALIDATION$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TRIGGERSVALIDATION$2);
                }
                target.set(triggersValidation);
            }
        }
        
        /**
         * Unsets the "triggersValidation" attribute
         */
        public void unsetTriggersValidation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TRIGGERSVALIDATION$2);
            }
        }
    }
}
