/*
 * An XML document type.
 * Localname: annotation
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.AnnotationDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one annotation(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class AnnotationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.AnnotationDocument
{
    private static final long serialVersionUID = 1L;
    
    public AnnotationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANNOTATION$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "annotation");
    
    
    /**
     * Gets the "annotation" element
     */
    public com.guidewire.datamodel.AnnotationDocument.Annotation getAnnotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.AnnotationDocument.Annotation target = null;
            target = (com.guidewire.datamodel.AnnotationDocument.Annotation)get_store().find_element_user(ANNOTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "annotation" element
     */
    public void setAnnotation(com.guidewire.datamodel.AnnotationDocument.Annotation annotation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.AnnotationDocument.Annotation target = null;
            target = (com.guidewire.datamodel.AnnotationDocument.Annotation)get_store().find_element_user(ANNOTATION$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.AnnotationDocument.Annotation)get_store().add_element_user(ANNOTATION$0);
            }
            target.set(annotation);
        }
    }
    
    /**
     * Appends and returns a new empty "annotation" element
     */
    public com.guidewire.datamodel.AnnotationDocument.Annotation addNewAnnotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.AnnotationDocument.Annotation target = null;
            target = (com.guidewire.datamodel.AnnotationDocument.Annotation)get_store().add_element_user(ANNOTATION$0);
            return target;
        }
    }
    /**
     * An XML annotation(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class AnnotationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.AnnotationDocument.Annotation
    {
        private static final long serialVersionUID = 1L;
        
        public AnnotationImpl(org.apache.xmlbeans.SchemaType sType)
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
        public org.apache.xmlbeans.XmlString xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$2);
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
        public void xsetValue(org.apache.xmlbeans.XmlString value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$2);
                }
                target.set(value);
            }
        }
    }
}
