/*
 * An XML document type.
 * Localname: indexcol
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.IndexcolDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one indexcol(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class IndexcolDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.IndexcolDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndexcolDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDEXCOL$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "indexcol");
    
    
    /**
     * Gets the "indexcol" element
     */
    public com.guidewire.datamodel.IndexcolDocument.Indexcol getIndexcol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.IndexcolDocument.Indexcol target = null;
            target = (com.guidewire.datamodel.IndexcolDocument.Indexcol)get_store().find_element_user(INDEXCOL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indexcol" element
     */
    public void setIndexcol(com.guidewire.datamodel.IndexcolDocument.Indexcol indexcol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.IndexcolDocument.Indexcol target = null;
            target = (com.guidewire.datamodel.IndexcolDocument.Indexcol)get_store().find_element_user(INDEXCOL$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.IndexcolDocument.Indexcol)get_store().add_element_user(INDEXCOL$0);
            }
            target.set(indexcol);
        }
    }
    
    /**
     * Appends and returns a new empty "indexcol" element
     */
    public com.guidewire.datamodel.IndexcolDocument.Indexcol addNewIndexcol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.IndexcolDocument.Indexcol target = null;
            target = (com.guidewire.datamodel.IndexcolDocument.Indexcol)get_store().add_element_user(INDEXCOL$0);
            return target;
        }
    }
    /**
     * An XML indexcol(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class IndexcolImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.IndexcolDocument.Indexcol
    {
        private static final long serialVersionUID = 1L;
        
        public IndexcolImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName KEYPOSITION$0 = 
            new javax.xml.namespace.QName("", "keyposition");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName SORTASCENDING$4 = 
            new javax.xml.namespace.QName("", "sortascending");
        
        
        /**
         * Gets the "keyposition" attribute
         */
        public java.math.BigInteger getKeyposition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEYPOSITION$0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "keyposition" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetKeyposition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(KEYPOSITION$0);
                return target;
            }
        }
        
        /**
         * Sets the "keyposition" attribute
         */
        public void setKeyposition(java.math.BigInteger keyposition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEYPOSITION$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KEYPOSITION$0);
                }
                target.setBigIntegerValue(keyposition);
            }
        }
        
        /**
         * Sets (as xml) the "keyposition" attribute
         */
        public void xsetKeyposition(org.apache.xmlbeans.XmlInteger keyposition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(KEYPOSITION$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(KEYPOSITION$0);
                }
                target.set(keyposition);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(NAME$2);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "sortascending" attribute
         */
        public boolean getSortascending()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTASCENDING$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SORTASCENDING$4);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "sortascending" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetSortascending()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SORTASCENDING$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SORTASCENDING$4);
                }
                return target;
            }
        }
        
        /**
         * True if has "sortascending" attribute
         */
        public boolean isSetSortascending()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SORTASCENDING$4) != null;
            }
        }
        
        /**
         * Sets the "sortascending" attribute
         */
        public void setSortascending(boolean sortascending)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTASCENDING$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTASCENDING$4);
                }
                target.setBooleanValue(sortascending);
            }
        }
        
        /**
         * Sets (as xml) the "sortascending" attribute
         */
        public void xsetSortascending(org.apache.xmlbeans.XmlBoolean sortascending)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SORTASCENDING$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SORTASCENDING$4);
                }
                target.set(sortascending);
            }
        }
        
        /**
         * Unsets the "sortascending" attribute
         */
        public void unsetSortascending()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SORTASCENDING$4);
            }
        }
    }
}
