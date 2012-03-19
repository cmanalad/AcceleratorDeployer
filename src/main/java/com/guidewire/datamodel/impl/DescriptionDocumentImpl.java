/*
 * An XML document type.
 * Localname: description
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.DescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one description(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class DescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.DescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public DescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "description");
    
    
    /**
     * Gets the "description" element
     */
    public com.guidewire.datamodel.DescriptionDocument.Description getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.DescriptionDocument.Description target = null;
            target = (com.guidewire.datamodel.DescriptionDocument.Description)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(com.guidewire.datamodel.DescriptionDocument.Description description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.DescriptionDocument.Description target = null;
            target = (com.guidewire.datamodel.DescriptionDocument.Description)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.DescriptionDocument.Description)get_store().add_element_user(DESCRIPTION$0);
            }
            target.set(description);
        }
    }
    
    /**
     * Appends and returns a new empty "description" element
     */
    public com.guidewire.datamodel.DescriptionDocument.Description addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.DescriptionDocument.Description target = null;
            target = (com.guidewire.datamodel.DescriptionDocument.Description)get_store().add_element_user(DESCRIPTION$0);
            return target;
        }
    }
    /**
     * An XML description(@http://guidewire.com/datamodel).
     *
     * This is an atomic type that is a restriction of com.guidewire.datamodel.DescriptionDocument$Description.
     */
    public static class DescriptionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.guidewire.datamodel.DescriptionDocument.Description
    {
        private static final long serialVersionUID = 1L;
        
        public DescriptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected DescriptionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        
    }
}
