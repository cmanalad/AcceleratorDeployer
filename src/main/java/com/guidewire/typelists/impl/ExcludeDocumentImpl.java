/*
 * An XML document type.
 * Localname: exclude
 * Namespace: http://guidewire.com/typelists
 * Java type: com.guidewire.typelists.ExcludeDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.typelists.impl;
/**
 * A document containing one exclude(@http://guidewire.com/typelists) element.
 *
 * This is a complex type.
 */
public class ExcludeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.typelists.ExcludeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExcludeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXCLUDE$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/typelists", "exclude");
    
    
    /**
     * Gets the "exclude" element
     */
    public com.guidewire.typelists.ExcludeDocument.Exclude getExclude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.typelists.ExcludeDocument.Exclude target = null;
            target = (com.guidewire.typelists.ExcludeDocument.Exclude)get_store().find_element_user(EXCLUDE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "exclude" element
     */
    public void setExclude(com.guidewire.typelists.ExcludeDocument.Exclude exclude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.typelists.ExcludeDocument.Exclude target = null;
            target = (com.guidewire.typelists.ExcludeDocument.Exclude)get_store().find_element_user(EXCLUDE$0, 0);
            if (target == null)
            {
                target = (com.guidewire.typelists.ExcludeDocument.Exclude)get_store().add_element_user(EXCLUDE$0);
            }
            target.set(exclude);
        }
    }
    
    /**
     * Appends and returns a new empty "exclude" element
     */
    public com.guidewire.typelists.ExcludeDocument.Exclude addNewExclude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.typelists.ExcludeDocument.Exclude target = null;
            target = (com.guidewire.typelists.ExcludeDocument.Exclude)get_store().add_element_user(EXCLUDE$0);
            return target;
        }
    }
    /**
     * An XML exclude(@http://guidewire.com/typelists).
     *
     * This is a complex type.
     */
    public static class ExcludeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.typelists.ExcludeDocument.Exclude
    {
        private static final long serialVersionUID = 1L;
        
        public ExcludeImpl(org.apache.xmlbeans.SchemaType sType)
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
