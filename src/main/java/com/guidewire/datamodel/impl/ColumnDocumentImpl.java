/*
 * An XML document type.
 * Localname: column
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.ColumnDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one column(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class ColumnDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ColumnDocument
{
    private static final long serialVersionUID = 1L;
    
    public ColumnDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLUMN$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "column");
    
    
    /**
     * Gets the "column" element
     */
    public com.guidewire.datamodel.ColumnDocument.Column getColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ColumnDocument.Column target = null;
            target = (com.guidewire.datamodel.ColumnDocument.Column)get_store().find_element_user(COLUMN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "column" element
     */
    public void setColumn(com.guidewire.datamodel.ColumnDocument.Column column)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ColumnDocument.Column target = null;
            target = (com.guidewire.datamodel.ColumnDocument.Column)get_store().find_element_user(COLUMN$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.ColumnDocument.Column)get_store().add_element_user(COLUMN$0);
            }
            target.set(column);
        }
    }
    
    /**
     * Appends and returns a new empty "column" element
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
     * An XML column(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class ColumnImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ColumnDocument.Column
    {
        private static final long serialVersionUID = 1L;
        
        public ColumnImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COLUMNPARAM$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "columnParam");
        private static final javax.xml.namespace.QName FULLDESCRIPTION$2 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "fulldescription");
        private static final javax.xml.namespace.QName LOCALIZATION$4 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "localization");
        private static final javax.xml.namespace.QName AUTOINCREMENT$6 = 
            new javax.xml.namespace.QName("", "autoincrement");
        private static final javax.xml.namespace.QName COLUMNNAME$8 = 
            new javax.xml.namespace.QName("", "columnName");
        private static final javax.xml.namespace.QName CREATEHISTOGRAM$10 = 
            new javax.xml.namespace.QName("", "createhistogram");
        private static final javax.xml.namespace.QName DEFAULT$12 = 
            new javax.xml.namespace.QName("", "default");
        private static final javax.xml.namespace.QName DEPRECATED$14 = 
            new javax.xml.namespace.QName("", "deprecated");
        private static final javax.xml.namespace.QName DESC$16 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName EXPORTABLE$18 = 
            new javax.xml.namespace.QName("", "exportable");
        private static final javax.xml.namespace.QName GENERATECODE$20 = 
            new javax.xml.namespace.QName("", "generateCode");
        private static final javax.xml.namespace.QName GETTERSCRIPTABILITY$22 = 
            new javax.xml.namespace.QName("", "getterScriptability");
        private static final javax.xml.namespace.QName IGNOREFOREVENTS$24 = 
            new javax.xml.namespace.QName("", "ignoreforevents");
        private static final javax.xml.namespace.QName LOADABLE$26 = 
            new javax.xml.namespace.QName("", "loadable");
        private static final javax.xml.namespace.QName NAME$28 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName NULLOK$30 = 
            new javax.xml.namespace.QName("", "nullok");
        private static final javax.xml.namespace.QName OVERWRITTENINSTAGINGTABLE$32 = 
            new javax.xml.namespace.QName("", "overwrittenInStagingTable");
        private static final javax.xml.namespace.QName SCALABLE$34 = 
            new javax.xml.namespace.QName("", "scalable");
        private static final javax.xml.namespace.QName SETTERSCRIPTABILITY$36 = 
            new javax.xml.namespace.QName("", "setterScriptability");
        private static final javax.xml.namespace.QName SOAPNULLOK$38 = 
            new javax.xml.namespace.QName("", "soapnullok");
        private static final javax.xml.namespace.QName SUPPORTSLINGUISTICSEARCH$40 = 
            new javax.xml.namespace.QName("", "supportsLinguisticSearch");
        private static final javax.xml.namespace.QName TYPE$42 = 
            new javax.xml.namespace.QName("", "type");
        
        
        /**
         * Gets array of all "columnParam" elements
         */
        public com.guidewire.datamodel.ColumnParamDocument.ColumnParam[] getColumnParamArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COLUMNPARAM$0, targetList);
                com.guidewire.datamodel.ColumnParamDocument.ColumnParam[] result = new com.guidewire.datamodel.ColumnParamDocument.ColumnParam[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "columnParam" element
         */
        public com.guidewire.datamodel.ColumnParamDocument.ColumnParam getColumnParamArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ColumnParamDocument.ColumnParam target = null;
                target = (com.guidewire.datamodel.ColumnParamDocument.ColumnParam)get_store().find_element_user(COLUMNPARAM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "columnParam" element
         */
        public int sizeOfColumnParamArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COLUMNPARAM$0);
            }
        }
        
        /**
         * Sets array of all "columnParam" element
         */
        public void setColumnParamArray(com.guidewire.datamodel.ColumnParamDocument.ColumnParam[] columnParamArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(columnParamArray, COLUMNPARAM$0);
            }
        }
        
        /**
         * Sets ith "columnParam" element
         */
        public void setColumnParamArray(int i, com.guidewire.datamodel.ColumnParamDocument.ColumnParam columnParam)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ColumnParamDocument.ColumnParam target = null;
                target = (com.guidewire.datamodel.ColumnParamDocument.ColumnParam)get_store().find_element_user(COLUMNPARAM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(columnParam);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "columnParam" element
         */
        public com.guidewire.datamodel.ColumnParamDocument.ColumnParam insertNewColumnParam(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ColumnParamDocument.ColumnParam target = null;
                target = (com.guidewire.datamodel.ColumnParamDocument.ColumnParam)get_store().insert_element_user(COLUMNPARAM$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "columnParam" element
         */
        public com.guidewire.datamodel.ColumnParamDocument.ColumnParam addNewColumnParam()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ColumnParamDocument.ColumnParam target = null;
                target = (com.guidewire.datamodel.ColumnParamDocument.ColumnParam)get_store().add_element_user(COLUMNPARAM$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "columnParam" element
         */
        public void removeColumnParam(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COLUMNPARAM$0, i);
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
                get_store().find_all_element_users(FULLDESCRIPTION$2, targetList);
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
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().find_element_user(FULLDESCRIPTION$2, i);
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
                return get_store().count_elements(FULLDESCRIPTION$2);
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
                arraySetterHelper(fulldescriptionArray, FULLDESCRIPTION$2);
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
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().find_element_user(FULLDESCRIPTION$2, i);
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
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().insert_element_user(FULLDESCRIPTION$2, i);
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
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().add_element_user(FULLDESCRIPTION$2);
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
                get_store().remove_element(FULLDESCRIPTION$2, i);
            }
        }
        
        /**
         * Gets array of all "localization" elements
         */
        public com.guidewire.datamodel.LocalizationDocument.Localization[] getLocalizationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LOCALIZATION$4, targetList);
                com.guidewire.datamodel.LocalizationDocument.Localization[] result = new com.guidewire.datamodel.LocalizationDocument.Localization[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "localization" element
         */
        public com.guidewire.datamodel.LocalizationDocument.Localization getLocalizationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.LocalizationDocument.Localization target = null;
                target = (com.guidewire.datamodel.LocalizationDocument.Localization)get_store().find_element_user(LOCALIZATION$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "localization" element
         */
        public int sizeOfLocalizationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOCALIZATION$4);
            }
        }
        
        /**
         * Sets array of all "localization" element
         */
        public void setLocalizationArray(com.guidewire.datamodel.LocalizationDocument.Localization[] localizationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(localizationArray, LOCALIZATION$4);
            }
        }
        
        /**
         * Sets ith "localization" element
         */
        public void setLocalizationArray(int i, com.guidewire.datamodel.LocalizationDocument.Localization localization)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.LocalizationDocument.Localization target = null;
                target = (com.guidewire.datamodel.LocalizationDocument.Localization)get_store().find_element_user(LOCALIZATION$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(localization);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "localization" element
         */
        public com.guidewire.datamodel.LocalizationDocument.Localization insertNewLocalization(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.LocalizationDocument.Localization target = null;
                target = (com.guidewire.datamodel.LocalizationDocument.Localization)get_store().insert_element_user(LOCALIZATION$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "localization" element
         */
        public com.guidewire.datamodel.LocalizationDocument.Localization addNewLocalization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.LocalizationDocument.Localization target = null;
                target = (com.guidewire.datamodel.LocalizationDocument.Localization)get_store().add_element_user(LOCALIZATION$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "localization" element
         */
        public void removeLocalization(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOCALIZATION$4, i);
            }
        }
        
        /**
         * Gets the "autoincrement" attribute
         */
        public java.lang.String getAutoincrement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOINCREMENT$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "autoincrement" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetAutoincrement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(AUTOINCREMENT$6);
                return target;
            }
        }
        
        /**
         * True if has "autoincrement" attribute
         */
        public boolean isSetAutoincrement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AUTOINCREMENT$6) != null;
            }
        }
        
        /**
         * Sets the "autoincrement" attribute
         */
        public void setAutoincrement(java.lang.String autoincrement)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOINCREMENT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOINCREMENT$6);
                }
                target.setStringValue(autoincrement);
            }
        }
        
        /**
         * Sets (as xml) the "autoincrement" attribute
         */
        public void xsetAutoincrement(org.apache.xmlbeans.XmlNMTOKEN autoincrement)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(AUTOINCREMENT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(AUTOINCREMENT$6);
                }
                target.set(autoincrement);
            }
        }
        
        /**
         * Unsets the "autoincrement" attribute
         */
        public void unsetAutoincrement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AUTOINCREMENT$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLUMNNAME$8);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(COLUMNNAME$8);
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
                return get_store().find_attribute_user(COLUMNNAME$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLUMNNAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLUMNNAME$8);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(COLUMNNAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(COLUMNNAME$8);
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
                get_store().remove_attribute(COLUMNNAME$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEHISTOGRAM$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CREATEHISTOGRAM$10);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CREATEHISTOGRAM$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CREATEHISTOGRAM$10);
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
                return get_store().find_attribute_user(CREATEHISTOGRAM$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEHISTOGRAM$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CREATEHISTOGRAM$10);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CREATEHISTOGRAM$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CREATEHISTOGRAM$10);
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
                get_store().remove_attribute(CREATEHISTOGRAM$10);
            }
        }
        
        /**
         * Gets the "default" attribute
         */
        public java.lang.String getDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULT$12);
                return target;
            }
        }
        
        /**
         * True if has "default" attribute
         */
        public boolean isSetDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULT$12) != null;
            }
        }
        
        /**
         * Sets the "default" attribute
         */
        public void setDefault(java.lang.String xdefault)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULT$12);
                }
                target.setStringValue(xdefault);
            }
        }
        
        /**
         * Sets (as xml) the "default" attribute
         */
        public void xsetDefault(org.apache.xmlbeans.XmlString xdefault)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULT$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULT$12);
                }
                target.set(xdefault);
            }
        }
        
        /**
         * Unsets the "default" attribute
         */
        public void unsetDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULT$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPRECATED$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DEPRECATED$14);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEPRECATED$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DEPRECATED$14);
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
                return get_store().find_attribute_user(DEPRECATED$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPRECATED$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEPRECATED$14);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEPRECATED$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DEPRECATED$14);
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
                get_store().remove_attribute(DEPRECATED$14);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$16);
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
                return get_store().find_attribute_user(DESC$16) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$16);
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
                get_store().remove_attribute(DESC$16);
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
         * Gets the "generateCode" attribute
         */
        public boolean getGenerateCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GENERATECODE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GENERATECODE$20);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GENERATECODE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(GENERATECODE$20);
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
                return get_store().find_attribute_user(GENERATECODE$20) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GENERATECODE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GENERATECODE$20);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GENERATECODE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(GENERATECODE$20);
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
                get_store().remove_attribute(GENERATECODE$20);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GETTERSCRIPTABILITY$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GETTERSCRIPTABILITY$22);
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
                target = (com.guidewire.datamodel.ScriptabilityType)get_store().find_attribute_user(GETTERSCRIPTABILITY$22);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.ScriptabilityType)get_default_attribute_value(GETTERSCRIPTABILITY$22);
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
                return get_store().find_attribute_user(GETTERSCRIPTABILITY$22) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GETTERSCRIPTABILITY$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GETTERSCRIPTABILITY$22);
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
                target = (com.guidewire.datamodel.ScriptabilityType)get_store().find_attribute_user(GETTERSCRIPTABILITY$22);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.ScriptabilityType)get_store().add_attribute_user(GETTERSCRIPTABILITY$22);
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
                get_store().remove_attribute(GETTERSCRIPTABILITY$22);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IGNOREFOREVENTS$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(IGNOREFOREVENTS$24);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(IGNOREFOREVENTS$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(IGNOREFOREVENTS$24);
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
                return get_store().find_attribute_user(IGNOREFOREVENTS$24) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IGNOREFOREVENTS$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IGNOREFOREVENTS$24);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(IGNOREFOREVENTS$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(IGNOREFOREVENTS$24);
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
                get_store().remove_attribute(IGNOREFOREVENTS$24);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOADABLE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LOADABLE$26);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOADABLE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(LOADABLE$26);
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
                return get_store().find_attribute_user(LOADABLE$26) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOADABLE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOADABLE$26);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOADABLE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LOADABLE$26);
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
                get_store().remove_attribute(LOADABLE$26);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$28);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$28);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$28);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(NAME$28);
                }
                target.set(name);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLOK$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NULLOK$30);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NULLOK$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(NULLOK$30);
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
                return get_store().find_attribute_user(NULLOK$30) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLOK$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLOK$30);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NULLOK$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NULLOK$30);
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
                get_store().remove_attribute(NULLOK$30);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OVERWRITTENINSTAGINGTABLE$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OVERWRITTENINSTAGINGTABLE$32);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OVERWRITTENINSTAGINGTABLE$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(OVERWRITTENINSTAGINGTABLE$32);
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
                return get_store().find_attribute_user(OVERWRITTENINSTAGINGTABLE$32) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OVERWRITTENINSTAGINGTABLE$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OVERWRITTENINSTAGINGTABLE$32);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OVERWRITTENINSTAGINGTABLE$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(OVERWRITTENINSTAGINGTABLE$32);
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
                get_store().remove_attribute(OVERWRITTENINSTAGINGTABLE$32);
            }
        }
        
        /**
         * Gets the "scalable" attribute
         */
        public boolean getScalable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCALABLE$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SCALABLE$34);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "scalable" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetScalable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SCALABLE$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SCALABLE$34);
                }
                return target;
            }
        }
        
        /**
         * True if has "scalable" attribute
         */
        public boolean isSetScalable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SCALABLE$34) != null;
            }
        }
        
        /**
         * Sets the "scalable" attribute
         */
        public void setScalable(boolean scalable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCALABLE$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCALABLE$34);
                }
                target.setBooleanValue(scalable);
            }
        }
        
        /**
         * Sets (as xml) the "scalable" attribute
         */
        public void xsetScalable(org.apache.xmlbeans.XmlBoolean scalable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SCALABLE$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SCALABLE$34);
                }
                target.set(scalable);
            }
        }
        
        /**
         * Unsets the "scalable" attribute
         */
        public void unsetScalable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SCALABLE$34);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETTERSCRIPTABILITY$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SETTERSCRIPTABILITY$36);
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
                target = (com.guidewire.datamodel.ScriptabilityType)get_store().find_attribute_user(SETTERSCRIPTABILITY$36);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.ScriptabilityType)get_default_attribute_value(SETTERSCRIPTABILITY$36);
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
                return get_store().find_attribute_user(SETTERSCRIPTABILITY$36) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETTERSCRIPTABILITY$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SETTERSCRIPTABILITY$36);
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
                target = (com.guidewire.datamodel.ScriptabilityType)get_store().find_attribute_user(SETTERSCRIPTABILITY$36);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.ScriptabilityType)get_store().add_attribute_user(SETTERSCRIPTABILITY$36);
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
                get_store().remove_attribute(SETTERSCRIPTABILITY$36);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOAPNULLOK$38);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SOAPNULLOK$38);
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
                return get_store().find_attribute_user(SOAPNULLOK$38) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOAPNULLOK$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOAPNULLOK$38);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SOAPNULLOK$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SOAPNULLOK$38);
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
                get_store().remove_attribute(SOAPNULLOK$38);
            }
        }
        
        /**
         * Gets the "supportsLinguisticSearch" attribute
         */
        public boolean getSupportsLinguisticSearch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPPORTSLINGUISTICSEARCH$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SUPPORTSLINGUISTICSEARCH$40);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "supportsLinguisticSearch" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetSupportsLinguisticSearch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUPPORTSLINGUISTICSEARCH$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SUPPORTSLINGUISTICSEARCH$40);
                }
                return target;
            }
        }
        
        /**
         * True if has "supportsLinguisticSearch" attribute
         */
        public boolean isSetSupportsLinguisticSearch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SUPPORTSLINGUISTICSEARCH$40) != null;
            }
        }
        
        /**
         * Sets the "supportsLinguisticSearch" attribute
         */
        public void setSupportsLinguisticSearch(boolean supportsLinguisticSearch)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPPORTSLINGUISTICSEARCH$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUPPORTSLINGUISTICSEARCH$40);
                }
                target.setBooleanValue(supportsLinguisticSearch);
            }
        }
        
        /**
         * Sets (as xml) the "supportsLinguisticSearch" attribute
         */
        public void xsetSupportsLinguisticSearch(org.apache.xmlbeans.XmlBoolean supportsLinguisticSearch)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUPPORTSLINGUISTICSEARCH$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SUPPORTSLINGUISTICSEARCH$40);
                }
                target.set(supportsLinguisticSearch);
            }
        }
        
        /**
         * Unsets the "supportsLinguisticSearch" attribute
         */
        public void unsetSupportsLinguisticSearch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SUPPORTSLINGUISTICSEARCH$40);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$42);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$42);
                return target;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$42);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(org.apache.xmlbeans.XmlString type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$42);
                }
                target.set(type);
            }
        }
    }
}
