/*
 * An XML document type.
 * Localname: param
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.ParamDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one param(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class ParamDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ParamDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParamDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAM$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "param");
    
    
    /**
     * Gets the "param" element
     */
    public com.guidewire.datamodel.ParamDocument.Param getParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ParamDocument.Param target = null;
            target = (com.guidewire.datamodel.ParamDocument.Param)get_store().find_element_user(PARAM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "param" element
     */
    public void setParam(com.guidewire.datamodel.ParamDocument.Param param)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ParamDocument.Param target = null;
            target = (com.guidewire.datamodel.ParamDocument.Param)get_store().find_element_user(PARAM$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.ParamDocument.Param)get_store().add_element_user(PARAM$0);
            }
            target.set(param);
        }
    }
    
    /**
     * Appends and returns a new empty "param" element
     */
    public com.guidewire.datamodel.ParamDocument.Param addNewParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ParamDocument.Param target = null;
            target = (com.guidewire.datamodel.ParamDocument.Param)get_store().add_element_user(PARAM$0);
            return target;
        }
    }
    /**
     * An XML param(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class ParamImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ParamDocument.Param
    {
        private static final long serialVersionUID = 1L;
        
        public ParamImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName REQUIRED$2 = 
            new javax.xml.namespace.QName("", "required");
        private static final javax.xml.namespace.QName VALIDATOR$4 = 
            new javax.xml.namespace.QName("", "validator");
        
        
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
         * Gets the "required" attribute
         */
        public boolean getRequired()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUIRED$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REQUIRED$2);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "required" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetRequired()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REQUIRED$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(REQUIRED$2);
                }
                return target;
            }
        }
        
        /**
         * True if has "required" attribute
         */
        public boolean isSetRequired()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REQUIRED$2) != null;
            }
        }
        
        /**
         * Sets the "required" attribute
         */
        public void setRequired(boolean required)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUIRED$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUIRED$2);
                }
                target.setBooleanValue(required);
            }
        }
        
        /**
         * Sets (as xml) the "required" attribute
         */
        public void xsetRequired(org.apache.xmlbeans.XmlBoolean required)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REQUIRED$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(REQUIRED$2);
                }
                target.set(required);
            }
        }
        
        /**
         * Unsets the "required" attribute
         */
        public void unsetRequired()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REQUIRED$2);
            }
        }
        
        /**
         * Gets the "validator" attribute
         */
        public java.lang.String getValidator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDATOR$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "validator" attribute
         */
        public org.apache.xmlbeans.XmlString xgetValidator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALIDATOR$4);
                return target;
            }
        }
        
        /**
         * True if has "validator" attribute
         */
        public boolean isSetValidator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALIDATOR$4) != null;
            }
        }
        
        /**
         * Sets the "validator" attribute
         */
        public void setValidator(java.lang.String validator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDATOR$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDATOR$4);
                }
                target.setStringValue(validator);
            }
        }
        
        /**
         * Sets (as xml) the "validator" attribute
         */
        public void xsetValidator(org.apache.xmlbeans.XmlString validator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALIDATOR$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALIDATOR$4);
                }
                target.set(validator);
            }
        }
        
        /**
         * Unsets the "validator" attribute
         */
        public void unsetValidator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALIDATOR$4);
            }
        }
    }
}
