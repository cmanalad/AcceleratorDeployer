/*
 * An XML document type.
 * Localname: dbcheckbuilder
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.DbcheckbuilderDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one dbcheckbuilder(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class DbcheckbuilderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.DbcheckbuilderDocument
{
    private static final long serialVersionUID = 1L;
    
    public DbcheckbuilderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DBCHECKBUILDER$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "dbcheckbuilder");
    
    
    /**
     * Gets the "dbcheckbuilder" element
     */
    public com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder getDbcheckbuilder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder target = null;
            target = (com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder)get_store().find_element_user(DBCHECKBUILDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dbcheckbuilder" element
     */
    public void setDbcheckbuilder(com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder dbcheckbuilder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder target = null;
            target = (com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder)get_store().find_element_user(DBCHECKBUILDER$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder)get_store().add_element_user(DBCHECKBUILDER$0);
            }
            target.set(dbcheckbuilder);
        }
    }
    
    /**
     * Appends and returns a new empty "dbcheckbuilder" element
     */
    public com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder addNewDbcheckbuilder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder target = null;
            target = (com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder)get_store().add_element_user(DBCHECKBUILDER$0);
            return target;
        }
    }
    /**
     * An XML dbcheckbuilder(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class DbcheckbuilderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder
    {
        private static final long serialVersionUID = 1L;
        
        public DbcheckbuilderImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CLASSNAME$0 = 
            new javax.xml.namespace.QName("", "className");
        
        
        /**
         * Gets the "className" attribute
         */
        public java.lang.String getClassName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSNAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "className" attribute
         */
        public org.apache.xmlbeans.XmlString xgetClassName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASSNAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "className" attribute
         */
        public void setClassName(java.lang.String className)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSNAME$0);
                }
                target.setStringValue(className);
            }
        }
        
        /**
         * Sets (as xml) the "className" attribute
         */
        public void xsetClassName(org.apache.xmlbeans.XmlString className)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASSNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLASSNAME$0);
                }
                target.set(className);
            }
        }
    }
}
