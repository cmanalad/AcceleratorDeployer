/*
 * An XML document type.
 * Localname: typefilter
 * Namespace: http://guidewire.com/typelists
 * Java type: com.guidewire.typelists.TypefilterDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.typelists.impl;
/**
 * A document containing one typefilter(@http://guidewire.com/typelists) element.
 *
 * This is a complex type.
 */
public class TypefilterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.typelists.TypefilterDocument
{
    private static final long serialVersionUID = 1L;
    
    public TypefilterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPEFILTER$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/typelists", "typefilter");
    
    
    /**
     * Gets the "typefilter" element
     */
    public com.guidewire.typelists.TypefilterDocument.Typefilter getTypefilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.typelists.TypefilterDocument.Typefilter target = null;
            target = (com.guidewire.typelists.TypefilterDocument.Typefilter)get_store().find_element_user(TYPEFILTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "typefilter" element
     */
    public void setTypefilter(com.guidewire.typelists.TypefilterDocument.Typefilter typefilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.typelists.TypefilterDocument.Typefilter target = null;
            target = (com.guidewire.typelists.TypefilterDocument.Typefilter)get_store().find_element_user(TYPEFILTER$0, 0);
            if (target == null)
            {
                target = (com.guidewire.typelists.TypefilterDocument.Typefilter)get_store().add_element_user(TYPEFILTER$0);
            }
            target.set(typefilter);
        }
    }
    
