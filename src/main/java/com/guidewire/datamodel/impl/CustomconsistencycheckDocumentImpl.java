/*
 * An XML document type.
 * Localname: customconsistencycheck
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.CustomconsistencycheckDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one customconsistencycheck(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class CustomconsistencycheckDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.CustomconsistencycheckDocument
{
    private static final long serialVersionUID = 1L;
    
    public CustomconsistencycheckDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTOMCONSISTENCYCHECK$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "customconsistencycheck");
    
    
    /**
     * Gets the "customconsistencycheck" element
     */
    public com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck getCustomconsistencycheck()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck target = null;
            target = (com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck)get_store().find_element_user(CUSTOMCONSISTENCYCHECK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "customconsistencycheck" element
     */
    public void setCustomconsistencycheck(com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck customconsistencycheck)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck target = null;
            target = (com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck)get_store().find_element_user(CUSTOMCONSISTENCYCHECK$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck)get_store().add_element_user(CUSTOMCONSISTENCYCHECK$0);
            }
            target.set(customconsistencycheck);
        }
    }
    
    /**
     * Appends and returns a new empty "customconsistencycheck" element
     */
    public com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck addNewCustomconsistencycheck()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck target = null;
            target = (com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck)get_store().add_element_user(CUSTOMCONSISTENCYCHECK$0);
            return target;
        }
    }
    /**
     * An XML customconsistencycheck(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class CustomconsistencycheckImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck
    {
        private static final long serialVersionUID = 1L;
        
        public CustomconsistencycheckImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CLASSNAME$0 = 
            new javax.xml.namespace.QName("", "className");
        private static final javax.xml.namespace.QName DESC$2 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName RUNAFTERPOPULATINGSOURCETABLES$4 = 
            new javax.xml.namespace.QName("", "runafterpopulatingsourcetables");
        private static final javax.xml.namespace.QName STATICMETHODNAME$6 = 
            new javax.xml.namespace.QName("", "staticMethodName");
        
        
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
        
        /**
         * Gets the "desc" attribute
         */
        public java.lang.String getDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$2);
                }
                target.set(desc);
            }
        }
        
        /**
         * Gets the "runafterpopulatingsourcetables" attribute
         */
        public boolean getRunafterpopulatingsourcetables()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RUNAFTERPOPULATINGSOURCETABLES$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RUNAFTERPOPULATINGSOURCETABLES$4);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "runafterpopulatingsourcetables" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetRunafterpopulatingsourcetables()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RUNAFTERPOPULATINGSOURCETABLES$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(RUNAFTERPOPULATINGSOURCETABLES$4);
                }
                return target;
            }
        }
        
        /**
         * True if has "runafterpopulatingsourcetables" attribute
         */
        public boolean isSetRunafterpopulatingsourcetables()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RUNAFTERPOPULATINGSOURCETABLES$4) != null;
            }
        }
        
        /**
         * Sets the "runafterpopulatingsourcetables" attribute
         */
        public void setRunafterpopulatingsourcetables(boolean runafterpopulatingsourcetables)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RUNAFTERPOPULATINGSOURCETABLES$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RUNAFTERPOPULATINGSOURCETABLES$4);
                }
                target.setBooleanValue(runafterpopulatingsourcetables);
            }
        }
        
        /**
         * Sets (as xml) the "runafterpopulatingsourcetables" attribute
         */
        public void xsetRunafterpopulatingsourcetables(org.apache.xmlbeans.XmlBoolean runafterpopulatingsourcetables)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RUNAFTERPOPULATINGSOURCETABLES$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(RUNAFTERPOPULATINGSOURCETABLES$4);
                }
                target.set(runafterpopulatingsourcetables);
            }
        }
        
        /**
         * Unsets the "runafterpopulatingsourcetables" attribute
         */
        public void unsetRunafterpopulatingsourcetables()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RUNAFTERPOPULATINGSOURCETABLES$4);
            }
        }
        
        /**
         * Gets the "staticMethodName" attribute
         */
        public java.lang.String getStaticMethodName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATICMETHODNAME$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "staticMethodName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetStaticMethodName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATICMETHODNAME$6);
                return target;
            }
        }
        
        /**
         * Sets the "staticMethodName" attribute
         */
        public void setStaticMethodName(java.lang.String staticMethodName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATICMETHODNAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATICMETHODNAME$6);
                }
                target.setStringValue(staticMethodName);
            }
        }
        
        /**
         * Sets (as xml) the "staticMethodName" attribute
         */
        public void xsetStaticMethodName(org.apache.xmlbeans.XmlString staticMethodName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATICMETHODNAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STATICMETHODNAME$6);
                }
                target.set(staticMethodName);
            }
        }
    }
}
