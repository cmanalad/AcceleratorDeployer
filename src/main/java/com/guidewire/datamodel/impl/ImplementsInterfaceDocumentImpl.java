/*
 * An XML document type.
 * Localname: implementsInterface
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.ImplementsInterfaceDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one implementsInterface(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class ImplementsInterfaceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ImplementsInterfaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ImplementsInterfaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPLEMENTSINTERFACE$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "implementsInterface");
    
    
    /**
     * Gets the "implementsInterface" element
     */
    public com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface getImplementsInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface target = null;
            target = (com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface)get_store().find_element_user(IMPLEMENTSINTERFACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "implementsInterface" element
     */
    public void setImplementsInterface(com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface implementsInterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface target = null;
            target = (com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface)get_store().find_element_user(IMPLEMENTSINTERFACE$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface)get_store().add_element_user(IMPLEMENTSINTERFACE$0);
            }
            target.set(implementsInterface);
        }
    }
    
    /**
     * Appends and returns a new empty "implementsInterface" element
     */
    public com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface addNewImplementsInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface target = null;
            target = (com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface)get_store().add_element_user(IMPLEMENTSINTERFACE$0);
            return target;
        }
    }
    /**
     * An XML implementsInterface(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class ImplementsInterfaceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface
    {
        private static final long serialVersionUID = 1L;
        
        public ImplementsInterfaceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IFACE$0 = 
            new javax.xml.namespace.QName("", "iface");
        private static final javax.xml.namespace.QName IMPL$2 = 
            new javax.xml.namespace.QName("", "impl");
        
        
        /**
         * Gets the "iface" attribute
         */
        public java.lang.String getIface()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IFACE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "iface" attribute
         */
        public org.apache.xmlbeans.XmlString xgetIface()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IFACE$0);
                return target;
            }
        }
        
        /**
         * Sets the "iface" attribute
         */
        public void setIface(java.lang.String iface)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IFACE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IFACE$0);
                }
                target.setStringValue(iface);
            }
        }
        
        /**
         * Sets (as xml) the "iface" attribute
         */
        public void xsetIface(org.apache.xmlbeans.XmlString iface)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IFACE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(IFACE$0);
                }
                target.set(iface);
            }
        }
        
        /**
         * Gets the "impl" attribute
         */
        public java.lang.String getImpl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMPL$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "impl" attribute
         */
        public org.apache.xmlbeans.XmlString xgetImpl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IMPL$2);
                return target;
            }
        }
        
        /**
         * Sets the "impl" attribute
         */
        public void setImpl(java.lang.String impl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMPL$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IMPL$2);
                }
                target.setStringValue(impl);
            }
        }
        
        /**
         * Sets (as xml) the "impl" attribute
         */
        public void xsetImpl(org.apache.xmlbeans.XmlString impl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IMPL$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(IMPL$2);
                }
                target.set(impl);
            }
        }
    }
}
