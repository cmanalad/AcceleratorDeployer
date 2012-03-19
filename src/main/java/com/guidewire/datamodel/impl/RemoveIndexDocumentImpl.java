/*
 * An XML document type.
 * Localname: remove-index
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.RemoveIndexDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one remove-index(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class RemoveIndexDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.RemoveIndexDocument
{
    private static final long serialVersionUID = 1L;
    
    public RemoveIndexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REMOVEINDEX$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "remove-index");
    
    
    /**
     * Gets the "remove-index" element
     */
    public com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex getRemoveIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex target = null;
            target = (com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex)get_store().find_element_user(REMOVEINDEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "remove-index" element
     */
    public void setRemoveIndex(com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex removeIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex target = null;
            target = (com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex)get_store().find_element_user(REMOVEINDEX$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex)get_store().add_element_user(REMOVEINDEX$0);
            }
            target.set(removeIndex);
        }
    }
    
    /**
     * Appends and returns a new empty "remove-index" element
     */
    public com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex addNewRemoveIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex target = null;
            target = (com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex)get_store().add_element_user(REMOVEINDEX$0);
            return target;
        }
    }
    /**
     * An XML remove-index(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class RemoveIndexImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex
    {
        private static final long serialVersionUID = 1L;
        
        public RemoveIndexImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        
        
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
    }
}
