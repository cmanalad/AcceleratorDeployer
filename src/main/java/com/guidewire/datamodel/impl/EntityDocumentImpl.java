/*
 * An XML document type.
 * Localname: entity
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.EntityDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one entity(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class EntityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.EntityDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITY$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "entity");
    
    
    /**
     * Gets the "entity" element
     */
    public com.guidewire.datamodel.EntityDocument.Entity getEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.EntityDocument.Entity target = null;
            target = (com.guidewire.datamodel.EntityDocument.Entity)get_store().find_element_user(ENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "entity" element
     */
    public void setEntity(com.guidewire.datamodel.EntityDocument.Entity entity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.EntityDocument.Entity target = null;
            target = (com.guidewire.datamodel.EntityDocument.Entity)get_store().find_element_user(ENTITY$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.EntityDocument.Entity)get_store().add_element_user(ENTITY$0);
            }
            target.set(entity);
        }
    }
    
    /**
     * Appends and returns a new empty "entity" element
     */
    public com.guidewire.datamodel.EntityDocument.Entity addNewEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.EntityDocument.Entity target = null;
            target = (com.guidewire.datamodel.EntityDocument.Entity)get_store().add_element_user(ENTITY$0);
            return target;
        }
    }
    /**
     * An XML entity(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class EntityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.EntityDocument.Entity
    {
        private static final long serialVersionUID = 1L;
        
        public EntityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ARRAY$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "array");
        private static final javax.xml.namespace.QName ASPECT$2 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "aspect");
        private static final javax.xml.namespace.QName CHECKCONSTRAINT$4 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "checkconstraint");
        private static final javax.xml.namespace.QName COLUMN$6 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "column");
        private static final javax.xml.namespace.QName COMPONENTREF$8 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "componentref");
        private static final javax.xml.namespace.QName CUSTOMCONSISTENCYCHECK$10 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "customconsistencycheck");
        private static final javax.xml.namespace.QName DATETIMEORDERING$12 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "datetimeordering");
        private static final javax.xml.namespace.QName DBCHECKBUILDER$14 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "dbcheckbuilder");
        private static final javax.xml.namespace.QName DEPENDENTFIELDS$16 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "dependentfields");
        private static final javax.xml.namespace.QName EDGEFOREIGNKEY$18 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "edgeForeignKey");
        private static final javax.xml.namespace.QName EVENTS$20 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "events");
        private static final javax.xml.namespace.QName FOREIGNKEY$22 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "foreignkey");
        private static final javax.xml.namespace.QName FULLDESCRIPTION$24 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "fulldescription");
        private static final javax.xml.namespace.QName IMPLEMENTSENTITY$26 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "implementsEntity");
        private static final javax.xml.namespace.QName IMPLEMENTSINTERFACE$28 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "implementsInterface");
        private static final javax.xml.namespace.QName INDEX$30 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "index");
        private static final javax.xml.namespace.QName JOINTABLECONSISTENCYCHECK$32 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "jointableconsistencycheck");
        private static final javax.xml.namespace.QName ONETOONE$34 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "onetoone");
        private static final javax.xml.namespace.QName REMOVEINDEX$36 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "remove-index");
        private static final javax.xml.namespace.QName TABLEAUGMENTER$38 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "tableAugmenter");
        private static final javax.xml.namespace.QName TYPEKEY$40 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "typekey");
        private static final javax.xml.namespace.QName VALIDATETYPEKEYINSET$42 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "validatetypekeyinset");
        private static final javax.xml.namespace.QName VALIDATETYPEKEYNOTINSET$44 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "validatetypekeynotinset");
        private static final javax.xml.namespace.QName ABSTRACT$46 = 
            new javax.xml.namespace.QName("", "abstract");
        private static final javax.xml.namespace.QName ADMIN$48 = 
            new javax.xml.namespace.QName("", "admin");
        private static final javax.xml.namespace.QName AUTOSPLIT$50 = 
            new javax.xml.namespace.QName("", "autoSplit");
        private static final javax.xml.namespace.QName BASE$52 = 
            new javax.xml.namespace.QName("", "base");
        private static final javax.xml.namespace.QName CACHEABLE$54 = 
            new javax.xml.namespace.QName("", "cacheable");
        private static final javax.xml.namespace.QName CONSISTENTCHILDREN$56 = 
            new javax.xml.namespace.QName("", "consistentchildren");
        private static final javax.xml.namespace.QName DESC$58 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName DISPLAYNAME$60 = 
            new javax.xml.namespace.QName("", "displayName");
        private static final javax.xml.namespace.QName EDGETABLE$62 = 
            new javax.xml.namespace.QName("", "edgeTable");
        private static final javax.xml.namespace.QName EFFDATEDBRANCHTYPE$64 = 
            new javax.xml.namespace.QName("", "effDatedBranchType");
        private static final javax.xml.namespace.QName EFFDATEDBRANCHESFIELD$66 = 
            new javax.xml.namespace.QName("", "effDatedBranchesField");
        private static final javax.xml.namespace.QName EFFDATEDCONTAINERFIELD$68 = 
            new javax.xml.namespace.QName("", "effDatedContainerField");
        private static final javax.xml.namespace.QName EFFDATEDREGISTRYTABLENAME$70 = 
            new javax.xml.namespace.QName("", "effDatedRegistryTableName");
        private static final javax.xml.namespace.QName ENTITY$72 = 
            new javax.xml.namespace.QName("", "entity");
        private static final javax.xml.namespace.QName EXPORTABLE$74 = 
            new javax.xml.namespace.QName("", "exportable");
        private static final javax.xml.namespace.QName EXTENDABLE$76 = 
            new javax.xml.namespace.QName("", "extendable");
        private static final javax.xml.namespace.QName FINAL$78 = 
            new javax.xml.namespace.QName("", "final");
        private static final javax.xml.namespace.QName GENERATEINTERNALLYIFABSENT$80 = 
            new javax.xml.namespace.QName("", "generateinternallyifabsent");
        private static final javax.xml.namespace.QName IGNOREFOREVENTS$82 = 
            new javax.xml.namespace.QName("", "ignoreForEvents");
        private static final javax.xml.namespace.QName INSTRUMENTATIONTABLE$84 = 
            new javax.xml.namespace.QName("", "instrumentationtable");
        private static final javax.xml.namespace.QName JAVACLASS$86 = 
            new javax.xml.namespace.QName("", "javaClass");
        private static final javax.xml.namespace.QName LOADABLE$88 = 
            new javax.xml.namespace.QName("", "loadable");
        private static final javax.xml.namespace.QName LOCKABLE$90 = 
            new javax.xml.namespace.QName("", "lockable");
        private static final javax.xml.namespace.QName OVERWRITTENINSTAGINGTABLE$92 = 
            new javax.xml.namespace.QName("", "overwrittenInStagingTable");
        private static final javax.xml.namespace.QName PLATFORM$94 = 
            new javax.xml.namespace.QName("", "platform");
        private static final javax.xml.namespace.QName PRIORITY$96 = 
            new javax.xml.namespace.QName("", "priority");
        private static final javax.xml.namespace.QName READONLY$98 = 
            new javax.xml.namespace.QName("", "readOnly");
        private static final javax.xml.namespace.QName SETTERSCRIPTABILITY$100 = 
            new javax.xml.namespace.QName("", "setterScriptability");
        private static final javax.xml.namespace.QName SIZE$102 = 
            new javax.xml.namespace.QName("", "size");
        private static final javax.xml.namespace.QName SUPERTYPEENTITY$104 = 
            new javax.xml.namespace.QName("", "supertypeEntity");
        private static final javax.xml.namespace.QName TABLE$106 = 
            new javax.xml.namespace.QName("", "table");
        private static final javax.xml.namespace.QName TEMPORARY$108 = 
            new javax.xml.namespace.QName("", "temporary");
        private static final javax.xml.namespace.QName TYPE$110 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName VALIDATEONCOMMIT$112 = 
            new javax.xml.namespace.QName("", "validateOnCommit");
        
        
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
         * Gets array of all "componentref" elements
         */
        public com.guidewire.datamodel.ComponentrefDocument.Componentref[] getComponentrefArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COMPONENTREF$8, targetList);
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
                target = (com.guidewire.datamodel.ComponentrefDocument.Componentref)get_store().find_element_user(COMPONENTREF$8, i);
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
                return get_store().count_elements(COMPONENTREF$8);
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
                arraySetterHelper(componentrefArray, COMPONENTREF$8);
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
                target = (com.guidewire.datamodel.ComponentrefDocument.Componentref)get_store().find_element_user(COMPONENTREF$8, i);
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
                target = (com.guidewire.datamodel.ComponentrefDocument.Componentref)get_store().insert_element_user(COMPONENTREF$8, i);
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
                target = (com.guidewire.datamodel.ComponentrefDocument.Componentref)get_store().add_element_user(COMPONENTREF$8);
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
                get_store().remove_element(COMPONENTREF$8, i);
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
                get_store().find_all_element_users(CUSTOMCONSISTENCYCHECK$10, targetList);
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
                target = (com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck)get_store().find_element_user(CUSTOMCONSISTENCYCHECK$10, i);
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
                return get_store().count_elements(CUSTOMCONSISTENCYCHECK$10);
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
                arraySetterHelper(customconsistencycheckArray, CUSTOMCONSISTENCYCHECK$10);
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
                target = (com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck)get_store().find_element_user(CUSTOMCONSISTENCYCHECK$10, i);
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
                target = (com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck)get_store().insert_element_user(CUSTOMCONSISTENCYCHECK$10, i);
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
                target = (com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck)get_store().add_element_user(CUSTOMCONSISTENCYCHECK$10);
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
                get_store().remove_element(CUSTOMCONSISTENCYCHECK$10, i);
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
                get_store().find_all_element_users(DATETIMEORDERING$12, targetList);
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
                target = (com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering)get_store().find_element_user(DATETIMEORDERING$12, i);
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
                return get_store().count_elements(DATETIMEORDERING$12);
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
                arraySetterHelper(datetimeorderingArray, DATETIMEORDERING$12);
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
                target = (com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering)get_store().find_element_user(DATETIMEORDERING$12, i);
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
                target = (com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering)get_store().insert_element_user(DATETIMEORDERING$12, i);
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
                target = (com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering)get_store().add_element_user(DATETIMEORDERING$12);
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
                get_store().remove_element(DATETIMEORDERING$12, i);
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
         * Gets array of all "edgeForeignKey" elements
         */
        public com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey[] getEdgeForeignKeyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EDGEFOREIGNKEY$18, targetList);
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
                target = (com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey)get_store().find_element_user(EDGEFOREIGNKEY$18, i);
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
                return get_store().count_elements(EDGEFOREIGNKEY$18);
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
                arraySetterHelper(edgeForeignKeyArray, EDGEFOREIGNKEY$18);
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
                target = (com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey)get_store().find_element_user(EDGEFOREIGNKEY$18, i);
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
                target = (com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey)get_store().insert_element_user(EDGEFOREIGNKEY$18, i);
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
                target = (com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey)get_store().add_element_user(EDGEFOREIGNKEY$18);
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
                get_store().remove_element(EDGEFOREIGNKEY$18, i);
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
                get_store().find_all_element_users(EVENTS$20, targetList);
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
                target = (com.guidewire.datamodel.EventsDocument.Events)get_store().find_element_user(EVENTS$20, i);
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
                return get_store().count_elements(EVENTS$20);
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
                arraySetterHelper(eventsArray, EVENTS$20);
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
                target = (com.guidewire.datamodel.EventsDocument.Events)get_store().find_element_user(EVENTS$20, i);
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
                target = (com.guidewire.datamodel.EventsDocument.Events)get_store().insert_element_user(EVENTS$20, i);
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
                target = (com.guidewire.datamodel.EventsDocument.Events)get_store().add_element_user(EVENTS$20);
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
                get_store().remove_element(EVENTS$20, i);
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
                get_store().find_all_element_users(FOREIGNKEY$22, targetList);
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
                target = (com.guidewire.datamodel.ForeignkeyDocument.Foreignkey)get_store().find_element_user(FOREIGNKEY$22, i);
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
                return get_store().count_elements(FOREIGNKEY$22);
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
                arraySetterHelper(foreignkeyArray, FOREIGNKEY$22);
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
                target = (com.guidewire.datamodel.ForeignkeyDocument.Foreignkey)get_store().find_element_user(FOREIGNKEY$22, i);
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
                target = (com.guidewire.datamodel.ForeignkeyDocument.Foreignkey)get_store().insert_element_user(FOREIGNKEY$22, i);
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
                target = (com.guidewire.datamodel.ForeignkeyDocument.Foreignkey)get_store().add_element_user(FOREIGNKEY$22);
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
                get_store().remove_element(FOREIGNKEY$22, i);
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
                get_store().find_all_element_users(FULLDESCRIPTION$24, targetList);
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
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().find_element_user(FULLDESCRIPTION$24, i);
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
                return get_store().count_elements(FULLDESCRIPTION$24);
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
                arraySetterHelper(fulldescriptionArray, FULLDESCRIPTION$24);
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
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().find_element_user(FULLDESCRIPTION$24, i);
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
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().insert_element_user(FULLDESCRIPTION$24, i);
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
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().add_element_user(FULLDESCRIPTION$24);
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
                get_store().remove_element(FULLDESCRIPTION$24, i);
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
                get_store().find_all_element_users(IMPLEMENTSENTITY$26, targetList);
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
                target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().find_element_user(IMPLEMENTSENTITY$26, i);
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
                return get_store().count_elements(IMPLEMENTSENTITY$26);
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
                arraySetterHelper(implementsEntityArray, IMPLEMENTSENTITY$26);
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
                target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().find_element_user(IMPLEMENTSENTITY$26, i);
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
                target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().insert_element_user(IMPLEMENTSENTITY$26, i);
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
                target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().add_element_user(IMPLEMENTSENTITY$26);
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
                get_store().remove_element(IMPLEMENTSENTITY$26, i);
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
                get_store().find_all_element_users(IMPLEMENTSINTERFACE$28, targetList);
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
                target = (com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface)get_store().find_element_user(IMPLEMENTSINTERFACE$28, i);
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
                return get_store().count_elements(IMPLEMENTSINTERFACE$28);
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
                arraySetterHelper(implementsInterfaceArray, IMPLEMENTSINTERFACE$28);
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
                target = (com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface)get_store().find_element_user(IMPLEMENTSINTERFACE$28, i);
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
                target = (com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface)get_store().insert_element_user(IMPLEMENTSINTERFACE$28, i);
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
                target = (com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface)get_store().add_element_user(IMPLEMENTSINTERFACE$28);
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
                get_store().remove_element(IMPLEMENTSINTERFACE$28, i);
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
                get_store().find_all_element_users(INDEX$30, targetList);
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
                target = (com.guidewire.datamodel.IndexDocument.Index)get_store().find_element_user(INDEX$30, i);
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
                return get_store().count_elements(INDEX$30);
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
                arraySetterHelper(indexArray, INDEX$30);
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
                target = (com.guidewire.datamodel.IndexDocument.Index)get_store().find_element_user(INDEX$30, i);
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
                target = (com.guidewire.datamodel.IndexDocument.Index)get_store().insert_element_user(INDEX$30, i);
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
                target = (com.guidewire.datamodel.IndexDocument.Index)get_store().add_element_user(INDEX$30);
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
                get_store().remove_element(INDEX$30, i);
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
                get_store().find_all_element_users(JOINTABLECONSISTENCYCHECK$32, targetList);
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
                target = (com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck)get_store().find_element_user(JOINTABLECONSISTENCYCHECK$32, i);
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
                return get_store().count_elements(JOINTABLECONSISTENCYCHECK$32);
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
                arraySetterHelper(jointableconsistencycheckArray, JOINTABLECONSISTENCYCHECK$32);
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
                target = (com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck)get_store().find_element_user(JOINTABLECONSISTENCYCHECK$32, i);
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
                target = (com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck)get_store().insert_element_user(JOINTABLECONSISTENCYCHECK$32, i);
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
                target = (com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck)get_store().add_element_user(JOINTABLECONSISTENCYCHECK$32);
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
                get_store().remove_element(JOINTABLECONSISTENCYCHECK$32, i);
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
                get_store().find_all_element_users(ONETOONE$34, targetList);
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
                target = (com.guidewire.datamodel.OnetooneDocument.Onetoone)get_store().find_element_user(ONETOONE$34, i);
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
                return get_store().count_elements(ONETOONE$34);
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
                arraySetterHelper(onetooneArray, ONETOONE$34);
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
                target = (com.guidewire.datamodel.OnetooneDocument.Onetoone)get_store().find_element_user(ONETOONE$34, i);
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
                target = (com.guidewire.datamodel.OnetooneDocument.Onetoone)get_store().insert_element_user(ONETOONE$34, i);
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
                target = (com.guidewire.datamodel.OnetooneDocument.Onetoone)get_store().add_element_user(ONETOONE$34);
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
                get_store().remove_element(ONETOONE$34, i);
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
                get_store().find_all_element_users(REMOVEINDEX$36, targetList);
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
                target = (com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex)get_store().find_element_user(REMOVEINDEX$36, i);
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
                return get_store().count_elements(REMOVEINDEX$36);
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
                arraySetterHelper(removeIndexArray, REMOVEINDEX$36);
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
                target = (com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex)get_store().find_element_user(REMOVEINDEX$36, i);
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
                target = (com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex)get_store().insert_element_user(REMOVEINDEX$36, i);
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
                target = (com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex)get_store().add_element_user(REMOVEINDEX$36);
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
                get_store().remove_element(REMOVEINDEX$36, i);
            }
        }
        
        /**
         * Gets array of all "tableAugmenter" elements
         */
        public com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter[] getTableAugmenterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TABLEAUGMENTER$38, targetList);
                com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter[] result = new com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "tableAugmenter" element
         */
        public com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter getTableAugmenterArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter target = null;
                target = (com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter)get_store().find_element_user(TABLEAUGMENTER$38, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "tableAugmenter" element
         */
        public int sizeOfTableAugmenterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TABLEAUGMENTER$38);
            }
        }
        
        /**
         * Sets array of all "tableAugmenter" element
         */
        public void setTableAugmenterArray(com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter[] tableAugmenterArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(tableAugmenterArray, TABLEAUGMENTER$38);
            }
        }
        
        /**
         * Sets ith "tableAugmenter" element
         */
        public void setTableAugmenterArray(int i, com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter tableAugmenter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter target = null;
                target = (com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter)get_store().find_element_user(TABLEAUGMENTER$38, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(tableAugmenter);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "tableAugmenter" element
         */
        public com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter insertNewTableAugmenter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter target = null;
                target = (com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter)get_store().insert_element_user(TABLEAUGMENTER$38, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "tableAugmenter" element
         */
        public com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter addNewTableAugmenter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter target = null;
                target = (com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter)get_store().add_element_user(TABLEAUGMENTER$38);
                return target;
            }
        }
        
        /**
         * Removes the ith "tableAugmenter" element
         */
        public void removeTableAugmenter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TABLEAUGMENTER$38, i);
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
                get_store().find_all_element_users(TYPEKEY$40, targetList);
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
                target = (com.guidewire.datamodel.TypekeyDocument.Typekey)get_store().find_element_user(TYPEKEY$40, i);
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
                return get_store().count_elements(TYPEKEY$40);
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
                arraySetterHelper(typekeyArray, TYPEKEY$40);
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
                target = (com.guidewire.datamodel.TypekeyDocument.Typekey)get_store().find_element_user(TYPEKEY$40, i);
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
                target = (com.guidewire.datamodel.TypekeyDocument.Typekey)get_store().insert_element_user(TYPEKEY$40, i);
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
                target = (com.guidewire.datamodel.TypekeyDocument.Typekey)get_store().add_element_user(TYPEKEY$40);
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
                get_store().remove_element(TYPEKEY$40, i);
            }
        }
        
        /**
         * Gets array of all "validatetypekeyinset" elements
         */
        public com.guidewire.datamodel.ValidatetypekeyinsetDocument.Validatetypekeyinset[] getValidatetypekeyinsetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VALIDATETYPEKEYINSET$42, targetList);
                com.guidewire.datamodel.ValidatetypekeyinsetDocument.Validatetypekeyinset[] result = new com.guidewire.datamodel.ValidatetypekeyinsetDocument.Validatetypekeyinset[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "validatetypekeyinset" element
         */
        public com.guidewire.datamodel.ValidatetypekeyinsetDocument.Validatetypekeyinset getValidatetypekeyinsetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ValidatetypekeyinsetDocument.Validatetypekeyinset target = null;
                target = (com.guidewire.datamodel.ValidatetypekeyinsetDocument.Validatetypekeyinset)get_store().find_element_user(VALIDATETYPEKEYINSET$42, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "validatetypekeyinset" element
         */
        public int sizeOfValidatetypekeyinsetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VALIDATETYPEKEYINSET$42);
            }
        }
        
        /**
         * Sets array of all "validatetypekeyinset" element
         */
        public void setValidatetypekeyinsetArray(com.guidewire.datamodel.ValidatetypekeyinsetDocument.Validatetypekeyinset[] validatetypekeyinsetArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(validatetypekeyinsetArray, VALIDATETYPEKEYINSET$42);
            }
        }
        
        /**
         * Sets ith "validatetypekeyinset" element
         */
        public void setValidatetypekeyinsetArray(int i, com.guidewire.datamodel.ValidatetypekeyinsetDocument.Validatetypekeyinset validatetypekeyinset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ValidatetypekeyinsetDocument.Validatetypekeyinset target = null;
                target = (com.guidewire.datamodel.ValidatetypekeyinsetDocument.Validatetypekeyinset)get_store().find_element_user(VALIDATETYPEKEYINSET$42, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(validatetypekeyinset);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "validatetypekeyinset" element
         */
        public com.guidewire.datamodel.ValidatetypekeyinsetDocument.Validatetypekeyinset insertNewValidatetypekeyinset(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ValidatetypekeyinsetDocument.Validatetypekeyinset target = null;
                target = (com.guidewire.datamodel.ValidatetypekeyinsetDocument.Validatetypekeyinset)get_store().insert_element_user(VALIDATETYPEKEYINSET$42, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "validatetypekeyinset" element
         */
        public com.guidewire.datamodel.ValidatetypekeyinsetDocument.Validatetypekeyinset addNewValidatetypekeyinset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ValidatetypekeyinsetDocument.Validatetypekeyinset target = null;
                target = (com.guidewire.datamodel.ValidatetypekeyinsetDocument.Validatetypekeyinset)get_store().add_element_user(VALIDATETYPEKEYINSET$42);
                return target;
            }
        }
        
        /**
         * Removes the ith "validatetypekeyinset" element
         */
        public void removeValidatetypekeyinset(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VALIDATETYPEKEYINSET$42, i);
            }
        }
        
        /**
         * Gets array of all "validatetypekeynotinset" elements
         */
        public com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset[] getValidatetypekeynotinsetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VALIDATETYPEKEYNOTINSET$44, targetList);
                com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset[] result = new com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "validatetypekeynotinset" element
         */
        public com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset getValidatetypekeynotinsetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset target = null;
                target = (com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset)get_store().find_element_user(VALIDATETYPEKEYNOTINSET$44, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "validatetypekeynotinset" element
         */
        public int sizeOfValidatetypekeynotinsetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VALIDATETYPEKEYNOTINSET$44);
            }
        }
        
        /**
         * Sets array of all "validatetypekeynotinset" element
         */
        public void setValidatetypekeynotinsetArray(com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset[] validatetypekeynotinsetArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(validatetypekeynotinsetArray, VALIDATETYPEKEYNOTINSET$44);
            }
        }
        
        /**
         * Sets ith "validatetypekeynotinset" element
         */
        public void setValidatetypekeynotinsetArray(int i, com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset validatetypekeynotinset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset target = null;
                target = (com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset)get_store().find_element_user(VALIDATETYPEKEYNOTINSET$44, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(validatetypekeynotinset);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "validatetypekeynotinset" element
         */
        public com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset insertNewValidatetypekeynotinset(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset target = null;
                target = (com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset)get_store().insert_element_user(VALIDATETYPEKEYNOTINSET$44, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "validatetypekeynotinset" element
         */
        public com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset addNewValidatetypekeynotinset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset target = null;
                target = (com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset)get_store().add_element_user(VALIDATETYPEKEYNOTINSET$44);
                return target;
            }
        }
        
        /**
         * Removes the ith "validatetypekeynotinset" element
         */
        public void removeValidatetypekeynotinset(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VALIDATETYPEKEYNOTINSET$44, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABSTRACT$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ABSTRACT$46);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABSTRACT$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ABSTRACT$46);
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
                return get_store().find_attribute_user(ABSTRACT$46) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABSTRACT$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ABSTRACT$46);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABSTRACT$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ABSTRACT$46);
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
                get_store().remove_attribute(ABSTRACT$46);
            }
        }
        
        /**
         * Gets the "admin" attribute
         */
        public boolean getAdmin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADMIN$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ADMIN$48);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "admin" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetAdmin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ADMIN$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ADMIN$48);
                }
                return target;
            }
        }
        
        /**
         * True if has "admin" attribute
         */
        public boolean isSetAdmin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ADMIN$48) != null;
            }
        }
        
        /**
         * Sets the "admin" attribute
         */
        public void setAdmin(boolean admin)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADMIN$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADMIN$48);
                }
                target.setBooleanValue(admin);
            }
        }
        
        /**
         * Sets (as xml) the "admin" attribute
         */
        public void xsetAdmin(org.apache.xmlbeans.XmlBoolean admin)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ADMIN$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ADMIN$48);
                }
                target.set(admin);
            }
        }
        
        /**
         * Unsets the "admin" attribute
         */
        public void unsetAdmin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ADMIN$48);
            }
        }
        
        /**
         * Gets the "autoSplit" attribute
         */
        public boolean getAutoSplit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOSPLIT$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTOSPLIT$50);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "autoSplit" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetAutoSplit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOSPLIT$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(AUTOSPLIT$50);
                }
                return target;
            }
        }
        
        /**
         * True if has "autoSplit" attribute
         */
        public boolean isSetAutoSplit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AUTOSPLIT$50) != null;
            }
        }
        
        /**
         * Sets the "autoSplit" attribute
         */
        public void setAutoSplit(boolean autoSplit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOSPLIT$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOSPLIT$50);
                }
                target.setBooleanValue(autoSplit);
            }
        }
        
        /**
         * Sets (as xml) the "autoSplit" attribute
         */
        public void xsetAutoSplit(org.apache.xmlbeans.XmlBoolean autoSplit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOSPLIT$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AUTOSPLIT$50);
                }
                target.set(autoSplit);
            }
        }
        
        /**
         * Unsets the "autoSplit" attribute
         */
        public void unsetAutoSplit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AUTOSPLIT$50);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASE$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BASE$52);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BASE$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(BASE$52);
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
                return get_store().find_attribute_user(BASE$52) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASE$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BASE$52);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BASE$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(BASE$52);
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
                get_store().remove_attribute(BASE$52);
            }
        }
        
        /**
         * Gets the "cacheable" attribute
         */
        public boolean getCacheable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CACHEABLE$54);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CACHEABLE$54);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "cacheable" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetCacheable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CACHEABLE$54);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CACHEABLE$54);
                }
                return target;
            }
        }
        
        /**
         * True if has "cacheable" attribute
         */
        public boolean isSetCacheable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CACHEABLE$54) != null;
            }
        }
        
        /**
         * Sets the "cacheable" attribute
         */
        public void setCacheable(boolean cacheable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CACHEABLE$54);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CACHEABLE$54);
                }
                target.setBooleanValue(cacheable);
            }
        }
        
        /**
         * Sets (as xml) the "cacheable" attribute
         */
        public void xsetCacheable(org.apache.xmlbeans.XmlBoolean cacheable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CACHEABLE$54);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CACHEABLE$54);
                }
                target.set(cacheable);
            }
        }
        
        /**
         * Unsets the "cacheable" attribute
         */
        public void unsetCacheable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CACHEABLE$54);
            }
        }
        
        /**
         * Gets the "consistentchildren" attribute
         */
        public boolean getConsistentchildren()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONSISTENTCHILDREN$56);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CONSISTENTCHILDREN$56);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "consistentchildren" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetConsistentchildren()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CONSISTENTCHILDREN$56);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CONSISTENTCHILDREN$56);
                }
                return target;
            }
        }
        
        /**
         * True if has "consistentchildren" attribute
         */
        public boolean isSetConsistentchildren()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CONSISTENTCHILDREN$56) != null;
            }
        }
        
        /**
         * Sets the "consistentchildren" attribute
         */
        public void setConsistentchildren(boolean consistentchildren)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONSISTENTCHILDREN$56);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONSISTENTCHILDREN$56);
                }
                target.setBooleanValue(consistentchildren);
            }
        }
        
        /**
         * Sets (as xml) the "consistentchildren" attribute
         */
        public void xsetConsistentchildren(org.apache.xmlbeans.XmlBoolean consistentchildren)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CONSISTENTCHILDREN$56);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CONSISTENTCHILDREN$56);
                }
                target.set(consistentchildren);
            }
        }
        
        /**
         * Unsets the "consistentchildren" attribute
         */
        public void unsetConsistentchildren()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CONSISTENTCHILDREN$56);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$58);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$58);
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
                return get_store().find_attribute_user(DESC$58) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$58);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$58);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$58);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$58);
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
                get_store().remove_attribute(DESC$58);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYNAME$60);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISPLAYNAME$60);
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
                return get_store().find_attribute_user(DISPLAYNAME$60) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYNAME$60);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISPLAYNAME$60);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISPLAYNAME$60);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DISPLAYNAME$60);
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
                get_store().remove_attribute(DISPLAYNAME$60);
            }
        }
        
        /**
         * Gets the "edgeTable" attribute
         */
        public boolean getEdgeTable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDGETABLE$62);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EDGETABLE$62);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "edgeTable" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetEdgeTable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EDGETABLE$62);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EDGETABLE$62);
                }
                return target;
            }
        }
        
        /**
         * True if has "edgeTable" attribute
         */
        public boolean isSetEdgeTable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EDGETABLE$62) != null;
            }
        }
        
        /**
         * Sets the "edgeTable" attribute
         */
        public void setEdgeTable(boolean edgeTable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDGETABLE$62);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EDGETABLE$62);
                }
                target.setBooleanValue(edgeTable);
            }
        }
        
        /**
         * Sets (as xml) the "edgeTable" attribute
         */
        public void xsetEdgeTable(org.apache.xmlbeans.XmlBoolean edgeTable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EDGETABLE$62);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EDGETABLE$62);
                }
                target.set(edgeTable);
            }
        }
        
        /**
         * Unsets the "edgeTable" attribute
         */
        public void unsetEdgeTable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EDGETABLE$62);
            }
        }
        
        /**
         * Gets the "effDatedBranchType" attribute
         */
        public java.lang.String getEffDatedBranchType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EFFDATEDBRANCHTYPE$64);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "effDatedBranchType" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEffDatedBranchType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EFFDATEDBRANCHTYPE$64);
                return target;
            }
        }
        
        /**
         * True if has "effDatedBranchType" attribute
         */
        public boolean isSetEffDatedBranchType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EFFDATEDBRANCHTYPE$64) != null;
            }
        }
        
        /**
         * Sets the "effDatedBranchType" attribute
         */
        public void setEffDatedBranchType(java.lang.String effDatedBranchType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EFFDATEDBRANCHTYPE$64);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EFFDATEDBRANCHTYPE$64);
                }
                target.setStringValue(effDatedBranchType);
            }
        }
        
        /**
         * Sets (as xml) the "effDatedBranchType" attribute
         */
        public void xsetEffDatedBranchType(org.apache.xmlbeans.XmlString effDatedBranchType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EFFDATEDBRANCHTYPE$64);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EFFDATEDBRANCHTYPE$64);
                }
                target.set(effDatedBranchType);
            }
        }
        
        /**
         * Unsets the "effDatedBranchType" attribute
         */
        public void unsetEffDatedBranchType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EFFDATEDBRANCHTYPE$64);
            }
        }
        
        /**
         * Gets the "effDatedBranchesField" attribute
         */
        public java.lang.String getEffDatedBranchesField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EFFDATEDBRANCHESFIELD$66);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "effDatedBranchesField" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEffDatedBranchesField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EFFDATEDBRANCHESFIELD$66);
                return target;
            }
        }
        
        /**
         * True if has "effDatedBranchesField" attribute
         */
        public boolean isSetEffDatedBranchesField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EFFDATEDBRANCHESFIELD$66) != null;
            }
        }
        
        /**
         * Sets the "effDatedBranchesField" attribute
         */
        public void setEffDatedBranchesField(java.lang.String effDatedBranchesField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EFFDATEDBRANCHESFIELD$66);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EFFDATEDBRANCHESFIELD$66);
                }
                target.setStringValue(effDatedBranchesField);
            }
        }
        
        /**
         * Sets (as xml) the "effDatedBranchesField" attribute
         */
        public void xsetEffDatedBranchesField(org.apache.xmlbeans.XmlString effDatedBranchesField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EFFDATEDBRANCHESFIELD$66);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EFFDATEDBRANCHESFIELD$66);
                }
                target.set(effDatedBranchesField);
            }
        }
        
        /**
         * Unsets the "effDatedBranchesField" attribute
         */
        public void unsetEffDatedBranchesField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EFFDATEDBRANCHESFIELD$66);
            }
        }
        
        /**
         * Gets the "effDatedContainerField" attribute
         */
        public java.lang.String getEffDatedContainerField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EFFDATEDCONTAINERFIELD$68);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "effDatedContainerField" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEffDatedContainerField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EFFDATEDCONTAINERFIELD$68);
                return target;
            }
        }
        
        /**
         * True if has "effDatedContainerField" attribute
         */
        public boolean isSetEffDatedContainerField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EFFDATEDCONTAINERFIELD$68) != null;
            }
        }
        
        /**
         * Sets the "effDatedContainerField" attribute
         */
        public void setEffDatedContainerField(java.lang.String effDatedContainerField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EFFDATEDCONTAINERFIELD$68);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EFFDATEDCONTAINERFIELD$68);
                }
                target.setStringValue(effDatedContainerField);
            }
        }
        
        /**
         * Sets (as xml) the "effDatedContainerField" attribute
         */
        public void xsetEffDatedContainerField(org.apache.xmlbeans.XmlString effDatedContainerField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EFFDATEDCONTAINERFIELD$68);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EFFDATEDCONTAINERFIELD$68);
                }
                target.set(effDatedContainerField);
            }
        }
        
        /**
         * Unsets the "effDatedContainerField" attribute
         */
        public void unsetEffDatedContainerField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EFFDATEDCONTAINERFIELD$68);
            }
        }
        
        /**
         * Gets the "effDatedRegistryTableName" attribute
         */
        public java.lang.String getEffDatedRegistryTableName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EFFDATEDREGISTRYTABLENAME$70);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "effDatedRegistryTableName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEffDatedRegistryTableName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EFFDATEDREGISTRYTABLENAME$70);
                return target;
            }
        }
        
        /**
         * True if has "effDatedRegistryTableName" attribute
         */
        public boolean isSetEffDatedRegistryTableName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EFFDATEDREGISTRYTABLENAME$70) != null;
            }
        }
        
        /**
         * Sets the "effDatedRegistryTableName" attribute
         */
        public void setEffDatedRegistryTableName(java.lang.String effDatedRegistryTableName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EFFDATEDREGISTRYTABLENAME$70);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EFFDATEDREGISTRYTABLENAME$70);
                }
                target.setStringValue(effDatedRegistryTableName);
            }
        }
        
        /**
         * Sets (as xml) the "effDatedRegistryTableName" attribute
         */
        public void xsetEffDatedRegistryTableName(org.apache.xmlbeans.XmlString effDatedRegistryTableName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EFFDATEDREGISTRYTABLENAME$70);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EFFDATEDREGISTRYTABLENAME$70);
                }
                target.set(effDatedRegistryTableName);
            }
        }
        
        /**
         * Unsets the "effDatedRegistryTableName" attribute
         */
        public void unsetEffDatedRegistryTableName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EFFDATEDREGISTRYTABLENAME$70);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITY$72);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(ENTITY$72);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITY$72);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTITY$72);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(ENTITY$72);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(ENTITY$72);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPORTABLE$74);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EXPORTABLE$74);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXPORTABLE$74);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EXPORTABLE$74);
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
                return get_store().find_attribute_user(EXPORTABLE$74) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPORTABLE$74);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXPORTABLE$74);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXPORTABLE$74);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EXPORTABLE$74);
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
                get_store().remove_attribute(EXPORTABLE$74);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENDABLE$76);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EXTENDABLE$76);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXTENDABLE$76);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EXTENDABLE$76);
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
                return get_store().find_attribute_user(EXTENDABLE$76) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENDABLE$76);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXTENDABLE$76);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXTENDABLE$76);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EXTENDABLE$76);
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
                get_store().remove_attribute(EXTENDABLE$76);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINAL$78);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FINAL$78);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FINAL$78);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FINAL$78);
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
                return get_store().find_attribute_user(FINAL$78) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINAL$78);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FINAL$78);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FINAL$78);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FINAL$78);
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
                get_store().remove_attribute(FINAL$78);
            }
        }
        
        /**
         * Gets the "generateinternallyifabsent" attribute
         */
        public boolean getGenerateinternallyifabsent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GENERATEINTERNALLYIFABSENT$80);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GENERATEINTERNALLYIFABSENT$80);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "generateinternallyifabsent" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetGenerateinternallyifabsent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GENERATEINTERNALLYIFABSENT$80);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(GENERATEINTERNALLYIFABSENT$80);
                }
                return target;
            }
        }
        
        /**
         * True if has "generateinternallyifabsent" attribute
         */
        public boolean isSetGenerateinternallyifabsent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GENERATEINTERNALLYIFABSENT$80) != null;
            }
        }
        
        /**
         * Sets the "generateinternallyifabsent" attribute
         */
        public void setGenerateinternallyifabsent(boolean generateinternallyifabsent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GENERATEINTERNALLYIFABSENT$80);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GENERATEINTERNALLYIFABSENT$80);
                }
                target.setBooleanValue(generateinternallyifabsent);
            }
        }
        
        /**
         * Sets (as xml) the "generateinternallyifabsent" attribute
         */
        public void xsetGenerateinternallyifabsent(org.apache.xmlbeans.XmlBoolean generateinternallyifabsent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GENERATEINTERNALLYIFABSENT$80);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(GENERATEINTERNALLYIFABSENT$80);
                }
                target.set(generateinternallyifabsent);
            }
        }
        
        /**
         * Unsets the "generateinternallyifabsent" attribute
         */
        public void unsetGenerateinternallyifabsent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GENERATEINTERNALLYIFABSENT$80);
            }
        }
        
        /**
         * Gets the "ignoreForEvents" attribute
         */
        public boolean getIgnoreForEvents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IGNOREFOREVENTS$82);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(IGNOREFOREVENTS$82);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "ignoreForEvents" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetIgnoreForEvents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(IGNOREFOREVENTS$82);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(IGNOREFOREVENTS$82);
                }
                return target;
            }
        }
        
        /**
         * True if has "ignoreForEvents" attribute
         */
        public boolean isSetIgnoreForEvents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(IGNOREFOREVENTS$82) != null;
            }
        }
        
        /**
         * Sets the "ignoreForEvents" attribute
         */
        public void setIgnoreForEvents(boolean ignoreForEvents)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IGNOREFOREVENTS$82);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IGNOREFOREVENTS$82);
                }
                target.setBooleanValue(ignoreForEvents);
            }
        }
        
        /**
         * Sets (as xml) the "ignoreForEvents" attribute
         */
        public void xsetIgnoreForEvents(org.apache.xmlbeans.XmlBoolean ignoreForEvents)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(IGNOREFOREVENTS$82);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(IGNOREFOREVENTS$82);
                }
                target.set(ignoreForEvents);
            }
        }
        
        /**
         * Unsets the "ignoreForEvents" attribute
         */
        public void unsetIgnoreForEvents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(IGNOREFOREVENTS$82);
            }
        }
        
        /**
         * Gets the "instrumentationtable" attribute
         */
        public boolean getInstrumentationtable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTRUMENTATIONTABLE$84);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INSTRUMENTATIONTABLE$84);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "instrumentationtable" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetInstrumentationtable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INSTRUMENTATIONTABLE$84);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(INSTRUMENTATIONTABLE$84);
                }
                return target;
            }
        }
        
        /**
         * True if has "instrumentationtable" attribute
         */
        public boolean isSetInstrumentationtable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INSTRUMENTATIONTABLE$84) != null;
            }
        }
        
        /**
         * Sets the "instrumentationtable" attribute
         */
        public void setInstrumentationtable(boolean instrumentationtable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTRUMENTATIONTABLE$84);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSTRUMENTATIONTABLE$84);
                }
                target.setBooleanValue(instrumentationtable);
            }
        }
        
        /**
         * Sets (as xml) the "instrumentationtable" attribute
         */
        public void xsetInstrumentationtable(org.apache.xmlbeans.XmlBoolean instrumentationtable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INSTRUMENTATIONTABLE$84);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INSTRUMENTATIONTABLE$84);
                }
                target.set(instrumentationtable);
            }
        }
        
        /**
         * Unsets the "instrumentationtable" attribute
         */
        public void unsetInstrumentationtable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INSTRUMENTATIONTABLE$84);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JAVACLASS$86);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(JAVACLASS$86);
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
                return get_store().find_attribute_user(JAVACLASS$86) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JAVACLASS$86);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JAVACLASS$86);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(JAVACLASS$86);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(JAVACLASS$86);
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
                get_store().remove_attribute(JAVACLASS$86);
            }
        }
        
        /**
         * Gets the "loadable" attribute
         */
        public boolean getLoadable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOADABLE$88);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LOADABLE$88);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "loadable" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetLoadable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOADABLE$88);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(LOADABLE$88);
                }
                return target;
            }
        }
        
        /**
         * True if has "loadable" attribute
         */
        public boolean isSetLoadable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LOADABLE$88) != null;
            }
        }
        
        /**
         * Sets the "loadable" attribute
         */
        public void setLoadable(boolean loadable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOADABLE$88);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOADABLE$88);
                }
                target.setBooleanValue(loadable);
            }
        }
        
        /**
         * Sets (as xml) the "loadable" attribute
         */
        public void xsetLoadable(org.apache.xmlbeans.XmlBoolean loadable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOADABLE$88);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LOADABLE$88);
                }
                target.set(loadable);
            }
        }
        
        /**
         * Unsets the "loadable" attribute
         */
        public void unsetLoadable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LOADABLE$88);
            }
        }
        
        /**
         * Gets the "lockable" attribute
         */
        public boolean getLockable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCKABLE$90);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LOCKABLE$90);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "lockable" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetLockable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOCKABLE$90);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(LOCKABLE$90);
                }
                return target;
            }
        }
        
        /**
         * True if has "lockable" attribute
         */
        public boolean isSetLockable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LOCKABLE$90) != null;
            }
        }
        
        /**
         * Sets the "lockable" attribute
         */
        public void setLockable(boolean lockable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCKABLE$90);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCKABLE$90);
                }
                target.setBooleanValue(lockable);
            }
        }
        
        /**
         * Sets (as xml) the "lockable" attribute
         */
        public void xsetLockable(org.apache.xmlbeans.XmlBoolean lockable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOCKABLE$90);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LOCKABLE$90);
                }
                target.set(lockable);
            }
        }
        
        /**
         * Unsets the "lockable" attribute
         */
        public void unsetLockable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LOCKABLE$90);
            }
        }
        
        /**
         * Gets the "overwrittenInStagingTable" attribute
         */
        public boolean getOverwrittenInStagingTable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OVERWRITTENINSTAGINGTABLE$92);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OVERWRITTENINSTAGINGTABLE$92);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "overwrittenInStagingTable" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetOverwrittenInStagingTable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OVERWRITTENINSTAGINGTABLE$92);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(OVERWRITTENINSTAGINGTABLE$92);
                }
                return target;
            }
        }
        
        /**
         * True if has "overwrittenInStagingTable" attribute
         */
        public boolean isSetOverwrittenInStagingTable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OVERWRITTENINSTAGINGTABLE$92) != null;
            }
        }
        
        /**
         * Sets the "overwrittenInStagingTable" attribute
         */
        public void setOverwrittenInStagingTable(boolean overwrittenInStagingTable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OVERWRITTENINSTAGINGTABLE$92);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OVERWRITTENINSTAGINGTABLE$92);
                }
                target.setBooleanValue(overwrittenInStagingTable);
            }
        }
        
        /**
         * Sets (as xml) the "overwrittenInStagingTable" attribute
         */
        public void xsetOverwrittenInStagingTable(org.apache.xmlbeans.XmlBoolean overwrittenInStagingTable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OVERWRITTENINSTAGINGTABLE$92);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(OVERWRITTENINSTAGINGTABLE$92);
                }
                target.set(overwrittenInStagingTable);
            }
        }
        
        /**
         * Unsets the "overwrittenInStagingTable" attribute
         */
        public void unsetOverwrittenInStagingTable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OVERWRITTENINSTAGINGTABLE$92);
            }
        }
        
        /**
         * Gets the "platform" attribute
         */
        public boolean getPlatform()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLATFORM$94);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PLATFORM$94);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "platform" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetPlatform()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PLATFORM$94);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PLATFORM$94);
                }
                return target;
            }
        }
        
        /**
         * True if has "platform" attribute
         */
        public boolean isSetPlatform()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PLATFORM$94) != null;
            }
        }
        
        /**
         * Sets the "platform" attribute
         */
        public void setPlatform(boolean platform)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLATFORM$94);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PLATFORM$94);
                }
                target.setBooleanValue(platform);
            }
        }
        
        /**
         * Sets (as xml) the "platform" attribute
         */
        public void xsetPlatform(org.apache.xmlbeans.XmlBoolean platform)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PLATFORM$94);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PLATFORM$94);
                }
                target.set(platform);
            }
        }
        
        /**
         * Unsets the "platform" attribute
         */
        public void unsetPlatform()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PLATFORM$94);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIORITY$96);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PRIORITY$96);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PRIORITY$96);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_default_attribute_value(PRIORITY$96);
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
                return get_store().find_attribute_user(PRIORITY$96) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIORITY$96);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRIORITY$96);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PRIORITY$96);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(PRIORITY$96);
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
                get_store().remove_attribute(PRIORITY$96);
            }
        }
        
        /**
         * Gets the "readOnly" attribute
         */
        public boolean getReadOnly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(READONLY$98);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "readOnly" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetReadOnly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(READONLY$98);
                return target;
            }
        }
        
        /**
         * True if has "readOnly" attribute
         */
        public boolean isSetReadOnly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(READONLY$98) != null;
            }
        }
        
        /**
         * Sets the "readOnly" attribute
         */
        public void setReadOnly(boolean readOnly)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(READONLY$98);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(READONLY$98);
                }
                target.setBooleanValue(readOnly);
            }
        }
        
        /**
         * Sets (as xml) the "readOnly" attribute
         */
        public void xsetReadOnly(org.apache.xmlbeans.XmlBoolean readOnly)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(READONLY$98);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(READONLY$98);
                }
                target.set(readOnly);
            }
        }
        
        /**
         * Unsets the "readOnly" attribute
         */
        public void unsetReadOnly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(READONLY$98);
            }
        }
        
        /**
         * Gets the "setterScriptability" attribute
         */
        public com.guidewire.datamodel.ScriptabilityType.Enum getSetterScriptability()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETTERSCRIPTABILITY$100);
                if (target == null)
                {
                    return null;
                }
                return (com.guidewire.datamodel.ScriptabilityType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "setterScriptability" attribute
         */
        public com.guidewire.datamodel.ScriptabilityType xgetSetterScriptability()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ScriptabilityType target = null;
                target = (com.guidewire.datamodel.ScriptabilityType)get_store().find_attribute_user(SETTERSCRIPTABILITY$100);
                return target;
            }
        }
        
        /**
         * True if has "setterScriptability" attribute
         */
        public boolean isSetSetterScriptability()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SETTERSCRIPTABILITY$100) != null;
            }
        }
        
        /**
         * Sets the "setterScriptability" attribute
         */
        public void setSetterScriptability(com.guidewire.datamodel.ScriptabilityType.Enum setterScriptability)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETTERSCRIPTABILITY$100);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SETTERSCRIPTABILITY$100);
                }
                target.setEnumValue(setterScriptability);
            }
        }
        
        /**
         * Sets (as xml) the "setterScriptability" attribute
         */
        public void xsetSetterScriptability(com.guidewire.datamodel.ScriptabilityType setterScriptability)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ScriptabilityType target = null;
                target = (com.guidewire.datamodel.ScriptabilityType)get_store().find_attribute_user(SETTERSCRIPTABILITY$100);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.ScriptabilityType)get_store().add_attribute_user(SETTERSCRIPTABILITY$100);
                }
                target.set(setterScriptability);
            }
        }
        
        /**
         * Unsets the "setterScriptability" attribute
         */
        public void unsetSetterScriptability()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SETTERSCRIPTABILITY$100);
            }
        }
        
        /**
         * Gets the "size" attribute
         */
        public com.guidewire.datamodel.SizeType.Enum getSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIZE$102);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SIZE$102);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.guidewire.datamodel.SizeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "size" attribute
         */
        public com.guidewire.datamodel.SizeType xgetSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.SizeType target = null;
                target = (com.guidewire.datamodel.SizeType)get_store().find_attribute_user(SIZE$102);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.SizeType)get_default_attribute_value(SIZE$102);
                }
                return target;
            }
        }
        
        /**
         * True if has "size" attribute
         */
        public boolean isSetSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SIZE$102) != null;
            }
        }
        
        /**
         * Sets the "size" attribute
         */
        public void setSize(com.guidewire.datamodel.SizeType.Enum size)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIZE$102);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIZE$102);
                }
                target.setEnumValue(size);
            }
        }
        
        /**
         * Sets (as xml) the "size" attribute
         */
        public void xsetSize(com.guidewire.datamodel.SizeType size)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.SizeType target = null;
                target = (com.guidewire.datamodel.SizeType)get_store().find_attribute_user(SIZE$102);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.SizeType)get_store().add_attribute_user(SIZE$102);
                }
                target.set(size);
            }
        }
        
        /**
         * Unsets the "size" attribute
         */
        public void unsetSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SIZE$102);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPERTYPEENTITY$104);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(SUPERTYPEENTITY$104);
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
                return get_store().find_attribute_user(SUPERTYPEENTITY$104) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPERTYPEENTITY$104);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUPERTYPEENTITY$104);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(SUPERTYPEENTITY$104);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(SUPERTYPEENTITY$104);
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
                get_store().remove_attribute(SUPERTYPEENTITY$104);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABLE$106);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(TABLE$106);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABLE$106);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TABLE$106);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(TABLE$106);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(TABLE$106);
                }
                target.set(table);
            }
        }
        
        /**
         * Gets the "temporary" attribute
         */
        public boolean getTemporary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEMPORARY$108);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TEMPORARY$108);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "temporary" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetTemporary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TEMPORARY$108);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(TEMPORARY$108);
                }
                return target;
            }
        }
        
        /**
         * True if has "temporary" attribute
         */
        public boolean isSetTemporary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TEMPORARY$108) != null;
            }
        }
        
        /**
         * Sets the "temporary" attribute
         */
        public void setTemporary(boolean temporary)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEMPORARY$108);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEMPORARY$108);
                }
                target.setBooleanValue(temporary);
            }
        }
        
        /**
         * Sets (as xml) the "temporary" attribute
         */
        public void xsetTemporary(org.apache.xmlbeans.XmlBoolean temporary)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TEMPORARY$108);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TEMPORARY$108);
                }
                target.set(temporary);
            }
        }
        
        /**
         * Unsets the "temporary" attribute
         */
        public void unsetTemporary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TEMPORARY$108);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public com.guidewire.datamodel.InternalEntityType.Enum getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$110);
                if (target == null)
                {
                    return null;
                }
                return (com.guidewire.datamodel.InternalEntityType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public com.guidewire.datamodel.InternalEntityType xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.InternalEntityType target = null;
                target = (com.guidewire.datamodel.InternalEntityType)get_store().find_attribute_user(TYPE$110);
                return target;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(com.guidewire.datamodel.InternalEntityType.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$110);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$110);
                }
                target.setEnumValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(com.guidewire.datamodel.InternalEntityType type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.InternalEntityType target = null;
                target = (com.guidewire.datamodel.InternalEntityType)get_store().find_attribute_user(TYPE$110);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.InternalEntityType)get_store().add_attribute_user(TYPE$110);
                }
                target.set(type);
            }
        }
        
        /**
         * Gets the "validateOnCommit" attribute
         */
        public boolean getValidateOnCommit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDATEONCOMMIT$112);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VALIDATEONCOMMIT$112);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "validateOnCommit" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetValidateOnCommit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(VALIDATEONCOMMIT$112);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(VALIDATEONCOMMIT$112);
                }
                return target;
            }
        }
        
        /**
         * True if has "validateOnCommit" attribute
         */
        public boolean isSetValidateOnCommit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALIDATEONCOMMIT$112) != null;
            }
        }
        
        /**
         * Sets the "validateOnCommit" attribute
         */
        public void setValidateOnCommit(boolean validateOnCommit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDATEONCOMMIT$112);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDATEONCOMMIT$112);
                }
                target.setBooleanValue(validateOnCommit);
            }
        }
        
        /**
         * Sets (as xml) the "validateOnCommit" attribute
         */
        public void xsetValidateOnCommit(org.apache.xmlbeans.XmlBoolean validateOnCommit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(VALIDATEONCOMMIT$112);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(VALIDATEONCOMMIT$112);
                }
                target.set(validateOnCommit);
            }
        }
        
        /**
         * Unsets the "validateOnCommit" attribute
         */
        public void unsetValidateOnCommit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALIDATEONCOMMIT$112);
            }
        }
    }
}
