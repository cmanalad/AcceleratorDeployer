/*
 * An XML document type.
 * Localname: typecode
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.TypecodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one typecode(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class TypecodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.TypecodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public TypecodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPECODE$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "typecode");
    
    
    /**
     * Gets the "typecode" element
     */
    public com.guidewire.datamodel.TypecodeDocument.Typecode getTypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.TypecodeDocument.Typecode target = null;
            target = (com.guidewire.datamodel.TypecodeDocument.Typecode)get_store().find_element_user(TYPECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "typecode" element
     */
    public void setTypecode(com.guidewire.datamodel.TypecodeDocument.Typecode typecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.TypecodeDocument.Typecode target = null;
            target = (com.guidewire.datamodel.TypecodeDocument.Typecode)get_store().find_element_user(TYPECODE$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.TypecodeDocument.Typecode)get_store().add_element_user(TYPECODE$0);
            }
            target.set(typecode);
        }
    }
    
    /**
     * Appends and returns a new empty "typecode" element
     */
    public com.guidewire.datamodel.TypecodeDocument.Typecode addNewTypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.TypecodeDocument.Typecode target = null;
            target = (com.guidewire.datamodel.TypecodeDocument.Typecode)get_store().add_element_user(TYPECODE$0);
            return target;
        }
    }
    /**
     * An XML typecode(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class TypecodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.TypecodeDocument.Typecode
    {
        private static final long serialVersionUID = 1L;
        
        public TypecodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPECODE$0 = 
            new javax.xml.namespace.QName("", "typecode");
        
        
        /**
         * Gets the "typecode" attribute
         */
        public java.lang.String getTypecode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPECODE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "typecode" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetTypecode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(TYPECODE$0);
                return target;
            }
        }
        
        /**
         * Sets the "typecode" attribute
         */
        public void setTypecode(java.lang.String typecode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPECODE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPECODE$0);
                }
                target.setStringValue(typecode);
            }
        }
        
        /**
         * Sets (as xml) the "typecode" attribute
         */
        public void xsetTypecode(org.apache.xmlbeans.XmlNMTOKEN typecode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(TYPECODE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(TYPECODE$0);
                }
                target.set(typecode);
            }
        }
    }
}
