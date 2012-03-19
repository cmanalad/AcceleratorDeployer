/*
 * An XML document type.
 * Localname: annotationdef
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.AnnotationdefDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one annotationdef(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class AnnotationdefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.AnnotationdefDocument
{
    private static final long serialVersionUID = 1L;
    
    public AnnotationdefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANNOTATIONDEF$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "annotationdef");
    
    
    /**
     * Gets the "annotationdef" element
     */
    public com.guidewire.datamodel.AnnotationdefDocument.Annotationdef getAnnotationdef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.AnnotationdefDocument.Annotationdef target = null;
            target = (com.guidewire.datamodel.AnnotationdefDocument.Annotationdef)get_store().find_element_user(ANNOTATIONDEF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "annotationdef" element
     */
    public void setAnnotationdef(com.guidewire.datamodel.AnnotationdefDocument.Annotationdef annotationdef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.AnnotationdefDocument.Annotationdef target = null;
            target = (com.guidewire.datamodel.AnnotationdefDocument.Annotationdef)get_store().find_element_user(ANNOTATIONDEF$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.AnnotationdefDocument.Annotationdef)get_store().add_element_user(ANNOTATIONDEF$0);
            }
            target.set(annotationdef);
        }
    }
    
    /**
     * Appends and returns a new empty "annotationdef" element
     */
    public com.guidewire.datamodel.AnnotationdefDocument.Annotationdef addNewAnnotationdef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.AnnotationdefDocument.Annotationdef target = null;
            target = (com.guidewire.datamodel.AnnotationdefDocument.Annotationdef)get_store().add_element_user(ANNOTATIONDEF$0);
            return target;
        }
    }
    /**
     * An XML annotationdef(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class AnnotationdefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.AnnotationdefDocument.Annotationdef
    {
        private static final long serialVersionUID = 1L;
        
        public AnnotationdefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName REQUIRED$2 = 
            new javax.xml.namespace.QName("", "required");
        
        
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
    }
}
