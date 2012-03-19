/*
 * An XML document type.
 * Localname: delegate
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.DelegateDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one delegate(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class DelegateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.DelegateDocument
{
    private static final long serialVersionUID = 1L;
    
    public DelegateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELEGATE$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "delegate");
    
    
    /**
     * Gets the "delegate" element
     */
    public com.guidewire.datamodel.DelegateDocument.Delegate getDelegate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.DelegateDocument.Delegate target = null;
            target = (com.guidewire.datamodel.DelegateDocument.Delegate)get_store().find_element_user(DELEGATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "delegate" element
     */
    public void setDelegate(com.guidewire.datamodel.DelegateDocument.Delegate delegate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.DelegateDocument.Delegate target = null;
            target = (com.guidewire.datamodel.DelegateDocument.Delegate)get_store().find_element_user(DELEGATE$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.DelegateDocument.Delegate)get_store().add_element_user(DELEGATE$0);
            }
            target.set(delegate);
        }
    }
    
    /**
     * Appends and returns a new empty "delegate" element
     */
    public com.guidewire.datamodel.DelegateDocument.Delegate addNewDelegate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.DelegateDocument.Delegate target = null;
            target = (com.guidewire.datamodel.DelegateDocument.Delegate)get_store().add_element_user(DELEGATE$0);
            return target;
        }
    }
    /**
     * An XML delegate(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class DelegateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.DelegateDocument.Delegate
    {
        private static final long serialVersionUID = 1L;
        
        public DelegateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COLUMN$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "column");
        private static final javax.xml.namespace.QName DATETIMEORDERING$2 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "datetimeordering");
        private static final javax.xml.namespace.QName FOREIGNKEY$4 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "foreignkey");
        private static final javax.xml.namespace.QName FULLDESCRIPTION$6 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "fulldescription");
        private static final javax.xml.namespace.QName IMPLEMENTSENTITY$8 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "implementsEntity");
        private static final javax.xml.namespace.QName IMPLEMENTSINTERFACE$10 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "implementsInterface");
        private static final javax.xml.namespace.QName INDEX$12 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "index");
        private static final javax.xml.namespace.QName PARAM$14 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "param");
        private static final javax.xml.namespace.QName TYPEKEY$16 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "typekey");
        private static final javax.xml.namespace.QName BASE$18 = 
            new javax.xml.namespace.QName("", "base");
        private static final javax.xml.namespace.QName EFFDATEDONLY$20 = 
            new javax.xml.namespace.QName("", "effdatedOnly");
        private static final javax.xml.namespace.QName EXTENDABLE$22 = 
            new javax.xml.namespace.QName("", "extendable");
        private static final javax.xml.namespace.QName JAVACLASS$24 = 
            new javax.xml.namespace.QName("", "javaClass");
        private static final javax.xml.namespace.QName NAME$26 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName REQUIRES$28 = 
            new javax.xml.namespace.QName("", "requires");
        
        
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
         * Gets array of all "datetimeordering" elements
         */
        public com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering[] getDatetimeorderingArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DATETIMEORDERING$2, targetList);
                com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering[] result = new com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "datetimeordering" element
         */
        public com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering getDatetimeorderingArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering target = null;
                target = (com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering)get_store().find_element_user(DATETIMEORDERING$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "datetimeordering" element
         */
        public int sizeOfDatetimeorderingArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATETIMEORDERING$2);
            }
        }
        
        /**
         * Sets array of all "datetimeordering" element
         */
        public void setDatetimeorderingArray(com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering[] datetimeorderingArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(datetimeorderingArray, DATETIMEORDERING$2);
            }
        }
        
        /**
         * Sets ith "datetimeordering" element
         */
        public void setDatetimeorderingArray(int i, com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering datetimeordering)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering target = null;
                target = (com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering)get_store().find_element_user(DATETIMEORDERING$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(datetimeordering);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "datetimeordering" element
         */
        public com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering insertNewDatetimeordering(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering target = null;
                target = (com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering)get_store().insert_element_user(DATETIMEORDERING$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "datetimeordering" element
         */
        public com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering addNewDatetimeordering()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering target = null;
                target = (com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering)get_store().add_element_user(DATETIMEORDERING$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "datetimeordering" element
         */
        public void removeDatetimeordering(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATETIMEORDERING$2, i);
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
                get_store().find_all_element_users(FOREIGNKEY$4, targetList);
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
                target = (com.guidewire.datamodel.ForeignkeyDocument.Foreignkey)get_store().find_element_user(FOREIGNKEY$4, i);
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
                return get_store().count_elements(FOREIGNKEY$4);
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
                arraySetterHelper(foreignkeyArray, FOREIGNKEY$4);
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
                target = (com.guidewire.datamodel.ForeignkeyDocument.Foreignkey)get_store().find_element_user(FOREIGNKEY$4, i);
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
                target = (com.guidewire.datamodel.ForeignkeyDocument.Foreignkey)get_store().insert_element_user(FOREIGNKEY$4, i);
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
                target = (com.guidewire.datamodel.ForeignkeyDocument.Foreignkey)get_store().add_element_user(FOREIGNKEY$4);
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
                get_store().remove_element(FOREIGNKEY$4, i);
            }
        }
        
        /**
         * Gets array of all "fulldescription" elements
         */
        public com.guidewire.datamodel.FulldescriptionDocument.Fulldescription[] getFulldescriptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FULLDESCRIPTION$6, targetList);
                com.guidewire.datamodel.FulldescriptionDocument.Fulldescription[] result = new com.guidewire.datamodel.FulldescriptionDocument.Fulldescription[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "fulldescription" element
         */
        public com.guidewire.datamodel.FulldescriptionDocument.Fulldescription getFulldescriptionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.FulldescriptionDocument.Fulldescription target = null;
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().find_element_user(FULLDESCRIPTION$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "fulldescription" element
         */
        public int sizeOfFulldescriptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FULLDESCRIPTION$6);
            }
        }
        
        /**
         * Sets array of all "fulldescription" element
         */
        public void setFulldescriptionArray(com.guidewire.datamodel.FulldescriptionDocument.Fulldescription[] fulldescriptionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(fulldescriptionArray, FULLDESCRIPTION$6);
            }
        }
        
        /**
         * Sets ith "fulldescription" element
         */
        public void setFulldescriptionArray(int i, com.guidewire.datamodel.FulldescriptionDocument.Fulldescription fulldescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.FulldescriptionDocument.Fulldescription target = null;
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().find_element_user(FULLDESCRIPTION$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(fulldescription);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "fulldescription" element
         */
        public com.guidewire.datamodel.FulldescriptionDocument.Fulldescription insertNewFulldescription(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.FulldescriptionDocument.Fulldescription target = null;
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().insert_element_user(FULLDESCRIPTION$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "fulldescription" element
         */
        public com.guidewire.datamodel.FulldescriptionDocument.Fulldescription addNewFulldescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.FulldescriptionDocument.Fulldescription target = null;
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().add_element_user(FULLDESCRIPTION$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "fulldescription" element
         */
        public void removeFulldescription(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FULLDESCRIPTION$6, i);
            }
        }
        
        /**
         * Gets array of all "implementsEntity" elements
         */
        public com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity[] getImplementsEntityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IMPLEMENTSENTITY$8, targetList);
                com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity[] result = new com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "implementsEntity" element
         */
        public com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity getImplementsEntityArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity target = null;
                target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().find_element_user(IMPLEMENTSENTITY$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "implementsEntity" element
         */
        public int sizeOfImplementsEntityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IMPLEMENTSENTITY$8);
            }
        }
        
        /**
         * Sets array of all "implementsEntity" element
         */
        public void setImplementsEntityArray(com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity[] implementsEntityArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(implementsEntityArray, IMPLEMENTSENTITY$8);
            }
        }
        
        /**
         * Sets ith "implementsEntity" element
         */
        public void setImplementsEntityArray(int i, com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity implementsEntity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity target = null;
                target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().find_element_user(IMPLEMENTSENTITY$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(implementsEntity);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "implementsEntity" element
         */
        public com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity insertNewImplementsEntity(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity target = null;
                target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().insert_element_user(IMPLEMENTSENTITY$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "implementsEntity" element
         */
        public com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity addNewImplementsEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity target = null;
                target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().add_element_user(IMPLEMENTSENTITY$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "implementsEntity" element
         */
        public void removeImplementsEntity(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IMPLEMENTSENTITY$8, i);
            }
        }
        
        /**
         * Gets array of all "implementsInterface" elements
         */
        public com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface[] getImplementsInterfaceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IMPLEMENTSINTERFACE$10, targetList);
                com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface[] result = new com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "implementsInterface" element
         */
        public com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface getImplementsInterfaceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface target = null;
                target = (com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface)get_store().find_element_user(IMPLEMENTSINTERFACE$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "implementsInterface" element
         */
        public int sizeOfImplementsInterfaceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IMPLEMENTSINTERFACE$10);
            }
        }
        
        /**
         * Sets array of all "implementsInterface" element
         */
        public void setImplementsInterfaceArray(com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface[] implementsInterfaceArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(implementsInterfaceArray, IMPLEMENTSINTERFACE$10);
            }
        }
        
        /**
         * Sets ith "implementsInterface" element
         */
        public void setImplementsInterfaceArray(int i, com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface implementsInterface)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface target = null;
                target = (com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface)get_store().find_element_user(IMPLEMENTSINTERFACE$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(implementsInterface);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "implementsInterface" element
         */
        public com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface insertNewImplementsInterface(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface target = null;
                target = (com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface)get_store().insert_element_user(IMPLEMENTSINTERFACE$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "implementsInterface" element
         */
        public com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface addNewImplementsInterface()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface target = null;
                target = (com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface)get_store().add_element_user(IMPLEMENTSINTERFACE$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "implementsInterface" element
         */
        public void removeImplementsInterface(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IMPLEMENTSINTERFACE$10, i);
            }
        }
        
        /**
         * Gets array of all "index" elements
         */
        public com.guidewire.datamodel.IndexDocument.Index[] getIndexArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INDEX$12, targetList);
                com.guidewire.datamodel.IndexDocument.Index[] result = new com.guidewire.datamodel.IndexDocument.Index[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "index" element
         */
        public com.guidewire.datamodel.IndexDocument.Index getIndexArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.IndexDocument.Index target = null;
                target = (com.guidewire.datamodel.IndexDocument.Index)get_store().find_element_user(INDEX$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "index" element
         */
        public int sizeOfIndexArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDEX$12);
            }
        }
        
        /**
         * Sets array of all "index" element
         */
        public void setIndexArray(com.guidewire.datamodel.IndexDocument.Index[] indexArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(indexArray, INDEX$12);
            }
        }
        
        /**
         * Sets ith "index" element
         */
        public void setIndexArray(int i, com.guidewire.datamodel.IndexDocument.Index index)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.IndexDocument.Index target = null;
                target = (com.guidewire.datamodel.IndexDocument.Index)get_store().find_element_user(INDEX$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(index);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "index" element
         */
        public com.guidewire.datamodel.IndexDocument.Index insertNewIndex(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.IndexDocument.Index target = null;
                target = (com.guidewire.datamodel.IndexDocument.Index)get_store().insert_element_user(INDEX$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "index" element
         */
        public com.guidewire.datamodel.IndexDocument.Index addNewIndex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.IndexDocument.Index target = null;
                target = (com.guidewire.datamodel.IndexDocument.Index)get_store().add_element_user(INDEX$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "index" element
         */
        public void removeIndex(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDEX$12, i);
            }
        }
        
        /**
         * Gets array of all "param" elements
         */
        public com.guidewire.datamodel.ParamDocument.Param[] getParamArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PARAM$14, targetList);
                com.guidewire.datamodel.ParamDocument.Param[] result = new com.guidewire.datamodel.ParamDocument.Param[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "param" element
         */
        public com.guidewire.datamodel.ParamDocument.Param getParamArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ParamDocument.Param target = null;
                target = (com.guidewire.datamodel.ParamDocument.Param)get_store().find_element_user(PARAM$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "param" element
         */
        public int sizeOfParamArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARAM$14);
            }
        }
        
        /**
         * Sets array of all "param" element
         */
        public void setParamArray(com.guidewire.datamodel.ParamDocument.Param[] paramArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(paramArray, PARAM$14);
            }
        }
        
        /**
         * Sets ith "param" element
         */
        public void setParamArray(int i, com.guidewire.datamodel.ParamDocument.Param param)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ParamDocument.Param target = null;
                target = (com.guidewire.datamodel.ParamDocument.Param)get_store().find_element_user(PARAM$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(param);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "param" element
         */
        public com.guidewire.datamodel.ParamDocument.Param insertNewParam(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ParamDocument.Param target = null;
                target = (com.guidewire.datamodel.ParamDocument.Param)get_store().insert_element_user(PARAM$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "param" element
         */
        public com.guidewire.datamodel.ParamDocument.Param addNewParam()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ParamDocument.Param target = null;
                target = (com.guidewire.datamodel.ParamDocument.Param)get_store().add_element_user(PARAM$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "param" element
         */
        public void removeParam(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARAM$14, i);
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
                get_store().find_all_element_users(TYPEKEY$16, targetList);
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
                target = (com.guidewire.datamodel.TypekeyDocument.Typekey)get_store().find_element_user(TYPEKEY$16, i);
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
                return get_store().count_elements(TYPEKEY$16);
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
                arraySetterHelper(typekeyArray, TYPEKEY$16);
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
                target = (com.guidewire.datamodel.TypekeyDocument.Typekey)get_store().find_element_user(TYPEKEY$16, i);
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
                target = (com.guidewire.datamodel.TypekeyDocument.Typekey)get_store().insert_element_user(TYPEKEY$16, i);
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
                target = (com.guidewire.datamodel.TypekeyDocument.Typekey)get_store().add_element_user(TYPEKEY$16);
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
                get_store().remove_element(TYPEKEY$16, i);
            }
        }
        
        /**
         * Gets the "base" attribute
         */
        public boolean getBase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BASE$18);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "base" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetBase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BASE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(BASE$18);
                }
                return target;
            }
        }
        
        /**
         * True if has "base" attribute
         */
        public boolean isSetBase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BASE$18) != null;
            }
        }
        
        /**
         * Sets the "base" attribute
         */
        public void setBase(boolean base)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BASE$18);
                }
                target.setBooleanValue(base);
            }
        }
        
        /**
         * Sets (as xml) the "base" attribute
         */
        public void xsetBase(org.apache.xmlbeans.XmlBoolean base)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BASE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(BASE$18);
                }
                target.set(base);
            }
        }
        
        /**
         * Unsets the "base" attribute
         */
        public void unsetBase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BASE$18);
            }
        }
        
        /**
         * Gets the "effdatedOnly" attribute
         */
        public boolean getEffdatedOnly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EFFDATEDONLY$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EFFDATEDONLY$20);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "effdatedOnly" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetEffdatedOnly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EFFDATEDONLY$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EFFDATEDONLY$20);
                }
                return target;
            }
        }
        
        /**
         * True if has "effdatedOnly" attribute
         */
        public boolean isSetEffdatedOnly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EFFDATEDONLY$20) != null;
            }
        }
        
        /**
         * Sets the "effdatedOnly" attribute
         */
        public void setEffdatedOnly(boolean effdatedOnly)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EFFDATEDONLY$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EFFDATEDONLY$20);
                }
                target.setBooleanValue(effdatedOnly);
            }
        }
        
        /**
         * Sets (as xml) the "effdatedOnly" attribute
         */
        public void xsetEffdatedOnly(org.apache.xmlbeans.XmlBoolean effdatedOnly)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EFFDATEDONLY$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EFFDATEDONLY$20);
                }
                target.set(effdatedOnly);
            }
        }
        
        /**
         * Unsets the "effdatedOnly" attribute
         */
        public void unsetEffdatedOnly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EFFDATEDONLY$20);
            }
        }
        
        /**
         * Gets the "extendable" attribute
         */
        public boolean getExtendable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENDABLE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EXTENDABLE$22);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "extendable" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetExtendable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXTENDABLE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EXTENDABLE$22);
                }
                return target;
            }
        }
        
        /**
         * True if has "extendable" attribute
         */
        public boolean isSetExtendable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EXTENDABLE$22) != null;
            }
        }
        
        /**
         * Sets the "extendable" attribute
         */
        public void setExtendable(boolean extendable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENDABLE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXTENDABLE$22);
                }
                target.setBooleanValue(extendable);
            }
        }
        
        /**
         * Sets (as xml) the "extendable" attribute
         */
        public void xsetExtendable(org.apache.xmlbeans.XmlBoolean extendable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXTENDABLE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EXTENDABLE$22);
                }
                target.set(extendable);
            }
        }
        
        /**
         * Unsets the "extendable" attribute
         */
        public void unsetExtendable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EXTENDABLE$22);
            }
        }
        
        /**
         * Gets the "javaClass" attribute
         */
        public java.lang.String getJavaClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JAVACLASS$24);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "javaClass" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetJavaClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(JAVACLASS$24);
                return target;
            }
        }
        
        /**
         * True if has "javaClass" attribute
         */
        public boolean isSetJavaClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(JAVACLASS$24) != null;
            }
        }
        
        /**
         * Sets the "javaClass" attribute
         */
        public void setJavaClass(java.lang.String javaClass)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JAVACLASS$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JAVACLASS$24);
                }
                target.setStringValue(javaClass);
            }
        }
        
        /**
         * Sets (as xml) the "javaClass" attribute
         */
        public void xsetJavaClass(org.apache.xmlbeans.XmlNMTOKEN javaClass)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(JAVACLASS$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(JAVACLASS$24);
                }
                target.set(javaClass);
            }
        }
        
        /**
         * Unsets the "javaClass" attribute
         */
        public void unsetJavaClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(JAVACLASS$24);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$26);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$26);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$26);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(NAME$26);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "requires" attribute
         */
        public java.lang.String getRequires()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUIRES$28);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "requires" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRequires()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REQUIRES$28);
                return target;
            }
        }
        
        /**
         * True if has "requires" attribute
         */
        public boolean isSetRequires()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REQUIRES$28) != null;
            }
        }
        
        /**
         * Sets the "requires" attribute
         */
        public void setRequires(java.lang.String requires)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUIRES$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUIRES$28);
                }
                target.setStringValue(requires);
            }
        }
        
        /**
         * Sets (as xml) the "requires" attribute
         */
        public void xsetRequires(org.apache.xmlbeans.XmlString requires)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REQUIRES$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REQUIRES$28);
                }
                target.set(requires);
            }
        }
        
        /**
         * Unsets the "requires" attribute
         */
        public void unsetRequires()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REQUIRES$28);
            }
        }
    }
}
