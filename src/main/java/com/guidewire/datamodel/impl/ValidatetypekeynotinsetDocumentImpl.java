/*
 * An XML document type.
 * Localname: validatetypekeynotinset
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.ValidatetypekeynotinsetDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one validatetypekeynotinset(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class ValidatetypekeynotinsetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ValidatetypekeynotinsetDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValidatetypekeynotinsetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDATETYPEKEYNOTINSET$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "validatetypekeynotinset");
    
    
    /**
     * Gets the "validatetypekeynotinset" element
     */
    public com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset getValidatetypekeynotinset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset target = null;
            target = (com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset)get_store().find_element_user(VALIDATETYPEKEYNOTINSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "validatetypekeynotinset" element
     */
    public void setValidatetypekeynotinset(com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset validatetypekeynotinset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset target = null;
            target = (com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset)get_store().find_element_user(VALIDATETYPEKEYNOTINSET$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset)get_store().add_element_user(VALIDATETYPEKEYNOTINSET$0);
            }
            target.set(validatetypekeynotinset);
        }
    }
    
    /**
     * Appends and returns a new empty "validatetypekeynotinset" element
     */
    public com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset addNewValidatetypekeynotinset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset target = null;
            target = (com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset)get_store().add_element_user(VALIDATETYPEKEYNOTINSET$0);
            return target;
        }
    }
    /**
     * An XML validatetypekeynotinset(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class ValidatetypekeynotinsetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset
    {
        private static final long serialVersionUID = 1L;
        
        public ValidatetypekeynotinsetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPECODES$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "typecodes");
        private static final javax.xml.namespace.QName COLUMNNAME$2 = 
            new javax.xml.namespace.QName("", "columnname");
        
        
        /**
         * Gets array of all "typecodes" elements
         */
        public com.guidewire.datamodel.TypecodesDocument.Typecodes[] getTypecodesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TYPECODES$0, targetList);
                com.guidewire.datamodel.TypecodesDocument.Typecodes[] result = new com.guidewire.datamodel.TypecodesDocument.Typecodes[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "typecodes" element
         */
        public com.guidewire.datamodel.TypecodesDocument.Typecodes getTypecodesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.TypecodesDocument.Typecodes target = null;
                target = (com.guidewire.datamodel.TypecodesDocument.Typecodes)get_store().find_element_user(TYPECODES$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "typecodes" element
         */
        public int sizeOfTypecodesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TYPECODES$0);
            }
        }
        
        /**
         * Sets array of all "typecodes" element
         */
        public void setTypecodesArray(com.guidewire.datamodel.TypecodesDocument.Typecodes[] typecodesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(typecodesArray, TYPECODES$0);
            }
        }
        
        /**
         * Sets ith "typecodes" element
         */
        public void setTypecodesArray(int i, com.guidewire.datamodel.TypecodesDocument.Typecodes typecodes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.TypecodesDocument.Typecodes target = null;
                target = (com.guidewire.datamodel.TypecodesDocument.Typecodes)get_store().find_element_user(TYPECODES$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(typecodes);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "typecodes" element
         */
        public com.guidewire.datamodel.TypecodesDocument.Typecodes insertNewTypecodes(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.TypecodesDocument.Typecodes target = null;
                target = (com.guidewire.datamodel.TypecodesDocument.Typecodes)get_store().insert_element_user(TYPECODES$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "typecodes" element
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
         * Removes the ith "typecodes" element
         */
        public void removeTypecodes(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TYPECODES$0, i);
            }
        }
        
        /**
         * Gets the "columnname" attribute
         */
        public java.lang.String getColumnname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLUMNNAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "columnname" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetColumnname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(COLUMNNAME$2);
                return target;
            }
        }
        
        /**
         * Sets the "columnname" attribute
         */
        public void setColumnname(java.lang.String columnname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLUMNNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLUMNNAME$2);
                }
                target.setStringValue(columnname);
            }
        }
        
        /**
         * Sets (as xml) the "columnname" attribute
         */
        public void xsetColumnname(org.apache.xmlbeans.XmlNMTOKEN columnname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(COLUMNNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(COLUMNNAME$2);
                }
                target.set(columnname);
            }
        }
    }
}
