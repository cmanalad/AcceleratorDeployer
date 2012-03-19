/*
 * An XML document type.
 * Localname: categorylist
 * Namespace: http://guidewire.com/typelists
 * Java type: com.guidewire.typelists.CategorylistDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.typelists.impl;
/**
 * A document containing one categorylist(@http://guidewire.com/typelists) element.
 *
 * This is a complex type.
 */
public class CategorylistDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.typelists.CategorylistDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategorylistDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYLIST$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/typelists", "categorylist");
    
    
    /**
     * Gets the "categorylist" element
     */
    public com.guidewire.typelists.CategorylistDocument.Categorylist getCategorylist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.typelists.CategorylistDocument.Categorylist target = null;
            target = (com.guidewire.typelists.CategorylistDocument.Categorylist)get_store().find_element_user(CATEGORYLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "categorylist" element
     */
    public void setCategorylist(com.guidewire.typelists.CategorylistDocument.Categorylist categorylist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.typelists.CategorylistDocument.Categorylist target = null;
            target = (com.guidewire.typelists.CategorylistDocument.Categorylist)get_store().find_element_user(CATEGORYLIST$0, 0);
            if (target == null)
            {
                target = (com.guidewire.typelists.CategorylistDocument.Categorylist)get_store().add_element_user(CATEGORYLIST$0);
            }
            target.set(categorylist);
        }
    }
    
    /**
     * Appends and returns a new empty "categorylist" element
     */
    public com.guidewire.typelists.CategorylistDocument.Categorylist addNewCategorylist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.typelists.CategorylistDocument.Categorylist target = null;
            target = (com.guidewire.typelists.CategorylistDocument.Categorylist)get_store().add_element_user(CATEGORYLIST$0);
            return target;
        }
    }
    /**
     * An XML categorylist(@http://guidewire.com/typelists).
     *
     * This is a complex type.
     */
    public static class CategorylistImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.typelists.CategorylistDocument.Categorylist
    {
        private static final long serialVersionUID = 1L;
        
        public CategorylistImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPELIST$0 = 
            new javax.xml.namespace.QName("", "typelist");
        
        
        /**
         * Gets the "typelist" attribute
         */
        public java.lang.String getTypelist()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPELIST$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "typelist" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetTypelist()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(TYPELIST$0);
                return target;
            }
        }
        
        /**
         * Sets the "typelist" attribute
         */
        public void setTypelist(java.lang.String typelist)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPELIST$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPELIST$0);
                }
                target.setStringValue(typelist);
            }
        }
        
        /**
         * Sets (as xml) the "typelist" attribute
         */
        public void xsetTypelist(org.apache.xmlbeans.XmlNMTOKEN typelist)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(TYPELIST$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(TYPELIST$0);
                }
                target.set(typelist);
            }
        }
    }
}