    /**
     * Appends and returns a new empty "typefilter" element
     */
    public com.guidewire.typelists.TypefilterDocument.Typefilter addNewTypefilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.typelists.TypefilterDocument.Typefilter target = null;
            target = (com.guidewire.typelists.TypefilterDocument.Typefilter)get_store().add_element_user(TYPEFILTER$0);
            return target;
        }
    }
    /**
     * An XML typefilter(@http://guidewire.com/typelists).
     *
     * This is a complex type.
     */
    public static class TypefilterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.typelists.TypefilterDocument.Typefilter
    {
        private static final long serialVersionUID = 1L;
        
        public TypefilterImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CATEGORY$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/typelists", "category");
        private static final javax.xml.namespace.QName EXCLUDE$2 = 
            new javax.xml.namespace.QName("http://guidewire.com/typelists", "exclude");
        private static final javax.xml.namespace.QName INCLUDE$4 = 
            new javax.xml.namespace.QName("http://guidewire.com/typelists", "include");
        private static final javax.xml.namespace.QName DESC$6 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName INCLUDEALL$8 = 
            new javax.xml.namespace.QName("", "includeAll");
        private static final javax.xml.namespace.QName NAME$10 = 
            new javax.xml.namespace.QName("", "name");
        
        
        /**
         * Gets array of all "category" elements
         */
        public com.guidewire.typelists.CategoryDocument.Category[] getCategoryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CATEGORY$0, targetList);
                com.guidewire.typelists.CategoryDocument.Category[] result = new com.guidewire.typelists.CategoryDocument.Category[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "category" element
         */
        public com.guidewire.typelists.CategoryDocument.Category getCategoryArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.typelists.CategoryDocument.Category target = null;
                target = (com.guidewire.typelists.CategoryDocument.Category)get_store().find_element_user(CATEGORY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "category" element
         */
        public int sizeOfCategoryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CATEGORY$0);
            }
        }
        
        /**
         * Sets array of all "category" element
         */
        public void setCategoryArray(com.guidewire.typelists.CategoryDocument.Category[] categoryArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(categoryArray, CATEGORY$0);
            }
        }
        
        /**
         * Sets ith "category" element
         */
        public void setCategoryArray(int i, com.guidewire.typelists.CategoryDocument.Category category)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.typelists.CategoryDocument.Category target = null;
                target = (com.guidewire.typelists.CategoryDocument.Category)get_store().find_element_user(CATEGORY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(category);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "category" element
         */
        public com.guidewire.typelists.CategoryDocument.Category insertNewCategory(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.typelists.CategoryDocument.Category target = null;
                target = (com.guidewire.typelists.CategoryDocument.Category)get_store().insert_element_user(CATEGORY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "category" element
         */
        public com.guidewire.typelists.CategoryDocument.Category addNewCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.typelists.CategoryDocument.Category target = null;
                target = (com.guidewire.typelists.CategoryDocument.Category)get_store().add_element_user(CATEGORY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "category" element
         */
        public void removeCategory(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CATEGORY$0, i);
            }
        }
        
        /**
         * Gets array of all "exclude" elements
         */
        public com.guidewire.typelists.ExcludeDocument.Exclude[] getExcludeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EXCLUDE$2, targetList);
                com.guidewire.typelists.ExcludeDocument.Exclude[] result = new com.guidewire.typelists.ExcludeDocument.Exclude[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "exclude" element
         */
        public com.guidewire.typelists.ExcludeDocument.Exclude getExcludeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.typelists.ExcludeDocument.Exclude target = null;
                target = (com.guidewire.typelists.ExcludeDocument.Exclude)get_store().find_element_user(EXCLUDE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "exclude" element
         */
        public int sizeOfExcludeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXCLUDE$2);
            }
        }
        
        /**
         * Sets array of all "exclude" element
         */
        public void setExcludeArray(com.guidewire.typelists.ExcludeDocument.Exclude[] excludeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(excludeArray, EXCLUDE$2);
            }
        }
        
        /**
         * Sets ith "exclude" element
         */
        public void setExcludeArray(int i, com.guidewire.typelists.ExcludeDocument.Exclude exclude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.typelists.ExcludeDocument.Exclude target = null;
                target = (com.guidewire.typelists.ExcludeDocument.Exclude)get_store().find_element_user(EXCLUDE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(exclude);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "exclude" element
         */
        public com.guidewire.typelists.ExcludeDocument.Exclude insertNewExclude(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.typelists.ExcludeDocument.Exclude target = null;
                target = (com.guidewire.typelists.ExcludeDocument.Exclude)get_store().insert_element_user(EXCLUDE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "exclude" element
         */
        public com.guidewire.typelists.ExcludeDocument.Exclude addNewExclude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.typelists.ExcludeDocument.Exclude target = null;
                target = (com.guidewire.typelists.ExcludeDocument.Exclude)get_store().add_element_user(EXCLUDE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "exclude" element
         */
        public void removeExclude(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXCLUDE$2, i);
            }
        }
        
        /**
         * Gets array of all "include" elements
         */
        public com.guidewire.typelists.IncludeDocument.Include[] getIncludeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INCLUDE$4, targetList);
                com.guidewire.typelists.IncludeDocument.Include[] result = new com.guidewire.typelists.IncludeDocument.Include[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "include" element
         */
        public com.guidewire.typelists.IncludeDocument.Include getIncludeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.typelists.IncludeDocument.Include target = null;
                target = (com.guidewire.typelists.IncludeDocument.Include)get_store().find_element_user(INCLUDE$4, i);
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
                return get_store().count_elements(INCLUDE$4);
            }
        }
        
        /**
         * Sets array of all "include" element
         */
        public void setIncludeArray(com.guidewire.typelists.IncludeDocument.Include[] includeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(includeArray, INCLUDE$4);
            }
        }
        
        /**
         * Sets ith "include" element
         */
        public void setIncludeArray(int i, com.guidewire.typelists.IncludeDocument.Include include)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.typelists.IncludeDocument.Include target = null;
                target = (com.guidewire.typelists.IncludeDocument.Include)get_store().find_element_user(INCLUDE$4, i);
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
        public com.guidewire.typelists.IncludeDocument.Include insertNewInclude(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.typelists.IncludeDocument.Include target = null;
                target = (com.guidewire.typelists.IncludeDocument.Include)get_store().insert_element_user(INCLUDE$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "include" element
         */
        public com.guidewire.typelists.IncludeDocument.Include addNewInclude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.typelists.IncludeDocument.Include target = null;
                target = (com.guidewire.typelists.IncludeDocument.Include)get_store().add_element_user(INCLUDE$4);
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
                get_store().remove_element(INCLUDE$4, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$6);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$6);
                }
                target.set(desc);
            }
        }
        
        /**
         * Gets the "includeAll" attribute
         */
        public boolean getIncludeAll()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUDEALL$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INCLUDEALL$8);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "includeAll" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetIncludeAll()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INCLUDEALL$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(INCLUDEALL$8);
                }
                return target;
            }
        }
        
        /**
         * True if has "includeAll" attribute
         */
        public boolean isSetIncludeAll()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INCLUDEALL$8) != null;
            }
        }
        
        /**
         * Sets the "includeAll" attribute
         */
        public void setIncludeAll(boolean includeAll)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUDEALL$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INCLUDEALL$8);
                }
                target.setBooleanValue(includeAll);
            }
        }
        
        /**
         * Sets (as xml) the "includeAll" attribute
         */
        public void xsetIncludeAll(org.apache.xmlbeans.XmlBoolean includeAll)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INCLUDEALL$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INCLUDEALL$8);
                }
                target.set(includeAll);
            }
        }
        
        /**
         * Unsets the "includeAll" attribute
         */
        public void unsetIncludeAll()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INCLUDEALL$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$10);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$10);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(NAME$10);
                }
                target.set(name);
            }
        }
    }
}
