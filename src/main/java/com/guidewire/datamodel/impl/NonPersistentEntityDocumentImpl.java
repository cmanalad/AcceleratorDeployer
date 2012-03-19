/*
 * An XML document type.
 * Localname: nonPersistentEntity
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.NonPersistentEntityDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one nonPersistentEntity(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class NonPersistentEntityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.NonPersistentEntityDocument
{
    private static final long serialVersionUID = 1L;
    
    public NonPersistentEntityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NONPERSISTENTENTITY$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "nonPersistentEntity");
    
    
    /**
     * Gets the "nonPersistentEntity" element
     */
    public com.guidewire.datamodel.NonPersistentEntityDocument.NonPersistentEntity getNonPersistentEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.NonPersistentEntityDocument.NonPersistentEntity target = null;
            target = (com.guidewire.datamodel.NonPersistentEntityDocument.NonPersistentEntity)get_store().find_element_user(NONPERSISTENTENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "nonPersistentEntity" element
     */
    public void setNonPersistentEntity(com.guidewire.datamodel.NonPersistentEntityDocument.NonPersistentEntity nonPersistentEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.NonPersistentEntityDocument.NonPersistentEntity target = null;
            target = (com.guidewire.datamodel.NonPersistentEntityDocument.NonPersistentEntity)get_store().find_element_user(NONPERSISTENTENTITY$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.NonPersistentEntityDocument.NonPersistentEntity)get_store().add_element_user(NONPERSISTENTENTITY$0);
            }
            target.set(nonPersistentEntity);
        }
    }
    
    /**
     * Appends and returns a new empty "nonPersistentEntity" element
     */
    public com.guidewire.datamodel.NonPersistentEntityDocument.NonPersistentEntity addNewNonPersistentEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.NonPersistentEntityDocument.NonPersistentEntity target = null;
            target = (com.guidewire.datamodel.NonPersistentEntityDocument.NonPersistentEntity)get_store().add_element_user(NONPERSISTENTENTITY$0);
            return target;
        }
    }
    /**
     * An XML nonPersistentEntity(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class NonPersistentEntityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.NonPersistentEntityDocument.NonPersistentEntity
    {
        private static final long serialVersionUID = 1L;
        
        public NonPersistentEntityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ARRAY$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "array");
        private static final javax.xml.namespace.QName ASPECT$2 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "aspect");
        private static final javax.xml.namespace.QName COLUMN$4 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "column");
        private static final javax.xml.namespace.QName COMPONENTREF$6 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "componentref");
        private static final javax.xml.namespace.QName DEPENDENTFIELDS$8 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "dependentfields");
        private static final javax.xml.namespace.QName EDGEFOREIGNKEY$10 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "edgeForeignKey");
        private static final javax.xml.namespace.QName FOREIGNKEY$12 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "foreignkey");
        private static final javax.xml.namespace.QName FULLDESCRIPTION$14 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "fulldescription");
        private static final javax.xml.namespace.QName IMPLEMENTSENTITY$16 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "implementsEntity");
        private static final javax.xml.namespace.QName IMPLEMENTSINTERFACE$18 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "implementsInterface");
        private static final javax.xml.namespace.QName ONETOONE$20 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "onetoone");
        private static final javax.xml.namespace.QName TYPEKEY$22 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "typekey");
        private static final javax.xml.namespace.QName ABSTRACT$24 = 
            new javax.xml.namespace.QName("", "abstract");
        private static final javax.xml.namespace.QName BASE$26 = 
            new javax.xml.namespace.QName("", "base");
        private static final javax.xml.namespace.QName DESC$28 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName DISPLAYNAME$30 = 
            new javax.xml.namespace.QName("", "displayName");
        private static final javax.xml.namespace.QName ENTITY$32 = 
            new javax.xml.namespace.QName("", "entity");
        private static final javax.xml.namespace.QName EXPORTABLE$34 = 
            new javax.xml.namespace.QName("", "exportable");
        private static final javax.xml.namespace.QName EXTENDABLE$36 = 
            new javax.xml.namespace.QName("", "extendable");
        private static final javax.xml.namespace.QName FINAL$38 = 
            new javax.xml.namespace.QName("", "final");
        private static final javax.xml.namespace.QName JAVACLASS$40 = 
            new javax.xml.namespace.QName("", "javaClass");
        private static final javax.xml.namespace.QName PRIORITY$42 = 
            new javax.xml.namespace.QName("", "priority");
        private static final javax.xml.namespace.QName SUPERTYPEENTITY$44 = 
            new javax.xml.namespace.QName("", "supertypeEntity");
        
        
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
         * Gets array of all "aspect" elements
         */
        public com.guidewire.datamodel.AspectDocument.Aspect[] getAspectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ASPECT$2, targetList);
                com.guidewire.datamodel.AspectDocument.Aspect[] result = new com.guidewire.datamodel.AspectDocument.Aspect[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "aspect" element
         */
        public com.guidewire.datamodel.AspectDocument.Aspect getAspectArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.AspectDocument.Aspect target = null;
                target = (com.guidewire.datamodel.AspectDocument.Aspect)get_store().find_element_user(ASPECT$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "aspect" element
         */
        public int sizeOfAspectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ASPECT$2);
            }
        }
        
        /**
         * Sets array of all "aspect" element
         */
        public void setAspectArray(com.guidewire.datamodel.AspectDocument.Aspect[] aspectArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(aspectArray, ASPECT$2);
            }
        }
        
        /**
         * Sets ith "aspect" element
         */
        public void setAspectArray(int i, com.guidewire.datamodel.AspectDocument.Aspect aspect)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.AspectDocument.Aspect target = null;
                target = (com.guidewire.datamodel.AspectDocument.Aspect)get_store().find_element_user(ASPECT$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(aspect);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "aspect" element
         */
        public com.guidewire.datamodel.AspectDocument.Aspect insertNewAspect(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.AspectDocument.Aspect target = null;
                target = (com.guidewire.datamodel.AspectDocument.Aspect)get_store().insert_element_user(ASPECT$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "aspect" element
         */
        public com.guidewire.datamodel.AspectDocument.Aspect addNewAspect()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.AspectDocument.Aspect target = null;
                target = (com.guidewire.datamodel.AspectDocument.Aspect)get_store().add_element_user(ASPECT$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "aspect" element
         */
        public void removeAspect(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ASPECT$2, i);
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
                get_store().find_all_element_users(COLUMN$4, targetList);
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
                target = (com.guidewire.datamodel.ColumnDocument.Column)get_store().find_element_user(COLUMN$4, i);
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
                return get_store().count_elements(COLUMN$4);
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
                arraySetterHelper(columnArray, COLUMN$4);
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
                target = (com.guidewire.datamodel.ColumnDocument.Column)get_store().find_element_user(COLUMN$4, i);
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
                target = (com.guidewire.datamodel.ColumnDocument.Column)get_store().insert_element_user(COLUMN$4, i);
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
                target = (com.guidewire.datamodel.ColumnDocument.Column)get_store().add_element_user(COLUMN$4);
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
                get_store().remove_element(COLUMN$4, i);
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
                get_store().find_all_element_users(COMPONENTREF$6, targetList);
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
                target = (com.guidewire.datamodel.ComponentrefDocument.Componentref)get_store().find_element_user(COMPONENTREF$6, i);
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
                return get_store().count_elements(COMPONENTREF$6);
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
                arraySetterHelper(componentrefArray, COMPONENTREF$6);
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
                target = (com.guidewire.datamodel.ComponentrefDocument.Componentref)get_store().find_element_user(COMPONENTREF$6, i);
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
                target = (com.guidewire.datamodel.ComponentrefDocument.Componentref)get_store().insert_element_user(COMPONENTREF$6, i);
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
                target = (com.guidewire.datamodel.ComponentrefDocument.Componentref)get_store().add_element_user(COMPONENTREF$6);
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
                get_store().remove_element(COMPONENTREF$6, i);
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
                get_store().find_all_element_users(DEPENDENTFIELDS$8, targetList);
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
                target = (com.guidewire.datamodel.DependentfieldsDocument.Dependentfields)get_store().find_element_user(DEPENDENTFIELDS$8, i);
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
                return get_store().count_elements(DEPENDENTFIELDS$8);
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
                arraySetterHelper(dependentfieldsArray, DEPENDENTFIELDS$8);
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
                target = (com.guidewire.datamodel.DependentfieldsDocument.Dependentfields)get_store().find_element_user(DEPENDENTFIELDS$8, i);
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
                target = (com.guidewire.datamodel.DependentfieldsDocument.Dependentfields)get_store().insert_element_user(DEPENDENTFIELDS$8, i);
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
                target = (com.guidewire.datamodel.DependentfieldsDocument.Dependentfields)get_store().add_element_user(DEPENDENTFIELDS$8);
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
                get_store().remove_element(DEPENDENTFIELDS$8, i);
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
                get_store().find_all_element_users(EDGEFOREIGNKEY$10, targetList);
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
                target = (com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey)get_store().find_element_user(EDGEFOREIGNKEY$10, i);
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
                return get_store().count_elements(EDGEFOREIGNKEY$10);
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
                arraySetterHelper(edgeForeignKeyArray, EDGEFOREIGNKEY$10);
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
                target = (com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey)get_store().find_element_user(EDGEFOREIGNKEY$10, i);
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
                target = (com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey)get_store().insert_element_user(EDGEFOREIGNKEY$10, i);
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
                target = (com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey)get_store().add_element_user(EDGEFOREIGNKEY$10);
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
                get_store().remove_element(EDGEFOREIGNKEY$10, i);
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
                get_store().find_all_element_users(FOREIGNKEY$12, targetList);
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
                target = (com.guidewire.datamodel.ForeignkeyDocument.Foreignkey)get_store().find_element_user(FOREIGNKEY$12, i);
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
                return get_store().count_elements(FOREIGNKEY$12);
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
                arraySetterHelper(foreignkeyArray, FOREIGNKEY$12);
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
                target = (com.guidewire.datamodel.ForeignkeyDocument.Foreignkey)get_store().find_element_user(FOREIGNKEY$12, i);
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
                target = (com.guidewire.datamodel.ForeignkeyDocument.Foreignkey)get_store().insert_element_user(FOREIGNKEY$12, i);
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
                target = (com.guidewire.datamodel.ForeignkeyDocument.Foreignkey)get_store().add_element_user(FOREIGNKEY$12);
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
                get_store().remove_element(FOREIGNKEY$12, i);
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
                get_store().find_all_element_users(FULLDESCRIPTION$14, targetList);
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
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().find_element_user(FULLDESCRIPTION$14, i);
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
                return get_store().count_elements(FULLDESCRIPTION$14);
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
                arraySetterHelper(fulldescriptionArray, FULLDESCRIPTION$14);
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
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().find_element_user(FULLDESCRIPTION$14, i);
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
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().insert_element_user(FULLDESCRIPTION$14, i);
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
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().add_element_user(FULLDESCRIPTION$14);
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
                get_store().remove_element(FULLDESCRIPTION$14, i);
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
                get_store().find_all_element_users(IMPLEMENTSENTITY$16, targetList);
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
                target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().find_element_user(IMPLEMENTSENTITY$16, i);
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
                return get_store().count_elements(IMPLEMENTSENTITY$16);
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
                arraySetterHelper(implementsEntityArray, IMPLEMENTSENTITY$16);
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
                target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().find_element_user(IMPLEMENTSENTITY$16, i);
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
                target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().insert_element_user(IMPLEMENTSENTITY$16, i);
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
                target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().add_element_user(IMPLEMENTSENTITY$16);
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
                get_store().remove_element(IMPLEMENTSENTITY$16, i);
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
                get_store().find_all_element_users(IMPLEMENTSINTERFACE$18, targetList);
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
                target = (com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface)get_store().find_element_user(IMPLEMENTSINTERFACE$18, i);
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
                return get_store().count_elements(IMPLEMENTSINTERFACE$18);
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
                arraySetterHelper(implementsInterfaceArray, IMPLEMENTSINTERFACE$18);
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
                target = (com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface)get_store().find_element_user(IMPLEMENTSINTERFACE$18, i);
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
                target = (com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface)get_store().insert_element_user(IMPLEMENTSINTERFACE$18, i);
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
                target = (com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface)get_store().add_element_user(IMPLEMENTSINTERFACE$18);
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
                get_store().remove_element(IMPLEMENTSINTERFACE$18, i);
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
                get_store().find_all_element_users(ONETOONE$20, targetList);
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
                target = (com.guidewire.datamodel.OnetooneDocument.Onetoone)get_store().find_element_user(ONETOONE$20, i);
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
                return get_store().count_elements(ONETOONE$20);
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
                arraySetterHelper(onetooneArray, ONETOONE$20);
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
                target = (com.guidewire.datamodel.OnetooneDocument.Onetoone)get_store().find_element_user(ONETOONE$20, i);
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
                target = (com.guidewire.datamodel.OnetooneDocument.Onetoone)get_store().insert_element_user(ONETOONE$20, i);
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
                target = (com.guidewire.datamodel.OnetooneDocument.Onetoone)get_store().add_element_user(ONETOONE$20);
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
                get_store().remove_element(ONETOONE$20, i);
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
                get_store().find_all_element_users(TYPEKEY$22, targetList);
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
                target = (com.guidewire.datamodel.TypekeyDocument.Typekey)get_store().find_element_user(TYPEKEY$22, i);
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
                return get_store().count_elements(TYPEKEY$22);
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
                arraySetterHelper(typekeyArray, TYPEKEY$22);
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
                target = (com.guidewire.datamodel.TypekeyDocument.Typekey)get_store().find_element_user(TYPEKEY$22, i);
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
                target = (com.guidewire.datamodel.TypekeyDocument.Typekey)get_store().insert_element_user(TYPEKEY$22, i);
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
                target = (com.guidewire.datamodel.TypekeyDocument.Typekey)get_store().add_element_user(TYPEKEY$22);
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
                get_store().remove_element(TYPEKEY$22, i);
            }
        }
        
        /**
         * Gets the "abstract" attribute
         */
        public boolean getAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABSTRACT$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ABSTRACT$24);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "abstract" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABSTRACT$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ABSTRACT$24);
                }
                return target;
            }
        }
        
        /**
         * True if has "abstract" attribute
         */
        public boolean isSetAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ABSTRACT$24) != null;
            }
        }
        
        /**
         * Sets the "abstract" attribute
         */
        public void setAbstract(boolean xabstract)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABSTRACT$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ABSTRACT$24);
                }
                target.setBooleanValue(xabstract);
            }
        }
        
        /**
         * Sets (as xml) the "abstract" attribute
         */
        public void xsetAbstract(org.apache.xmlbeans.XmlBoolean xabstract)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABSTRACT$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ABSTRACT$24);
                }
                target.set(xabstract);
            }
        }
        
        /**
         * Unsets the "abstract" attribute
         */
        public void unsetAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ABSTRACT$24);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BASE$26);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BASE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(BASE$26);
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
                return get_store().find_attribute_user(BASE$26) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BASE$26);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BASE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(BASE$26);
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
                get_store().remove_attribute(BASE$26);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$28);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$28);
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
                return get_store().find_attribute_user(DESC$28) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$28);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$28);
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
                get_store().remove_attribute(DESC$28);
            }
        }
        
        /**
         * Gets the "displayName" attribute
         */
        public java.lang.String getDisplayName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYNAME$30);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "displayName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDisplayName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISPLAYNAME$30);
                return target;
            }
        }
        
        /**
         * True if has "displayName" attribute
         */
        public boolean isSetDisplayName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DISPLAYNAME$30) != null;
            }
        }
        
        /**
         * Sets the "displayName" attribute
         */
        public void setDisplayName(java.lang.String displayName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYNAME$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISPLAYNAME$30);
                }
                target.setStringValue(displayName);
            }
        }
        
        /**
         * Sets (as xml) the "displayName" attribute
         */
        public void xsetDisplayName(org.apache.xmlbeans.XmlString displayName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISPLAYNAME$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DISPLAYNAME$30);
                }
                target.set(displayName);
            }
        }
        
        /**
         * Unsets the "displayName" attribute
         */
        public void unsetDisplayName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DISPLAYNAME$30);
            }
        }
        
        /**
         * Gets the "entity" attribute
         */
        public java.lang.String getEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITY$32);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "entity" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(ENTITY$32);
                return target;
            }
        }
        
        /**
         * Sets the "entity" attribute
         */
        public void setEntity(java.lang.String entity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITY$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTITY$32);
                }
                target.setStringValue(entity);
            }
        }
        
        /**
         * Sets (as xml) the "entity" attribute
         */
        public void xsetEntity(org.apache.xmlbeans.XmlNMTOKEN entity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(ENTITY$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(ENTITY$32);
                }
                target.set(entity);
            }
        }
        
        /**
         * Gets the "exportable" attribute
         */
        public boolean getExportable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPORTABLE$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EXPORTABLE$34);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "exportable" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetExportable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXPORTABLE$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EXPORTABLE$34);
                }
                return target;
            }
        }
        
        /**
         * True if has "exportable" attribute
         */
        public boolean isSetExportable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EXPORTABLE$34) != null;
            }
        }
        
        /**
         * Sets the "exportable" attribute
         */
        public void setExportable(boolean exportable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPORTABLE$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXPORTABLE$34);
                }
                target.setBooleanValue(exportable);
            }
        }
        
        /**
         * Sets (as xml) the "exportable" attribute
         */
        public void xsetExportable(org.apache.xmlbeans.XmlBoolean exportable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXPORTABLE$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EXPORTABLE$34);
                }
                target.set(exportable);
            }
        }
        
        /**
         * Unsets the "exportable" attribute
         */
        public void unsetExportable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EXPORTABLE$34);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENDABLE$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EXTENDABLE$36);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXTENDABLE$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EXTENDABLE$36);
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
                return get_store().find_attribute_user(EXTENDABLE$36) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENDABLE$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXTENDABLE$36);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXTENDABLE$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EXTENDABLE$36);
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
                get_store().remove_attribute(EXTENDABLE$36);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINAL$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FINAL$38);
                }
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FINAL$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FINAL$38);
                }
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
                return get_store().find_attribute_user(FINAL$38) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINAL$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FINAL$38);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FINAL$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FINAL$38);
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
                get_store().remove_attribute(FINAL$38);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JAVACLASS$40);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(JAVACLASS$40);
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
                return get_store().find_attribute_user(JAVACLASS$40) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JAVACLASS$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JAVACLASS$40);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(JAVACLASS$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(JAVACLASS$40);
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
                get_store().remove_attribute(JAVACLASS$40);
            }
        }
        
        /**
         * Gets the "priority" attribute
         */
        public java.math.BigInteger getPriority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIORITY$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PRIORITY$42);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "priority" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetPriority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PRIORITY$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_default_attribute_value(PRIORITY$42);
                }
                return target;
            }
        }
        
        /**
         * True if has "priority" attribute
         */
        public boolean isSetPriority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PRIORITY$42) != null;
            }
        }
        
        /**
         * Sets the "priority" attribute
         */
        public void setPriority(java.math.BigInteger priority)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIORITY$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRIORITY$42);
                }
                target.setBigIntegerValue(priority);
            }
        }
        
        /**
         * Sets (as xml) the "priority" attribute
         */
        public void xsetPriority(org.apache.xmlbeans.XmlInteger priority)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PRIORITY$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(PRIORITY$42);
                }
                target.set(priority);
            }
        }
        
        /**
         * Unsets the "priority" attribute
         */
        public void unsetPriority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PRIORITY$42);
            }
        }
        
        /**
         * Gets the "supertypeEntity" attribute
         */
        public java.lang.String getSupertypeEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPERTYPEENTITY$44);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "supertypeEntity" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetSupertypeEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(SUPERTYPEENTITY$44);
                return target;
            }
        }
        
        /**
         * True if has "supertypeEntity" attribute
         */
        public boolean isSetSupertypeEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SUPERTYPEENTITY$44) != null;
            }
        }
        
        /**
         * Sets the "supertypeEntity" attribute
         */
        public void setSupertypeEntity(java.lang.String supertypeEntity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPERTYPEENTITY$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUPERTYPEENTITY$44);
                }
                target.setStringValue(supertypeEntity);
            }
        }
        
        /**
         * Sets (as xml) the "supertypeEntity" attribute
         */
        public void xsetSupertypeEntity(org.apache.xmlbeans.XmlNMTOKEN supertypeEntity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(SUPERTYPEENTITY$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(SUPERTYPEENTITY$44);
                }
                target.set(supertypeEntity);
            }
        }
        
        /**
         * Unsets the "supertypeEntity" attribute
         */
        public void unsetSupertypeEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SUPERTYPEENTITY$44);
            }
        }
    }
}
