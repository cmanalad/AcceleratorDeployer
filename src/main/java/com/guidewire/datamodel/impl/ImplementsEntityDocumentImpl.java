/*
 * An XML document type.
 * Localname: implementsEntity
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.ImplementsEntityDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one implementsEntity(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class ImplementsEntityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ImplementsEntityDocument
{
    private static final long serialVersionUID = 1L;
    
    public ImplementsEntityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPLEMENTSENTITY$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "implementsEntity");
    
    
    /**
     * Gets the "implementsEntity" element
     */
    public com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity getImplementsEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity target = null;
            target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().find_element_user(IMPLEMENTSENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "implementsEntity" element
     */
    public void setImplementsEntity(com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity implementsEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity target = null;
            target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().find_element_user(IMPLEMENTSENTITY$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().add_element_user(IMPLEMENTSENTITY$0);
            }
            target.set(implementsEntity);
        }
    }
    
    /**
     * Appends and returns a new empty "implementsEntity" element
     */
    public com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity addNewImplementsEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity target = null;
            target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().add_element_user(IMPLEMENTSENTITY$0);
            return target;
        }
    }
    /**
     * An XML implementsEntity(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class ImplementsEntityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity
    {
        private static final long serialVersionUID = 1L;
        
        public ImplementsEntityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ADAPTER$0 = 
            new javax.xml.namespace.QName("", "adapter");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        
        
        /**
         * Gets the "adapter" attribute
         */
        public java.lang.String getAdapter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADAPTER$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "adapter" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAdapter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADAPTER$0);
                return target;
            }
        }
        
        /**
         * True if has "adapter" attribute
         */
        public boolean isSetAdapter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ADAPTER$0) != null;
            }
        }
        
        /**
         * Sets the "adapter" attribute
         */
        public void setAdapter(java.lang.String adapter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADAPTER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADAPTER$0);
                }
                target.setStringValue(adapter);
            }
        }
        
        /**
         * Sets (as xml) the "adapter" attribute
         */
        public void xsetAdapter(org.apache.xmlbeans.XmlString adapter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADAPTER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ADAPTER$0);
                }
                target.set(adapter);
            }
        }
        
        /**
         * Unsets the "adapter" attribute
         */
        public void unsetAdapter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ADAPTER$0);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(NAME$2);
                }
                target.set(name);
            }
        }
    }
}
