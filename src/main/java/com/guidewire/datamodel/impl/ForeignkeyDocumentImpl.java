/*
 * An XML document type.
 * Localname: foreignkey
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.ForeignkeyDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one foreignkey(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class ForeignkeyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ForeignkeyDocument
{
    private static final long serialVersionUID = 1L;
    
    public ForeignkeyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FOREIGNKEY$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "foreignkey");
    
    
    /**
     * Gets the "foreignkey" element
     */
    public com.guidewire.datamodel.ForeignkeyDocument.Foreignkey getForeignkey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ForeignkeyDocument.Foreignkey target = null;
            target = (com.guidewire.datamodel.ForeignkeyDocument.Foreignkey)get_store().find_element_user(FOREIGNKEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "foreignkey" element
     */
    public void setForeignkey(com.guidewire.datamodel.ForeignkeyDocument.Foreignkey foreignkey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ForeignkeyDocument.Foreignkey target = null;
            target = (com.guidewire.datamodel.ForeignkeyDocument.Foreignkey)get_store().find_element_user(FOREIGNKEY$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.ForeignkeyDocument.Foreignkey)get_store().add_element_user(FOREIGNKEY$0);
            }
            target.set(foreignkey);
        }
    }
    
    /**
     * Appends and returns a new empty "foreignkey" element
     */
    public com.guidewire.datamodel.ForeignkeyDocument.Foreignkey addNewForeignkey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ForeignkeyDocument.Foreignkey target = null;
            target = (com.guidewire.datamodel.ForeignkeyDocument.Foreignkey)get_store().add_element_user(FOREIGNKEY$0);
            return target;
        }
    }
    /**
     * An XML foreignkey(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class ForeignkeyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ForeignkeyDocument.Foreignkey
    {
        private static final long serialVersionUID = 1L;
        
        public ForeignkeyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FULLDESCRIPTION$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "fulldescription");
        private static final javax.xml.namespace.QName COLUMNNAME$2 = 
            new javax.xml.namespace.QName("", "columnName");
        private static final javax.xml.namespace.QName CREATECONSTRAINT$4 = 
            new javax.xml.namespace.QName("", "createConstraint");
        private static final javax.xml.namespace.QName CREATEBACKINGINDEX$6 = 
            new javax.xml.namespace.QName("", "createbackingindex");
        private static final javax.xml.namespace.QName CREATEHISTOGRAM$8 = 
            new javax.xml.namespace.QName("", "createhistogram");
        private static final javax.xml.namespace.QName DELETEFK$10 = 
            new javax.xml.namespace.QName("", "deletefk");
        private static final javax.xml.namespace.QName DEPRECATED$12 = 
            new javax.xml.namespace.QName("", "deprecated");
        private static final javax.xml.namespace.QName DESC$14 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName EXISTINGREFERENCESALLOWED$16 = 
            new javax.xml.namespace.QName("", "existingreferencesallowed");
        private static final javax.xml.namespace.QName EXPORTABLE$18 = 
            new javax.xml.namespace.QName("", "exportable");
        private static final javax.xml.namespace.QName EXPORTASID$20 = 
            new javax.xml.namespace.QName("", "exportasid");
        private static final javax.xml.namespace.QName FKENTITY$22 = 
            new javax.xml.namespace.QName("", "fkentity");
        private static final javax.xml.namespace.QName GENERATECODE$24 = 
            new javax.xml.namespace.QName("", "generateCode");
        private static final javax.xml.namespace.QName GETTERSCRIPTABILITY$26 = 
            new javax.xml.namespace.QName("", "getterScriptability");
        private static final javax.xml.namespace.QName IGNOREFOREVENTS$28 = 
            new javax.xml.namespace.QName("", "ignoreforevents");
        private static final javax.xml.namespace.QName IMPORTABLEAGAINSTEXISTINGOBJECT$30 = 
            new javax.xml.namespace.QName("", "importableagainstexistingobject");
        private static final javax.xml.namespace.QName INCLUDEIDININDEX$32 = 
            new javax.xml.namespace.QName("", "includeIdInIndex");
        private static final javax.xml.namespace.QName LOADABLE$34 = 
            new javax.xml.namespace.QName("", "loadable");
        private static final javax.xml.namespace.QName NAME$36 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName NONEFFDATED$38 = 
            new javax.xml.namespace.QName("", "nonEffDated");
        private static final javax.xml.namespace.QName NULLOK$40 = 
            new javax.xml.namespace.QName("", "nullok");
        private static final javax.xml.namespace.QName ONDELETE$42 = 
            new javax.xml.namespace.QName("", "ondelete");
        private static final javax.xml.namespace.QName OVERWRITTENINSTAGINGTABLE$44 = 
            new javax.xml.namespace.QName("", "overwrittenInStagingTable");
        private static final javax.xml.namespace.QName OWNER$46 = 
            new javax.xml.namespace.QName("", "owner");
        private static final javax.xml.namespace.QName SETTERSCRIPTABILITY$48 = 
            new javax.xml.namespace.QName("", "setterScriptability");
        private static final javax.xml.namespace.QName SOAPNULLOK$50 = 
            new javax.xml.namespace.QName("", "soapnullok");
        private static final javax.xml.namespace.QName TRIGGERSVALIDATION$52 = 
            new javax.xml.namespace.QName("", "triggersValidation");
        
        
        /**
         * Gets array of all "fulldescription" elements
         */
        public com.guidewire.datamodel.FulldescriptionDocument.Fulldescription[] getFulldescriptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FULLDESCRIPTION$0, targetList);
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
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().find_element_user(FULLDESCRIPTION$0, i);
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
                return get_store().count_elements(FULLDESCRIPTION$0);
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
                arraySetterHelper(fulldescriptionArray, FULLDESCRIPTION$0);
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
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().find_element_user(FULLDESCRIPTION$0, i);
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
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().insert_element_user(FULLDESCRIPTION$0, i);
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
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().add_element_user(FULLDESCRIPTION$0);
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
                get_store().remove_element(FULLDESCRIPTION$0, i);
            }
        }
        
        /**
         * Gets the "columnName" attribute
         */
        public java.lang.String getColumnName()
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
         * Gets (as xml) the "columnName" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetColumnName()
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
         * True if has "columnName" attribute
         */
        public boolean isSetColumnName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COLUMNNAME$2) != null;
            }
        }
        
        /**
         * Sets the "columnName" attribute
         */
        public void setColumnName(java.lang.String columnName)
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
                target.setStringValue(columnName);
            }
        }
        
        /**
         * Sets (as xml) the "columnName" attribute
         */
        public void xsetColumnName(org.apache.xmlbeans.XmlNMTOKEN columnName)
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
                target.set(columnName);
            }
        }
        
        /**
         * Unsets the "columnName" attribute
         */
        public void unsetColumnName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COLUMNNAME$2);
            }
        }
        
        /**
         * Gets the "createConstraint" attribute
         */
        public boolean getCreateConstraint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATECONSTRAINT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CREATECONSTRAINT$4);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "createConstraint" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetCreateConstraint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CREATECONSTRAINT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CREATECONSTRAINT$4);
                }
                return target;
            }
        }
        
        /**
         * True if has "createConstraint" attribute
         */
        public boolean isSetCreateConstraint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CREATECONSTRAINT$4) != null;
            }
        }
        
        /**
         * Sets the "createConstraint" attribute
         */
        public void setCreateConstraint(boolean createConstraint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATECONSTRAINT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CREATECONSTRAINT$4);
                }
                target.setBooleanValue(createConstraint);
            }
        }
        
        /**
         * Sets (as xml) the "createConstraint" attribute
         */
        public void xsetCreateConstraint(org.apache.xmlbeans.XmlBoolean createConstraint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CREATECONSTRAINT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CREATECONSTRAINT$4);
                }
                target.set(createConstraint);
            }
        }
        
        /**
         * Unsets the "createConstraint" attribute
         */
        public void unsetCreateConstraint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CREATECONSTRAINT$4);
            }
        }
        
        /**
         * Gets the "createbackingindex" attribute
         */
        public boolean getCreatebackingindex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEBACKINGINDEX$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CREATEBACKINGINDEX$6);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "createbackingindex" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetCreatebackingindex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CREATEBACKINGINDEX$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CREATEBACKINGINDEX$6);
                }
                return target;
            }
        }
        
        /**
         * True if has "createbackingindex" attribute
         */
        public boolean isSetCreatebackingindex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CREATEBACKINGINDEX$6) != null;
            }
        }
        
        /**
         * Sets the "createbackingindex" attribute
         */
        public void setCreatebackingindex(boolean createbackingindex)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEBACKINGINDEX$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CREATEBACKINGINDEX$6);
                }
                target.setBooleanValue(createbackingindex);
            }
        }
        
        /**
         * Sets (as xml) the "createbackingindex" attribute
         */
        public void xsetCreatebackingindex(org.apache.xmlbeans.XmlBoolean createbackingindex)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CREATEBACKINGINDEX$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CREATEBACKINGINDEX$6);
                }
                target.set(createbackingindex);
            }
        }
        
        /**
         * Unsets the "createbackingindex" attribute
         */
        public void unsetCreatebackingindex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CREATEBACKINGINDEX$6);
            }
        }
        
        /**
         * Gets the "createhistogram" attribute
         */
        public boolean getCreatehistogram()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEHISTOGRAM$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CREATEHISTOGRAM$8);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "createhistogram" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetCreatehistogram()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CREATEHISTOGRAM$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CREATEHISTOGRAM$8);
                }
                return target;
            }
        }
        
        /**
         * True if has "createhistogram" attribute
         */
        public boolean isSetCreatehistogram()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CREATEHISTOGRAM$8) != null;
            }
        }
        
        /**
         * Sets the "createhistogram" attribute
         */
        public void setCreatehistogram(boolean createhistogram)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEHISTOGRAM$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CREATEHISTOGRAM$8);
                }
                target.setBooleanValue(createhistogram);
            }
        }
        
        /**
         * Sets (as xml) the "createhistogram" attribute
         */
        public void xsetCreatehistogram(org.apache.xmlbeans.XmlBoolean createhistogram)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CREATEHISTOGRAM$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CREATEHISTOGRAM$8);
                }
                target.set(createhistogram);
            }
        }
        
        /**
         * Unsets the "createhistogram" attribute
         */
        public void unsetCreatehistogram()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CREATEHISTOGRAM$8);
            }
        }
        
        /**
         * Gets the "deletefk" attribute
         */
        public boolean getDeletefk()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELETEFK$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DELETEFK$10);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "deletefk" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetDeletefk()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DELETEFK$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DELETEFK$10);
                }
                return target;
            }
        }
        
        /**
         * True if has "deletefk" attribute
         */
        public boolean isSetDeletefk()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DELETEFK$10) != null;
            }
        }
        
        /**
         * Sets the "deletefk" attribute
         */
        public void setDeletefk(boolean deletefk)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELETEFK$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DELETEFK$10);
                }
                target.setBooleanValue(deletefk);
            }
        }
        
        /**
         * Sets (as xml) the "deletefk" attribute
         */
        public void xsetDeletefk(org.apache.xmlbeans.XmlBoolean deletefk)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DELETEFK$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DELETEFK$10);
                }
                target.set(deletefk);
            }
        }
        
        /**
         * Unsets the "deletefk" attribute
         */
        public void unsetDeletefk()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DELETEFK$10);
            }
        }
        
        /**
         * Gets the "deprecated" attribute
         */
        public boolean getDeprecated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPRECATED$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DEPRECATED$12);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "deprecated" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetDeprecated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEPRECATED$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DEPRECATED$12);
                }
                return target;
            }
        }
        
        /**
         * True if has "deprecated" attribute
         */
        public boolean isSetDeprecated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEPRECATED$12) != null;
            }
        }
        
        /**
         * Sets the "deprecated" attribute
         */
        public void setDeprecated(boolean deprecated)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPRECATED$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEPRECATED$12);
                }
                target.setBooleanValue(deprecated);
            }
        }
        
        /**
         * Sets (as xml) the "deprecated" attribute
         */
        public void xsetDeprecated(org.apache.xmlbeans.XmlBoolean deprecated)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEPRECATED$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DEPRECATED$12);
                }
                target.set(deprecated);
            }
        }
        
        /**
         * Unsets the "deprecated" attribute
         */
        public void unsetDeprecated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEPRECATED$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$14);
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
                return get_store().find_attribute_user(DESC$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$14);
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
                get_store().remove_attribute(DESC$14);
            }
        }
        
        /**
         * Gets the "existingreferencesallowed" attribute
         */
        public boolean getExistingreferencesallowed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXISTINGREFERENCESALLOWED$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EXISTINGREFERENCESALLOWED$16);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "existingreferencesallowed" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetExistingreferencesallowed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXISTINGREFERENCESALLOWED$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EXISTINGREFERENCESALLOWED$16);
                }
                return target;
            }
        }
        
        /**
         * True if has "existingreferencesallowed" attribute
         */
        public boolean isSetExistingreferencesallowed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EXISTINGREFERENCESALLOWED$16) != null;
            }
        }
        
        /**
         * Sets the "existingreferencesallowed" attribute
         */
        public void setExistingreferencesallowed(boolean existingreferencesallowed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXISTINGREFERENCESALLOWED$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXISTINGREFERENCESALLOWED$16);
                }
                target.setBooleanValue(existingreferencesallowed);
            }
        }
        
        /**
         * Sets (as xml) the "existingreferencesallowed" attribute
         */
        public void xsetExistingreferencesallowed(org.apache.xmlbeans.XmlBoolean existingreferencesallowed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXISTINGREFERENCESALLOWED$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EXISTINGREFERENCESALLOWED$16);
                }
                target.set(existingreferencesallowed);
            }
        }
        
        /**
         * Unsets the "existingreferencesallowed" attribute
         */
        public void unsetExistingreferencesallowed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EXISTINGREFERENCESALLOWED$16);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPORTABLE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EXPORTABLE$18);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXPORTABLE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EXPORTABLE$18);
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
                return get_store().find_attribute_user(EXPORTABLE$18) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPORTABLE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXPORTABLE$18);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXPORTABLE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EXPORTABLE$18);
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
                get_store().remove_attribute(EXPORTABLE$18);
            }
        }
        
        /**
         * Gets the "exportasid" attribute
         */
        public boolean getExportasid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPORTASID$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EXPORTASID$20);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "exportasid" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetExportasid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXPORTASID$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EXPORTASID$20);
                }
                return target;
            }
        }
        
        /**
         * True if has "exportasid" attribute
         */
        public boolean isSetExportasid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EXPORTASID$20) != null;
            }
        }
        
        /**
         * Sets the "exportasid" attribute
         */
        public void setExportasid(boolean exportasid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPORTASID$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXPORTASID$20);
                }
                target.setBooleanValue(exportasid);
            }
        }
        
        /**
         * Sets (as xml) the "exportasid" attribute
         */
        public void xsetExportasid(org.apache.xmlbeans.XmlBoolean exportasid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXPORTASID$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EXPORTASID$20);
                }
                target.set(exportasid);
            }
        }
        
        /**
         * Unsets the "exportasid" attribute
         */
        public void unsetExportasid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EXPORTASID$20);
            }
        }
        
        /**
         * Gets the "fkentity" attribute
         */
        public java.lang.String getFkentity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FKENTITY$22);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fkentity" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetFkentity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(FKENTITY$22);
                return target;
            }
        }
        
        /**
         * Sets the "fkentity" attribute
         */
        public void setFkentity(java.lang.String fkentity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FKENTITY$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FKENTITY$22);
                }
                target.setStringValue(fkentity);
            }
        }
        
        /**
         * Sets (as xml) the "fkentity" attribute
         */
        public void xsetFkentity(org.apache.xmlbeans.XmlNMTOKEN fkentity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(FKENTITY$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(FKENTITY$22);
                }
                target.set(fkentity);
            }
        }
        
        /**
         * Gets the "generateCode" attribute
         */
        public boolean getGenerateCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GENERATECODE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GENERATECODE$24);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "generateCode" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetGenerateCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GENERATECODE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(GENERATECODE$24);
                }
                return target;
            }
        }
        
        /**
         * True if has "generateCode" attribute
         */
        public boolean isSetGenerateCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GENERATECODE$24) != null;
            }
        }
        
        /**
         * Sets the "generateCode" attribute
         */
        public void setGenerateCode(boolean generateCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GENERATECODE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GENERATECODE$24);
                }
                target.setBooleanValue(generateCode);
            }
        }
        
        /**
         * Sets (as xml) the "generateCode" attribute
         */
        public void xsetGenerateCode(org.apache.xmlbeans.XmlBoolean generateCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GENERATECODE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(GENERATECODE$24);
                }
                target.set(generateCode);
            }
        }
        
        /**
         * Unsets the "generateCode" attribute
         */
        public void unsetGenerateCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GENERATECODE$24);
            }
        }
        
        /**
         * Gets the "getterScriptability" attribute
         */
        public com.guidewire.datamodel.ScriptabilityType.Enum getGetterScriptability()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GETTERSCRIPTABILITY$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GETTERSCRIPTABILITY$26);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.guidewire.datamodel.ScriptabilityType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "getterScriptability" attribute
         */
        public com.guidewire.datamodel.ScriptabilityType xgetGetterScriptability()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ScriptabilityType target = null;
                target = (com.guidewire.datamodel.ScriptabilityType)get_store().find_attribute_user(GETTERSCRIPTABILITY$26);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.ScriptabilityType)get_default_attribute_value(GETTERSCRIPTABILITY$26);
                }
                return target;
            }
        }
        
        /**
         * True if has "getterScriptability" attribute
         */
        public boolean isSetGetterScriptability()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GETTERSCRIPTABILITY$26) != null;
            }
        }
        
        /**
         * Sets the "getterScriptability" attribute
         */
        public void setGetterScriptability(com.guidewire.datamodel.ScriptabilityType.Enum getterScriptability)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GETTERSCRIPTABILITY$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GETTERSCRIPTABILITY$26);
                }
                target.setEnumValue(getterScriptability);
            }
        }
        
        /**
         * Sets (as xml) the "getterScriptability" attribute
         */
        public void xsetGetterScriptability(com.guidewire.datamodel.ScriptabilityType getterScriptability)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ScriptabilityType target = null;
                target = (com.guidewire.datamodel.ScriptabilityType)get_store().find_attribute_user(GETTERSCRIPTABILITY$26);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.ScriptabilityType)get_store().add_attribute_user(GETTERSCRIPTABILITY$26);
                }
                target.set(getterScriptability);
            }
        }
        
        /**
         * Unsets the "getterScriptability" attribute
         */
        public void unsetGetterScriptability()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GETTERSCRIPTABILITY$26);
            }
        }
        
        /**
         * Gets the "ignoreforevents" attribute
         */
        public boolean getIgnoreforevents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IGNOREFOREVENTS$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(IGNOREFOREVENTS$28);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "ignoreforevents" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetIgnoreforevents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(IGNOREFOREVENTS$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(IGNOREFOREVENTS$28);
                }
                return target;
            }
        }
        
        /**
         * True if has "ignoreforevents" attribute
         */
        public boolean isSetIgnoreforevents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(IGNOREFOREVENTS$28) != null;
            }
        }
        
        /**
         * Sets the "ignoreforevents" attribute
         */
        public void setIgnoreforevents(boolean ignoreforevents)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IGNOREFOREVENTS$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IGNOREFOREVENTS$28);
                }
                target.setBooleanValue(ignoreforevents);
            }
        }
        
        /**
         * Sets (as xml) the "ignoreforevents" attribute
         */
        public void xsetIgnoreforevents(org.apache.xmlbeans.XmlBoolean ignoreforevents)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(IGNOREFOREVENTS$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(IGNOREFOREVENTS$28);
                }
                target.set(ignoreforevents);
            }
        }
        
        /**
         * Unsets the "ignoreforevents" attribute
         */
        public void unsetIgnoreforevents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(IGNOREFOREVENTS$28);
            }
        }
        
        /**
         * Gets the "importableagainstexistingobject" attribute
         */
        public boolean getImportableagainstexistingobject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMPORTABLEAGAINSTEXISTINGOBJECT$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(IMPORTABLEAGAINSTEXISTINGOBJECT$30);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "importableagainstexistingobject" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetImportableagainstexistingobject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(IMPORTABLEAGAINSTEXISTINGOBJECT$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(IMPORTABLEAGAINSTEXISTINGOBJECT$30);
                }
                return target;
            }
        }
        
        /**
         * True if has "importableagainstexistingobject" attribute
         */
        public boolean isSetImportableagainstexistingobject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(IMPORTABLEAGAINSTEXISTINGOBJECT$30) != null;
            }
        }
        
        /**
         * Sets the "importableagainstexistingobject" attribute
         */
        public void setImportableagainstexistingobject(boolean importableagainstexistingobject)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMPORTABLEAGAINSTEXISTINGOBJECT$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IMPORTABLEAGAINSTEXISTINGOBJECT$30);
                }
                target.setBooleanValue(importableagainstexistingobject);
            }
        }
        
        /**
         * Sets (as xml) the "importableagainstexistingobject" attribute
         */
        public void xsetImportableagainstexistingobject(org.apache.xmlbeans.XmlBoolean importableagainstexistingobject)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(IMPORTABLEAGAINSTEXISTINGOBJECT$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(IMPORTABLEAGAINSTEXISTINGOBJECT$30);
                }
                target.set(importableagainstexistingobject);
            }
        }
        
        /**
         * Unsets the "importableagainstexistingobject" attribute
         */
        public void unsetImportableagainstexistingobject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(IMPORTABLEAGAINSTEXISTINGOBJECT$30);
            }
        }
        
        /**
         * Gets the "includeIdInIndex" attribute
         */
        public boolean getIncludeIdInIndex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUDEIDININDEX$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INCLUDEIDININDEX$32);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "includeIdInIndex" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetIncludeIdInIndex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INCLUDEIDININDEX$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(INCLUDEIDININDEX$32);
                }
                return target;
            }
        }
        
        /**
         * True if has "includeIdInIndex" attribute
         */
        public boolean isSetIncludeIdInIndex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INCLUDEIDININDEX$32) != null;
            }
        }
        
        /**
         * Sets the "includeIdInIndex" attribute
         */
        public void setIncludeIdInIndex(boolean includeIdInIndex)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUDEIDININDEX$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INCLUDEIDININDEX$32);
                }
                target.setBooleanValue(includeIdInIndex);
            }
        }
        
        /**
         * Sets (as xml) the "includeIdInIndex" attribute
         */
        public void xsetIncludeIdInIndex(org.apache.xmlbeans.XmlBoolean includeIdInIndex)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INCLUDEIDININDEX$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INCLUDEIDININDEX$32);
                }
                target.set(includeIdInIndex);
            }
        }
        
        /**
         * Unsets the "includeIdInIndex" attribute
         */
        public void unsetIncludeIdInIndex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INCLUDEIDININDEX$32);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOADABLE$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LOADABLE$34);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOADABLE$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(LOADABLE$34);
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
                return get_store().find_attribute_user(LOADABLE$34) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOADABLE$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOADABLE$34);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOADABLE$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LOADABLE$34);
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
                get_store().remove_attribute(LOADABLE$34);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$36);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$36);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$36);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(NAME$36);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "nonEffDated" attribute
         */
        public boolean getNonEffDated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NONEFFDATED$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NONEFFDATED$38);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "nonEffDated" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetNonEffDated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NONEFFDATED$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(NONEFFDATED$38);
                }
                return target;
            }
        }
        
        /**
         * True if has "nonEffDated" attribute
         */
        public boolean isSetNonEffDated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NONEFFDATED$38) != null;
            }
        }
        
        /**
         * Sets the "nonEffDated" attribute
         */
        public void setNonEffDated(boolean nonEffDated)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NONEFFDATED$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NONEFFDATED$38);
                }
                target.setBooleanValue(nonEffDated);
            }
        }
        
        /**
         * Sets (as xml) the "nonEffDated" attribute
         */
        public void xsetNonEffDated(org.apache.xmlbeans.XmlBoolean nonEffDated)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NONEFFDATED$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NONEFFDATED$38);
                }
                target.set(nonEffDated);
            }
        }
        
        /**
         * Unsets the "nonEffDated" attribute
         */
        public void unsetNonEffDated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NONEFFDATED$38);
            }
        }
        
        /**
         * Gets the "nullok" attribute
         */
        public boolean getNullok()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLOK$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NULLOK$40);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "nullok" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetNullok()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NULLOK$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(NULLOK$40);
                }
                return target;
            }
        }
        
        /**
         * True if has "nullok" attribute
         */
        public boolean isSetNullok()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NULLOK$40) != null;
            }
        }
        
        /**
         * Sets the "nullok" attribute
         */
        public void setNullok(boolean nullok)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLOK$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLOK$40);
                }
                target.setBooleanValue(nullok);
            }
        }
        
        /**
         * Sets (as xml) the "nullok" attribute
         */
        public void xsetNullok(org.apache.xmlbeans.XmlBoolean nullok)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NULLOK$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NULLOK$40);
                }
                target.set(nullok);
            }
        }
        
        /**
         * Unsets the "nullok" attribute
         */
        public void unsetNullok()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NULLOK$40);
            }
        }
        
        /**
         * Gets the "ondelete" attribute
         */
        public com.guidewire.datamodel.OnDelete.Enum getOndelete()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONDELETE$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ONDELETE$42);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.guidewire.datamodel.OnDelete.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "ondelete" attribute
         */
        public com.guidewire.datamodel.OnDelete xgetOndelete()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.OnDelete target = null;
                target = (com.guidewire.datamodel.OnDelete)get_store().find_attribute_user(ONDELETE$42);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.OnDelete)get_default_attribute_value(ONDELETE$42);
                }
                return target;
            }
        }
        
        /**
         * True if has "ondelete" attribute
         */
        public boolean isSetOndelete()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ONDELETE$42) != null;
            }
        }
        
        /**
         * Sets the "ondelete" attribute
         */
        public void setOndelete(com.guidewire.datamodel.OnDelete.Enum ondelete)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONDELETE$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONDELETE$42);
                }
                target.setEnumValue(ondelete);
            }
        }
        
        /**
         * Sets (as xml) the "ondelete" attribute
         */
        public void xsetOndelete(com.guidewire.datamodel.OnDelete ondelete)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.OnDelete target = null;
                target = (com.guidewire.datamodel.OnDelete)get_store().find_attribute_user(ONDELETE$42);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.OnDelete)get_store().add_attribute_user(ONDELETE$42);
                }
                target.set(ondelete);
            }
        }
        
        /**
         * Unsets the "ondelete" attribute
         */
        public void unsetOndelete()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ONDELETE$42);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OVERWRITTENINSTAGINGTABLE$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OVERWRITTENINSTAGINGTABLE$44);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OVERWRITTENINSTAGINGTABLE$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(OVERWRITTENINSTAGINGTABLE$44);
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
                return get_store().find_attribute_user(OVERWRITTENINSTAGINGTABLE$44) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OVERWRITTENINSTAGINGTABLE$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OVERWRITTENINSTAGINGTABLE$44);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OVERWRITTENINSTAGINGTABLE$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(OVERWRITTENINSTAGINGTABLE$44);
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
                get_store().remove_attribute(OVERWRITTENINSTAGINGTABLE$44);
            }
        }
        
        /**
         * Gets the "owner" attribute
         */
        public boolean getOwner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OWNER$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OWNER$46);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "owner" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetOwner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OWNER$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(OWNER$46);
                }
                return target;
            }
        }
        
        /**
         * True if has "owner" attribute
         */
        public boolean isSetOwner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OWNER$46) != null;
            }
        }
        
        /**
         * Sets the "owner" attribute
         */
        public void setOwner(boolean owner)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OWNER$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OWNER$46);
                }
                target.setBooleanValue(owner);
            }
        }
        
        /**
         * Sets (as xml) the "owner" attribute
         */
        public void xsetOwner(org.apache.xmlbeans.XmlBoolean owner)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OWNER$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(OWNER$46);
                }
                target.set(owner);
            }
        }
        
        /**
         * Unsets the "owner" attribute
         */
        public void unsetOwner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OWNER$46);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETTERSCRIPTABILITY$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SETTERSCRIPTABILITY$48);
                }
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
                target = (com.guidewire.datamodel.ScriptabilityType)get_store().find_attribute_user(SETTERSCRIPTABILITY$48);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.ScriptabilityType)get_default_attribute_value(SETTERSCRIPTABILITY$48);
                }
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
                return get_store().find_attribute_user(SETTERSCRIPTABILITY$48) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETTERSCRIPTABILITY$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SETTERSCRIPTABILITY$48);
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
                target = (com.guidewire.datamodel.ScriptabilityType)get_store().find_attribute_user(SETTERSCRIPTABILITY$48);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.ScriptabilityType)get_store().add_attribute_user(SETTERSCRIPTABILITY$48);
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
                get_store().remove_attribute(SETTERSCRIPTABILITY$48);
            }
        }
        
        /**
         * Gets the "soapnullok" attribute
         */
        public boolean getSoapnullok()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOAPNULLOK$50);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "soapnullok" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetSoapnullok()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SOAPNULLOK$50);
                return target;
            }
        }
        
        /**
         * True if has "soapnullok" attribute
         */
        public boolean isSetSoapnullok()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SOAPNULLOK$50) != null;
            }
        }
        
        /**
         * Sets the "soapnullok" attribute
         */
        public void setSoapnullok(boolean soapnullok)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOAPNULLOK$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOAPNULLOK$50);
                }
                target.setBooleanValue(soapnullok);
            }
        }
        
        /**
         * Sets (as xml) the "soapnullok" attribute
         */
        public void xsetSoapnullok(org.apache.xmlbeans.XmlBoolean soapnullok)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SOAPNULLOK$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SOAPNULLOK$50);
                }
                target.set(soapnullok);
            }
        }
        
        /**
         * Unsets the "soapnullok" attribute
         */
        public void unsetSoapnullok()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SOAPNULLOK$50);
            }
        }
        
        /**
         * Gets the "triggersValidation" attribute
         */
        public boolean getTriggersValidation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRIGGERSVALIDATION$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TRIGGERSVALIDATION$52);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "triggersValidation" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetTriggersValidation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRIGGERSVALIDATION$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(TRIGGERSVALIDATION$52);
                }
                return target;
            }
        }
        
        /**
         * True if has "triggersValidation" attribute
         */
        public boolean isSetTriggersValidation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TRIGGERSVALIDATION$52) != null;
            }
        }
        
        /**
         * Sets the "triggersValidation" attribute
         */
        public void setTriggersValidation(boolean triggersValidation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRIGGERSVALIDATION$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRIGGERSVALIDATION$52);
                }
                target.setBooleanValue(triggersValidation);
            }
        }
        
        /**
         * Sets (as xml) the "triggersValidation" attribute
         */
        public void xsetTriggersValidation(org.apache.xmlbeans.XmlBoolean triggersValidation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRIGGERSVALIDATION$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TRIGGERSVALIDATION$52);
                }
                target.set(triggersValidation);
            }
        }
        
        /**
         * Unsets the "triggersValidation" attribute
         */
        public void unsetTriggersValidation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TRIGGERSVALIDATION$52);
            }
        }
    }
}
