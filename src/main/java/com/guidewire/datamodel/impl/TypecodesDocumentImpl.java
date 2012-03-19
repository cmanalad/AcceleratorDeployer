/*
 * An XML document type.
 * Localname: typecodes
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.TypecodesDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one typecodes(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class TypecodesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.TypecodesDocument
{
    private static final long serialVersionUID = 1L;
    
    public TypecodesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPECODES$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "typecodes");
    
    
    /**
     * Gets the "typecodes" element
     */
    public com.guidewire.datamodel.TypecodesDocument.Typecodes getTypecodes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.TypecodesDocument.Typecodes target = null;
            target = (com.guidewire.datamodel.TypecodesDocument.Typecodes)get_store().find_element_user(TYPECODES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "typecodes" element
     */
    public void setTypecodes(com.guidewire.datamodel.TypecodesDocument.Typecodes typecodes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.TypecodesDocument.Typecodes target = null;
            target = (com.guidewire.datamodel.TypecodesDocument.Typecodes)get_store().find_element_user(TYPECODES$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.TypecodesDocument.Typecodes)get_store().add_element_user(TYPECODES$0);
            }
            target.set(typecodes);
        }
    }
    
    /**
     * Appends and returns a new empty "typecodes" element
     */
    public com.guidewire.datamodel.TypecodesDocument.Typecodes addNewTypecodes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.TypecodesDocument.Typecodes target = null;
            target = (com.guidewire.datamodel.TypecodesDocument.Typecodes)get_store().add_element_user(TYPECODES$0);
            return target;
        }
    }
    /**
     * An XML typecodes(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class TypecodesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.TypecodesDocument.Typecodes
    {
        private static final long serialVersionUID = 1L;
        
        public TypecodesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPECODE$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "typecode");
        
        
        /**
         * Gets array of all "typecode" elements
         */
        public com.guidewire.datamodel.TypecodeDocument.Typecode[] getTypecodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TYPECODE$0, targetList);
                com.guidewire.datamodel.TypecodeDocument.Typecode[] result = new com.guidewire.datamodel.TypecodeDocument.Typecode[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "typecode" element
         */
        public com.guidewire.datamodel.TypecodeDocument.Typecode getTypecodeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.TypecodeDocument.Typecode target = null;
                target = (com.guidewire.datamodel.TypecodeDocument.Typecode)get_store().find_element_user(TYPECODE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "typecode" element
         */
        public int sizeOfTypecodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TYPECODE$0);
            }
        }
        
        /**
         * Sets array of all "typecode" element
         */
        public void setTypecodeArray(com.guidewire.datamodel.TypecodeDocument.Typecode[] typecodeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(typecodeArray, TYPECODE$0);
            }
        }
        
        /**
         * Sets ith "typecode" element
         */
        public void setTypecodeArray(int i, com.guidewire.datamodel.TypecodeDocument.Typecode typecode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.TypecodeDocument.Typecode target = null;
                target = (com.guidewire.datamodel.TypecodeDocument.Typecode)get_store().find_element_user(TYPECODE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(typecode);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "typecode" element
         */
        public com.guidewire.datamodel.TypecodeDocument.Typecode insertNewTypecode(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.TypecodeDocument.Typecode target = null;
                target = (com.guidewire.datamodel.TypecodeDocument.Typecode)get_store().insert_element_user(TYPECODE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "typecode" element
         */
        public com.guidewire.datamodel.TypecodeDocument.Typecode addNewTypecode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.TypecodeDocument.Typecode target = null;
                target = (com.guidewire.datamodel.TypecodeDocument.Typecode)get_store().add_element_user(TYPECODE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "typecode" element
         */
        public void removeTypecode(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TYPECODE$0, i);
            }
        }
    }
}
