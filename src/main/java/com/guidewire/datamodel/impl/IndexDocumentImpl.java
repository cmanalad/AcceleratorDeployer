/*
 * An XML document type.
 * Localname: index
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.IndexDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one index(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class IndexDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.IndexDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDEX$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "index");
    
    
    /**
     * Gets the "index" element
     */
    public com.guidewire.datamodel.IndexDocument.Index getIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.IndexDocument.Index target = null;
            target = (com.guidewire.datamodel.IndexDocument.Index)get_store().find_element_user(INDEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "index" element
     */
    public void setIndex(com.guidewire.datamodel.IndexDocument.Index index)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.IndexDocument.Index target = null;
            target = (com.guidewire.datamodel.IndexDocument.Index)get_store().find_element_user(INDEX$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.IndexDocument.Index)get_store().add_element_user(INDEX$0);
            }
            target.set(index);
        }
    }
    
    /**
     * Appends and returns a new empty "index" element
     */
    public com.guidewire.datamodel.IndexDocument.Index addNewIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.IndexDocument.Index target = null;
            target = (com.guidewire.datamodel.IndexDocument.Index)get_store().add_element_user(INDEX$0);
            return target;
        }
    }
    /**
     * An XML index(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class IndexImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.IndexDocument.Index
    {
        private static final long serialVersionUID = 1L;
        
        public IndexImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FORCEINDEX$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "forceindex");
        private static final javax.xml.namespace.QName INDEXCOL$2 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "indexcol");
        private static final javax.xml.namespace.QName CLUSTERED$4 = 
            new javax.xml.namespace.QName("", "clustered");
        private static final javax.xml.namespace.QName DESC$6 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName EXPECTEDTOBECOVERING$8 = 
            new javax.xml.namespace.QName("", "expectedtobecovering");
        private static final javax.xml.namespace.QName NAME$10 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName TRACKUSAGE$12 = 
            new javax.xml.namespace.QName("", "trackUsage");
        private static final javax.xml.namespace.QName UNIQUE$14 = 
            new javax.xml.namespace.QName("", "unique");
        private static final javax.xml.namespace.QName VERIFYINLOADER$16 = 
            new javax.xml.namespace.QName("", "verifyInLoader");
        
        
        /**
         * Gets array of all "forceindex" elements
         */
        public com.guidewire.datamodel.ForceindexDocument.Forceindex[] getForceindexArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FORCEINDEX$0, targetList);
                com.guidewire.datamodel.ForceindexDocument.Forceindex[] result = new com.guidewire.datamodel.ForceindexDocument.Forceindex[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "forceindex" element
         */
        public com.guidewire.datamodel.ForceindexDocument.Forceindex getForceindexArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ForceindexDocument.Forceindex target = null;
                target = (com.guidewire.datamodel.ForceindexDocument.Forceindex)get_store().find_element_user(FORCEINDEX$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "forceindex" element
         */
        public int sizeOfForceindexArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FORCEINDEX$0);
            }
        }
        
        /**
         * Sets array of all "forceindex" element
         */
        public void setForceindexArray(com.guidewire.datamodel.ForceindexDocument.Forceindex[] forceindexArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(forceindexArray, FORCEINDEX$0);
            }
        }
        
        /**
         * Sets ith "forceindex" element
         */
        public void setForceindexArray(int i, com.guidewire.datamodel.ForceindexDocument.Forceindex forceindex)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ForceindexDocument.Forceindex target = null;
                target = (com.guidewire.datamodel.ForceindexDocument.Forceindex)get_store().find_element_user(FORCEINDEX$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(forceindex);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "forceindex" element
         */
        public com.guidewire.datamodel.ForceindexDocument.Forceindex insertNewForceindex(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ForceindexDocument.Forceindex target = null;
                target = (com.guidewire.datamodel.ForceindexDocument.Forceindex)get_store().insert_element_user(FORCEINDEX$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "forceindex" element
         */
        public com.guidewire.datamodel.ForceindexDocument.Forceindex addNewForceindex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ForceindexDocument.Forceindex target = null;
                target = (com.guidewire.datamodel.ForceindexDocument.Forceindex)get_store().add_element_user(FORCEINDEX$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "forceindex" element
         */
        public void removeForceindex(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FORCEINDEX$0, i);
            }
        }
        
        /**
         * Gets array of all "indexcol" elements
         */
        public com.guidewire.datamodel.IndexcolDocument.Indexcol[] getIndexcolArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INDEXCOL$2, targetList);
                com.guidewire.datamodel.IndexcolDocument.Indexcol[] result = new com.guidewire.datamodel.IndexcolDocument.Indexcol[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "indexcol" element
         */
        public com.guidewire.datamodel.IndexcolDocument.Indexcol getIndexcolArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.IndexcolDocument.Indexcol target = null;
                target = (com.guidewire.datamodel.IndexcolDocument.Indexcol)get_store().find_element_user(INDEXCOL$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "indexcol" element
         */
        public int sizeOfIndexcolArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDEXCOL$2);
            }
        }
        
        /**
         * Sets array of all "indexcol" element
         */
        public void setIndexcolArray(com.guidewire.datamodel.IndexcolDocument.Indexcol[] indexcolArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(indexcolArray, INDEXCOL$2);
            }
        }
        
        /**
         * Sets ith "indexcol" element
         */
        public void setIndexcolArray(int i, com.guidewire.datamodel.IndexcolDocument.Indexcol indexcol)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.IndexcolDocument.Indexcol target = null;
                target = (com.guidewire.datamodel.IndexcolDocument.Indexcol)get_store().find_element_user(INDEXCOL$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(indexcol);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "indexcol" element
         */
        public com.guidewire.datamodel.IndexcolDocument.Indexcol insertNewIndexcol(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.IndexcolDocument.Indexcol target = null;
                target = (com.guidewire.datamodel.IndexcolDocument.Indexcol)get_store().insert_element_user(INDEXCOL$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "indexcol" element
         */
        public com.guidewire.datamodel.IndexcolDocument.Indexcol addNewIndexcol()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.IndexcolDocument.Indexcol target = null;
                target = (com.guidewire.datamodel.IndexcolDocument.Indexcol)get_store().add_element_user(INDEXCOL$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "indexcol" element
         */
        public void removeIndexcol(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDEXCOL$2, i);
            }
        }
        
        /**
         * Gets the "clustered" attribute
         */
        public boolean getClustered()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLUSTERED$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CLUSTERED$4);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "clustered" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetClustered()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CLUSTERED$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CLUSTERED$4);
                }
                return target;
            }
        }
        
        /**
         * True if has "clustered" attribute
         */
        public boolean isSetClustered()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CLUSTERED$4) != null;
            }
        }
        
        /**
         * Sets the "clustered" attribute
         */
        public void setClustered(boolean clustered)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLUSTERED$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLUSTERED$4);
                }
                target.setBooleanValue(clustered);
            }
        }
        
        /**
         * Sets (as xml) the "clustered" attribute
         */
        public void xsetClustered(org.apache.xmlbeans.XmlBoolean clustered)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CLUSTERED$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CLUSTERED$4);
                }
                target.set(clustered);
            }
        }
        
        /**
         * Unsets the "clustered" attribute
         */
        public void unsetClustered()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CLUSTERED$4);
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
         * True if has "desc" attribute
         */
        public boolean isSetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DESC$6) != null;
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
         * Unsets the "desc" attribute
         */
        public void unsetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DESC$6);
            }
        }
        
        /**
         * Gets the "expectedtobecovering" attribute
         */
        public boolean getExpectedtobecovering()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPECTEDTOBECOVERING$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EXPECTEDTOBECOVERING$8);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "expectedtobecovering" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetExpectedtobecovering()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXPECTEDTOBECOVERING$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EXPECTEDTOBECOVERING$8);
                }
                return target;
            }
        }
        
        /**
         * True if has "expectedtobecovering" attribute
         */
        public boolean isSetExpectedtobecovering()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EXPECTEDTOBECOVERING$8) != null;
            }
        }
        
        /**
         * Sets the "expectedtobecovering" attribute
         */
        public void setExpectedtobecovering(boolean expectedtobecovering)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPECTEDTOBECOVERING$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXPECTEDTOBECOVERING$8);
                }
                target.setBooleanValue(expectedtobecovering);
            }
        }
        
        /**
         * Sets (as xml) the "expectedtobecovering" attribute
         */
        public void xsetExpectedtobecovering(org.apache.xmlbeans.XmlBoolean expectedtobecovering)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXPECTEDTOBECOVERING$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EXPECTEDTOBECOVERING$8);
                }
                target.set(expectedtobecovering);
            }
        }
        
        /**
         * Unsets the "expectedtobecovering" attribute
         */
        public void unsetExpectedtobecovering()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EXPECTEDTOBECOVERING$8);
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
        
        /**
         * Gets the "trackUsage" attribute
         */
        public boolean getTrackUsage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRACKUSAGE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TRACKUSAGE$12);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "trackUsage" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetTrackUsage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRACKUSAGE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(TRACKUSAGE$12);
                }
                return target;
            }
        }
        
        /**
         * True if has "trackUsage" attribute
         */
        public boolean isSetTrackUsage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TRACKUSAGE$12) != null;
            }
        }
        
        /**
         * Sets the "trackUsage" attribute
         */
        public void setTrackUsage(boolean trackUsage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRACKUSAGE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRACKUSAGE$12);
                }
                target.setBooleanValue(trackUsage);
            }
        }
        
        /**
         * Sets (as xml) the "trackUsage" attribute
         */
        public void xsetTrackUsage(org.apache.xmlbeans.XmlBoolean trackUsage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRACKUSAGE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TRACKUSAGE$12);
                }
                target.set(trackUsage);
            }
        }
        
        /**
         * Unsets the "trackUsage" attribute
         */
        public void unsetTrackUsage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TRACKUSAGE$12);
            }
        }
        
        /**
         * Gets the "unique" attribute
         */
        public boolean getUnique()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(UNIQUE$14);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "unique" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetUnique()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UNIQUE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(UNIQUE$14);
                }
                return target;
            }
        }
        
        /**
         * True if has "unique" attribute
         */
        public boolean isSetUnique()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(UNIQUE$14) != null;
            }
        }
        
        /**
         * Sets the "unique" attribute
         */
        public void setUnique(boolean unique)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIQUE$14);
                }
                target.setBooleanValue(unique);
            }
        }
        
        /**
         * Sets (as xml) the "unique" attribute
         */
        public void xsetUnique(org.apache.xmlbeans.XmlBoolean unique)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UNIQUE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(UNIQUE$14);
                }
                target.set(unique);
            }
        }
        
        /**
         * Unsets the "unique" attribute
         */
        public void unsetUnique()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(UNIQUE$14);
            }
        }
        
        /**
         * Gets the "verifyInLoader" attribute
         */
        public boolean getVerifyInLoader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERIFYINLOADER$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VERIFYINLOADER$16);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "verifyInLoader" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetVerifyInLoader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(VERIFYINLOADER$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(VERIFYINLOADER$16);
                }
                return target;
            }
        }
        
        /**
         * True if has "verifyInLoader" attribute
         */
        public boolean isSetVerifyInLoader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VERIFYINLOADER$16) != null;
            }
        }
        
        /**
         * Sets the "verifyInLoader" attribute
         */
        public void setVerifyInLoader(boolean verifyInLoader)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERIFYINLOADER$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERIFYINLOADER$16);
                }
                target.setBooleanValue(verifyInLoader);
            }
        }
        
        /**
         * Sets (as xml) the "verifyInLoader" attribute
         */
        public void xsetVerifyInLoader(org.apache.xmlbeans.XmlBoolean verifyInLoader)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(VERIFYINLOADER$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(VERIFYINLOADER$16);
                }
                target.set(verifyInLoader);
            }
        }
        
        /**
         * Unsets the "verifyInLoader" attribute
         */
        public void unsetVerifyInLoader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VERIFYINLOADER$16);
            }
        }
    }
}
