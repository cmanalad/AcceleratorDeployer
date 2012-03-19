/*
 * An XML document type.
 * Localname: columnParam
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.ColumnParamDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one columnParam(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class ColumnParamDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ColumnParamDocument
{
    private static final long serialVersionUID = 1L;
    
    public ColumnParamDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLUMNPARAM$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "columnParam");
    
    
    /**
     * Gets the "columnParam" element
     */
    public com.guidewire.datamodel.ColumnParamDocument.ColumnParam getColumnParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ColumnParamDocument.ColumnParam target = null;
            target = (com.guidewire.datamodel.ColumnParamDocument.ColumnParam)get_store().find_element_user(COLUMNPARAM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "columnParam" element
     */
    public void setColumnParam(com.guidewire.datamodel.ColumnParamDocument.ColumnParam columnParam)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ColumnParamDocument.ColumnParam target = null;
            target = (com.guidewire.datamodel.ColumnParamDocument.ColumnParam)get_store().find_element_user(COLUMNPARAM$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.ColumnParamDocument.ColumnParam)get_store().add_element_user(COLUMNPARAM$0);
            }
            target.set(columnParam);
        }
    }
    
    /**
     * Appends and returns a new empty "columnParam" element
     */
    public com.guidewire.datamodel.ColumnParamDocument.ColumnParam addNewColumnParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ColumnParamDocument.ColumnParam target = null;
            target = (com.guidewire.datamodel.ColumnParamDocument.ColumnParam)get_store().add_element_user(COLUMNPARAM$0);
            return target;
        }
    }
    /**
     * An XML columnParam(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class ColumnParamImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ColumnParamDocument.ColumnParam
    {
        private static final long serialVersionUID = 1L;
        
        public ColumnParamImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName VALUE$2 = 
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
         * Gets the "value" attribute
         */
        public java.lang.String getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
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
        public org.apache.xmlbeans.XmlNMTOKEN xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(VALUE$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$2);
                }
                target.setStringValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(org.apache.xmlbeans.XmlNMTOKEN value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(VALUE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(VALUE$2);
                }
                target.set(value);
            }
        }
    }
}
