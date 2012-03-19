/*
 * An XML document type.
 * Localname: subtype
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.SubtypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one subtype(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class SubtypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.SubtypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubtypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBTYPE$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "subtype");
    
    
    /**
     * Gets the "subtype" element
     */
    public com.guidewire.datamodel.SubtypeDocument.Subtype getSubtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.SubtypeDocument.Subtype target = null;
            target = (com.guidewire.datamodel.SubtypeDocument.Subtype)get_store().find_element_user(SUBTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subtype" element
     */
    public void setSubtype(com.guidewire.datamodel.SubtypeDocument.Subtype subtype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.SubtypeDocument.Subtype target = null;
            target = (com.guidewire.datamodel.SubtypeDocument.Subtype)get_store().find_element_user(SUBTYPE$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.SubtypeDocument.Subtype)get_store().add_element_user(SUBTYPE$0);
            }
            target.set(subtype);
        }
    }
    
    /**
     * Appends and returns a new empty "subtype" element
     */
    public com.guidewire.datamodel.SubtypeDocument.Subtype addNewSubtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.SubtypeDocument.Subtype target = null;
            target = (com.guidewire.datamodel.SubtypeDocument.Subtype)get_store().add_element_user(SUBTYPE$0);
            return target;
        }
    }
    /**
     * An XML subtype(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class SubtypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.SubtypeDocument.Subtype
    {
        private static final long serialVersionUID = 1L;
        
        public SubtypeImpl(org.apache.xmlbeans.SchemaType sType)
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
        private static final javax.xml.namespace.QName CUSTOMCONSISTENCYCHECK$8 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "customconsistencycheck");
        private static final javax.xml.namespace.QName DATETIMEORDERING$10 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "datetimeordering");
        private static final javax.xml.namespace.QName DBCHECKBUILDER$12 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "dbcheckbuilder");
        private static final javax.xml.namespace.QName DEPENDENTFIELDS$14 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "dependentfields");
        private static final javax.xml.namespace.QName EDGEFOREIGNKEY$16 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "edgeForeignKey");
        private static final javax.xml.namespace.QName EVENTS$18 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "events");
        private static final javax.xml.namespace.QName FOREIGNKEY$20 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "foreignkey");
        private static final javax.xml.namespace.QName FULLDESCRIPTION$22 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "fulldescription");
        private static final javax.xml.namespace.QName IMPLEMENTSENTITY$24 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "implementsEntity");
        private static final javax.xml.namespace.QName IMPLEMENTSINTERFACE$26 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "implementsInterface");
        private static final javax.xml.namespace.QName INDEX$28 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "index");
        private static final javax.xml.namespace.QName JOINTABLECONSISTENCYCHECK$30 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "jointableconsistencycheck");
        private static final javax.xml.namespace.QName ONETOONE$32 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "onetoone");
        private static final javax.xml.namespace.QName TABLEAUGMENTER$34 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "tableAugmenter");
        private static final javax.xml.namespace.QName TYPEKEY$36 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "typekey");
        private static final javax.xml.namespace.QName VALIDATETYPEKEYINSET$38 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "validatetypekeyinset");
        private static final javax.xml.namespace.QName VALIDATETYPEKEYNOTINSET$40 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "validatetypekeynotinset");
        private static final javax.xml.namespace.QName ABSTRACT$42 = 
            new javax.xml.namespace.QName("", "abstract");
        private static final javax.xml.namespace.QName DESC$44 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName DISPLAYNAME$46 = 
            new javax.xml.namespace.QName("", "displayName");
        private static final javax.xml.namespace.QName ENTITY$48 = 
            new javax.xml.namespace.QName("", "entity");
        private static final javax.xml.namespace.QName FINAL$50 = 
            new javax.xml.namespace.QName("", "final");
        private static final javax.xml.namespace.QName JAVACLASS$52 = 
            new javax.xml.namespace.QName("", "javaClass");
        private static final javax.xml.namespace.QName PRIORITY$54 = 
            new javax.xml.namespace.QName("", "priority");
        private static final javax.xml.namespace.QName READONLY$56 = 
            new javax.xml.namespace.QName("", "readOnly");
        private static final javax.xml.namespace.QName SUPERTYPE$58 = 
            new javax.xml.namespace.QName("", "supertype");
        
        
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
         * Gets array of all "customconsistencycheck" elements
         */
        public com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck[] getCustomconsistencycheckArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CUSTOMCONSISTENCYCHECK$8, targetList);
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
                target = (com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck)get_store().find_element_user(CUSTOMCONSISTENCYCHECK$8, i);
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
                return get_store().count_elements(CUSTOMCONSISTENCYCHECK$8);
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
                arraySetterHelper(customconsistencycheckArray, CUSTOMCONSISTENCYCHECK$8);
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
                target = (com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck)get_store().find_element_user(CUSTOMCONSISTENCYCHECK$8, i);
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
                target = (com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck)get_store().insert_element_user(CUSTOMCONSISTENCYCHECK$8, i);
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
                target = (com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck)get_store().add_element_user(CUSTOMCONSISTENCYCHECK$8);
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
                get_store().remove_element(CUSTOMCONSISTENCYCHECK$8, i);
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
                get_store().find_all_element_users(DATETIMEORDERING$10, targetList);
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
                target = (com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering)get_store().find_element_user(DATETIMEORDERING$10, i);
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
                return get_store().count_elements(DATETIMEORDERING$10);
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
                arraySetterHelper(datetimeorderingArray, DATETIMEORDERING$10);
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
                target = (com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering)get_store().find_element_user(DATETIMEORDERING$10, i);
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
                target = (com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering)get_store().insert_element_user(DATETIMEORDERING$10, i);
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
                target = (com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering)get_store().add_element_user(DATETIMEORDERING$10);
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
                get_store().remove_element(DATETIMEORDERING$10, i);
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
                get_store().find_all_element_users(DBCHECKBUILDER$12, targetList);
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
                target = (com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder)get_store().find_element_user(DBCHECKBUILDER$12, i);
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
                return get_store().count_elements(DBCHECKBUILDER$12);
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
                arraySetterHelper(dbcheckbuilderArray, DBCHECKBUILDER$12);
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
                target = (com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder)get_store().find_element_user(DBCHECKBUILDER$12, i);
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
                target = (com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder)get_store().insert_element_user(DBCHECKBUILDER$12, i);
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
                target = (com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder)get_store().add_element_user(DBCHECKBUILDER$12);
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
                get_store().remove_element(DBCHECKBUILDER$12, i);
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
                get_store().find_all_element_users(DEPENDENTFIELDS$14, targetList);
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
                target = (com.guidewire.datamodel.DependentfieldsDocument.Dependentfields)get_store().find_element_user(DEPENDENTFIELDS$14, i);
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
                return get_store().count_elements(DEPENDENTFIELDS$14);
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
                arraySetterHelper(dependentfieldsArray, DEPENDENTFIELDS$14);
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
                target = (com.guidewire.datamodel.DependentfieldsDocument.Dependentfields)get_store().find_element_user(DEPENDENTFIELDS$14, i);
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
                target = (com.guidewire.datamodel.DependentfieldsDocument.Dependentfields)get_store().insert_element_user(DEPENDENTFIELDS$14, i);
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
                target = (com.guidewire.datamodel.DependentfieldsDocument.Dependentfields)get_store().add_element_user(DEPENDENTFIELDS$14);
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
                get_store().remove_element(DEPENDENTFIELDS$14, i);
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
                get_store().find_all_element_users(EDGEFOREIGNKEY$16, targetList);
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
                target = (com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey)get_store().find_element_user(EDGEFOREIGNKEY$16, i);
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
                return get_store().count_elements(EDGEFOREIGNKEY$16);
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
                arraySetterHelper(edgeForeignKeyArray, EDGEFOREIGNKEY$16);
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
                target = (com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey)get_store().find_element_user(EDGEFOREIGNKEY$16, i);
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
                target = (com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey)get_store().insert_element_user(EDGEFOREIGNKEY$16, i);
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
                target = (com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey)get_store().add_element_user(EDGEFOREIGNKEY$16);
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
                get_store().remove_element(EDGEFOREIGNKEY$16, i);
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
                get_store().find_all_element_users(EVENTS$18, targetList);
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
                target = (com.guidewire.datamodel.EventsDocument.Events)get_store().find_element_user(EVENTS$18, i);
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
                return get_store().count_elements(EVENTS$18);
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
                arraySetterHelper(eventsArray, EVENTS$18);
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
                target = (com.guidewire.datamodel.EventsDocument.Events)get_store().find_element_user(EVENTS$18, i);
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
                target = (com.guidewire.datamodel.EventsDocument.Events)get_store().insert_element_user(EVENTS$18, i);
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
                target = (com.guidewire.datamodel.EventsDocument.Events)get_store().add_element_user(EVENTS$18);
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
                get_store().remove_element(EVENTS$18, i);
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
                get_store().find_all_element_users(FOREIGNKEY$20, targetList);
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
                target = (com.guidewire.datamodel.ForeignkeyDocument.Foreignkey)get_store().find_element_user(FOREIGNKEY$20, i);
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
                return get_store().count_elements(FOREIGNKEY$20);
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
                arraySetterHelper(foreignkeyArray, FOREIGNKEY$20);
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
                target = (com.guidewire.datamodel.ForeignkeyDocument.Foreignkey)get_store().find_element_user(FOREIGNKEY$20, i);
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
                target = (com.guidewire.datamodel.ForeignkeyDocument.Foreignkey)get_store().insert_element_user(FOREIGNKEY$20, i);
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
                target = (com.guidewire.datamodel.ForeignkeyDocument.Foreignkey)get_store().add_element_user(FOREIGNKEY$20);
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
                get_store().remove_element(FOREIGNKEY$20, i);
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
                get_store().find_all_element_users(FULLDESCRIPTION$22, targetList);
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
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().find_element_user(FULLDESCRIPTION$22, i);
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
                return get_store().count_elements(FULLDESCRIPTION$22);
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
                arraySetterHelper(fulldescriptionArray, FULLDESCRIPTION$22);
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
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().find_element_user(FULLDESCRIPTION$22, i);
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
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().insert_element_user(FULLDESCRIPTION$22, i);
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
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().add_element_user(FULLDESCRIPTION$22);
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
                get_store().remove_element(FULLDESCRIPTION$22, i);
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
                get_store().find_all_element_users(IMPLEMENTSENTITY$24, targetList);
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
                target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().find_element_user(IMPLEMENTSENTITY$24, i);
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
                return get_store().count_elements(IMPLEMENTSENTITY$24);
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
                arraySetterHelper(implementsEntityArray, IMPLEMENTSENTITY$24);
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
                target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().find_element_user(IMPLEMENTSENTITY$24, i);
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
                target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().insert_element_user(IMPLEMENTSENTITY$24, i);
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
                target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().add_element_user(IMPLEMENTSENTITY$24);
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
                get_store().remove_element(IMPLEMENTSENTITY$24, i);
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
                get_store().find_all_element_users(IMPLEMENTSINTERFACE$26, targetList);
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
                target = (com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface)get_store().find_element_user(IMPLEMENTSINTERFACE$26, i);
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
                return get_store().count_elements(IMPLEMENTSINTERFACE$26);
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
                arraySetterHelper(implementsInterfaceArray, IMPLEMENTSINTERFACE$26);
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
                target = (com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface)get_store().find_element_user(IMPLEMENTSINTERFACE$26, i);
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
                target = (com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface)get_store().insert_element_user(IMPLEMENTSINTERFACE$26, i);
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
                target = (com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface)get_store().add_element_user(IMPLEMENTSINTERFACE$26);
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
                get_store().remove_element(IMPLEMENTSINTERFACE$26, i);
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
                get_store().find_all_element_users(INDEX$28, targetList);
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
                target = (com.guidewire.datamodel.IndexDocument.Index)get_store().find_element_user(INDEX$28, i);
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
                return get_store().count_elements(INDEX$28);
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
                arraySetterHelper(indexArray, INDEX$28);
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
                target = (com.guidewire.datamodel.IndexDocument.Index)get_store().find_element_user(INDEX$28, i);
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
                target = (com.guidewire.datamodel.IndexDocument.Index)get_store().insert_element_user(INDEX$28, i);
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
                target = (com.guidewire.datamodel.IndexDocument.Index)get_store().add_element_user(INDEX$28);
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
                get_store().remove_element(INDEX$28, i);
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
                get_store().find_all_element_users(JOINTABLECONSISTENCYCHECK$30, targetList);
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
                target = (com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck)get_store().find_element_user(JOINTABLECONSISTENCYCHECK$30, i);
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
                return get_store().count_elements(JOINTABLECONSISTENCYCHECK$30);
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
                arraySetterHelper(jointableconsistencycheckArray, JOINTABLECONSISTENCYCHECK$30);
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
                target = (com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck)get_store().find_element_user(JOINTABLECONSISTENCYCHECK$30, i);
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
                target = (com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck)get_store().insert_element_user(JOINTABLECONSISTENCYCHECK$30, i);
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
                target = (com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck)get_store().add_element_user(JOINTABLECONSISTENCYCHECK$30);
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
                get_store().remove_element(JOINTABLECONSISTENCYCHECK$30, i);
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
                get_store().find_all_element_users(ONETOONE$32, targetList);
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
                target = (com.guidewire.datamodel.OnetooneDocument.Onetoone)get_store().find_element_user(ONETOONE$32, i);
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
                return get_store().count_elements(ONETOONE$32);
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
                arraySetterHelper(onetooneArray, ONETOONE$32);
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
                target = (com.guidewire.datamodel.OnetooneDocument.Onetoone)get_store().find_element_user(ONETOONE$32, i);
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
                target = (com.guidewire.datamodel.OnetooneDocument.Onetoone)get_store().insert_element_user(ONETOONE$32, i);
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
                target = (com.guidewire.datamodel.OnetooneDocument.Onetoone)get_store().add_element_user(ONETOONE$32);
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
                get_store().remove_element(ONETOONE$32, i);
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
                get_store().find_all_element_users(TABLEAUGMENTER$34, targetList);
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
                target = (com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter)get_store().find_element_user(TABLEAUGMENTER$34, i);
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
                return get_store().count_elements(TABLEAUGMENTER$34);
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
                arraySetterHelper(tableAugmenterArray, TABLEAUGMENTER$34);
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
                target = (com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter)get_store().find_element_user(TABLEAUGMENTER$34, i);
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
                target = (com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter)get_store().insert_element_user(TABLEAUGMENTER$34, i);
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
                target = (com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter)get_store().add_element_user(TABLEAUGMENTER$34);
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
                get_store().remove_element(TABLEAUGMENTER$34, i);
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
                get_store().find_all_element_users(TYPEKEY$36, targetList);
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
                target = (com.guidewire.datamodel.TypekeyDocument.Typekey)get_store().find_element_user(TYPEKEY$36, i);
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
                return get_store().count_elements(TYPEKEY$36);
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
                arraySetterHelper(typekeyArray, TYPEKEY$36);
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
                target = (com.guidewire.datamodel.TypekeyDocument.Typekey)get_store().find_element_user(TYPEKEY$36, i);
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
                target = (com.guidewire.datamodel.TypekeyDocument.Typekey)get_store().insert_element_user(TYPEKEY$36, i);
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
                target = (com.guidewire.datamodel.TypekeyDocument.Typekey)get_store().add_element_user(TYPEKEY$36);
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
                get_store().remove_element(TYPEKEY$36, i);
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
                get_store().find_all_element_users(VALIDATETYPEKEYINSET$38, targetList);
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
                target = (com.guidewire.datamodel.ValidatetypekeyinsetDocument.Validatetypekeyinset)get_store().find_element_user(VALIDATETYPEKEYINSET$38, i);
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
                return get_store().count_elements(VALIDATETYPEKEYINSET$38);
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
                arraySetterHelper(validatetypekeyinsetArray, VALIDATETYPEKEYINSET$38);
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
                target = (com.guidewire.datamodel.ValidatetypekeyinsetDocument.Validatetypekeyinset)get_store().find_element_user(VALIDATETYPEKEYINSET$38, i);
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
                target = (com.guidewire.datamodel.ValidatetypekeyinsetDocument.Validatetypekeyinset)get_store().insert_element_user(VALIDATETYPEKEYINSET$38, i);
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
                target = (com.guidewire.datamodel.ValidatetypekeyinsetDocument.Validatetypekeyinset)get_store().add_element_user(VALIDATETYPEKEYINSET$38);
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
                get_store().remove_element(VALIDATETYPEKEYINSET$38, i);
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
                get_store().find_all_element_users(VALIDATETYPEKEYNOTINSET$40, targetList);
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
                target = (com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset)get_store().find_element_user(VALIDATETYPEKEYNOTINSET$40, i);
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
                return get_store().count_elements(VALIDATETYPEKEYNOTINSET$40);
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
                arraySetterHelper(validatetypekeynotinsetArray, VALIDATETYPEKEYNOTINSET$40);
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
                target = (com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset)get_store().find_element_user(VALIDATETYPEKEYNOTINSET$40, i);
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
                target = (com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset)get_store().insert_element_user(VALIDATETYPEKEYNOTINSET$40, i);
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
                target = (com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset)get_store().add_element_user(VALIDATETYPEKEYNOTINSET$40);
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
                get_store().remove_element(VALIDATETYPEKEYNOTINSET$40, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABSTRACT$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ABSTRACT$42);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABSTRACT$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ABSTRACT$42);
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
                return get_store().find_attribute_user(ABSTRACT$42) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABSTRACT$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ABSTRACT$42);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABSTRACT$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ABSTRACT$42);
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
                get_store().remove_attribute(ABSTRACT$42);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$44);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$44);
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
                return get_store().find_attribute_user(DESC$44) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$44);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$44);
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
                get_store().remove_attribute(DESC$44);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYNAME$46);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISPLAYNAME$46);
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
                return get_store().find_attribute_user(DISPLAYNAME$46) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYNAME$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISPLAYNAME$46);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISPLAYNAME$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DISPLAYNAME$46);
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
                get_store().remove_attribute(DISPLAYNAME$46);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITY$48);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(ENTITY$48);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITY$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTITY$48);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(ENTITY$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(ENTITY$48);
                }
                target.set(entity);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINAL$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FINAL$50);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FINAL$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FINAL$50);
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
                return get_store().find_attribute_user(FINAL$50) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINAL$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FINAL$50);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FINAL$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FINAL$50);
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
                get_store().remove_attribute(FINAL$50);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JAVACLASS$52);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(JAVACLASS$52);
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
                return get_store().find_attribute_user(JAVACLASS$52) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JAVACLASS$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JAVACLASS$52);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(JAVACLASS$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(JAVACLASS$52);
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
                get_store().remove_attribute(JAVACLASS$52);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIORITY$54);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PRIORITY$54);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PRIORITY$54);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_default_attribute_value(PRIORITY$54);
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
                return get_store().find_attribute_user(PRIORITY$54) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIORITY$54);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRIORITY$54);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PRIORITY$54);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(PRIORITY$54);
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
                get_store().remove_attribute(PRIORITY$54);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(READONLY$56);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(READONLY$56);
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
                return get_store().find_attribute_user(READONLY$56) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(READONLY$56);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(READONLY$56);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(READONLY$56);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(READONLY$56);
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
                get_store().remove_attribute(READONLY$56);
            }
        }
        
        /**
         * Gets the "supertype" attribute
         */
        public java.lang.String getSupertype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPERTYPE$58);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "supertype" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetSupertype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(SUPERTYPE$58);
                return target;
            }
        }
        
        /**
         * Sets the "supertype" attribute
         */
        public void setSupertype(java.lang.String supertype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPERTYPE$58);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUPERTYPE$58);
                }
                target.setStringValue(supertype);
            }
        }
        
        /**
         * Sets (as xml) the "supertype" attribute
         */
        public void xsetSupertype(org.apache.xmlbeans.XmlNMTOKEN supertype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(SUPERTYPE$58);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(SUPERTYPE$58);
                }
                target.set(supertype);
            }
        }
    }
}
