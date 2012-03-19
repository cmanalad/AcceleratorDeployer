/*
 * An XML document type.
 * Localname: aspect
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.AspectDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one aspect(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class AspectDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.AspectDocument
{
    private static final long serialVersionUID = 1L;
    
    public AspectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ASPECT$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "aspect");
    
    
    /**
     * Gets the "aspect" element
     */
    public com.guidewire.datamodel.AspectDocument.Aspect getAspect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.AspectDocument.Aspect target = null;
            target = (com.guidewire.datamodel.AspectDocument.Aspect)get_store().find_element_user(ASPECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "aspect" element
     */
    public void setAspect(com.guidewire.datamodel.AspectDocument.Aspect aspect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.AspectDocument.Aspect target = null;
            target = (com.guidewire.datamodel.AspectDocument.Aspect)get_store().find_element_user(ASPECT$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.AspectDocument.Aspect)get_store().add_element_user(ASPECT$0);
            }
            target.set(aspect);
        }
    }
    
    /**
     * Appends and returns a new empty "aspect" element
     */
    public com.guidewire.datamodel.AspectDocument.Aspect addNewAspect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.AspectDocument.Aspect target = null;
            target = (com.guidewire.datamodel.AspectDocument.Aspect)get_store().add_element_user(ASPECT$0);
            return target;
        }
    }
    /**
     * An XML aspect(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class AspectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.AspectDocument.Aspect
    {
        private static final long serialVersionUID = 1L;
        
        public AspectImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COLUMN$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "column");
        private static final javax.xml.namespace.QName FOREIGNKEY$2 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "foreignkey");
        private static final javax.xml.namespace.QName TYPEKEY$4 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "typekey");
        private static final javax.xml.namespace.QName DESC$6 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName NAME$8 = 
            new javax.xml.namespace.QName("", "name");
        
        
        /**
         * Gets array of all "column" elements
         */
        public com.guidewire.datamodel.ColumnDocument.Column[] getColumnArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COLUMN$0, targetList);
                com.guidewire.datamodel.ColumnDocument.Column[] result = new com.guidewire.datamodel.ColumnDocument.Column[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "column" element
         */
        public com.guidewire.datamodel.ColumnDocument.Column getColumnArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ColumnDocument.Column target = null;
                target = (com.guidewire.datamodel.ColumnDocument.Column)get_store().find_element_user(COLUMN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "column" element
         */
        public int sizeOfColumnArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COLUMN$0);
            }
        }
        
        /**
         * Sets array of all "column" element
         */
        public void setColumnArray(com.guidewire.datamodel.ColumnDocument.Column[] columnArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(columnArray, COLUMN$0);
            }
        }
        
        /**
         * Sets ith "column" element
         */
        public void setColumnArray(int i, com.guidewire.datamodel.ColumnDocument.Column column)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ColumnDocument.Column target = null;
                target = (com.guidewire.datamodel.ColumnDocument.Column)get_store().find_element_user(COLUMN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(column);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "column" element
         */
        public com.guidewire.datamodel.ColumnDocument.Column insertNewColumn(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ColumnDocument.Column target = null;
                target = (com.guidewire.datamodel.ColumnDocument.Column)get_store().insert_element_user(COLUMN$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "column" element
         */
        public com.guidewire.datamodel.ColumnDocument.Column addNewColumn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ColumnDocument.Column target = null;
                target = (com.guidewire.datamodel.ColumnDocument.Column)get_store().add_element_user(COLUMN$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "column" element
         */
        public void removeColumn(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COLUMN$0, i);
            }
        }
        
        /**
         * Gets array of all "foreignkey" elements
         */
        public com.guidewire.datamodel.ForeignkeyDocument.Foreignkey[] getForeignkeyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FOREIGNKEY$2, targetList);
                com.guidewire.datamodel.ForeignkeyDocument.Foreignkey[] result = new com.guidewire.datamodel.ForeignkeyDocument.Foreignkey[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "foreignkey" element
         */
        public com.guidewire.datamodel.ForeignkeyDocument.Foreignkey getForeignkeyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ForeignkeyDocument.Foreignkey target = null;
                target = (com.guidewire.datamodel.ForeignkeyDocument.Foreignkey)get_store().find_element_user(FOREIGNKEY$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "foreignkey" element
         */
        public int sizeOfForeignkeyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FOREIGNKEY$2);
            }
        }
        
        /**
         * Sets array of all "foreignkey" element
         */
        public void setForeignkeyArray(com.guidewire.datamodel.ForeignkeyDocument.Foreignkey[] foreignkeyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(foreignkeyArray, FOREIGNKEY$2);
            }
        }
        
        /**
         * Sets ith "foreignkey" element
         */
        public void setForeignkeyArray(int i, com.guidewire.datamodel.ForeignkeyDocument.Foreignkey foreignkey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ForeignkeyDocument.Foreignkey target = null;
                target = (com.guidewire.datamodel.ForeignkeyDocument.Foreignkey)get_store().find_element_user(FOREIGNKEY$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(foreignkey);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "foreignkey" element
         */
        public com.guidewire.datamodel.ForeignkeyDocument.Foreignkey insertNewForeignkey(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ForeignkeyDocument.Foreignkey target = null;
                target = (com.guidewire.datamodel.ForeignkeyDocument.Foreignkey)get_store().insert_element_user(FOREIGNKEY$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "foreignkey" element
         */
        public com.guidewire.datamodel.ForeignkeyDocument.Foreignkey addNewForeignkey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ForeignkeyDocument.Foreignkey target = null;
                target = (com.guidewire.datamodel.ForeignkeyDocument.Foreignkey)get_store().add_element_user(FOREIGNKEY$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "foreignkey" element
         */
        public void removeForeignkey(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FOREIGNKEY$2, i);
            }
        }
        
        /**
         * Gets array of all "typekey" elements
         */
        public com.guidewire.datamodel.TypekeyDocument.Typekey[] getTypekeyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TYPEKEY$4, targetList);
                com.guidewire.datamodel.TypekeyDocument.Typekey[] result = new com.guidewire.datamodel.TypekeyDocument.Typekey[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "typekey" element
         */
        public com.guidewire.datamodel.TypekeyDocument.Typekey getTypekeyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.TypekeyDocument.Typekey target = null;
                target = (com.guidewire.datamodel.TypekeyDocument.Typekey)get_store().find_element_user(TYPEKEY$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "typekey" element
         */
        public int sizeOfTypekeyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TYPEKEY$4);
            }
        }
        
        /**
         * Sets array of all "typekey" element
         */
        public void setTypekeyArray(com.guidewire.datamodel.TypekeyDocument.Typekey[] typekeyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(typekeyArray, TYPEKEY$4);
            }
        }
        
        /**
         * Sets ith "typekey" element
         */
        public void setTypekeyArray(int i, com.guidewire.datamodel.TypekeyDocument.Typekey typekey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.TypekeyDocument.Typekey target = null;
                target = (com.guidewire.datamodel.TypekeyDocument.Typekey)get_store().find_element_user(TYPEKEY$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(typekey);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "typekey" element
         */
        public com.guidewire.datamodel.TypekeyDocument.Typekey insertNewTypekey(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.TypekeyDocument.Typekey target = null;
                target = (com.guidewire.datamodel.TypekeyDocument.Typekey)get_store().insert_element_user(TYPEKEY$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "typekey" element
         */
        public com.guidewire.datamodel.TypekeyDocument.Typekey addNewTypekey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.TypekeyDocument.Typekey target = null;
                target = (com.guidewire.datamodel.TypekeyDocument.Typekey)get_store().add_element_user(TYPEKEY$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "typekey" element
         */
        public void removeTypekey(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TYPEKEY$4, i);
            }
        }
        
        /**
         * Gets the "desc" attribute
         */
        public java.lang.String getDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "desc" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$6);
                return target;
            }
        }
        
        /**
         * True if has "desc" attribute
         */
        public boolean isSetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DESC$6) != null;
            }
        }
        
        /**
         * Sets the "desc" attribute
         */
        public void setDesc(java.lang.String desc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$6);
                }
                target.setStringValue(desc);
            }
        }
        
        /**
         * Sets (as xml) the "desc" attribute
         */
        public void xsetDesc(org.apache.xmlbeans.XmlString desc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$6);
                }
                target.set(desc);
            }
        }
        
        /**
         * Unsets the "desc" attribute
         */
        public void unsetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DESC$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$8);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(NAME$8);
                }
                target.set(name);
            }
        }
    }
}
