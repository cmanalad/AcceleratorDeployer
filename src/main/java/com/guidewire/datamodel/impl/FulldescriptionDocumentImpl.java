/*
 * An XML document type.
 * Localname: fulldescription
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.FulldescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one fulldescription(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class FulldescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.FulldescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public FulldescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULLDESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "fulldescription");
    
    
    /**
     * Gets the "fulldescription" element
     */
    public com.guidewire.datamodel.FulldescriptionDocument.Fulldescription getFulldescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.FulldescriptionDocument.Fulldescription target = null;
            target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().find_element_user(FULLDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fulldescription" element
     */
    public void setFulldescription(com.guidewire.datamodel.FulldescriptionDocument.Fulldescription fulldescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.FulldescriptionDocument.Fulldescription target = null;
            target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().find_element_user(FULLDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().add_element_user(FULLDESCRIPTION$0);
            }
            target.set(fulldescription);
        }
    }
    
    /**
     * Appends and returns a new empty "fulldescription" element
     */
    public com.guidewire.datamodel.FulldescriptionDocument.Fulldescription addNewFulldescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.FulldescriptionDocument.Fulldescription target = null;
            target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().add_element_user(FULLDESCRIPTION$0);
            return target;
        }
    }
    /**
     * An XML fulldescription(@http://guidewire.com/datamodel).
     *
     * This is an atomic type that is a restriction of com.guidewire.datamodel.FulldescriptionDocument$Fulldescription.
     */
    public static class FulldescriptionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.guidewire.datamodel.FulldescriptionDocument.Fulldescription
    {
        private static final long serialVersionUID = 1L;
        
        public FulldescriptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected FulldescriptionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        
    }
}
