/*
 * An XML document type.
 * Localname: typelist-map
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.TypelistMapDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one typelist-map(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class TypelistMapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.TypelistMapDocument
{
    private static final long serialVersionUID = 1L;
    
    public TypelistMapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPELISTMAP$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "typelist-map");
    
    
    /**
     * Gets the "typelist-map" element
     */
    public com.guidewire.datamodel.TypelistMapDocument.TypelistMap getTypelistMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.TypelistMapDocument.TypelistMap target = null;
            target = (com.guidewire.datamodel.TypelistMapDocument.TypelistMap)get_store().find_element_user(TYPELISTMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "typelist-map" element
     */
    public void setTypelistMap(com.guidewire.datamodel.TypelistMapDocument.TypelistMap typelistMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.TypelistMapDocument.TypelistMap target = null;
            target = (com.guidewire.datamodel.TypelistMapDocument.TypelistMap)get_store().find_element_user(TYPELISTMAP$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.TypelistMapDocument.TypelistMap)get_store().add_element_user(TYPELISTMAP$0);
            }
            target.set(typelistMap);
        }
    }
    
    /**
     * Appends and returns a new empty "typelist-map" element
     */
    public com.guidewire.datamodel.TypelistMapDocument.TypelistMap addNewTypelistMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.TypelistMapDocument.TypelistMap target = null;
            target = (com.guidewire.datamodel.TypelistMapDocument.TypelistMap)get_store().add_element_user(TYPELISTMAP$0);
            return target;
        }
    }
    /**
     * An XML typelist-map(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class TypelistMapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.TypelistMapDocument.TypelistMap
    {
        private static final long serialVersionUID = 1L;
        
        public TypelistMapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CUSTOMACCESSOR$0 = 
            new javax.xml.namespace.QName("", "customAccessor");
        private static final javax.xml.namespace.QName FIELD$2 = 
            new javax.xml.namespace.QName("", "field");
        private static final javax.xml.namespace.QName PROPERTYPREFIX$4 = 
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
         * Gets the "field" attribute
         */
        public java.lang.String getField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELD$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELD$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELD$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELD$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELD$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIELD$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTYPREFIX$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTYPREFIX$4);
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
                return get_store().find_attribute_user(PROPERTYPREFIX$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTYPREFIX$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTYPREFIX$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTYPREFIX$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTYPREFIX$4);
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
                get_store().remove_attribute(PROPERTYPREFIX$4);
            }
        }
    }
}
