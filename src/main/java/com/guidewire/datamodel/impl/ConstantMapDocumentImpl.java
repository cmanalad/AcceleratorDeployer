/*
 * An XML document type.
 * Localname: constant-map
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.ConstantMapDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one constant-map(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class ConstantMapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ConstantMapDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConstantMapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONSTANTMAP$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "constant-map");
    
    
    /**
     * Gets the "constant-map" element
     */
    public com.guidewire.datamodel.ConstantMapDocument.ConstantMap getConstantMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ConstantMapDocument.ConstantMap target = null;
            target = (com.guidewire.datamodel.ConstantMapDocument.ConstantMap)get_store().find_element_user(CONSTANTMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "constant-map" element
     */
    public void setConstantMap(com.guidewire.datamodel.ConstantMapDocument.ConstantMap constantMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ConstantMapDocument.ConstantMap target = null;
            target = (com.guidewire.datamodel.ConstantMapDocument.ConstantMap)get_store().find_element_user(CONSTANTMAP$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.ConstantMapDocument.ConstantMap)get_store().add_element_user(CONSTANTMAP$0);
            }
            target.set(constantMap);
        }
    }
    
    /**
     * Appends and returns a new empty "constant-map" element
     */
    public com.guidewire.datamodel.ConstantMapDocument.ConstantMap addNewConstantMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ConstantMapDocument.ConstantMap target = null;
            target = (com.guidewire.datamodel.ConstantMapDocument.ConstantMap)get_store().add_element_user(CONSTANTMAP$0);
            return target;
        }
    }
    /**
     * An XML constant-map(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class ConstantMapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ConstantMapDocument.ConstantMap
    {
        private static final long serialVersionUID = 1L;
        
        public ConstantMapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PROPERTY$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "property");
        private static final javax.xml.namespace.QName CUSTOMACCESSOR$2 = 
            new javax.xml.namespace.QName("", "customAccessor");
        private static final javax.xml.namespace.QName FIELD$4 = 
            new javax.xml.namespace.QName("", "field");
        private static final javax.xml.namespace.QName PROPERTYPREFIX$6 = 
            new javax.xml.namespace.QName("", "propertyPrefix");
        
        
        /**
         * Gets array of all "property" elements
         */
        public com.guidewire.datamodel.PropertyDocument.Property[] getPropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PROPERTY$0, targetList);
                com.guidewire.datamodel.PropertyDocument.Property[] result = new com.guidewire.datamodel.PropertyDocument.Property[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "property" element
         */
        public com.guidewire.datamodel.PropertyDocument.Property getPropertyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.PropertyDocument.Property target = null;
                target = (com.guidewire.datamodel.PropertyDocument.Property)get_store().find_element_user(PROPERTY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "property" element
         */
        public int sizeOfPropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROPERTY$0);
            }
        }
        
        /**
         * Sets array of all "property" element
         */
        public void setPropertyArray(com.guidewire.datamodel.PropertyDocument.Property[] propertyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(propertyArray, PROPERTY$0);
            }
        }
        
        /**
         * Sets ith "property" element
         */
        public void setPropertyArray(int i, com.guidewire.datamodel.PropertyDocument.Property property)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.PropertyDocument.Property target = null;
                target = (com.guidewire.datamodel.PropertyDocument.Property)get_store().find_element_user(PROPERTY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(property);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "property" element
         */
        public com.guidewire.datamodel.PropertyDocument.Property insertNewProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.PropertyDocument.Property target = null;
                target = (com.guidewire.datamodel.PropertyDocument.Property)get_store().insert_element_user(PROPERTY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "property" element
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
         * Removes the ith "property" element
         */
        public void removeProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROPERTY$0, i);
            }
        }
        
        /**
         * Gets the "customAccessor" attribute
         */
        public java.lang.String getCustomAccessor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTOMACCESSOR$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "customAccessor" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCustomAccessor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CUSTOMACCESSOR$2);
                return target;
            }
        }
        
        /**
         * True if has "customAccessor" attribute
         */
        public boolean isSetCustomAccessor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CUSTOMACCESSOR$2) != null;
            }
        }
        
        /**
         * Sets the "customAccessor" attribute
         */
        public void setCustomAccessor(java.lang.String customAccessor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTOMACCESSOR$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CUSTOMACCESSOR$2);
                }
                target.setStringValue(customAccessor);
            }
        }
        
        /**
         * Sets (as xml) the "customAccessor" attribute
         */
        public void xsetCustomAccessor(org.apache.xmlbeans.XmlString customAccessor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CUSTOMACCESSOR$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CUSTOMACCESSOR$2);
                }
                target.set(customAccessor);
            }
        }
        
        /**
         * Unsets the "customAccessor" attribute
         */
        public void unsetCustomAccessor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CUSTOMACCESSOR$2);
            }
        }
        
        /**
         * Gets the "field" attribute
         */
        public java.lang.String getField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELD$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "field" attribute
         */
        public org.apache.xmlbeans.XmlString xgetField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELD$4);
                return target;
            }
        }
        
        /**
         * Sets the "field" attribute
         */
        public void setField(java.lang.String field)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELD$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELD$4);
                }
                target.setStringValue(field);
            }
        }
        
        /**
         * Sets (as xml) the "field" attribute
         */
        public void xsetField(org.apache.xmlbeans.XmlString field)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELD$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIELD$4);
                }
                target.set(field);
            }
        }
        
        /**
         * Gets the "propertyPrefix" attribute
         */
        public java.lang.String getPropertyPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTYPREFIX$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "propertyPrefix" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPropertyPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTYPREFIX$6);
                return target;
            }
        }
        
        /**
         * True if has "propertyPrefix" attribute
         */
        public boolean isSetPropertyPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTYPREFIX$6) != null;
            }
        }
        
        /**
         * Sets the "propertyPrefix" attribute
         */
        public void setPropertyPrefix(java.lang.String propertyPrefix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTYPREFIX$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTYPREFIX$6);
                }
                target.setStringValue(propertyPrefix);
            }
        }
        
        /**
         * Sets (as xml) the "propertyPrefix" attribute
         */
        public void xsetPropertyPrefix(org.apache.xmlbeans.XmlString propertyPrefix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTYPREFIX$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTYPREFIX$6);
                }
                target.set(propertyPrefix);
            }
        }
        
        /**
         * Unsets the "propertyPrefix" attribute
         */
        public void unsetPropertyPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PROPERTYPREFIX$6);
            }
        }
    }
}
