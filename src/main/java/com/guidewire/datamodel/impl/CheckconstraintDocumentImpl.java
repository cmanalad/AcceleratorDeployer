/*
 * An XML document type.
 * Localname: checkconstraint
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.CheckconstraintDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one checkconstraint(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class CheckconstraintDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.CheckconstraintDocument
{
    private static final long serialVersionUID = 1L;
    
    public CheckconstraintDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHECKCONSTRAINT$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "checkconstraint");
    
    
    /**
     * Gets the "checkconstraint" element
     */
    public com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint getCheckconstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint target = null;
            target = (com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint)get_store().find_element_user(CHECKCONSTRAINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "checkconstraint" element
     */
    public void setCheckconstraint(com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint checkconstraint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint target = null;
            target = (com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint)get_store().find_element_user(CHECKCONSTRAINT$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint)get_store().add_element_user(CHECKCONSTRAINT$0);
            }
            target.set(checkconstraint);
        }
    }
    
    /**
     * Appends and returns a new empty "checkconstraint" element
     */
    public com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint addNewCheckconstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint target = null;
            target = (com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint)get_store().add_element_user(CHECKCONSTRAINT$0);
            return target;
        }
    }
    /**
     * An XML checkconstraint(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class CheckconstraintImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint
    {
        private static final long serialVersionUID = 1L;
        
        public CheckconstraintImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName APPLICABLETOSTAGINGTABLE$0 = 
            new javax.xml.namespace.QName("", "applicabletostagingtable");
        private static final javax.xml.namespace.QName DESC$2 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName PREDICATE$4 = 
            new javax.xml.namespace.QName("", "predicate");
        private static final javax.xml.namespace.QName STAGINGTABLEPREDICATE$6 = 
            new javax.xml.namespace.QName("", "stagingtablepredicate");
        
        
        /**
         * Gets the "applicabletostagingtable" attribute
         */
        public boolean getApplicabletostagingtable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICABLETOSTAGINGTABLE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(APPLICABLETOSTAGINGTABLE$0);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "applicabletostagingtable" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetApplicabletostagingtable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLICABLETOSTAGINGTABLE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(APPLICABLETOSTAGINGTABLE$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "applicabletostagingtable" attribute
         */
        public boolean isSetApplicabletostagingtable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(APPLICABLETOSTAGINGTABLE$0) != null;
            }
        }
        
        /**
         * Sets the "applicabletostagingtable" attribute
         */
        public void setApplicabletostagingtable(boolean applicabletostagingtable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICABLETOSTAGINGTABLE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLICABLETOSTAGINGTABLE$0);
                }
                target.setBooleanValue(applicabletostagingtable);
            }
        }
        
        /**
         * Sets (as xml) the "applicabletostagingtable" attribute
         */
        public void xsetApplicabletostagingtable(org.apache.xmlbeans.XmlBoolean applicabletostagingtable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLICABLETOSTAGINGTABLE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLICABLETOSTAGINGTABLE$0);
                }
                target.set(applicabletostagingtable);
            }
        }
        
        /**
         * Unsets the "applicabletostagingtable" attribute
         */
        public void unsetApplicabletostagingtable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(APPLICABLETOSTAGINGTABLE$0);
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
         * True if has "desc" attribute
         */
        public boolean isSetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DESC$2) != null;
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
         * Unsets the "desc" attribute
         */
        public void unsetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DESC$2);
            }
        }
        
        /**
         * Gets the "predicate" attribute
         */
        public java.lang.String getPredicate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREDICATE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "predicate" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPredicate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PREDICATE$4);
                return target;
            }
        }
        
        /**
         * True if has "predicate" attribute
         */
        public boolean isSetPredicate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PREDICATE$4) != null;
            }
        }
        
        /**
         * Sets the "predicate" attribute
         */
        public void setPredicate(java.lang.String predicate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREDICATE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PREDICATE$4);
                }
                target.setStringValue(predicate);
            }
        }
        
        /**
         * Sets (as xml) the "predicate" attribute
         */
        public void xsetPredicate(org.apache.xmlbeans.XmlString predicate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PREDICATE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PREDICATE$4);
                }
                target.set(predicate);
            }
        }
        
        /**
         * Unsets the "predicate" attribute
         */
        public void unsetPredicate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PREDICATE$4);
            }
        }
        
        /**
         * Gets the "stagingtablepredicate" attribute
         */
        public java.lang.String getStagingtablepredicate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STAGINGTABLEPREDICATE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "stagingtablepredicate" attribute
         */
        public org.apache.xmlbeans.XmlString xgetStagingtablepredicate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STAGINGTABLEPREDICATE$6);
                return target;
            }
        }
        
        /**
         * True if has "stagingtablepredicate" attribute
         */
        public boolean isSetStagingtablepredicate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STAGINGTABLEPREDICATE$6) != null;
            }
        }
        
        /**
         * Sets the "stagingtablepredicate" attribute
         */
        public void setStagingtablepredicate(java.lang.String stagingtablepredicate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STAGINGTABLEPREDICATE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STAGINGTABLEPREDICATE$6);
                }
                target.setStringValue(stagingtablepredicate);
            }
        }
        
        /**
         * Sets (as xml) the "stagingtablepredicate" attribute
         */
        public void xsetStagingtablepredicate(org.apache.xmlbeans.XmlString stagingtablepredicate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STAGINGTABLEPREDICATE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STAGINGTABLEPREDICATE$6);
                }
                target.set(stagingtablepredicate);
            }
        }
        
        /**
         * Unsets the "stagingtablepredicate" attribute
         */
        public void unsetStagingtablepredicate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STAGINGTABLEPREDICATE$6);
            }
        }
    }
}
