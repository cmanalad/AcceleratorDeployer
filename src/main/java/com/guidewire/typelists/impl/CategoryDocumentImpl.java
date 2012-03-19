/*
 * An XML document type.
 * Localname: category
 * Namespace: http://guidewire.com/typelists
 * Java type: com.guidewire.typelists.CategoryDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.typelists.impl;
/**
 * A document containing one category(@http://guidewire.com/typelists) element.
 *
 * This is a complex type.
 */
public class CategoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.typelists.CategoryDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORY$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/typelists", "category");
    
    
    /**
     * Gets the "category" element
     */
    public com.guidewire.typelists.CategoryDocument.Category getCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.typelists.CategoryDocument.Category target = null;
            target = (com.guidewire.typelists.CategoryDocument.Category)get_store().find_element_user(CATEGORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "category" element
     */
    public void setCategory(com.guidewire.typelists.CategoryDocument.Category category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.typelists.CategoryDocument.Category target = null;
            target = (com.guidewire.typelists.CategoryDocument.Category)get_store().find_element_user(CATEGORY$0, 0);
            if (target == null)
            {
                target = (com.guidewire.typelists.CategoryDocument.Category)get_store().add_element_user(CATEGORY$0);
            }
            target.set(category);
        }
    }
    
    /**
     * Appends and returns a new empty "category" element
     */
    public com.guidewire.typelists.CategoryDocument.Category addNewCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.typelists.CategoryDocument.Category target = null;
            target = (com.guidewire.typelists.CategoryDocument.Category)get_store().add_element_user(CATEGORY$0);
            return target;
        }
    }
    /**
     * An XML category(@http://guidewire.com/typelists).
     *
     * This is a complex type.
     */
    public static class CategoryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.typelists.CategoryDocument.Category
    {
        private static final long serialVersionUID = 1L;
        
        public CategoryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CODE$0 = 
            new javax.xml.namespace.QName("", "code");
        private static final javax.xml.namespace.QName TYPELIST$2 = 
            new javax.xml.namespace.QName("", "typelist");
        
        
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
        
        /**
         * Gets the "typelist" attribute
         */
        public java.lang.String getTypelist()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPELIST$2);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(TYPELIST$2);
                return target;
            }
        }
        
        /**
         * True if has "typelist" attribute
         */
        public boolean isSetTypelist()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPELIST$2) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPELIST$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPELIST$2);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(TYPELIST$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(TYPELIST$2);
                }
                target.set(typelist);
            }
        }
        
        /**
         * Unsets the "typelist" attribute
         */
        public void unsetTypelist()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPELIST$2);
            }
        }
    }
}
