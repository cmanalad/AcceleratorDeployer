/*
 * An XML document type.
 * Localname: include
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.IncludeDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one include(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class IncludeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.IncludeDocument
{
    private static final long serialVersionUID = 1L;
    
    public IncludeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUDE$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "include");
    
    
    /**
     * Gets the "include" element
     */
    public com.guidewire.datamodel.IncludeDocument.Include getInclude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.IncludeDocument.Include target = null;
            target = (com.guidewire.datamodel.IncludeDocument.Include)get_store().find_element_user(INCLUDE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "include" element
     */
    public void setInclude(com.guidewire.datamodel.IncludeDocument.Include include)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.IncludeDocument.Include target = null;
            target = (com.guidewire.datamodel.IncludeDocument.Include)get_store().find_element_user(INCLUDE$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.IncludeDocument.Include)get_store().add_element_user(INCLUDE$0);
            }
            target.set(include);
        }
    }
    
    /**
     * Appends and returns a new empty "include" element
     */
    public com.guidewire.datamodel.IncludeDocument.Include addNewInclude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.IncludeDocument.Include target = null;
            target = (com.guidewire.datamodel.IncludeDocument.Include)get_store().add_element_user(INCLUDE$0);
            return target;
        }
    }
    /**
     * An XML include(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class IncludeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.IncludeDocument.Include
    {
        private static final long serialVersionUID = 1L;
        
        public IncludeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CATEGORY$0 = 
            new javax.xml.namespace.QName("", "category");
        private static final javax.xml.namespace.QName CODE$2 = 
            new javax.xml.namespace.QName("", "code");
        
        
        /**
         * Gets the "category" attribute
         */
        public java.lang.String getCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORY$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "category" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(CATEGORY$0);
                return target;
            }
        }
        
        /**
         * True if has "category" attribute
         */
        public boolean isSetCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CATEGORY$0) != null;
            }
        }
        
        /**
         * Sets the "category" attribute
         */
        public void setCategory(java.lang.String category)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORY$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CATEGORY$0);
                }
                target.setStringValue(category);
            }
        }
        
        /**
         * Sets (as xml) the "category" attribute
         */
        public void xsetCategory(org.apache.xmlbeans.XmlNMTOKEN category)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(CATEGORY$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(CATEGORY$0);
                }
                target.set(category);
            }
        }
        
        /**
         * Unsets the "category" attribute
         */
        public void unsetCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CATEGORY$0);
            }
        }
        
        /**
         * Gets the "code" attribute
         */
        public java.lang.String getCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "code" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(CODE$2);
                return target;
            }
        }
        
        /**
         * True if has "code" attribute
         */
        public boolean isSetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CODE$2) != null;
            }
        }
        
        /**
         * Sets the "code" attribute
         */
        public void setCode(java.lang.String code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$2);
                }
                target.setStringValue(code);
            }
        }
        
        /**
         * Sets (as xml) the "code" attribute
         */
        public void xsetCode(org.apache.xmlbeans.XmlNMTOKEN code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(CODE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(CODE$2);
                }
                target.set(code);
            }
        }
        
        /**
         * Unsets the "code" attribute
         */
        public void unsetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CODE$2);
            }
        }
    }
}
