/*
 * An XML document type.
 * Localname: typekey-override
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.TypekeyOverrideDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one typekey-override(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class TypekeyOverrideDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.TypekeyOverrideDocument
{
    private static final long serialVersionUID = 1L;
    
    public TypekeyOverrideDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPEKEYOVERRIDE$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "typekey-override");
    
    
    /**
     * Gets the "typekey-override" element
     */
    public com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride getTypekeyOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride target = null;
            target = (com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride)get_store().find_element_user(TYPEKEYOVERRIDE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "typekey-override" element
     */
    public void setTypekeyOverride(com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride typekeyOverride)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride target = null;
            target = (com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride)get_store().find_element_user(TYPEKEYOVERRIDE$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride)get_store().add_element_user(TYPEKEYOVERRIDE$0);
            }
            target.set(typekeyOverride);
        }
    }
    
    /**
     * Appends and returns a new empty "typekey-override" element
     */
    public com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride addNewTypekeyOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride target = null;
            target = (com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride)get_store().add_element_user(TYPEKEYOVERRIDE$0);
            return target;
        }
    }
    /**
     * An XML typekey-override(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class TypekeyOverrideImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride
    {
        private static final long serialVersionUID = 1L;
        
        public TypekeyOverrideImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DEFAULT$0 = 
            new javax.xml.namespace.QName("", "default");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName NULLOK$4 = 
            new javax.xml.namespace.QName("", "nullok");
        
        
        /**
         * Gets the "default" attribute
         */
        public java.lang.String getDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(DEFAULT$0);
                return target;
            }
        }
        
        /**
         * True if has "default" attribute
         */
        public boolean isSetDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULT$0) != null;
            }
        }
        
        /**
         * Sets the "default" attribute
         */
        public void setDefault(java.lang.String xdefault)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULT$0);
                }
                target.setStringValue(xdefault);
            }
        }
        
        /**
         * Sets (as xml) the "default" attribute
         */
        public void xsetDefault(org.apache.xmlbeans.XmlNMTOKEN xdefault)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(DEFAULT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(DEFAULT$0);
                }
                target.set(xdefault);
            }
        }
        
        /**
         * Unsets the "default" attribute
         */
        public void unsetDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULT$0);
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
        public org.apache.xmlbeans.XmlNMTOKEN xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$2);
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
        public void xsetName(org.apache.xmlbeans.XmlNMTOKEN name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(NAME$2);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "nullok" attribute
         */
        public boolean getNullok()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLOK$4);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "nullok" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetNullok()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NULLOK$4);
                return target;
            }
        }
        
        /**
         * True if has "nullok" attribute
         */
        public boolean isSetNullok()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NULLOK$4) != null;
            }
        }
        
        /**
         * Sets the "nullok" attribute
         */
        public void setNullok(boolean nullok)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLOK$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLOK$4);
                }
                target.setBooleanValue(nullok);
            }
        }
        
        /**
         * Sets (as xml) the "nullok" attribute
         */
        public void xsetNullok(org.apache.xmlbeans.XmlBoolean nullok)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NULLOK$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NULLOK$4);
                }
                target.set(nullok);
            }
        }
        
        /**
         * Unsets the "nullok" attribute
         */
        public void unsetNullok()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NULLOK$4);
            }
        }
    }
}
