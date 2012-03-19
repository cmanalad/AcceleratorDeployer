/*
 * An XML document type.
 * Localname: forceindex
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.ForceindexDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one forceindex(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class ForceindexDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ForceindexDocument
{
    private static final long serialVersionUID = 1L;
    
    public ForceindexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORCEINDEX$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "forceindex");
    
    
    /**
     * Gets the "forceindex" element
     */
    public com.guidewire.datamodel.ForceindexDocument.Forceindex getForceindex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ForceindexDocument.Forceindex target = null;
            target = (com.guidewire.datamodel.ForceindexDocument.Forceindex)get_store().find_element_user(FORCEINDEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "forceindex" element
     */
    public void setForceindex(com.guidewire.datamodel.ForceindexDocument.Forceindex forceindex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ForceindexDocument.Forceindex target = null;
            target = (com.guidewire.datamodel.ForceindexDocument.Forceindex)get_store().find_element_user(FORCEINDEX$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.ForceindexDocument.Forceindex)get_store().add_element_user(FORCEINDEX$0);
            }
            target.set(forceindex);
        }
    }
    
    /**
     * Appends and returns a new empty "forceindex" element
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
     * An XML forceindex(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class ForceindexImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ForceindexDocument.Forceindex
    {
        private static final long serialVersionUID = 1L;
        
        public ForceindexImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DB2$0 = 
            new javax.xml.namespace.QName("", "db2");
        private static final javax.xml.namespace.QName ORACLE$2 = 
            new javax.xml.namespace.QName("", "oracle");
        private static final javax.xml.namespace.QName SQLSERVER$4 = 
            new javax.xml.namespace.QName("", "sqlserver");
        
        
        /**
         * Gets the "db2" attribute
         */
        public boolean getDb2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DB2$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DB2$0);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "db2" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetDb2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DB2$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DB2$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "db2" attribute
         */
        public boolean isSetDb2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DB2$0) != null;
            }
        }
        
        /**
         * Sets the "db2" attribute
         */
        public void setDb2(boolean db2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DB2$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DB2$0);
                }
                target.setBooleanValue(db2);
            }
        }
        
        /**
         * Sets (as xml) the "db2" attribute
         */
        public void xsetDb2(org.apache.xmlbeans.XmlBoolean db2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DB2$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DB2$0);
                }
                target.set(db2);
            }
        }
        
        /**
         * Unsets the "db2" attribute
         */
        public void unsetDb2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DB2$0);
            }
        }
        
        /**
         * Gets the "oracle" attribute
         */
        public boolean getOracle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORACLE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ORACLE$2);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "oracle" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetOracle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ORACLE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ORACLE$2);
                }
                return target;
            }
        }
        
        /**
         * True if has "oracle" attribute
         */
        public boolean isSetOracle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ORACLE$2) != null;
            }
        }
        
        /**
         * Sets the "oracle" attribute
         */
        public void setOracle(boolean oracle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORACLE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORACLE$2);
                }
                target.setBooleanValue(oracle);
            }
        }
        
        /**
         * Sets (as xml) the "oracle" attribute
         */
        public void xsetOracle(org.apache.xmlbeans.XmlBoolean oracle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ORACLE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ORACLE$2);
                }
                target.set(oracle);
            }
        }
        
        /**
         * Unsets the "oracle" attribute
         */
        public void unsetOracle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ORACLE$2);
            }
        }
        
        /**
         * Gets the "sqlserver" attribute
         */
        public boolean getSqlserver()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SQLSERVER$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SQLSERVER$4);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "sqlserver" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetSqlserver()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SQLSERVER$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SQLSERVER$4);
                }
                return target;
            }
        }
        
        /**
         * True if has "sqlserver" attribute
         */
        public boolean isSetSqlserver()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SQLSERVER$4) != null;
            }
        }
        
        /**
         * Sets the "sqlserver" attribute
         */
        public void setSqlserver(boolean sqlserver)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SQLSERVER$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SQLSERVER$4);
                }
                target.setBooleanValue(sqlserver);
            }
        }
        
        /**
         * Sets (as xml) the "sqlserver" attribute
         */
        public void xsetSqlserver(org.apache.xmlbeans.XmlBoolean sqlserver)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SQLSERVER$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SQLSERVER$4);
                }
                target.set(sqlserver);
            }
        }
        
        /**
         * Unsets the "sqlserver" attribute
         */
        public void unsetSqlserver()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SQLSERVER$4);
            }
        }
    }
}
