/*
 * An XML document type.
 * Localname: internalonlyfields
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.InternalonlyfieldsDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one internalonlyfields(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class InternalonlyfieldsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.InternalonlyfieldsDocument
{
    private static final long serialVersionUID = 1L;
    
    public InternalonlyfieldsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERNALONLYFIELDS$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "internalonlyfields");
    
    
    /**
     * Gets the "internalonlyfields" element
     */
    public com.guidewire.datamodel.InternalonlyfieldsDocument.Internalonlyfields getInternalonlyfields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.InternalonlyfieldsDocument.Internalonlyfields target = null;
            target = (com.guidewire.datamodel.InternalonlyfieldsDocument.Internalonlyfields)get_store().find_element_user(INTERNALONLYFIELDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "internalonlyfields" element
     */
    public void setInternalonlyfields(com.guidewire.datamodel.InternalonlyfieldsDocument.Internalonlyfields internalonlyfields)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.InternalonlyfieldsDocument.Internalonlyfields target = null;
            target = (com.guidewire.datamodel.InternalonlyfieldsDocument.Internalonlyfields)get_store().find_element_user(INTERNALONLYFIELDS$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.InternalonlyfieldsDocument.Internalonlyfields)get_store().add_element_user(INTERNALONLYFIELDS$0);
            }
            target.set(internalonlyfields);
        }
    }
    
    /**
     * Appends and returns a new empty "internalonlyfields" element
     */
    public com.guidewire.datamodel.InternalonlyfieldsDocument.Internalonlyfields addNewInternalonlyfields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.InternalonlyfieldsDocument.Internalonlyfields target = null;
            target = (com.guidewire.datamodel.InternalonlyfieldsDocument.Internalonlyfields)get_store().add_element_user(INTERNALONLYFIELDS$0);
            return target;
        }
    }
    /**
     * An XML internalonlyfields(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class InternalonlyfieldsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.InternalonlyfieldsDocument.Internalonlyfields
    {
        private static final long serialVersionUID = 1L;
        
        public InternalonlyfieldsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INTERNALFIELD$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "internalfield");
        
        
        /**
         * Gets array of all "internalfield" elements
         */
        public com.guidewire.datamodel.InternalfieldDocument.Internalfield[] getInternalfieldArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INTERNALFIELD$0, targetList);
                com.guidewire.datamodel.InternalfieldDocument.Internalfield[] result = new com.guidewire.datamodel.InternalfieldDocument.Internalfield[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "internalfield" element
         */
        public com.guidewire.datamodel.InternalfieldDocument.Internalfield getInternalfieldArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.InternalfieldDocument.Internalfield target = null;
                target = (com.guidewire.datamodel.InternalfieldDocument.Internalfield)get_store().find_element_user(INTERNALFIELD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "internalfield" element
         */
        public int sizeOfInternalfieldArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INTERNALFIELD$0);
            }
        }
        
        /**
         * Sets array of all "internalfield" element
         */
        public void setInternalfieldArray(com.guidewire.datamodel.InternalfieldDocument.Internalfield[] internalfieldArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(internalfieldArray, INTERNALFIELD$0);
            }
        }
        
        /**
         * Sets ith "internalfield" element
         */
        public void setInternalfieldArray(int i, com.guidewire.datamodel.InternalfieldDocument.Internalfield internalfield)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.InternalfieldDocument.Internalfield target = null;
                target = (com.guidewire.datamodel.InternalfieldDocument.Internalfield)get_store().find_element_user(INTERNALFIELD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(internalfield);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "internalfield" element
         */
        public com.guidewire.datamodel.InternalfieldDocument.Internalfield insertNewInternalfield(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.InternalfieldDocument.Internalfield target = null;
                target = (com.guidewire.datamodel.InternalfieldDocument.Internalfield)get_store().insert_element_user(INTERNALFIELD$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "internalfield" element
         */
        public com.guidewire.datamodel.InternalfieldDocument.Internalfield addNewInternalfield()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.InternalfieldDocument.Internalfield target = null;
                target = (com.guidewire.datamodel.InternalfieldDocument.Internalfield)get_store().add_element_user(INTERNALFIELD$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "internalfield" element
         */
        public void removeInternalfield(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INTERNALFIELD$0, i);
            }
        }
    }
}
