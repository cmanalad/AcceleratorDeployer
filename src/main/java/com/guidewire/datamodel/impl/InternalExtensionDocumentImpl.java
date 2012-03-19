/*
 * An XML document type.
 * Localname: internalExtension
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.InternalExtensionDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one internalExtension(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class InternalExtensionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.InternalExtensionDocument
{
    private static final long serialVersionUID = 1L;
    
    public InternalExtensionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERNALEXTENSION$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "internalExtension");
    
    
    /**
     * Gets the "internalExtension" element
     */
    public com.guidewire.datamodel.InternalExtensionDocument.InternalExtension getInternalExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.InternalExtensionDocument.InternalExtension target = null;
            target = (com.guidewire.datamodel.InternalExtensionDocument.InternalExtension)get_store().find_element_user(INTERNALEXTENSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "internalExtension" element
     */
    public void setInternalExtension(com.guidewire.datamodel.InternalExtensionDocument.InternalExtension internalExtension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.InternalExtensionDocument.InternalExtension target = null;
            target = (com.guidewire.datamodel.InternalExtensionDocument.InternalExtension)get_store().find_element_user(INTERNALEXTENSION$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.InternalExtensionDocument.InternalExtension)get_store().add_element_user(INTERNALEXTENSION$0);
            }
            target.set(internalExtension);
        }
    }
    
    /**
     * Appends and returns a new empty "internalExtension" element
     */
    public com.guidewire.datamodel.InternalExtensionDocument.InternalExtension addNewInternalExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.InternalExtensionDocument.InternalExtension target = null;
            target = (com.guidewire.datamodel.InternalExtensionDocument.InternalExtension)get_store().add_element_user(INTERNALEXTENSION$0);
            return target;
        }
    }
    /**
     * An XML internalExtension(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class InternalExtensionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.InternalExtensionDocument.InternalExtension
    {
        private static final long serialVersionUID = 1L;
        
        public InternalExtensionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ARRAY$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "array");
        private static final javax.xml.namespace.QName ARRAYOVERRIDE$2 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "array-override");
        private static final javax.xml.namespace.QName CHECKCONSTRAINT$4 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "checkconstraint");
        private static final javax.xml.namespace.QName COLUMN$6 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "column");
        private static final javax.xml.namespace.QName COLUMNOVERRIDE$8 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "column-override");
        private static final javax.xml.namespace.QName COMPONENTREF$10 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "componentref");
        private static final javax.xml.namespace.QName CUSTOMCONSISTENCYCHECK$12 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "customconsistencycheck");
        private static final javax.xml.namespace.QName DBCHECKBUILDER$14 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "dbcheckbuilder");
        private static final javax.xml.namespace.QName DEPENDENTFIELDS$16 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "dependentfields");
        private static final javax.xml.namespace.QName DESCRIPTION$18 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "description");
        private static final javax.xml.namespace.QName EDGEFOREIGNKEY$20 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "edgeForeignKey");
        private static final javax.xml.namespace.QName EVENTS$22 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "events");
        private static final javax.xml.namespace.QName FOREIGNKEY$24 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "foreignkey");
        private static final javax.xml.namespace.QName FOREIGNKEYOVERRIDE$26 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "foreignkey-override");
        private static final javax.xml.namespace.QName IMPLEMENTSENTITY$28 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "implementsEntity");
        private static final javax.xml.namespace.QName IMPLEMENTSINTERFACE$30 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "implementsInterface");
        private static final javax.xml.namespace.QName INDEX$32 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "index");
        private static final javax.xml.namespace.QName JOINTABLECONSISTENCYCHECK$34 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "jointableconsistencycheck");
        private static final javax.xml.namespace.QName ONETOONE$36 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "onetoone");
        private static final javax.xml.namespace.QName ONETOONEOVERRIDE$38 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "onetoone-override");
        private static final javax.xml.namespace.QName REMOVEINDEX$40 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "remove-index");
        private static final javax.xml.namespace.QName TYPEKEY$42 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "typekey");
        private static final javax.xml.namespace.QName TYPEKEYOVERRIDE$44 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "typekey-override");
        private static final javax.xml.namespace.QName ENTITYNAME$46 = 
            new javax.xml.namespace.QName("", "entityName");
        private static final javax.xml.namespace.QName FINAL$48 = 
            new javax.xml.namespace.QName("", "final");
        private static final javax.xml.namespace.QName JAVACLASS$50 = 
            new javax.xml.namespace.QName("", "javaClass");
        private static final javax.xml.namespace.QName TABLE$52 = 
            new javax.xml.namespace.QName("", "table");
        
        
        /**
         * Gets array of all "array" elements
         */
        public com.guidewire.datamodel.ArrayDocument.Array[] getArrayArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ARRAY$0, targetList);
                com.guidewire.datamodel.ArrayDocument.Array[] result = new com.guidewire.datamodel.ArrayDocument.Array[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "array" element
         */
        public com.guidewire.datamodel.ArrayDocument.Array getArrayArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ArrayDocument.Array target = null;
                target = (com.guidewire.datamodel.ArrayDocument.Array)get_store().find_element_user(ARRAY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "array" element
         */
        public int sizeOfArrayArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ARRAY$0);
            }
        }
        
        /**
         * Sets array of all "array" element
         */
        public void setArrayArray(com.guidewire.datamodel.ArrayDocument.Array[] arrayArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(arrayArray, ARRAY$0);
            }
        }
        
        /**
         * Sets ith "array" element
         */
        public void setArrayArray(int i, com.guidewire.datamodel.ArrayDocument.Array array)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ArrayDocument.Array target = null;
                target = (com.guidewire.datamodel.ArrayDocument.Array)get_store().find_element_user(ARRAY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(array);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "array" element
         */
        public com.guidewire.datamodel.ArrayDocument.Array insertNewArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ArrayDocument.Array target = null;
                target = (com.guidewire.datamodel.ArrayDocument.Array)get_store().insert_element_user(ARRAY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "array" element
         */
        public com.guidewire.datamodel.ArrayDocument.Array addNewArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ArrayDocument.Array target = null;
                target = (com.guidewire.datamodel.ArrayDocument.Array)get_store().add_element_user(ARRAY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "array" element
         */
        public void removeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ARRAY$0, i);
            }
        }
        
        /**
         * Gets array of all "array-override" elements
         */
        public com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride[] getArrayOverrideArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ARRAYOVERRIDE$2, targetList);
                com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride[] result = new com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "array-override" element
         */
        public com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride getArrayOverrideArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride target = null;
                target = (com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride)get_store().find_element_user(ARRAYOVERRIDE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "array-override" element
         */
        public int sizeOfArrayOverrideArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ARRAYOVERRIDE$2);
            }
        }
        
        /**
         * Sets array of all "array-override" element
         */
        public void setArrayOverrideArray(com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride[] arrayOverrideArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(arrayOverrideArray, ARRAYOVERRIDE$2);
            }
        }
        
        /**
         * Sets ith "array-override" element
         */
        public void setArrayOverrideArray(int i, com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride arrayOverride)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride target = null;
                target = (com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride)get_store().find_element_user(ARRAYOVERRIDE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(arrayOverride);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "array-override" element
         */
        public com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride insertNewArrayOverride(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride target = null;
                target = (com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride)get_store().insert_element_user(ARRAYOVERRIDE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "array-override" element
         */
        public com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride addNewArrayOverride()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride target = null;
                target = (com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride)get_store().add_element_user(ARRAYOVERRIDE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "array-override" element
         */
        public void removeArrayOverride(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ARRAYOVERRIDE$2, i);
            }
        }
        
        /**
         * Gets array of all "checkconstraint" elements
         */
        public com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint[] getCheckconstraintArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CHECKCONSTRAINT$4, targetList);
                com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint[] result = new com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "checkconstraint" element
         */
        public com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint getCheckconstraintArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint target = null;
                target = (com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint)get_store().find_element_user(CHECKCONSTRAINT$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "checkconstraint" element
         */
        public int sizeOfCheckconstraintArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CHECKCONSTRAINT$4);
            }
        }
        
        /**
         * Sets array of all "checkconstraint" element
         */
        public void setCheckconstraintArray(com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint[] checkconstraintArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(checkconstraintArray, CHECKCONSTRAINT$4);
            }
        }
        
        /**
         * Sets ith "checkconstraint" element
         */
        public void setCheckconstraintArray(int i, com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint checkconstraint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint target = null;
                target = (com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint)get_store().find_element_user(CHECKCONSTRAINT$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(checkconstraint);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "checkconstraint" element
         */
        public com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint insertNewCheckconstraint(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint target = null;
                target = (com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint)get_store().insert_element_user(CHECKCONSTRAINT$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "checkconstraint" element
         */
        public com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint addNewCheckconstraint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint target = null;
                target = (com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint)get_store().add_element_user(CHECKCONSTRAINT$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "checkconstraint" element
         */
        public void removeCheckconstraint(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CHECKCONSTRAINT$4, i);
            }
        }
        
        /**
         * Gets array of all "column" elements
         */
        public com.guidewire.datamodel.ColumnDocument.Column[] getColumnArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COLUMN$6, targetList);
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
                target = (com.guidewire.datamodel.ColumnDocument.Column)get_store().find_element_user(COLUMN$6, i);
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
                return get_store().count_elements(COLUMN$6);
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
                arraySetterHelper(columnArray, COLUMN$6);
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
                target = (com.guidewire.datamodel.ColumnDocument.Column)get_store().find_element_user(COLUMN$6, i);
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
                target = (com.guidewire.datamodel.ColumnDocument.Column)get_store().insert_element_user(COLUMN$6, i);
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
                target = (com.guidewire.datamodel.ColumnDocument.Column)get_store().add_element_user(COLUMN$6);
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
                get_store().remove_element(COLUMN$6, i);
            }
        }
        
        /**
         * Gets array of all "column-override" elements
         */
        public com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride[] getColumnOverrideArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COLUMNOVERRIDE$8, targetList);
                com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride[] result = new com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "column-override" element
         */
        public com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride getColumnOverrideArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride target = null;
                target = (com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride)get_store().find_element_user(COLUMNOVERRIDE$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "column-override" element
         */
        public int sizeOfColumnOverrideArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COLUMNOVERRIDE$8);
            }
        }
        
        /**
         * Sets array of all "column-override" element
         */
        public void setColumnOverrideArray(com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride[] columnOverrideArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(columnOverrideArray, COLUMNOVERRIDE$8);
            }
        }
        
        /**
         * Sets ith "column-override" element
         */
        public void setColumnOverrideArray(int i, com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride columnOverride)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride target = null;
                target = (com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride)get_store().find_element_user(COLUMNOVERRIDE$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(columnOverride);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "column-override" element
         */
        public com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride insertNewColumnOverride(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride target = null;
                target = (com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride)get_store().insert_element_user(COLUMNOVERRIDE$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "column-override" element
         */
        public com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride addNewColumnOverride()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride target = null;
                target = (com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride)get_store().add_element_user(COLUMNOVERRIDE$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "column-override" element
         */
        public void removeColumnOverride(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COLUMNOVERRIDE$8, i);
            }
        }
        
        /**
         * Gets array of all "componentref" elements
         */
        public com.guidewire.datamodel.ComponentrefDocument.Componentref[] getComponentrefArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COMPONENTREF$10, targetList);
                com.guidewire.datamodel.ComponentrefDocument.Componentref[] result = new com.guidewire.datamodel.ComponentrefDocument.Componentref[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "componentref" element
         */
        public com.guidewire.datamodel.ComponentrefDocument.Componentref getComponentrefArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ComponentrefDocument.Componentref target = null;
                target = (com.guidewire.datamodel.ComponentrefDocument.Componentref)get_store().find_element_user(COMPONENTREF$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "componentref" element
         */
        public int sizeOfComponentrefArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMPONENTREF$10);
            }
        }
        
        /**
         * Sets array of all "componentref" element
         */
        public void setComponentrefArray(com.guidewire.datamodel.ComponentrefDocument.Componentref[] componentrefArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(componentrefArray, COMPONENTREF$10);
            }
        }
        
        /**
         * Sets ith "componentref" element
         */
        public void setComponentrefArray(int i, com.guidewire.datamodel.ComponentrefDocument.Componentref componentref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ComponentrefDocument.Componentref target = null;
                target = (com.guidewire.datamodel.ComponentrefDocument.Componentref)get_store().find_element_user(COMPONENTREF$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(componentref);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "componentref" element
         */
        public com.guidewire.datamodel.ComponentrefDocument.Componentref insertNewComponentref(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ComponentrefDocument.Componentref target = null;
                target = (com.guidewire.datamodel.ComponentrefDocument.Componentref)get_store().insert_element_user(COMPONENTREF$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "componentref" element
         */
        public com.guidewire.datamodel.ComponentrefDocument.Componentref addNewComponentref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ComponentrefDocument.Componentref target = null;
                target = (com.guidewire.datamodel.ComponentrefDocument.Componentref)get_store().add_element_user(COMPONENTREF$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "componentref" element
         */
        public void removeComponentref(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMPONENTREF$10, i);
            }
        }
        
        /**
         * Gets array of all "customconsistencycheck" elements
         */
        public com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck[] getCustomconsistencycheckArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CUSTOMCONSISTENCYCHECK$12, targetList);
                com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck[] result = new com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "customconsistencycheck" element
         */
        public com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck getCustomconsistencycheckArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck target = null;
                target = (com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck)get_store().find_element_user(CUSTOMCONSISTENCYCHECK$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "customconsistencycheck" element
         */
        public int sizeOfCustomconsistencycheckArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CUSTOMCONSISTENCYCHECK$12);
            }
        }
        
        /**
         * Sets array of all "customconsistencycheck" element
         */
        public void setCustomconsistencycheckArray(com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck[] customconsistencycheckArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(customconsistencycheckArray, CUSTOMCONSISTENCYCHECK$12);
            }
        }
        
        /**
         * Sets ith "customconsistencycheck" element
         */
        public void setCustomconsistencycheckArray(int i, com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck customconsistencycheck)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck target = null;
                target = (com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck)get_store().find_element_user(CUSTOMCONSISTENCYCHECK$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(customconsistencycheck);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "customconsistencycheck" element
         */
        public com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck insertNewCustomconsistencycheck(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck target = null;
                target = (com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck)get_store().insert_element_user(CUSTOMCONSISTENCYCHECK$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "customconsistencycheck" element
         */
        public com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck addNewCustomconsistencycheck()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck target = null;
                target = (com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck)get_store().add_element_user(CUSTOMCONSISTENCYCHECK$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "customconsistencycheck" element
         */
        public void removeCustomconsistencycheck(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CUSTOMCONSISTENCYCHECK$12, i);
            }
        }
        
        /**
         * Gets array of all "dbcheckbuilder" elements
         */
        public com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder[] getDbcheckbuilderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DBCHECKBUILDER$14, targetList);
                com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder[] result = new com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "dbcheckbuilder" element
         */
        public com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder getDbcheckbuilderArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder target = null;
                target = (com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder)get_store().find_element_user(DBCHECKBUILDER$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "dbcheckbuilder" element
         */
        public int sizeOfDbcheckbuilderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DBCHECKBUILDER$14);
            }
        }
        
        /**
         * Sets array of all "dbcheckbuilder" element
         */
        public void setDbcheckbuilderArray(com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder[] dbcheckbuilderArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(dbcheckbuilderArray, DBCHECKBUILDER$14);
            }
        }
        
        /**
         * Sets ith "dbcheckbuilder" element
         */
        public void setDbcheckbuilderArray(int i, com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder dbcheckbuilder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder target = null;
                target = (com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder)get_store().find_element_user(DBCHECKBUILDER$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(dbcheckbuilder);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dbcheckbuilder" element
         */
        public com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder insertNewDbcheckbuilder(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder target = null;
                target = (com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder)get_store().insert_element_user(DBCHECKBUILDER$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dbcheckbuilder" element
         */
        public com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder addNewDbcheckbuilder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder target = null;
                target = (com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder)get_store().add_element_user(DBCHECKBUILDER$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "dbcheckbuilder" element
         */
        public void removeDbcheckbuilder(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DBCHECKBUILDER$14, i);
            }
        }
        
        /**
         * Gets array of all "dependentfields" elements
         */
        public com.guidewire.datamodel.DependentfieldsDocument.Dependentfields[] getDependentfieldsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DEPENDENTFIELDS$16, targetList);
                com.guidewire.datamodel.DependentfieldsDocument.Dependentfields[] result = new com.guidewire.datamodel.DependentfieldsDocument.Dependentfields[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "dependentfields" element
         */
        public com.guidewire.datamodel.DependentfieldsDocument.Dependentfields getDependentfieldsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.DependentfieldsDocument.Dependentfields target = null;
                target = (com.guidewire.datamodel.DependentfieldsDocument.Dependentfields)get_store().find_element_user(DEPENDENTFIELDS$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "dependentfields" element
         */
        public int sizeOfDependentfieldsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DEPENDENTFIELDS$16);
            }
        }
        
        /**
         * Sets array of all "dependentfields" element
         */
        public void setDependentfieldsArray(com.guidewire.datamodel.DependentfieldsDocument.Dependentfields[] dependentfieldsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(dependentfieldsArray, DEPENDENTFIELDS$16);
            }
        }
        
        /**
         * Sets ith "dependentfields" element
         */
        public void setDependentfieldsArray(int i, com.guidewire.datamodel.DependentfieldsDocument.Dependentfields dependentfields)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.DependentfieldsDocument.Dependentfields target = null;
                target = (com.guidewire.datamodel.DependentfieldsDocument.Dependentfields)get_store().find_element_user(DEPENDENTFIELDS$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(dependentfields);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dependentfields" element
         */
        public com.guidewire.datamodel.DependentfieldsDocument.Dependentfields insertNewDependentfields(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.DependentfieldsDocument.Dependentfields target = null;
                target = (com.guidewire.datamodel.DependentfieldsDocument.Dependentfields)get_store().insert_element_user(DEPENDENTFIELDS$16, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dependentfields" element
         */
        public com.guidewire.datamodel.DependentfieldsDocument.Dependentfields addNewDependentfields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.DependentfieldsDocument.Dependentfields target = null;
                target = (com.guidewire.datamodel.DependentfieldsDocument.Dependentfields)get_store().add_element_user(DEPENDENTFIELDS$16);
                return target;
            }
        }
        
        /**
         * Removes the ith "dependentfields" element
         */
        public void removeDependentfields(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DEPENDENTFIELDS$16, i);
            }
        }
        
        /**
         * Gets array of all "description" elements
         */
        public com.guidewire.datamodel.DescriptionDocument.Description[] getDescriptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DESCRIPTION$18, targetList);
                com.guidewire.datamodel.DescriptionDocument.Description[] result = new com.guidewire.datamodel.DescriptionDocument.Description[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "description" element
         */
        public com.guidewire.datamodel.DescriptionDocument.Description getDescriptionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.DescriptionDocument.Description target = null;
                target = (com.guidewire.datamodel.DescriptionDocument.Description)get_store().find_element_user(DESCRIPTION$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "description" element
         */
        public int sizeOfDescriptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESCRIPTION$18);
            }
        }
        
        /**
         * Sets array of all "description" element
         */
        public void setDescriptionArray(com.guidewire.datamodel.DescriptionDocument.Description[] descriptionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(descriptionArray, DESCRIPTION$18);
            }
        }
        
        /**
         * Sets ith "description" element
         */
        public void setDescriptionArray(int i, com.guidewire.datamodel.DescriptionDocument.Description description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.DescriptionDocument.Description target = null;
                target = (com.guidewire.datamodel.DescriptionDocument.Description)get_store().find_element_user(DESCRIPTION$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(description);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "description" element
         */
        public com.guidewire.datamodel.DescriptionDocument.Description insertNewDescription(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.DescriptionDocument.Description target = null;
                target = (com.guidewire.datamodel.DescriptionDocument.Description)get_store().insert_element_user(DESCRIPTION$18, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "description" element
         */
        public com.guidewire.datamodel.DescriptionDocument.Description addNewDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.DescriptionDocument.Description target = null;
                target = (com.guidewire.datamodel.DescriptionDocument.Description)get_store().add_element_user(DESCRIPTION$18);
                return target;
            }
        }
        
        /**
         * Removes the ith "description" element
         */
        public void removeDescription(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESCRIPTION$18, i);
            }
        }
        
        /**
         * Gets array of all "edgeForeignKey" elements
         */
        public com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey[] getEdgeForeignKeyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EDGEFOREIGNKEY$20, targetList);
                com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey[] result = new com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "edgeForeignKey" element
         */
        public com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey getEdgeForeignKeyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey target = null;
                target = (com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey)get_store().find_element_user(EDGEFOREIGNKEY$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "edgeForeignKey" element
         */
        public int sizeOfEdgeForeignKeyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EDGEFOREIGNKEY$20);
            }
        }
        
        /**
         * Sets array of all "edgeForeignKey" element
         */
        public void setEdgeForeignKeyArray(com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey[] edgeForeignKeyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(edgeForeignKeyArray, EDGEFOREIGNKEY$20);
            }
        }
        
        /**
         * Sets ith "edgeForeignKey" element
         */
        public void setEdgeForeignKeyArray(int i, com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey edgeForeignKey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey target = null;
                target = (com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey)get_store().find_element_user(EDGEFOREIGNKEY$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(edgeForeignKey);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "edgeForeignKey" element
         */
        public com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey insertNewEdgeForeignKey(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey target = null;
                target = (com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey)get_store().insert_element_user(EDGEFOREIGNKEY$20, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "edgeForeignKey" element
         */
        public com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey addNewEdgeForeignKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey target = null;
                target = (com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey)get_store().add_element_user(EDGEFOREIGNKEY$20);
                return target;
            }
        }
        
        /**
         * Removes the ith "edgeForeignKey" element
         */
        public void removeEdgeForeignKey(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EDGEFOREIGNKEY$20, i);
            }
        }
        
        /**
         * Gets array of all "events" elements
         */
        public com.guidewire.datamodel.EventsDocument.Events[] getEventsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EVENTS$22, targetList);
                com.guidewire.datamodel.EventsDocument.Events[] result = new com.guidewire.datamodel.EventsDocument.Events[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "events" element
         */
        public com.guidewire.datamodel.EventsDocument.Events getEventsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.EventsDocument.Events target = null;
                target = (com.guidewire.datamodel.EventsDocument.Events)get_store().find_element_user(EVENTS$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "events" element
         */
        public int sizeOfEventsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EVENTS$22);
            }
        }
        
        /**
         * Sets array of all "events" element
         */
        public void setEventsArray(com.guidewire.datamodel.EventsDocument.Events[] eventsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(eventsArray, EVENTS$22);
            }
        }
        
        /**
         * Sets ith "events" element
         */
        public void setEventsArray(int i, com.guidewire.datamodel.EventsDocument.Events events)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.EventsDocument.Events target = null;
                target = (com.guidewire.datamodel.EventsDocument.Events)get_store().find_element_user(EVENTS$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(events);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "events" element
         */
        public com.guidewire.datamodel.EventsDocument.Events insertNewEvents(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.EventsDocument.Events target = null;
                target = (com.guidewire.datamodel.EventsDocument.Events)get_store().insert_element_user(EVENTS$22, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "events" element
         */
        public com.guidewire.datamodel.EventsDocument.Events addNewEvents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.EventsDocument.Events target = null;
                target = (com.guidewire.datamodel.EventsDocument.Events)get_store().add_element_user(EVENTS$22);
                return target;
            }
        }
        
        /**
         * Removes the ith "events" element
         */
        public void removeEvents(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EVENTS$22, i);
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
                get_store().find_all_element_users(FOREIGNKEY$24, targetList);
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
                target = (com.guidewire.datamodel.ForeignkeyDocument.Foreignkey)get_store().find_element_user(FOREIGNKEY$24, i);
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
                return get_store().count_elements(FOREIGNKEY$24);
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
                arraySetterHelper(foreignkeyArray, FOREIGNKEY$24);
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
                target = (com.guidewire.datamodel.ForeignkeyDocument.Foreignkey)get_store().find_element_user(FOREIGNKEY$24, i);
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
                target = (com.guidewire.datamodel.ForeignkeyDocument.Foreignkey)get_store().insert_element_user(FOREIGNKEY$24, i);
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
                target = (com.guidewire.datamodel.ForeignkeyDocument.Foreignkey)get_store().add_element_user(FOREIGNKEY$24);
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
                get_store().remove_element(FOREIGNKEY$24, i);
            }
        }
        
        /**
         * Gets array of all "foreignkey-override" elements
         */
        public com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride[] getForeignkeyOverrideArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FOREIGNKEYOVERRIDE$26, targetList);
                com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride[] result = new com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "foreignkey-override" element
         */
        public com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride getForeignkeyOverrideArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride target = null;
                target = (com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride)get_store().find_element_user(FOREIGNKEYOVERRIDE$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "foreignkey-override" element
         */
        public int sizeOfForeignkeyOverrideArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FOREIGNKEYOVERRIDE$26);
            }
        }
        
        /**
         * Sets array of all "foreignkey-override" element
         */
        public void setForeignkeyOverrideArray(com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride[] foreignkeyOverrideArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(foreignkeyOverrideArray, FOREIGNKEYOVERRIDE$26);
            }
        }
        
        /**
         * Sets ith "foreignkey-override" element
         */
        public void setForeignkeyOverrideArray(int i, com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride foreignkeyOverride)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride target = null;
                target = (com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride)get_store().find_element_user(FOREIGNKEYOVERRIDE$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(foreignkeyOverride);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "foreignkey-override" element
         */
        public com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride insertNewForeignkeyOverride(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride target = null;
                target = (com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride)get_store().insert_element_user(FOREIGNKEYOVERRIDE$26, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "foreignkey-override" element
         */
        public com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride addNewForeignkeyOverride()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride target = null;
                target = (com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride)get_store().add_element_user(FOREIGNKEYOVERRIDE$26);
                return target;
            }
        }
        
        /**
         * Removes the ith "foreignkey-override" element
         */
        public void removeForeignkeyOverride(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FOREIGNKEYOVERRIDE$26, i);
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
                get_store().find_all_element_users(IMPLEMENTSENTITY$28, targetList);
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
                target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().find_element_user(IMPLEMENTSENTITY$28, i);
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
                return get_store().count_elements(IMPLEMENTSENTITY$28);
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
                arraySetterHelper(implementsEntityArray, IMPLEMENTSENTITY$28);
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
                target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().find_element_user(IMPLEMENTSENTITY$28, i);
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
                target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().insert_element_user(IMPLEMENTSENTITY$28, i);
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
                target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().add_element_user(IMPLEMENTSENTITY$28);
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
                get_store().remove_element(IMPLEMENTSENTITY$28, i);
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
                get_store().find_all_element_users(IMPLEMENTSINTERFACE$30, targetList);
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
                target = (com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface)get_store().find_element_user(IMPLEMENTSINTERFACE$30, i);
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
                return get_store().count_elements(IMPLEMENTSINTERFACE$30);
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
                arraySetterHelper(implementsInterfaceArray, IMPLEMENTSINTERFACE$30);
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
                target = (com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface)get_store().find_element_user(IMPLEMENTSINTERFACE$30, i);
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
                target = (com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface)get_store().insert_element_user(IMPLEMENTSINTERFACE$30, i);
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
                target = (com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface)get_store().add_element_user(IMPLEMENTSINTERFACE$30);
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
                get_store().remove_element(IMPLEMENTSINTERFACE$30, i);
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
                get_store().find_all_element_users(INDEX$32, targetList);
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
                target = (com.guidewire.datamodel.IndexDocument.Index)get_store().find_element_user(INDEX$32, i);
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
                return get_store().count_elements(INDEX$32);
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
                arraySetterHelper(indexArray, INDEX$32);
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
                target = (com.guidewire.datamodel.IndexDocument.Index)get_store().find_element_user(INDEX$32, i);
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
                target = (com.guidewire.datamodel.IndexDocument.Index)get_store().insert_element_user(INDEX$32, i);
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
                target = (com.guidewire.datamodel.IndexDocument.Index)get_store().add_element_user(INDEX$32);
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
                get_store().remove_element(INDEX$32, i);
            }
        }
        
        /**
         * Gets array of all "jointableconsistencycheck" elements
         */
        public com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck[] getJointableconsistencycheckArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(JOINTABLECONSISTENCYCHECK$34, targetList);
                com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck[] result = new com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "jointableconsistencycheck" element
         */
        public com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck getJointableconsistencycheckArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck target = null;
                target = (com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck)get_store().find_element_user(JOINTABLECONSISTENCYCHECK$34, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "jointableconsistencycheck" element
         */
        public int sizeOfJointableconsistencycheckArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(JOINTABLECONSISTENCYCHECK$34);
            }
        }
        
        /**
         * Sets array of all "jointableconsistencycheck" element
         */
        public void setJointableconsistencycheckArray(com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck[] jointableconsistencycheckArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(jointableconsistencycheckArray, JOINTABLECONSISTENCYCHECK$34);
            }
        }
        
        /**
         * Sets ith "jointableconsistencycheck" element
         */
        public void setJointableconsistencycheckArray(int i, com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck jointableconsistencycheck)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck target = null;
                target = (com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck)get_store().find_element_user(JOINTABLECONSISTENCYCHECK$34, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(jointableconsistencycheck);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "jointableconsistencycheck" element
         */
        public com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck insertNewJointableconsistencycheck(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck target = null;
                target = (com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck)get_store().insert_element_user(JOINTABLECONSISTENCYCHECK$34, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "jointableconsistencycheck" element
         */
        public com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck addNewJointableconsistencycheck()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck target = null;
                target = (com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck)get_store().add_element_user(JOINTABLECONSISTENCYCHECK$34);
                return target;
            }
        }
        
        /**
         * Removes the ith "jointableconsistencycheck" element
         */
        public void removeJointableconsistencycheck(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(JOINTABLECONSISTENCYCHECK$34, i);
            }
        }
        
        /**
         * Gets array of all "onetoone" elements
         */
        public com.guidewire.datamodel.OnetooneDocument.Onetoone[] getOnetooneArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ONETOONE$36, targetList);
                com.guidewire.datamodel.OnetooneDocument.Onetoone[] result = new com.guidewire.datamodel.OnetooneDocument.Onetoone[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "onetoone" element
         */
        public com.guidewire.datamodel.OnetooneDocument.Onetoone getOnetooneArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.OnetooneDocument.Onetoone target = null;
                target = (com.guidewire.datamodel.OnetooneDocument.Onetoone)get_store().find_element_user(ONETOONE$36, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "onetoone" element
         */
        public int sizeOfOnetooneArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ONETOONE$36);
            }
        }
        
        /**
         * Sets array of all "onetoone" element
         */
        public void setOnetooneArray(com.guidewire.datamodel.OnetooneDocument.Onetoone[] onetooneArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(onetooneArray, ONETOONE$36);
            }
        }
        
        /**
         * Sets ith "onetoone" element
         */
        public void setOnetooneArray(int i, com.guidewire.datamodel.OnetooneDocument.Onetoone onetoone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.OnetooneDocument.Onetoone target = null;
                target = (com.guidewire.datamodel.OnetooneDocument.Onetoone)get_store().find_element_user(ONETOONE$36, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(onetoone);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "onetoone" element
         */
        public com.guidewire.datamodel.OnetooneDocument.Onetoone insertNewOnetoone(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.OnetooneDocument.Onetoone target = null;
                target = (com.guidewire.datamodel.OnetooneDocument.Onetoone)get_store().insert_element_user(ONETOONE$36, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "onetoone" element
         */
        public com.guidewire.datamodel.OnetooneDocument.Onetoone addNewOnetoone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.OnetooneDocument.Onetoone target = null;
                target = (com.guidewire.datamodel.OnetooneDocument.Onetoone)get_store().add_element_user(ONETOONE$36);
                return target;
            }
        }
        
        /**
         * Removes the ith "onetoone" element
         */
        public void removeOnetoone(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ONETOONE$36, i);
            }
        }
        
        /**
         * Gets array of all "onetoone-override" elements
         */
        public com.guidewire.datamodel.OnetooneOverrideDocument.OnetooneOverride[] getOnetooneOverrideArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ONETOONEOVERRIDE$38, targetList);
                com.guidewire.datamodel.OnetooneOverrideDocument.OnetooneOverride[] result = new com.guidewire.datamodel.OnetooneOverrideDocument.OnetooneOverride[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "onetoone-override" element
         */
        public com.guidewire.datamodel.OnetooneOverrideDocument.OnetooneOverride getOnetooneOverrideArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.OnetooneOverrideDocument.OnetooneOverride target = null;
                target = (com.guidewire.datamodel.OnetooneOverrideDocument.OnetooneOverride)get_store().find_element_user(ONETOONEOVERRIDE$38, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "onetoone-override" element
         */
        public int sizeOfOnetooneOverrideArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ONETOONEOVERRIDE$38);
            }
        }
        
        /**
         * Sets array of all "onetoone-override" element
         */
        public void setOnetooneOverrideArray(com.guidewire.datamodel.OnetooneOverrideDocument.OnetooneOverride[] onetooneOverrideArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(onetooneOverrideArray, ONETOONEOVERRIDE$38);
            }
        }
        
        /**
         * Sets ith "onetoone-override" element
         */
        public void setOnetooneOverrideArray(int i, com.guidewire.datamodel.OnetooneOverrideDocument.OnetooneOverride onetooneOverride)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.OnetooneOverrideDocument.OnetooneOverride target = null;
                target = (com.guidewire.datamodel.OnetooneOverrideDocument.OnetooneOverride)get_store().find_element_user(ONETOONEOVERRIDE$38, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(onetooneOverride);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "onetoone-override" element
         */
        public com.guidewire.datamodel.OnetooneOverrideDocument.OnetooneOverride insertNewOnetooneOverride(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.OnetooneOverrideDocument.OnetooneOverride target = null;
                target = (com.guidewire.datamodel.OnetooneOverrideDocument.OnetooneOverride)get_store().insert_element_user(ONETOONEOVERRIDE$38, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "onetoone-override" element
         */
        public com.guidewire.datamodel.OnetooneOverrideDocument.OnetooneOverride addNewOnetooneOverride()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.OnetooneOverrideDocument.OnetooneOverride target = null;
                target = (com.guidewire.datamodel.OnetooneOverrideDocument.OnetooneOverride)get_store().add_element_user(ONETOONEOVERRIDE$38);
                return target;
            }
        }
        
        /**
         * Removes the ith "onetoone-override" element
         */
        public void removeOnetooneOverride(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ONETOONEOVERRIDE$38, i);
            }
        }
        
        /**
         * Gets array of all "remove-index" elements
         */
        public com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex[] getRemoveIndexArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REMOVEINDEX$40, targetList);
                com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex[] result = new com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "remove-index" element
         */
        public com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex getRemoveIndexArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex target = null;
                target = (com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex)get_store().find_element_user(REMOVEINDEX$40, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "remove-index" element
         */
        public int sizeOfRemoveIndexArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REMOVEINDEX$40);
            }
        }
        
        /**
         * Sets array of all "remove-index" element
         */
        public void setRemoveIndexArray(com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex[] removeIndexArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(removeIndexArray, REMOVEINDEX$40);
            }
        }
        
        /**
         * Sets ith "remove-index" element
         */
        public void setRemoveIndexArray(int i, com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex removeIndex)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex target = null;
                target = (com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex)get_store().find_element_user(REMOVEINDEX$40, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(removeIndex);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "remove-index" element
         */
        public com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex insertNewRemoveIndex(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex target = null;
                target = (com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex)get_store().insert_element_user(REMOVEINDEX$40, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "remove-index" element
         */
        public com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex addNewRemoveIndex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex target = null;
                target = (com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex)get_store().add_element_user(REMOVEINDEX$40);
                return target;
            }
        }
        
        /**
         * Removes the ith "remove-index" element
         */
        public void removeRemoveIndex(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REMOVEINDEX$40, i);
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
                get_store().find_all_element_users(TYPEKEY$42, targetList);
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
                target = (com.guidewire.datamodel.TypekeyDocument.Typekey)get_store().find_element_user(TYPEKEY$42, i);
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
                return get_store().count_elements(TYPEKEY$42);
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
                arraySetterHelper(typekeyArray, TYPEKEY$42);
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
                target = (com.guidewire.datamodel.TypekeyDocument.Typekey)get_store().find_element_user(TYPEKEY$42, i);
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
                target = (com.guidewire.datamodel.TypekeyDocument.Typekey)get_store().insert_element_user(TYPEKEY$42, i);
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
                target = (com.guidewire.datamodel.TypekeyDocument.Typekey)get_store().add_element_user(TYPEKEY$42);
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
                get_store().remove_element(TYPEKEY$42, i);
            }
        }
        
        /**
         * Gets array of all "typekey-override" elements
         */
        public com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride[] getTypekeyOverrideArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TYPEKEYOVERRIDE$44, targetList);
                com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride[] result = new com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "typekey-override" element
         */
        public com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride getTypekeyOverrideArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride target = null;
                target = (com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride)get_store().find_element_user(TYPEKEYOVERRIDE$44, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "typekey-override" element
         */
        public int sizeOfTypekeyOverrideArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TYPEKEYOVERRIDE$44);
            }
        }
        
        /**
         * Sets array of all "typekey-override" element
         */
        public void setTypekeyOverrideArray(com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride[] typekeyOverrideArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(typekeyOverrideArray, TYPEKEYOVERRIDE$44);
            }
        }
        
        /**
         * Sets ith "typekey-override" element
         */
        public void setTypekeyOverrideArray(int i, com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride typekeyOverride)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride target = null;
                target = (com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride)get_store().find_element_user(TYPEKEYOVERRIDE$44, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(typekeyOverride);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "typekey-override" element
         */
        public com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride insertNewTypekeyOverride(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride target = null;
                target = (com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride)get_store().insert_element_user(TYPEKEYOVERRIDE$44, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "typekey-override" element
         */
        public com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride addNewTypekeyOverride()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride target = null;
                target = (com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride)get_store().add_element_user(TYPEKEYOVERRIDE$44);
                return target;
            }
        }
        
        /**
         * Removes the ith "typekey-override" element
         */
        public void removeTypekeyOverride(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TYPEKEYOVERRIDE$44, i);
            }
        }
        
        /**
         * Gets the "entityName" attribute
         */
        public java.lang.String getEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$46);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "entityName" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(ENTITYNAME$46);
                return target;
            }
        }
        
        /**
         * Sets the "entityName" attribute
         */
        public void setEntityName(java.lang.String entityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTITYNAME$46);
                }
                target.setStringValue(entityName);
            }
        }
        
        /**
         * Sets (as xml) the "entityName" attribute
         */
        public void xsetEntityName(org.apache.xmlbeans.XmlNMTOKEN entityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(ENTITYNAME$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(ENTITYNAME$46);
                }
                target.set(entityName);
            }
        }
        
        /**
         * Gets the "final" attribute
         */
        public boolean getFinal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINAL$48);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "final" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetFinal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FINAL$48);
                return target;
            }
        }
        
        /**
         * True if has "final" attribute
         */
        public boolean isSetFinal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FINAL$48) != null;
            }
        }
        
        /**
         * Sets the "final" attribute
         */
        public void setFinal(boolean xfinal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINAL$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FINAL$48);
                }
                target.setBooleanValue(xfinal);
            }
        }
        
        /**
         * Sets (as xml) the "final" attribute
         */
        public void xsetFinal(org.apache.xmlbeans.XmlBoolean xfinal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FINAL$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FINAL$48);
                }
                target.set(xfinal);
            }
        }
        
        /**
         * Unsets the "final" attribute
         */
        public void unsetFinal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FINAL$48);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JAVACLASS$50);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(JAVACLASS$50);
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
                return get_store().find_attribute_user(JAVACLASS$50) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JAVACLASS$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JAVACLASS$50);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(JAVACLASS$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(JAVACLASS$50);
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
                get_store().remove_attribute(JAVACLASS$50);
            }
        }
        
        /**
         * Gets the "table" attribute
         */
        public java.lang.String getTable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABLE$52);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "table" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetTable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(TABLE$52);
                return target;
            }
        }
        
        /**
         * True if has "table" attribute
         */
        public boolean isSetTable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TABLE$52) != null;
            }
        }
        
        /**
         * Sets the "table" attribute
         */
        public void setTable(java.lang.String table)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABLE$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TABLE$52);
                }
                target.setStringValue(table);
            }
        }
        
        /**
         * Sets (as xml) the "table" attribute
         */
        public void xsetTable(org.apache.xmlbeans.XmlNMTOKEN table)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(TABLE$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(TABLE$52);
                }
                target.set(table);
            }
        }
        
        /**
         * Unsets the "table" attribute
         */
        public void unsetTable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TABLE$52);
            }
        }
    }
}
