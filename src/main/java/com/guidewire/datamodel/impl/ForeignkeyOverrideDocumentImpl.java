/*
 * An XML document type.
 * Localname: foreignkey-override
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.ForeignkeyOverrideDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one foreignkey-override(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class ForeignkeyOverrideDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ForeignkeyOverrideDocument
{
    private static final long serialVersionUID = 1L;
    
    public ForeignkeyOverrideDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FOREIGNKEYOVERRIDE$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "foreignkey-override");
    
    
    /**
     * Gets the "foreignkey-override" element
     */
    public com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride getForeignkeyOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride target = null;
            target = (com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride)get_store().find_element_user(FOREIGNKEYOVERRIDE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "foreignkey-override" element
     */
    public void setForeignkeyOverride(com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride foreignkeyOverride)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride target = null;
            target = (com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride)get_store().find_element_user(FOREIGNKEYOVERRIDE$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride)get_store().add_element_user(FOREIGNKEYOVERRIDE$0);
            }
            target.set(foreignkeyOverride);
        }
    }
    
    /**
     * Appends and returns a new empty "foreignkey-override" element
     */
    public com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride addNewForeignkeyOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride target = null;
            target = (com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride)get_store().add_element_user(FOREIGNKEYOVERRIDE$0);
            return target;
        }
    }
    /**
     * An XML foreignkey-override(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class ForeignkeyOverrideImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride
    {
        private static final long serialVersionUID = 1L;
        
        public ForeignkeyOverrideImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName NULLOK$2 = 
            new javax.xml.namespace.QName("", "nullok");
        private static final javax.xml.namespace.QName TRIGGERSVALIDATION$4 = 
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
         * Gets the "nullok" attribute
         */
        public boolean getNullok()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLOK$2);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NULLOK$2);
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
                return get_store().find_attribute_user(NULLOK$2) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLOK$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLOK$2);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NULLOK$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NULLOK$2);
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
                get_store().remove_attribute(NULLOK$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRIGGERSVALIDATION$4);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRIGGERSVALIDATION$4);
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
                return get_store().find_attribute_user(TRIGGERSVALIDATION$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRIGGERSVALIDATION$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRIGGERSVALIDATION$4);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRIGGERSVALIDATION$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TRIGGERSVALIDATION$4);
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
                get_store().remove_attribute(TRIGGERSVALIDATION$4);
            }
        }
    }
}
