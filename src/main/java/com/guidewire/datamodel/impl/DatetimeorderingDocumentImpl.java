/*
 * An XML document type.
 * Localname: datetimeordering
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.DatetimeorderingDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one datetimeordering(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class DatetimeorderingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.DatetimeorderingDocument
{
    private static final long serialVersionUID = 1L;
    
    public DatetimeorderingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATETIMEORDERING$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "datetimeordering");
    
    
    /**
     * Gets the "datetimeordering" element
     */
    public com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering getDatetimeordering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering target = null;
            target = (com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering)get_store().find_element_user(DATETIMEORDERING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "datetimeordering" element
     */
    public void setDatetimeordering(com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering datetimeordering)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering target = null;
            target = (com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering)get_store().find_element_user(DATETIMEORDERING$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering)get_store().add_element_user(DATETIMEORDERING$0);
            }
            target.set(datetimeordering);
        }
    }
    
    /**
     * Appends and returns a new empty "datetimeordering" element
     */
    public com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering addNewDatetimeordering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering target = null;
            target = (com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering)get_store().add_element_user(DATETIMEORDERING$0);
            return target;
        }
    }
    /**
     * An XML datetimeordering(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class DatetimeorderingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering
    {
        private static final long serialVersionUID = 1L;
        
        public DatetimeorderingImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FIRSTCOLUMNNAME$0 = 
            new javax.xml.namespace.QName("", "firstcolumnname");
        private static final javax.xml.namespace.QName OPERATOR$2 = 
            new javax.xml.namespace.QName("", "operator");
        private static final javax.xml.namespace.QName SECONDCOLUMNNAME$4 = 
            new javax.xml.namespace.QName("", "secondcolumnname");
        
        
        /**
         * Gets the "firstcolumnname" attribute
         */
        public java.lang.String getFirstcolumnname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTCOLUMNNAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "firstcolumnname" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetFirstcolumnname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(FIRSTCOLUMNNAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "firstcolumnname" attribute
         */
        public void setFirstcolumnname(java.lang.String firstcolumnname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTCOLUMNNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIRSTCOLUMNNAME$0);
                }
                target.setStringValue(firstcolumnname);
            }
        }
        
        /**
         * Sets (as xml) the "firstcolumnname" attribute
         */
        public void xsetFirstcolumnname(org.apache.xmlbeans.XmlNMTOKEN firstcolumnname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(FIRSTCOLUMNNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(FIRSTCOLUMNNAME$0);
                }
                target.set(firstcolumnname);
            }
        }
        
        /**
         * Gets the "operator" attribute
         */
        public com.guidewire.datamodel.Operator.Enum getOperator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATOR$2);
                if (target == null)
                {
                    return null;
                }
                return (com.guidewire.datamodel.Operator.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "operator" attribute
         */
        public com.guidewire.datamodel.Operator xgetOperator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.Operator target = null;
                target = (com.guidewire.datamodel.Operator)get_store().find_attribute_user(OPERATOR$2);
                return target;
            }
        }
        
        /**
         * Sets the "operator" attribute
         */
        public void setOperator(com.guidewire.datamodel.Operator.Enum operator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATOR$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPERATOR$2);
                }
                target.setEnumValue(operator);
            }
        }
        
        /**
         * Sets (as xml) the "operator" attribute
         */
        public void xsetOperator(com.guidewire.datamodel.Operator operator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.Operator target = null;
                target = (com.guidewire.datamodel.Operator)get_store().find_attribute_user(OPERATOR$2);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.Operator)get_store().add_attribute_user(OPERATOR$2);
                }
                target.set(operator);
            }
        }
        
        /**
         * Gets the "secondcolumnname" attribute
         */
        public java.lang.String getSecondcolumnname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SECONDCOLUMNNAME$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "secondcolumnname" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetSecondcolumnname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(SECONDCOLUMNNAME$4);
                return target;
            }
        }
        
        /**
         * Sets the "secondcolumnname" attribute
         */
        public void setSecondcolumnname(java.lang.String secondcolumnname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SECONDCOLUMNNAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SECONDCOLUMNNAME$4);
                }
                target.setStringValue(secondcolumnname);
            }
        }
        
        /**
         * Sets (as xml) the "secondcolumnname" attribute
         */
        public void xsetSecondcolumnname(org.apache.xmlbeans.XmlNMTOKEN secondcolumnname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(SECONDCOLUMNNAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(SECONDCOLUMNNAME$4);
                }
                target.set(secondcolumnname);
            }
        }
    }
}
