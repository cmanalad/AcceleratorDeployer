/*
 * An XML document type.
 * Localname: dependentfields
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.DependentfieldsDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one dependentfields(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class DependentfieldsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.DependentfieldsDocument
{
    private static final long serialVersionUID = 1L;
    
    public DependentfieldsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEPENDENTFIELDS$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "dependentfields");
    
    
    /**
     * Gets the "dependentfields" element
     */
    public com.guidewire.datamodel.DependentfieldsDocument.Dependentfields getDependentfields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.DependentfieldsDocument.Dependentfields target = null;
            target = (com.guidewire.datamodel.DependentfieldsDocument.Dependentfields)get_store().find_element_user(DEPENDENTFIELDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dependentfields" element
     */
    public void setDependentfields(com.guidewire.datamodel.DependentfieldsDocument.Dependentfields dependentfields)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.DependentfieldsDocument.Dependentfields target = null;
            target = (com.guidewire.datamodel.DependentfieldsDocument.Dependentfields)get_store().find_element_user(DEPENDENTFIELDS$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.DependentfieldsDocument.Dependentfields)get_store().add_element_user(DEPENDENTFIELDS$0);
            }
            target.set(dependentfields);
        }
    }
    
    /**
     * Appends and returns a new empty "dependentfields" element
     */
    public com.guidewire.datamodel.DependentfieldsDocument.Dependentfields addNewDependentfields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.DependentfieldsDocument.Dependentfields target = null;
            target = (com.guidewire.datamodel.DependentfieldsDocument.Dependentfields)get_store().add_element_user(DEPENDENTFIELDS$0);
            return target;
        }
    }
    /**
     * An XML dependentfields(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class DependentfieldsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.DependentfieldsDocument.Dependentfields
    {
        private static final long serialVersionUID = 1L;
        
        public DependentfieldsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COLUMN$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "column");
        private static final javax.xml.namespace.QName DEPENDENTKEY$2 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "dependentkey");
        private static final javax.xml.namespace.QName TYPEKEY$4 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "typekey");
        
        
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
         * Gets array of all "dependentkey" elements
         */
        public com.guidewire.datamodel.DependentkeyDocument.Dependentkey[] getDependentkeyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DEPENDENTKEY$2, targetList);
                com.guidewire.datamodel.DependentkeyDocument.Dependentkey[] result = new com.guidewire.datamodel.DependentkeyDocument.Dependentkey[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "dependentkey" element
         */
        public com.guidewire.datamodel.DependentkeyDocument.Dependentkey getDependentkeyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.DependentkeyDocument.Dependentkey target = null;
                target = (com.guidewire.datamodel.DependentkeyDocument.Dependentkey)get_store().find_element_user(DEPENDENTKEY$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "dependentkey" element
         */
        public int sizeOfDependentkeyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DEPENDENTKEY$2);
            }
        }
        
        /**
         * Sets array of all "dependentkey" element
         */
        public void setDependentkeyArray(com.guidewire.datamodel.DependentkeyDocument.Dependentkey[] dependentkeyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(dependentkeyArray, DEPENDENTKEY$2);
            }
        }
        
        /**
         * Sets ith "dependentkey" element
         */
        public void setDependentkeyArray(int i, com.guidewire.datamodel.DependentkeyDocument.Dependentkey dependentkey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.DependentkeyDocument.Dependentkey target = null;
                target = (com.guidewire.datamodel.DependentkeyDocument.Dependentkey)get_store().find_element_user(DEPENDENTKEY$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(dependentkey);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dependentkey" element
         */
        public com.guidewire.datamodel.DependentkeyDocument.Dependentkey insertNewDependentkey(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.DependentkeyDocument.Dependentkey target = null;
                target = (com.guidewire.datamodel.DependentkeyDocument.Dependentkey)get_store().insert_element_user(DEPENDENTKEY$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dependentkey" element
         */
        public com.guidewire.datamodel.DependentkeyDocument.Dependentkey addNewDependentkey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.DependentkeyDocument.Dependentkey target = null;
                target = (com.guidewire.datamodel.DependentkeyDocument.Dependentkey)get_store().add_element_user(DEPENDENTKEY$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "dependentkey" element
         */
        public void removeDependentkey(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DEPENDENTKEY$2, i);
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
    }
}
