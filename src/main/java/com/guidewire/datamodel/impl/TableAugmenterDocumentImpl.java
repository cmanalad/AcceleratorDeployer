/*
 * An XML document type.
 * Localname: tableAugmenter
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.TableAugmenterDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one tableAugmenter(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class TableAugmenterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.TableAugmenterDocument
{
    private static final long serialVersionUID = 1L;
    
    public TableAugmenterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TABLEAUGMENTER$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "tableAugmenter");
    
    
    /**
     * Gets the "tableAugmenter" element
     */
    public com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter getTableAugmenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter target = null;
            target = (com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter)get_store().find_element_user(TABLEAUGMENTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tableAugmenter" element
     */
    public void setTableAugmenter(com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter tableAugmenter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter target = null;
            target = (com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter)get_store().find_element_user(TABLEAUGMENTER$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter)get_store().add_element_user(TABLEAUGMENTER$0);
            }
            target.set(tableAugmenter);
        }
    }
    
    /**
     * Appends and returns a new empty "tableAugmenter" element
     */
    public com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter addNewTableAugmenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter target = null;
            target = (com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter)get_store().add_element_user(TABLEAUGMENTER$0);
            return target;
        }
    }
    /**
     * An XML tableAugmenter(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class TableAugmenterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter
    {
        private static final long serialVersionUID = 1L;
        
        public TableAugmenterImpl(org.apache.xmlbeans.SchemaType sType)
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
