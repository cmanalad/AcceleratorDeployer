/*
 * An XML document type.
 * Localname: matchingcolumn
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.MatchingcolumnDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one matchingcolumn(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class MatchingcolumnDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.MatchingcolumnDocument
{
    private static final long serialVersionUID = 1L;
    
    public MatchingcolumnDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MATCHINGCOLUMN$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "matchingcolumn");
    
    
    /**
     * Gets the "matchingcolumn" element
     */
    public com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn getMatchingcolumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn target = null;
            target = (com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn)get_store().find_element_user(MATCHINGCOLUMN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "matchingcolumn" element
     */
    public void setMatchingcolumn(com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn matchingcolumn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn target = null;
            target = (com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn)get_store().find_element_user(MATCHINGCOLUMN$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn)get_store().add_element_user(MATCHINGCOLUMN$0);
            }
            target.set(matchingcolumn);
        }
    }
    
    /**
     * Appends and returns a new empty "matchingcolumn" element
     */
    public com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn addNewMatchingcolumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn target = null;
            target = (com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn)get_store().add_element_user(MATCHINGCOLUMN$0);
            return target;
        }
    }
    /**
     * An XML matchingcolumn(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class MatchingcolumnImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn
    {
        private static final long serialVersionUID = 1L;
        
        public MatchingcolumnImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName JOINCOLUMN$0 = 
            new javax.xml.namespace.QName("", "joincolumn");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        
        
        /**
         * Gets the "joincolumn" attribute
         */
        public java.lang.String getJoincolumn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JOINCOLUMN$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "joincolumn" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetJoincolumn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(JOINCOLUMN$0);
                return target;
            }
        }
        
        /**
         * Sets the "joincolumn" attribute
         */
        public void setJoincolumn(java.lang.String joincolumn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JOINCOLUMN$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JOINCOLUMN$0);
                }
                target.setStringValue(joincolumn);
            }
        }
        
        /**
         * Sets (as xml) the "joincolumn" attribute
         */
        public void xsetJoincolumn(org.apache.xmlbeans.XmlNMTOKEN joincolumn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(JOINCOLUMN$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(JOINCOLUMN$0);
                }
                target.set(joincolumn);
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
    }
}
