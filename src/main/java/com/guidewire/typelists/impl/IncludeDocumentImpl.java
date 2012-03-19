/*
 * An XML document type.
 * Localname: include
 * Namespace: http://guidewire.com/typelists
 * Java type: com.guidewire.typelists.IncludeDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.typelists.impl;
/**
 * A document containing one include(@http://guidewire.com/typelists) element.
 *
 * This is a complex type.
 */
public class IncludeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.typelists.IncludeDocument
{
    private static final long serialVersionUID = 1L;
    
    public IncludeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUDE$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/typelists", "include");
    
    
    /**
     * Gets the "include" element
     */
    public com.guidewire.typelists.IncludeDocument.Include getInclude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.typelists.IncludeDocument.Include target = null;
            target = (com.guidewire.typelists.IncludeDocument.Include)get_store().find_element_user(INCLUDE$0, 0);
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
    public void setInclude(com.guidewire.typelists.IncludeDocument.Include include)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.typelists.IncludeDocument.Include target = null;
            target = (com.guidewire.typelists.IncludeDocument.Include)get_store().find_element_user(INCLUDE$0, 0);
            if (target == null)
            {
                target = (com.guidewire.typelists.IncludeDocument.Include)get_store().add_element_user(INCLUDE$0);
            }
            target.set(include);
        }
    }
    
    /**
     * Appends and returns a new empty "include" element
     */
    public com.guidewire.typelists.IncludeDocument.Include addNewInclude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.typelists.IncludeDocument.Include target = null;
            target = (com.guidewire.typelists.IncludeDocument.Include)get_store().add_element_user(INCLUDE$0);
            return target;
        }
    }
    /**
     * An XML include(@http://guidewire.com/typelists).
     *
     * This is a complex type.
     */
    public static class IncludeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.typelists.IncludeDocument.Include
    {
        private static final long serialVersionUID = 1L;
        
        public IncludeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CODE$0 = 
            new javax.xml.namespace.QName("", "code");
        
        
        /**
         * Gets the "code" attribute
         */
        public java.lang.String getCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$0);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(CODE$0);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$0);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(CODE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(CODE$0);
                }
                target.set(code);
            }
        }
    }
}
