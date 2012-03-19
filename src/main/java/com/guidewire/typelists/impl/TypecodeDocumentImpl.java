/*
 * An XML document type.
 * Localname: typecode
 * Namespace: http://guidewire.com/typelists
 * Java type: com.guidewire.typelists.TypecodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.typelists.impl;
/**
 * A document containing one typecode(@http://guidewire.com/typelists) element.
 *
 * This is a complex type.
 */
public class TypecodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.typelists.TypecodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public TypecodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPECODE$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/typelists", "typecode");
    
    
    /**
     * Gets the "typecode" element
     */
    public com.guidewire.typelists.TypecodeDocument.Typecode getTypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.typelists.TypecodeDocument.Typecode target = null;
            target = (com.guidewire.typelists.TypecodeDocument.Typecode)get_store().find_element_user(TYPECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "typecode" element
     */
    public void setTypecode(com.guidewire.typelists.TypecodeDocument.Typecode typecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.typelists.TypecodeDocument.Typecode target = null;
            target = (com.guidewire.typelists.TypecodeDocument.Typecode)get_store().find_element_user(TYPECODE$0, 0);
            if (target == null)
            {
                target = (com.guidewire.typelists.TypecodeDocument.Typecode)get_store().add_element_user(TYPECODE$0);
            }
            target.set(typecode);
        }
    }
    
    /**
     * Appends and returns a new empty "typecode" element
     */
    public com.guidewire.typelists.TypecodeDocument.Typecode addNewTypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.typelists.TypecodeDocument.Typecode target = null;
            target = (com.guidewire.typelists.TypecodeDocument.Typecode)get_store().add_element_user(TYPECODE$0);
            return target;
        }
    }
    /**
     * An XML typecode(@http://guidewire.com/typelists).
     *
     * This is a complex type.
     */
    public static class TypecodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.typelists.TypecodeDocument.Typecode
    {
        private static final long serialVersionUID = 1L;
        
        public TypecodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CATEGORY$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/typelists", "category");
        private static final javax.xml.namespace.QName CATEGORYLIST$2 = 
            new javax.xml.namespace.QName("http://guidewire.com/typelists", "categorylist");
        private static final javax.xml.namespace.QName TYPECODELOCALIZATION$4 = 
            new javax.xml.namespace.QName("http://guidewire.com/typelists", "typecodelocalization");
        private static final javax.xml.namespace.QName CODE$6 = 
            new javax.xml.namespace.QName("", "code");
        private static final javax.xml.namespace.QName DESC$8 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName ID$10 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName NAME$12 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName PRIORITY$14 = 
            new javax.xml.namespace.QName("", "priority");
        private static final javax.xml.namespace.QName RETIRED$16 = 
            new javax.xml.namespace.QName("", "retired");
        
        
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
         * Gets array of all "categorylist" elements
         */
        public com.guidewire.typelists.CategorylistDocument.Categorylist[] getCategorylistArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CATEGORYLIST$2, targetList);
                com.guidewire.typelists.CategorylistDocument.Categorylist[] result = new com.guidewire.typelists.CategorylistDocument.Categorylist[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "categorylist" element
         */
        public com.guidewire.typelists.CategorylistDocument.Categorylist getCategorylistArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.typelists.CategorylistDocument.Categorylist target = null;
                target = (com.guidewire.typelists.CategorylistDocument.Categorylist)get_store().find_element_user(CATEGORYLIST$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "categorylist" element
         */
        public int sizeOfCategorylistArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CATEGORYLIST$2);
            }
        }
        
        /**
         * Sets array of all "categorylist" element
         */
        public void setCategorylistArray(com.guidewire.typelists.CategorylistDocument.Categorylist[] categorylistArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(categorylistArray, CATEGORYLIST$2);
            }
        }
        
        /**
         * Sets ith "categorylist" element
         */
        public void setCategorylistArray(int i, com.guidewire.typelists.CategorylistDocument.Categorylist categorylist)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.typelists.CategorylistDocument.Categorylist target = null;
                target = (com.guidewire.typelists.CategorylistDocument.Categorylist)get_store().find_element_user(CATEGORYLIST$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(categorylist);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "categorylist" element
         */
        public com.guidewire.typelists.CategorylistDocument.Categorylist insertNewCategorylist(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.typelists.CategorylistDocument.Categorylist target = null;
                target = (com.guidewire.typelists.CategorylistDocument.Categorylist)get_store().insert_element_user(CATEGORYLIST$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "categorylist" element
         */
        public com.guidewire.typelists.CategorylistDocument.Categorylist addNewCategorylist()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.typelists.CategorylistDocument.Categorylist target = null;
                target = (com.guidewire.typelists.CategorylistDocument.Categorylist)get_store().add_element_user(CATEGORYLIST$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "categorylist" element
         */
        public void removeCategorylist(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CATEGORYLIST$2, i);
            }
        }
        
        /**
         * Gets array of all "typecodelocalization" elements
         */
        public com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization[] getTypecodelocalizationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TYPECODELOCALIZATION$4, targetList);
                com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization[] result = new com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "typecodelocalization" element
         */
        public com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization getTypecodelocalizationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization target = null;
                target = (com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization)get_store().find_element_user(TYPECODELOCALIZATION$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "typecodelocalization" element
         */
        public int sizeOfTypecodelocalizationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TYPECODELOCALIZATION$4);
            }
        }
        
        /**
         * Sets array of all "typecodelocalization" element
         */
        public void setTypecodelocalizationArray(com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization[] typecodelocalizationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(typecodelocalizationArray, TYPECODELOCALIZATION$4);
            }
        }
        
        /**
         * Sets ith "typecodelocalization" element
         */
        public void setTypecodelocalizationArray(int i, com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization typecodelocalization)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization target = null;
                target = (com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization)get_store().find_element_user(TYPECODELOCALIZATION$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(typecodelocalization);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "typecodelocalization" element
         */
        public com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization insertNewTypecodelocalization(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization target = null;
                target = (com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization)get_store().insert_element_user(TYPECODELOCALIZATION$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "typecodelocalization" element
         */
        public com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization addNewTypecodelocalization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization target = null;
                target = (com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization)get_store().add_element_user(TYPECODELOCALIZATION$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "typecodelocalization" element
         */
        public void removeTypecodelocalization(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TYPECODELOCALIZATION$4, i);
            }
        }
        
        /**
         * Gets the "code" attribute
         */
        public java.lang.String getCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "code" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(CODE$6);
                return target;
            }
        }
        
        /**
         * Sets the "code" attribute
         */
        public void setCode(java.lang.String code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$6);
                }
                target.setStringValue(code);
            }
        }
        
        /**
         * Sets (as xml) the "code" attribute
         */
        public void xsetCode(org.apache.xmlbeans.XmlNMTOKEN code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(CODE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(CODE$6);
                }
                target.set(code);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$8);
                }
                target.set(desc);
            }
        }
        
        /**
         * Gets the "id" attribute
         */
        public java.math.BigInteger getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ID$10);
                return target;
            }
        }
        
        /**
         * True if has "id" attribute
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ID$10) != null;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(java.math.BigInteger id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$10);
                }
                target.setBigIntegerValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlInteger id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ID$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(ID$10);
                }
                target.set(id);
            }
        }
        
        /**
         * Unsets the "id" attribute
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ID$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$12);
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
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$12);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$12);
                }
                target.set(name);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIORITY$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PRIORITY$14);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PRIORITY$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_default_attribute_value(PRIORITY$14);
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
                return get_store().find_attribute_user(PRIORITY$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIORITY$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRIORITY$14);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PRIORITY$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(PRIORITY$14);
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
                get_store().remove_attribute(PRIORITY$14);
            }
        }
        
        /**
         * Gets the "retired" attribute
         */
        public boolean getRetired()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RETIRED$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RETIRED$16);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "retired" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetRetired()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RETIRED$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(RETIRED$16);
                }
                return target;
            }
        }
        
        /**
         * True if has "retired" attribute
         */
        public boolean isSetRetired()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RETIRED$16) != null;
            }
        }
        
        /**
         * Sets the "retired" attribute
         */
        public void setRetired(boolean retired)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RETIRED$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RETIRED$16);
                }
                target.setBooleanValue(retired);
            }
        }
        
        /**
         * Sets (as xml) the "retired" attribute
         */
        public void xsetRetired(org.apache.xmlbeans.XmlBoolean retired)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RETIRED$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(RETIRED$16);
                }
                target.set(retired);
            }
        }
        
        /**
         * Unsets the "retired" attribute
         */
        public void unsetRetired()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RETIRED$16);
            }
        }
    }
}
