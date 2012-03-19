/*
 * An XML document type.
 * Localname: keyfilters
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.KeyfiltersDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one keyfilters(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class KeyfiltersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.KeyfiltersDocument
{
    private static final long serialVersionUID = 1L;
    
    public KeyfiltersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYFILTERS$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "keyfilters");
    
    
    /**
     * Gets the "keyfilters" element
     */
    public com.guidewire.datamodel.KeyfiltersDocument.Keyfilters getKeyfilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.KeyfiltersDocument.Keyfilters target = null;
            target = (com.guidewire.datamodel.KeyfiltersDocument.Keyfilters)get_store().find_element_user(KEYFILTERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "keyfilters" element
     */
    public void setKeyfilters(com.guidewire.datamodel.KeyfiltersDocument.Keyfilters keyfilters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.KeyfiltersDocument.Keyfilters target = null;
            target = (com.guidewire.datamodel.KeyfiltersDocument.Keyfilters)get_store().find_element_user(KEYFILTERS$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.KeyfiltersDocument.Keyfilters)get_store().add_element_user(KEYFILTERS$0);
            }
            target.set(keyfilters);
        }
    }
    
    /**
     * Appends and returns a new empty "keyfilters" element
     */
    public com.guidewire.datamodel.KeyfiltersDocument.Keyfilters addNewKeyfilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.KeyfiltersDocument.Keyfilters target = null;
            target = (com.guidewire.datamodel.KeyfiltersDocument.Keyfilters)get_store().add_element_user(KEYFILTERS$0);
            return target;
        }
    }
    /**
     * An XML keyfilters(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class KeyfiltersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.KeyfiltersDocument.Keyfilters
    {
        private static final long serialVersionUID = 1L;
        
        public KeyfiltersImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName KEYFILTER$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "keyfilter");
        
        
        /**
         * Gets array of all "keyfilter" elements
         */
        public com.guidewire.datamodel.KeyfilterDocument.Keyfilter[] getKeyfilterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(KEYFILTER$0, targetList);
                com.guidewire.datamodel.KeyfilterDocument.Keyfilter[] result = new com.guidewire.datamodel.KeyfilterDocument.Keyfilter[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "keyfilter" element
         */
        public com.guidewire.datamodel.KeyfilterDocument.Keyfilter getKeyfilterArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.KeyfilterDocument.Keyfilter target = null;
                target = (com.guidewire.datamodel.KeyfilterDocument.Keyfilter)get_store().find_element_user(KEYFILTER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "keyfilter" element
         */
        public int sizeOfKeyfilterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(KEYFILTER$0);
            }
        }
        
        /**
         * Sets array of all "keyfilter" element
         */
        public void setKeyfilterArray(com.guidewire.datamodel.KeyfilterDocument.Keyfilter[] keyfilterArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(keyfilterArray, KEYFILTER$0);
            }
        }
        
        /**
         * Sets ith "keyfilter" element
         */
        public void setKeyfilterArray(int i, com.guidewire.datamodel.KeyfilterDocument.Keyfilter keyfilter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.KeyfilterDocument.Keyfilter target = null;
                target = (com.guidewire.datamodel.KeyfilterDocument.Keyfilter)get_store().find_element_user(KEYFILTER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(keyfilter);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "keyfilter" element
         */
        public com.guidewire.datamodel.KeyfilterDocument.Keyfilter insertNewKeyfilter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.KeyfilterDocument.Keyfilter target = null;
                target = (com.guidewire.datamodel.KeyfilterDocument.Keyfilter)get_store().insert_element_user(KEYFILTER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "keyfilter" element
         */
        public com.guidewire.datamodel.KeyfilterDocument.Keyfilter addNewKeyfilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.KeyfilterDocument.Keyfilter target = null;
                target = (com.guidewire.datamodel.KeyfilterDocument.Keyfilter)get_store().add_element_user(KEYFILTER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "keyfilter" element
         */
        public void removeKeyfilter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(KEYFILTER$0, i);
            }
        }
    }
}
