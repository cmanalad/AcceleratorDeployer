/*
 * An XML document type.
 * Localname: dependentkey
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.DependentkeyDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one dependentkey(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class DependentkeyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.DependentkeyDocument
{
    private static final long serialVersionUID = 1L;
    
    public DependentkeyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEPENDENTKEY$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "dependentkey");
    
    
    /**
     * Gets the "dependentkey" element
     */
    public com.guidewire.datamodel.DependentkeyDocument.Dependentkey getDependentkey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.DependentkeyDocument.Dependentkey target = null;
            target = (com.guidewire.datamodel.DependentkeyDocument.Dependentkey)get_store().find_element_user(DEPENDENTKEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dependentkey" element
     */
    public void setDependentkey(com.guidewire.datamodel.DependentkeyDocument.Dependentkey dependentkey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.DependentkeyDocument.Dependentkey target = null;
            target = (com.guidewire.datamodel.DependentkeyDocument.Dependentkey)get_store().find_element_user(DEPENDENTKEY$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.DependentkeyDocument.Dependentkey)get_store().add_element_user(DEPENDENTKEY$0);
            }
            target.set(dependentkey);
        }
    }
    
    /**
     * Appends and returns a new empty "dependentkey" element
     */
    public com.guidewire.datamodel.DependentkeyDocument.Dependentkey addNewDependentkey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.DependentkeyDocument.Dependentkey target = null;
            target = (com.guidewire.datamodel.DependentkeyDocument.Dependentkey)get_store().add_element_user(DEPENDENTKEY$0);
            return target;
        }
    }
    /**
     * An XML dependentkey(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class DependentkeyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.DependentkeyDocument.Dependentkey
    {
        private static final long serialVersionUID = 1L;
        
        public DependentkeyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCLUDE$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "include");
        private static final javax.xml.namespace.QName TYPEKEY$2 = 
            new javax.xml.namespace.QName("", "typekey");
        
        
        /**
         * Gets array of all "include" elements
         */
        public com.guidewire.datamodel.IncludeDocument.Include[] getIncludeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INCLUDE$0, targetList);
                com.guidewire.datamodel.IncludeDocument.Include[] result = new com.guidewire.datamodel.IncludeDocument.Include[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "include" element
         */
        public com.guidewire.datamodel.IncludeDocument.Include getIncludeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.IncludeDocument.Include target = null;
                target = (com.guidewire.datamodel.IncludeDocument.Include)get_store().find_element_user(INCLUDE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "include" element
         */
        public int sizeOfIncludeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INCLUDE$0);
            }
        }
        
        /**
         * Sets array of all "include" element
         */
        public void setIncludeArray(com.guidewire.datamodel.IncludeDocument.Include[] includeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(includeArray, INCLUDE$0);
            }
        }
        
        /**
         * Sets ith "include" element
         */
        public void setIncludeArray(int i, com.guidewire.datamodel.IncludeDocument.Include include)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.IncludeDocument.Include target = null;
                target = (com.guidewire.datamodel.IncludeDocument.Include)get_store().find_element_user(INCLUDE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(include);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "include" element
         */
        public com.guidewire.datamodel.IncludeDocument.Include insertNewInclude(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.IncludeDocument.Include target = null;
                target = (com.guidewire.datamodel.IncludeDocument.Include)get_store().insert_element_user(INCLUDE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "include" element
         */
        public com.guidewire.datamodel.IncludeDocument.Include addNewInclude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.IncludeDocument.Include target = null;
                target = (com.guidewire.datamodel.IncludeDocument.Include)get_store().add_element_user(INCLUDE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "include" element
         */
        public void removeInclude(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INCLUDE$0, i);
            }
        }
        
        /**
         * Gets the "typekey" attribute
         */
        public java.lang.String getTypekey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPEKEY$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "typekey" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTypekey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPEKEY$2);
                return target;
            }
        }
        
        /**
         * Sets the "typekey" attribute
         */
        public void setTypekey(java.lang.String typekey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPEKEY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPEKEY$2);
                }
                target.setStringValue(typekey);
            }
        }
        
        /**
         * Sets (as xml) the "typekey" attribute
         */
        public void xsetTypekey(org.apache.xmlbeans.XmlString typekey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPEKEY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPEKEY$2);
                }
                target.set(typekey);
            }
        }
    }
}
