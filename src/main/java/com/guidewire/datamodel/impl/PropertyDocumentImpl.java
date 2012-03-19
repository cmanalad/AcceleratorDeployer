/*
 * An XML document type.
 * Localname: property
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.PropertyDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one property(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class PropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.PropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public PropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTY$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "property");
    
    
    /**
     * Gets the "property" element
     */
    public com.guidewire.datamodel.PropertyDocument.Property getProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.PropertyDocument.Property target = null;
            target = (com.guidewire.datamodel.PropertyDocument.Property)get_store().find_element_user(PROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "property" element
     */
    public void setProperty(com.guidewire.datamodel.PropertyDocument.Property property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.PropertyDocument.Property target = null;
            target = (com.guidewire.datamodel.PropertyDocument.Property)get_store().find_element_user(PROPERTY$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.PropertyDocument.Property)get_store().add_element_user(PROPERTY$0);
            }
            target.set(property);
        }
    }
    
    /**
     * Appends and returns a new empty "property" element
     */
    public com.guidewire.datamodel.PropertyDocument.Property addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.PropertyDocument.Property target = null;
            target = (com.guidewire.datamodel.PropertyDocument.Property)get_store().add_element_user(PROPERTY$0);
            return target;
        }
    }
    /**
     * An XML property(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class PropertyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.PropertyDocument.Property
    {
        private static final long serialVersionUID = 1L;
        
        public PropertyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName NULLOK$2 = 
            new javax.xml.namespace.QName("", "nullOk");
        private static final javax.xml.namespace.QName VALUE$4 = 
            new javax.xml.namespace.QName("", "value");
        
        
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
        
        /**
         * Gets the "nullOk" attribute
         */
        public java.lang.String getNullOk()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLOK$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "nullOk" attribute
         */
        public org.apache.xmlbeans.XmlString xgetNullOk()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NULLOK$2);
                return target;
            }
        }
        
        /**
         * True if has "nullOk" attribute
         */
        public boolean isSetNullOk()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NULLOK$2) != null;
            }
        }
        
        /**
         * Sets the "nullOk" attribute
         */
        public void setNullOk(java.lang.String nullOk)
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
                target.setStringValue(nullOk);
            }
        }
        
        /**
         * Sets (as xml) the "nullOk" attribute
         */
        public void xsetNullOk(org.apache.xmlbeans.XmlString nullOk)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NULLOK$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NULLOK$2);
                }
                target.set(nullOk);
            }
        }
        
        /**
         * Unsets the "nullOk" attribute
         */
        public void unsetNullOk()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NULLOK$2);
            }
        }
        
        /**
         * Gets the "value" attribute
         */
        public java.lang.String getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public org.apache.xmlbeans.XmlString xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$4);
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(java.lang.String value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$4);
                }
                target.setStringValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(org.apache.xmlbeans.XmlString value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$4);
                }
                target.set(value);
            }
        }
    }
}
