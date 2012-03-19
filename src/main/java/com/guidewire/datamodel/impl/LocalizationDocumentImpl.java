/*
 * An XML document type.
 * Localname: localization
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.LocalizationDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one localization(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class LocalizationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.LocalizationDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocalizationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCALIZATION$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "localization");
    
    
    /**
     * Gets the "localization" element
     */
    public com.guidewire.datamodel.LocalizationDocument.Localization getLocalization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.LocalizationDocument.Localization target = null;
            target = (com.guidewire.datamodel.LocalizationDocument.Localization)get_store().find_element_user(LOCALIZATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "localization" element
     */
    public void setLocalization(com.guidewire.datamodel.LocalizationDocument.Localization localization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.LocalizationDocument.Localization target = null;
            target = (com.guidewire.datamodel.LocalizationDocument.Localization)get_store().find_element_user(LOCALIZATION$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.LocalizationDocument.Localization)get_store().add_element_user(LOCALIZATION$0);
            }
            target.set(localization);
        }
    }
    
    /**
     * Appends and returns a new empty "localization" element
     */
    public com.guidewire.datamodel.LocalizationDocument.Localization addNewLocalization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.LocalizationDocument.Localization target = null;
            target = (com.guidewire.datamodel.LocalizationDocument.Localization)get_store().add_element_user(LOCALIZATION$0);
            return target;
        }
    }
    /**
     * An XML localization(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class LocalizationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.LocalizationDocument.Localization
    {
        private static final long serialVersionUID = 1L;
        
        public LocalizationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IMPLEMENTSENTITY$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "implementsEntity");
        private static final javax.xml.namespace.QName TABLENAME$2 = 
            new javax.xml.namespace.QName("", "tableName");
        
        
        /**
         * Gets array of all "implementsEntity" elements
         */
        public com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity[] getImplementsEntityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IMPLEMENTSENTITY$0, targetList);
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
                target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().find_element_user(IMPLEMENTSENTITY$0, i);
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
                return get_store().count_elements(IMPLEMENTSENTITY$0);
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
                arraySetterHelper(implementsEntityArray, IMPLEMENTSENTITY$0);
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
                target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().find_element_user(IMPLEMENTSENTITY$0, i);
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
                target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().insert_element_user(IMPLEMENTSENTITY$0, i);
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
                target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().add_element_user(IMPLEMENTSENTITY$0);
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
                get_store().remove_element(IMPLEMENTSENTITY$0, i);
            }
        }
        
        /**
         * Gets the "tableName" attribute
         */
        public java.lang.String getTableName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABLENAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "tableName" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetTableName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(TABLENAME$2);
                return target;
            }
        }
        
        /**
         * Sets the "tableName" attribute
         */
        public void setTableName(java.lang.String tableName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABLENAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TABLENAME$2);
                }
                target.setStringValue(tableName);
            }
        }
        
        /**
         * Sets (as xml) the "tableName" attribute
         */
        public void xsetTableName(org.apache.xmlbeans.XmlNMTOKEN tableName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(TABLENAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(TABLENAME$2);
                }
                target.set(tableName);
            }
        }
    }
}
