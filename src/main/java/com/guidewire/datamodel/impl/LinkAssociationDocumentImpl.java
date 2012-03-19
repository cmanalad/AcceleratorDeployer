/*
 * An XML document type.
 * Localname: link-association
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.LinkAssociationDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one link-association(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class LinkAssociationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.LinkAssociationDocument
{
    private static final long serialVersionUID = 1L;
    
    public LinkAssociationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINKASSOCIATION$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "link-association");
    
    
    /**
     * Gets the "link-association" element
     */
    public com.guidewire.datamodel.LinkAssociationDocument.LinkAssociation getLinkAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.LinkAssociationDocument.LinkAssociation target = null;
            target = (com.guidewire.datamodel.LinkAssociationDocument.LinkAssociation)get_store().find_element_user(LINKASSOCIATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "link-association" element
     */
    public void setLinkAssociation(com.guidewire.datamodel.LinkAssociationDocument.LinkAssociation linkAssociation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.LinkAssociationDocument.LinkAssociation target = null;
            target = (com.guidewire.datamodel.LinkAssociationDocument.LinkAssociation)get_store().find_element_user(LINKASSOCIATION$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.LinkAssociationDocument.LinkAssociation)get_store().add_element_user(LINKASSOCIATION$0);
            }
            target.set(linkAssociation);
        }
    }
    
    /**
     * Appends and returns a new empty "link-association" element
     */
    public com.guidewire.datamodel.LinkAssociationDocument.LinkAssociation addNewLinkAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.LinkAssociationDocument.LinkAssociation target = null;
            target = (com.guidewire.datamodel.LinkAssociationDocument.LinkAssociation)get_store().add_element_user(LINKASSOCIATION$0);
            return target;
        }
    }
    /**
     * An XML link-association(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class LinkAssociationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.LinkAssociationDocument.LinkAssociation
    {
        private static final long serialVersionUID = 1L;
        
        public LinkAssociationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONSTANTMAP$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "constant-map");
        private static final javax.xml.namespace.QName SUBTYPEMAP$2 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "subtype-map");
        private static final javax.xml.namespace.QName TYPELISTMAP$4 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "typelist-map");
        private static final javax.xml.namespace.QName HASGETTER$6 = 
            new javax.xml.namespace.QName("", "hasGetter");
        private static final javax.xml.namespace.QName HASSETTER$8 = 
            new javax.xml.namespace.QName("", "hasSetter");
        private static final javax.xml.namespace.QName VALUEFIELD$10 = 
            new javax.xml.namespace.QName("", "valueField");
        
        
        /**
         * Gets array of all "constant-map" elements
         */
        public com.guidewire.datamodel.ConstantMapDocument.ConstantMap[] getConstantMapArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CONSTANTMAP$0, targetList);
                com.guidewire.datamodel.ConstantMapDocument.ConstantMap[] result = new com.guidewire.datamodel.ConstantMapDocument.ConstantMap[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "constant-map" element
         */
        public com.guidewire.datamodel.ConstantMapDocument.ConstantMap getConstantMapArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ConstantMapDocument.ConstantMap target = null;
                target = (com.guidewire.datamodel.ConstantMapDocument.ConstantMap)get_store().find_element_user(CONSTANTMAP$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "constant-map" element
         */
        public int sizeOfConstantMapArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONSTANTMAP$0);
            }
        }
        
        /**
         * Sets array of all "constant-map" element
         */
        public void setConstantMapArray(com.guidewire.datamodel.ConstantMapDocument.ConstantMap[] constantMapArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(constantMapArray, CONSTANTMAP$0);
            }
        }
        
        /**
         * Sets ith "constant-map" element
         */
        public void setConstantMapArray(int i, com.guidewire.datamodel.ConstantMapDocument.ConstantMap constantMap)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ConstantMapDocument.ConstantMap target = null;
                target = (com.guidewire.datamodel.ConstantMapDocument.ConstantMap)get_store().find_element_user(CONSTANTMAP$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(constantMap);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "constant-map" element
         */
        public com.guidewire.datamodel.ConstantMapDocument.ConstantMap insertNewConstantMap(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ConstantMapDocument.ConstantMap target = null;
                target = (com.guidewire.datamodel.ConstantMapDocument.ConstantMap)get_store().insert_element_user(CONSTANTMAP$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "constant-map" element
         */
        public com.guidewire.datamodel.ConstantMapDocument.ConstantMap addNewConstantMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ConstantMapDocument.ConstantMap target = null;
                target = (com.guidewire.datamodel.ConstantMapDocument.ConstantMap)get_store().add_element_user(CONSTANTMAP$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "constant-map" element
         */
        public void removeConstantMap(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONSTANTMAP$0, i);
            }
        }
        
        /**
         * Gets array of all "subtype-map" elements
         */
        public com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap[] getSubtypeMapArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SUBTYPEMAP$2, targetList);
                com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap[] result = new com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "subtype-map" element
         */
        public com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap getSubtypeMapArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap target = null;
                target = (com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap)get_store().find_element_user(SUBTYPEMAP$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "subtype-map" element
         */
        public int sizeOfSubtypeMapArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBTYPEMAP$2);
            }
        }
        
        /**
         * Sets array of all "subtype-map" element
         */
        public void setSubtypeMapArray(com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap[] subtypeMapArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(subtypeMapArray, SUBTYPEMAP$2);
            }
        }
        
        /**
         * Sets ith "subtype-map" element
         */
        public void setSubtypeMapArray(int i, com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap subtypeMap)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap target = null;
                target = (com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap)get_store().find_element_user(SUBTYPEMAP$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(subtypeMap);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "subtype-map" element
         */
        public com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap insertNewSubtypeMap(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap target = null;
                target = (com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap)get_store().insert_element_user(SUBTYPEMAP$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "subtype-map" element
         */
        public com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap addNewSubtypeMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap target = null;
                target = (com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap)get_store().add_element_user(SUBTYPEMAP$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "subtype-map" element
         */
        public void removeSubtypeMap(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBTYPEMAP$2, i);
            }
        }
        
        /**
         * Gets array of all "typelist-map" elements
         */
        public com.guidewire.datamodel.TypelistMapDocument.TypelistMap[] getTypelistMapArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TYPELISTMAP$4, targetList);
                com.guidewire.datamodel.TypelistMapDocument.TypelistMap[] result = new com.guidewire.datamodel.TypelistMapDocument.TypelistMap[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "typelist-map" element
         */
        public com.guidewire.datamodel.TypelistMapDocument.TypelistMap getTypelistMapArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.TypelistMapDocument.TypelistMap target = null;
                target = (com.guidewire.datamodel.TypelistMapDocument.TypelistMap)get_store().find_element_user(TYPELISTMAP$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "typelist-map" element
         */
        public int sizeOfTypelistMapArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TYPELISTMAP$4);
            }
        }
        
        /**
         * Sets array of all "typelist-map" element
         */
        public void setTypelistMapArray(com.guidewire.datamodel.TypelistMapDocument.TypelistMap[] typelistMapArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(typelistMapArray, TYPELISTMAP$4);
            }
        }
        
        /**
         * Sets ith "typelist-map" element
         */
        public void setTypelistMapArray(int i, com.guidewire.datamodel.TypelistMapDocument.TypelistMap typelistMap)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.TypelistMapDocument.TypelistMap target = null;
                target = (com.guidewire.datamodel.TypelistMapDocument.TypelistMap)get_store().find_element_user(TYPELISTMAP$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(typelistMap);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "typelist-map" element
         */
        public com.guidewire.datamodel.TypelistMapDocument.TypelistMap insertNewTypelistMap(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.TypelistMapDocument.TypelistMap target = null;
                target = (com.guidewire.datamodel.TypelistMapDocument.TypelistMap)get_store().insert_element_user(TYPELISTMAP$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "typelist-map" element
         */
        public com.guidewire.datamodel.TypelistMapDocument.TypelistMap addNewTypelistMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.TypelistMapDocument.TypelistMap target = null;
                target = (com.guidewire.datamodel.TypelistMapDocument.TypelistMap)get_store().add_element_user(TYPELISTMAP$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "typelist-map" element
         */
        public void removeTypelistMap(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TYPELISTMAP$4, i);
            }
        }
        
        /**
         * Gets the "hasGetter" attribute
         */
        public boolean getHasGetter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HASGETTER$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HASGETTER$6);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "hasGetter" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetHasGetter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HASGETTER$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HASGETTER$6);
                }
                return target;
            }
        }
        
        /**
         * True if has "hasGetter" attribute
         */
        public boolean isSetHasGetter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HASGETTER$6) != null;
            }
        }
        
        /**
         * Sets the "hasGetter" attribute
         */
        public void setHasGetter(boolean hasGetter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HASGETTER$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HASGETTER$6);
                }
                target.setBooleanValue(hasGetter);
            }
        }
        
        /**
         * Sets (as xml) the "hasGetter" attribute
         */
        public void xsetHasGetter(org.apache.xmlbeans.XmlBoolean hasGetter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HASGETTER$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HASGETTER$6);
                }
                target.set(hasGetter);
            }
        }
        
        /**
         * Unsets the "hasGetter" attribute
         */
        public void unsetHasGetter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HASGETTER$6);
            }
        }
        
        /**
         * Gets the "hasSetter" attribute
         */
        public boolean getHasSetter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HASSETTER$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HASSETTER$8);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "hasSetter" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetHasSetter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HASSETTER$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HASSETTER$8);
                }
                return target;
            }
        }
        
        /**
         * True if has "hasSetter" attribute
         */
        public boolean isSetHasSetter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HASSETTER$8) != null;
            }
        }
        
        /**
         * Sets the "hasSetter" attribute
         */
        public void setHasSetter(boolean hasSetter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HASSETTER$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HASSETTER$8);
                }
                target.setBooleanValue(hasSetter);
            }
        }
        
        /**
         * Sets (as xml) the "hasSetter" attribute
         */
        public void xsetHasSetter(org.apache.xmlbeans.XmlBoolean hasSetter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HASSETTER$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HASSETTER$8);
                }
                target.set(hasSetter);
            }
        }
        
        /**
         * Unsets the "hasSetter" attribute
         */
        public void unsetHasSetter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HASSETTER$8);
            }
        }
        
        /**
         * Gets the "valueField" attribute
         */
        public java.lang.String getValueField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUEFIELD$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VALUEFIELD$10);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "valueField" attribute
         */
        public org.apache.xmlbeans.XmlString xgetValueField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUEFIELD$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(VALUEFIELD$10);
                }
                return target;
            }
        }
        
        /**
         * True if has "valueField" attribute
         */
        public boolean isSetValueField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALUEFIELD$10) != null;
            }
        }
        
        /**
         * Sets the "valueField" attribute
         */
        public void setValueField(java.lang.String valueField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUEFIELD$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUEFIELD$10);
                }
                target.setStringValue(valueField);
            }
        }
        
        /**
         * Sets (as xml) the "valueField" attribute
         */
        public void xsetValueField(org.apache.xmlbeans.XmlString valueField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUEFIELD$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUEFIELD$10);
                }
                target.set(valueField);
            }
        }
        
        /**
         * Unsets the "valueField" attribute
         */
        public void unsetValueField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALUEFIELD$10);
            }
        }
    }
}
