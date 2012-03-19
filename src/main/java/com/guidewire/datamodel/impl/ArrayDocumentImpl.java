/*
 * An XML document type.
 * Localname: array
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.ArrayDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one array(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class ArrayDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ArrayDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArrayDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAY$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "array");
    
    
    /**
     * Gets the "array" element
     */
    public com.guidewire.datamodel.ArrayDocument.Array getArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ArrayDocument.Array target = null;
            target = (com.guidewire.datamodel.ArrayDocument.Array)get_store().find_element_user(ARRAY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "array" element
     */
    public void setArray(com.guidewire.datamodel.ArrayDocument.Array array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ArrayDocument.Array target = null;
            target = (com.guidewire.datamodel.ArrayDocument.Array)get_store().find_element_user(ARRAY$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.ArrayDocument.Array)get_store().add_element_user(ARRAY$0);
            }
            target.set(array);
        }
    }
    
    /**
     * Appends and returns a new empty "array" element
     */
    public com.guidewire.datamodel.ArrayDocument.Array addNewArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ArrayDocument.Array target = null;
            target = (com.guidewire.datamodel.ArrayDocument.Array)get_store().add_element_user(ARRAY$0);
            return target;
        }
    }
    /**
     * An XML array(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class ArrayImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ArrayDocument.Array
    {
        private static final long serialVersionUID = 1L;
        
        public ArrayImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ARRAYASSOCIATION$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "array-association");
        private static final javax.xml.namespace.QName FULLDESCRIPTION$2 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "fulldescription");
        private static final javax.xml.namespace.QName LINKASSOCIATION$4 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "link-association");
        private static final javax.xml.namespace.QName ARRAYENTITY$6 = 
            new javax.xml.namespace.QName("", "arrayentity");
        private static final javax.xml.namespace.QName ARRAYFIELD$8 = 
            new javax.xml.namespace.QName("", "arrayfield");
        private static final javax.xml.namespace.QName CASCADEDELETE$10 = 
            new javax.xml.namespace.QName("", "cascadeDelete");
        private static final javax.xml.namespace.QName DEPRECATED$12 = 
            new javax.xml.namespace.QName("", "deprecated");
        private static final javax.xml.namespace.QName DESC$14 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName EXPORTABLE$16 = 
            new javax.xml.namespace.QName("", "exportable");
        private static final javax.xml.namespace.QName GENERATECODE$18 = 
            new javax.xml.namespace.QName("", "generateCode");
        private static final javax.xml.namespace.QName GETTERSCRIPTABILITY$20 = 
            new javax.xml.namespace.QName("", "getterScriptability");
        private static final javax.xml.namespace.QName IGNOREFOREVENTS$22 = 
            new javax.xml.namespace.QName("", "ignoreforevents");
        private static final javax.xml.namespace.QName NAME$24 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName OWNER$26 = 
            new javax.xml.namespace.QName("", "owner");
        private static final javax.xml.namespace.QName REQUIREDMATCH$28 = 
            new javax.xml.namespace.QName("", "requiredmatch");
        private static final javax.xml.namespace.QName SETTERSCRIPTABILITY$30 = 
            new javax.xml.namespace.QName("", "setterScriptability");
        private static final javax.xml.namespace.QName TRACKSSYNCHSTATE$32 = 
            new javax.xml.namespace.QName("", "trackssynchstate");
        private static final javax.xml.namespace.QName TRIGGERSVALIDATION$34 = 
            new javax.xml.namespace.QName("", "triggersValidation");
        
        
        /**
         * Gets array of all "array-association" elements
         */
        public com.guidewire.datamodel.ArrayAssociationDocument.ArrayAssociation[] getArrayAssociationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ARRAYASSOCIATION$0, targetList);
                com.guidewire.datamodel.ArrayAssociationDocument.ArrayAssociation[] result = new com.guidewire.datamodel.ArrayAssociationDocument.ArrayAssociation[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "array-association" element
         */
        public com.guidewire.datamodel.ArrayAssociationDocument.ArrayAssociation getArrayAssociationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ArrayAssociationDocument.ArrayAssociation target = null;
                target = (com.guidewire.datamodel.ArrayAssociationDocument.ArrayAssociation)get_store().find_element_user(ARRAYASSOCIATION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "array-association" element
         */
        public int sizeOfArrayAssociationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ARRAYASSOCIATION$0);
            }
        }
        
        /**
         * Sets array of all "array-association" element
         */
        public void setArrayAssociationArray(com.guidewire.datamodel.ArrayAssociationDocument.ArrayAssociation[] arrayAssociationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(arrayAssociationArray, ARRAYASSOCIATION$0);
            }
        }
        
        /**
         * Sets ith "array-association" element
         */
        public void setArrayAssociationArray(int i, com.guidewire.datamodel.ArrayAssociationDocument.ArrayAssociation arrayAssociation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ArrayAssociationDocument.ArrayAssociation target = null;
                target = (com.guidewire.datamodel.ArrayAssociationDocument.ArrayAssociation)get_store().find_element_user(ARRAYASSOCIATION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(arrayAssociation);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "array-association" element
         */
        public com.guidewire.datamodel.ArrayAssociationDocument.ArrayAssociation insertNewArrayAssociation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ArrayAssociationDocument.ArrayAssociation target = null;
                target = (com.guidewire.datamodel.ArrayAssociationDocument.ArrayAssociation)get_store().insert_element_user(ARRAYASSOCIATION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "array-association" element
         */
        public com.guidewire.datamodel.ArrayAssociationDocument.ArrayAssociation addNewArrayAssociation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ArrayAssociationDocument.ArrayAssociation target = null;
                target = (com.guidewire.datamodel.ArrayAssociationDocument.ArrayAssociation)get_store().add_element_user(ARRAYASSOCIATION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "array-association" element
         */
        public void removeArrayAssociation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ARRAYASSOCIATION$0, i);
            }
        }
        
        /**
         * Gets array of all "fulldescription" elements
         */
        public com.guidewire.datamodel.FulldescriptionDocument.Fulldescription[] getFulldescriptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FULLDESCRIPTION$2, targetList);
                com.guidewire.datamodel.FulldescriptionDocument.Fulldescription[] result = new com.guidewire.datamodel.FulldescriptionDocument.Fulldescription[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "fulldescription" element
         */
        public com.guidewire.datamodel.FulldescriptionDocument.Fulldescription getFulldescriptionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.FulldescriptionDocument.Fulldescription target = null;
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().find_element_user(FULLDESCRIPTION$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "fulldescription" element
         */
        public int sizeOfFulldescriptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FULLDESCRIPTION$2);
            }
        }
        
        /**
         * Sets array of all "fulldescription" element
         */
        public void setFulldescriptionArray(com.guidewire.datamodel.FulldescriptionDocument.Fulldescription[] fulldescriptionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(fulldescriptionArray, FULLDESCRIPTION$2);
            }
        }
        
        /**
         * Sets ith "fulldescription" element
         */
        public void setFulldescriptionArray(int i, com.guidewire.datamodel.FulldescriptionDocument.Fulldescription fulldescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.FulldescriptionDocument.Fulldescription target = null;
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().find_element_user(FULLDESCRIPTION$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(fulldescription);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "fulldescription" element
         */
        public com.guidewire.datamodel.FulldescriptionDocument.Fulldescription insertNewFulldescription(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.FulldescriptionDocument.Fulldescription target = null;
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().insert_element_user(FULLDESCRIPTION$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "fulldescription" element
         */
        public com.guidewire.datamodel.FulldescriptionDocument.Fulldescription addNewFulldescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.FulldescriptionDocument.Fulldescription target = null;
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().add_element_user(FULLDESCRIPTION$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "fulldescription" element
         */
        public void removeFulldescription(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FULLDESCRIPTION$2, i);
            }
        }
        
        /**
         * Gets array of all "link-association" elements
         */
        public com.guidewire.datamodel.LinkAssociationDocument.LinkAssociation[] getLinkAssociationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LINKASSOCIATION$4, targetList);
                com.guidewire.datamodel.LinkAssociationDocument.LinkAssociation[] result = new com.guidewire.datamodel.LinkAssociationDocument.LinkAssociation[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "link-association" element
         */
        public com.guidewire.datamodel.LinkAssociationDocument.LinkAssociation getLinkAssociationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.LinkAssociationDocument.LinkAssociation target = null;
                target = (com.guidewire.datamodel.LinkAssociationDocument.LinkAssociation)get_store().find_element_user(LINKASSOCIATION$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "link-association" element
         */
        public int sizeOfLinkAssociationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LINKASSOCIATION$4);
            }
        }
        
        /**
         * Sets array of all "link-association" element
         */
        public void setLinkAssociationArray(com.guidewire.datamodel.LinkAssociationDocument.LinkAssociation[] linkAssociationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(linkAssociationArray, LINKASSOCIATION$4);
            }
        }
        
        /**
         * Sets ith "link-association" element
         */
        public void setLinkAssociationArray(int i, com.guidewire.datamodel.LinkAssociationDocument.LinkAssociation linkAssociation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.LinkAssociationDocument.LinkAssociation target = null;
                target = (com.guidewire.datamodel.LinkAssociationDocument.LinkAssociation)get_store().find_element_user(LINKASSOCIATION$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(linkAssociation);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "link-association" element
         */
        public com.guidewire.datamodel.LinkAssociationDocument.LinkAssociation insertNewLinkAssociation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.LinkAssociationDocument.LinkAssociation target = null;
                target = (com.guidewire.datamodel.LinkAssociationDocument.LinkAssociation)get_store().insert_element_user(LINKASSOCIATION$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "link-association" element
         */
        public com.guidewire.datamodel.LinkAssociationDocument.LinkAssociation addNewLinkAssociation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.LinkAssociationDocument.LinkAssociation target = null;
                target = (com.guidewire.datamodel.LinkAssociationDocument.LinkAssociation)get_store().add_element_user(LINKASSOCIATION$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "link-association" element
         */
        public void removeLinkAssociation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LINKASSOCIATION$4, i);
            }
        }
        
        /**
         * Gets the "arrayentity" attribute
         */
        public java.lang.String getArrayentity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARRAYENTITY$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "arrayentity" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetArrayentity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(ARRAYENTITY$6);
                return target;
            }
        }
        
        /**
         * Sets the "arrayentity" attribute
         */
        public void setArrayentity(java.lang.String arrayentity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARRAYENTITY$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ARRAYENTITY$6);
                }
                target.setStringValue(arrayentity);
            }
        }
        
        /**
         * Sets (as xml) the "arrayentity" attribute
         */
        public void xsetArrayentity(org.apache.xmlbeans.XmlNMTOKEN arrayentity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(ARRAYENTITY$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(ARRAYENTITY$6);
                }
                target.set(arrayentity);
            }
        }
        
        /**
         * Gets the "arrayfield" attribute
         */
        public java.lang.String getArrayfield()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARRAYFIELD$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "arrayfield" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetArrayfield()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(ARRAYFIELD$8);
                return target;
            }
        }
        
        /**
         * True if has "arrayfield" attribute
         */
        public boolean isSetArrayfield()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ARRAYFIELD$8) != null;
            }
        }
        
        /**
         * Sets the "arrayfield" attribute
         */
        public void setArrayfield(java.lang.String arrayfield)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARRAYFIELD$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ARRAYFIELD$8);
                }
                target.setStringValue(arrayfield);
            }
        }
        
        /**
         * Sets (as xml) the "arrayfield" attribute
         */
        public void xsetArrayfield(org.apache.xmlbeans.XmlNMTOKEN arrayfield)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(ARRAYFIELD$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(ARRAYFIELD$8);
                }
                target.set(arrayfield);
            }
        }
        
        /**
         * Unsets the "arrayfield" attribute
         */
        public void unsetArrayfield()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ARRAYFIELD$8);
            }
        }
        
        /**
         * Gets the "cascadeDelete" attribute
         */
        public boolean getCascadeDelete()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CASCADEDELETE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CASCADEDELETE$10);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "cascadeDelete" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetCascadeDelete()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CASCADEDELETE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CASCADEDELETE$10);
                }
                return target;
            }
        }
        
        /**
         * True if has "cascadeDelete" attribute
         */
        public boolean isSetCascadeDelete()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CASCADEDELETE$10) != null;
            }
        }
        
        /**
         * Sets the "cascadeDelete" attribute
         */
        public void setCascadeDelete(boolean cascadeDelete)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CASCADEDELETE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CASCADEDELETE$10);
                }
                target.setBooleanValue(cascadeDelete);
            }
        }
        
        /**
         * Sets (as xml) the "cascadeDelete" attribute
         */
        public void xsetCascadeDelete(org.apache.xmlbeans.XmlBoolean cascadeDelete)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CASCADEDELETE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CASCADEDELETE$10);
                }
                target.set(cascadeDelete);
            }
        }
        
        /**
         * Unsets the "cascadeDelete" attribute
         */
        public void unsetCascadeDelete()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CASCADEDELETE$10);
            }
        }
        
        /**
         * Gets the "deprecated" attribute
         */
        public boolean getDeprecated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPRECATED$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DEPRECATED$12);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "deprecated" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetDeprecated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEPRECATED$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DEPRECATED$12);
                }
                return target;
            }
        }
        
        /**
         * True if has "deprecated" attribute
         */
        public boolean isSetDeprecated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEPRECATED$12) != null;
            }
        }
        
        /**
         * Sets the "deprecated" attribute
         */
        public void setDeprecated(boolean deprecated)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPRECATED$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEPRECATED$12);
                }
                target.setBooleanValue(deprecated);
            }
        }
        
        /**
         * Sets (as xml) the "deprecated" attribute
         */
        public void xsetDeprecated(org.apache.xmlbeans.XmlBoolean deprecated)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEPRECATED$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DEPRECATED$12);
                }
                target.set(deprecated);
            }
        }
        
        /**
         * Unsets the "deprecated" attribute
         */
        public void unsetDeprecated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEPRECATED$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$14);
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
                return get_store().find_attribute_user(DESC$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$14);
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
                get_store().remove_attribute(DESC$14);
            }
        }
        
        /**
         * Gets the "exportable" attribute
         */
        public boolean getExportable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPORTABLE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EXPORTABLE$16);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "exportable" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetExportable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXPORTABLE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EXPORTABLE$16);
                }
                return target;
            }
        }
        
        /**
         * True if has "exportable" attribute
         */
        public boolean isSetExportable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EXPORTABLE$16) != null;
            }
        }
        
        /**
         * Sets the "exportable" attribute
         */
        public void setExportable(boolean exportable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPORTABLE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXPORTABLE$16);
                }
                target.setBooleanValue(exportable);
            }
        }
        
        /**
         * Sets (as xml) the "exportable" attribute
         */
        public void xsetExportable(org.apache.xmlbeans.XmlBoolean exportable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXPORTABLE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EXPORTABLE$16);
                }
                target.set(exportable);
            }
        }
        
        /**
         * Unsets the "exportable" attribute
         */
        public void unsetExportable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EXPORTABLE$16);
            }
        }
        
        /**
         * Gets the "generateCode" attribute
         */
        public boolean getGenerateCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GENERATECODE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GENERATECODE$18);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "generateCode" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetGenerateCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GENERATECODE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(GENERATECODE$18);
                }
                return target;
            }
        }
        
        /**
         * True if has "generateCode" attribute
         */
        public boolean isSetGenerateCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GENERATECODE$18) != null;
            }
        }
        
        /**
         * Sets the "generateCode" attribute
         */
        public void setGenerateCode(boolean generateCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GENERATECODE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GENERATECODE$18);
                }
                target.setBooleanValue(generateCode);
            }
        }
        
        /**
         * Sets (as xml) the "generateCode" attribute
         */
        public void xsetGenerateCode(org.apache.xmlbeans.XmlBoolean generateCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GENERATECODE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(GENERATECODE$18);
                }
                target.set(generateCode);
            }
        }
        
        /**
         * Unsets the "generateCode" attribute
         */
        public void unsetGenerateCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GENERATECODE$18);
            }
        }
        
        /**
         * Gets the "getterScriptability" attribute
         */
        public com.guidewire.datamodel.ScriptabilityType.Enum getGetterScriptability()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GETTERSCRIPTABILITY$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GETTERSCRIPTABILITY$20);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.guidewire.datamodel.ScriptabilityType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "getterScriptability" attribute
         */
        public com.guidewire.datamodel.ScriptabilityType xgetGetterScriptability()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ScriptabilityType target = null;
                target = (com.guidewire.datamodel.ScriptabilityType)get_store().find_attribute_user(GETTERSCRIPTABILITY$20);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.ScriptabilityType)get_default_attribute_value(GETTERSCRIPTABILITY$20);
                }
                return target;
            }
        }
        
        /**
         * True if has "getterScriptability" attribute
         */
        public boolean isSetGetterScriptability()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GETTERSCRIPTABILITY$20) != null;
            }
        }
        
        /**
         * Sets the "getterScriptability" attribute
         */
        public void setGetterScriptability(com.guidewire.datamodel.ScriptabilityType.Enum getterScriptability)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GETTERSCRIPTABILITY$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GETTERSCRIPTABILITY$20);
                }
                target.setEnumValue(getterScriptability);
            }
        }
        
        /**
         * Sets (as xml) the "getterScriptability" attribute
         */
        public void xsetGetterScriptability(com.guidewire.datamodel.ScriptabilityType getterScriptability)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ScriptabilityType target = null;
                target = (com.guidewire.datamodel.ScriptabilityType)get_store().find_attribute_user(GETTERSCRIPTABILITY$20);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.ScriptabilityType)get_store().add_attribute_user(GETTERSCRIPTABILITY$20);
                }
                target.set(getterScriptability);
            }
        }
        
        /**
         * Unsets the "getterScriptability" attribute
         */
        public void unsetGetterScriptability()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GETTERSCRIPTABILITY$20);
            }
        }
        
        /**
         * Gets the "ignoreforevents" attribute
         */
        public boolean getIgnoreforevents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IGNOREFOREVENTS$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(IGNOREFOREVENTS$22);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "ignoreforevents" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetIgnoreforevents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(IGNOREFOREVENTS$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(IGNOREFOREVENTS$22);
                }
                return target;
            }
        }
        
        /**
         * True if has "ignoreforevents" attribute
         */
        public boolean isSetIgnoreforevents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(IGNOREFOREVENTS$22) != null;
            }
        }
        
        /**
         * Sets the "ignoreforevents" attribute
         */
        public void setIgnoreforevents(boolean ignoreforevents)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IGNOREFOREVENTS$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IGNOREFOREVENTS$22);
                }
                target.setBooleanValue(ignoreforevents);
            }
        }
        
        /**
         * Sets (as xml) the "ignoreforevents" attribute
         */
        public void xsetIgnoreforevents(org.apache.xmlbeans.XmlBoolean ignoreforevents)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(IGNOREFOREVENTS$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(IGNOREFOREVENTS$22);
                }
                target.set(ignoreforevents);
            }
        }
        
        /**
         * Unsets the "ignoreforevents" attribute
         */
        public void unsetIgnoreforevents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(IGNOREFOREVENTS$22);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$24);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$24);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$24);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(NAME$24);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "owner" attribute
         */
        public boolean getOwner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OWNER$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OWNER$26);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "owner" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetOwner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OWNER$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(OWNER$26);
                }
                return target;
            }
        }
        
        /**
         * True if has "owner" attribute
         */
        public boolean isSetOwner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OWNER$26) != null;
            }
        }
        
        /**
         * Sets the "owner" attribute
         */
        public void setOwner(boolean owner)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OWNER$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OWNER$26);
                }
                target.setBooleanValue(owner);
            }
        }
        
        /**
         * Sets (as xml) the "owner" attribute
         */
        public void xsetOwner(org.apache.xmlbeans.XmlBoolean owner)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OWNER$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(OWNER$26);
                }
                target.set(owner);
            }
        }
        
        /**
         * Unsets the "owner" attribute
         */
        public void unsetOwner()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OWNER$26);
            }
        }
        
        /**
         * Gets the "requiredmatch" attribute
         */
        public com.guidewire.datamodel.ContainerMatchType.Enum getRequiredmatch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUIREDMATCH$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REQUIREDMATCH$28);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.guidewire.datamodel.ContainerMatchType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "requiredmatch" attribute
         */
        public com.guidewire.datamodel.ContainerMatchType xgetRequiredmatch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ContainerMatchType target = null;
                target = (com.guidewire.datamodel.ContainerMatchType)get_store().find_attribute_user(REQUIREDMATCH$28);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.ContainerMatchType)get_default_attribute_value(REQUIREDMATCH$28);
                }
                return target;
            }
        }
        
        /**
         * True if has "requiredmatch" attribute
         */
        public boolean isSetRequiredmatch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REQUIREDMATCH$28) != null;
            }
        }
        
        /**
         * Sets the "requiredmatch" attribute
         */
        public void setRequiredmatch(com.guidewire.datamodel.ContainerMatchType.Enum requiredmatch)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUIREDMATCH$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUIREDMATCH$28);
                }
                target.setEnumValue(requiredmatch);
            }
        }
        
        /**
         * Sets (as xml) the "requiredmatch" attribute
         */
        public void xsetRequiredmatch(com.guidewire.datamodel.ContainerMatchType requiredmatch)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ContainerMatchType target = null;
                target = (com.guidewire.datamodel.ContainerMatchType)get_store().find_attribute_user(REQUIREDMATCH$28);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.ContainerMatchType)get_store().add_attribute_user(REQUIREDMATCH$28);
                }
                target.set(requiredmatch);
            }
        }
        
        /**
         * Unsets the "requiredmatch" attribute
         */
        public void unsetRequiredmatch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REQUIREDMATCH$28);
            }
        }
        
        /**
         * Gets the "setterScriptability" attribute
         */
        public com.guidewire.datamodel.ScriptabilityType.Enum getSetterScriptability()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETTERSCRIPTABILITY$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SETTERSCRIPTABILITY$30);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.guidewire.datamodel.ScriptabilityType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "setterScriptability" attribute
         */
        public com.guidewire.datamodel.ScriptabilityType xgetSetterScriptability()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ScriptabilityType target = null;
                target = (com.guidewire.datamodel.ScriptabilityType)get_store().find_attribute_user(SETTERSCRIPTABILITY$30);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.ScriptabilityType)get_default_attribute_value(SETTERSCRIPTABILITY$30);
                }
                return target;
            }
        }
        
        /**
         * True if has "setterScriptability" attribute
         */
        public boolean isSetSetterScriptability()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SETTERSCRIPTABILITY$30) != null;
            }
        }
        
        /**
         * Sets the "setterScriptability" attribute
         */
        public void setSetterScriptability(com.guidewire.datamodel.ScriptabilityType.Enum setterScriptability)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETTERSCRIPTABILITY$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SETTERSCRIPTABILITY$30);
                }
                target.setEnumValue(setterScriptability);
            }
        }
        
        /**
         * Sets (as xml) the "setterScriptability" attribute
         */
        public void xsetSetterScriptability(com.guidewire.datamodel.ScriptabilityType setterScriptability)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ScriptabilityType target = null;
                target = (com.guidewire.datamodel.ScriptabilityType)get_store().find_attribute_user(SETTERSCRIPTABILITY$30);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.ScriptabilityType)get_store().add_attribute_user(SETTERSCRIPTABILITY$30);
                }
                target.set(setterScriptability);
            }
        }
        
        /**
         * Unsets the "setterScriptability" attribute
         */
        public void unsetSetterScriptability()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SETTERSCRIPTABILITY$30);
            }
        }
        
        /**
         * Gets the "trackssynchstate" attribute
         */
        public boolean getTrackssynchstate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRACKSSYNCHSTATE$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TRACKSSYNCHSTATE$32);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "trackssynchstate" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetTrackssynchstate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRACKSSYNCHSTATE$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(TRACKSSYNCHSTATE$32);
                }
                return target;
            }
        }
        
        /**
         * True if has "trackssynchstate" attribute
         */
        public boolean isSetTrackssynchstate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TRACKSSYNCHSTATE$32) != null;
            }
        }
        
        /**
         * Sets the "trackssynchstate" attribute
         */
        public void setTrackssynchstate(boolean trackssynchstate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRACKSSYNCHSTATE$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRACKSSYNCHSTATE$32);
                }
                target.setBooleanValue(trackssynchstate);
            }
        }
        
        /**
         * Sets (as xml) the "trackssynchstate" attribute
         */
        public void xsetTrackssynchstate(org.apache.xmlbeans.XmlBoolean trackssynchstate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRACKSSYNCHSTATE$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TRACKSSYNCHSTATE$32);
                }
                target.set(trackssynchstate);
            }
        }
        
        /**
         * Unsets the "trackssynchstate" attribute
         */
        public void unsetTrackssynchstate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TRACKSSYNCHSTATE$32);
            }
        }
        
        /**
         * Gets the "triggersValidation" attribute
         */
        public boolean getTriggersValidation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRIGGERSVALIDATION$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TRIGGERSVALIDATION$34);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "triggersValidation" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetTriggersValidation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRIGGERSVALIDATION$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(TRIGGERSVALIDATION$34);
                }
                return target;
            }
        }
        
        /**
         * True if has "triggersValidation" attribute
         */
        public boolean isSetTriggersValidation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TRIGGERSVALIDATION$34) != null;
            }
        }
        
        /**
         * Sets the "triggersValidation" attribute
         */
        public void setTriggersValidation(boolean triggersValidation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRIGGERSVALIDATION$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRIGGERSVALIDATION$34);
                }
                target.setBooleanValue(triggersValidation);
            }
        }
        
        /**
         * Sets (as xml) the "triggersValidation" attribute
         */
        public void xsetTriggersValidation(org.apache.xmlbeans.XmlBoolean triggersValidation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRIGGERSVALIDATION$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TRIGGERSVALIDATION$34);
                }
                target.set(triggersValidation);
            }
        }
        
        /**
         * Unsets the "triggersValidation" attribute
         */
        public void unsetTriggersValidation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TRIGGERSVALIDATION$34);
            }
        }
    }
}
