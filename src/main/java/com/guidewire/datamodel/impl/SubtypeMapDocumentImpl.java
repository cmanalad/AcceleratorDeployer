/*
 * An XML document type.
 * Localname: subtype-map
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.SubtypeMapDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one subtype-map(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class SubtypeMapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.SubtypeMapDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubtypeMapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBTYPEMAP$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "subtype-map");
    
    
    /**
     * Gets the "subtype-map" element
     */
    public com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap getSubtypeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap target = null;
            target = (com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap)get_store().find_element_user(SUBTYPEMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subtype-map" element
     */
    public void setSubtypeMap(com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap subtypeMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap target = null;
            target = (com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap)get_store().find_element_user(SUBTYPEMAP$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap)get_store().add_element_user(SUBTYPEMAP$0);
            }
            target.set(subtypeMap);
        }
    }
    
    /**
     * Appends and returns a new empty "subtype-map" element
     */
    public com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap addNewSubtypeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap target = null;
            target = (com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap)get_store().add_element_user(SUBTYPEMAP$0);
            return target;
        }
    }
    /**
     * An XML subtype-map(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class SubtypeMapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap
    {
        private static final long serialVersionUID = 1L;
        
        public SubtypeMapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CUSTOMACCESSOR$0 = 
            new javax.xml.namespace.QName("", "customAccessor");
        private static final javax.xml.namespace.QName PROPERTYPREFIX$2 = 
            new javax.xml.namespace.QName("", "propertyPrefix");
        
        
        /**
         * Gets the "customAccessor" attribute
         */
        public java.lang.String getCustomAccessor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTOMACCESSOR$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CUSTOMACCESSOR$0);
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
                return get_store().find_attribute_user(CUSTOMACCESSOR$0) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTOMACCESSOR$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CUSTOMACCESSOR$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CUSTOMACCESSOR$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CUSTOMACCESSOR$0);
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
                get_store().remove_attribute(CUSTOMACCESSOR$0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTYPREFIX$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTYPREFIX$2);
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
                return get_store().find_attribute_user(PROPERTYPREFIX$2) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTYPREFIX$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTYPREFIX$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTYPREFIX$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTYPREFIX$2);
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
                get_store().remove_attribute(PROPERTYPREFIX$2);
            }
        }
    }
}
