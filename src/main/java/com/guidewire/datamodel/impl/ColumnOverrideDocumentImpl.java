/*
 * An XML document type.
 * Localname: column-override
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.ColumnOverrideDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one column-override(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class ColumnOverrideDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ColumnOverrideDocument
{
    private static final long serialVersionUID = 1L;
    
    public ColumnOverrideDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLUMNOVERRIDE$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "column-override");
    
    
    /**
     * Gets the "column-override" element
     */
    public com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride getColumnOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride target = null;
            target = (com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride)get_store().find_element_user(COLUMNOVERRIDE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "column-override" element
     */
    public void setColumnOverride(com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride columnOverride)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride target = null;
            target = (com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride)get_store().find_element_user(COLUMNOVERRIDE$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride)get_store().add_element_user(COLUMNOVERRIDE$0);
            }
            target.set(columnOverride);
        }
    }
    
    /**
     * Appends and returns a new empty "column-override" element
     */
    public com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride addNewColumnOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride target = null;
            target = (com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride)get_store().add_element_user(COLUMNOVERRIDE$0);
            return target;
        }
    }
    /**
     * An XML column-override(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class ColumnOverrideImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride
    {
        private static final long serialVersionUID = 1L;
        
        public ColumnOverrideImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COLUMNPARAM$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "columnParam");
        private static final javax.xml.namespace.QName LOCALIZATION$2 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "localization");
        private static final javax.xml.namespace.QName CREATEHISTOGRAM$4 = 
            new javax.xml.namespace.QName("", "createhistogram");
        private static final javax.xml.namespace.QName DEFAULT$6 = 
            new javax.xml.namespace.QName("", "default");
        private static final javax.xml.namespace.QName NAME$8 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName NULLOK$10 = 
            new javax.xml.namespace.QName("", "nullok");
        private static final javax.xml.namespace.QName SUPPORTSLINGUISTICSEARCH$12 = 
            new javax.xml.namespace.QName("", "supportsLinguisticSearch");
        private static final javax.xml.namespace.QName TYPE$14 = 
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
         * Gets array of all "localization" elements
         */
        public com.guidewire.datamodel.LocalizationDocument.Localization[] getLocalizationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LOCALIZATION$2, targetList);
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
                target = (com.guidewire.datamodel.LocalizationDocument.Localization)get_store().find_element_user(LOCALIZATION$2, i);
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
                return get_store().count_elements(LOCALIZATION$2);
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
                arraySetterHelper(localizationArray, LOCALIZATION$2);
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
                target = (com.guidewire.datamodel.LocalizationDocument.Localization)get_store().find_element_user(LOCALIZATION$2, i);
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
                target = (com.guidewire.datamodel.LocalizationDocument.Localization)get_store().insert_element_user(LOCALIZATION$2, i);
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
                target = (com.guidewire.datamodel.LocalizationDocument.Localization)get_store().add_element_user(LOCALIZATION$2);
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
                get_store().remove_element(LOCALIZATION$2, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEHISTOGRAM$4);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CREATEHISTOGRAM$4);
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
                return get_store().find_attribute_user(CREATEHISTOGRAM$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEHISTOGRAM$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CREATEHISTOGRAM$4);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CREATEHISTOGRAM$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CREATEHISTOGRAM$4);
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
                get_store().remove_attribute(CREATEHISTOGRAM$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULT$6);
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
                return get_store().find_attribute_user(DEFAULT$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULT$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULT$6);
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
                get_store().remove_attribute(DEFAULT$6);
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
        
        /**
         * Gets the "nullok" attribute
         */
        public boolean getNullok()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLOK$10);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NULLOK$10);
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
                return get_store().find_attribute_user(NULLOK$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLOK$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLOK$10);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NULLOK$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NULLOK$10);
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
                get_store().remove_attribute(NULLOK$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPPORTSLINGUISTICSEARCH$12);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUPPORTSLINGUISTICSEARCH$12);
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
                return get_store().find_attribute_user(SUPPORTSLINGUISTICSEARCH$12) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPPORTSLINGUISTICSEARCH$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUPPORTSLINGUISTICSEARCH$12);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUPPORTSLINGUISTICSEARCH$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SUPPORTSLINGUISTICSEARCH$12);
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
                get_store().remove_attribute(SUPPORTSLINGUISTICSEARCH$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$14);
                return target;
            }
        }
        
        /**
         * True if has "type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$14);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$14);
            }
        }
    }
}
