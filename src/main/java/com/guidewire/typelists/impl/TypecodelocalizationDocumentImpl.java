/*
 * An XML document type.
 * Localname: typecodelocalization
 * Namespace: http://guidewire.com/typelists
 * Java type: com.guidewire.typelists.TypecodelocalizationDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.typelists.impl;
/**
 * A document containing one typecodelocalization(@http://guidewire.com/typelists) element.
 *
 * This is a complex type.
 */
public class TypecodelocalizationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.typelists.TypecodelocalizationDocument
{
    private static final long serialVersionUID = 1L;
    
    public TypecodelocalizationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPECODELOCALIZATION$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/typelists", "typecodelocalization");
    
    
    /**
     * Gets the "typecodelocalization" element
     */
    public com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization getTypecodelocalization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization target = null;
            target = (com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization)get_store().find_element_user(TYPECODELOCALIZATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "typecodelocalization" element
     */
    public void setTypecodelocalization(com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization typecodelocalization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization target = null;
            target = (com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization)get_store().find_element_user(TYPECODELOCALIZATION$0, 0);
            if (target == null)
            {
                target = (com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization)get_store().add_element_user(TYPECODELOCALIZATION$0);
            }
            target.set(typecodelocalization);
        }
    }
    
    /**
     * Appends and returns a new empty "typecodelocalization" element
     */
    public com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization addNewTypecodelocalization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization target = null;
            target = (com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization)get_store().add_element_user(TYPECODELOCALIZATION$0);
            return target;
        }
    }
    /**
     * An XML typecodelocalization(@http://guidewire.com/typelists).
     *
     * This is a complex type.
     */
    public static class TypecodelocalizationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization
    {
        private static final long serialVersionUID = 1L;
        
        public TypecodelocalizationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DESC$0 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName LOCALE$2 = 
            new javax.xml.namespace.QName("", "locale");
        private static final javax.xml.namespace.QName NAME$4 = 
            new javax.xml.namespace.QName("", "name");
        
        
        /**
         * Gets the "desc" attribute
         */
        public java.lang.String getDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$0);
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
                return get_store().find_attribute_user(DESC$0) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$0);
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
                get_store().remove_attribute(DESC$0);
            }
        }
        
        /**
         * Gets the "locale" attribute
         */
        public java.lang.String getLocale()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "locale" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetLocale()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(LOCALE$2);
                return target;
            }
        }
        
        /**
         * Sets the "locale" attribute
         */
        public void setLocale(java.lang.String locale)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCALE$2);
                }
                target.setStringValue(locale);
            }
        }
        
        /**
         * Sets (as xml) the "locale" attribute
         */
        public void xsetLocale(org.apache.xmlbeans.XmlNMTOKEN locale)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(LOCALE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(LOCALE$2);
                }
                target.set(locale);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$4);
                }
                target.set(name);
            }
        }
    }
}
