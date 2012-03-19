/*
 * An XML document type.
 * Localname: edgeForeignKey
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.EdgeForeignKeyDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one edgeForeignKey(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class EdgeForeignKeyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.EdgeForeignKeyDocument
{
    private static final long serialVersionUID = 1L;
    
    public EdgeForeignKeyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EDGEFOREIGNKEY$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "edgeForeignKey");
    
    
    /**
     * Gets the "edgeForeignKey" element
     */
    public com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey getEdgeForeignKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey target = null;
            target = (com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey)get_store().find_element_user(EDGEFOREIGNKEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "edgeForeignKey" element
     */
    public void setEdgeForeignKey(com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey edgeForeignKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey target = null;
            target = (com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey)get_store().find_element_user(EDGEFOREIGNKEY$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey)get_store().add_element_user(EDGEFOREIGNKEY$0);
            }
            target.set(edgeForeignKey);
        }
    }
    
    /**
     * Appends and returns a new empty "edgeForeignKey" element
     */
    public com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey addNewEdgeForeignKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey target = null;
            target = (com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey)get_store().add_element_user(EDGEFOREIGNKEY$0);
            return target;
        }
    }
    /**
     * An XML edgeForeignKey(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class EdgeForeignKeyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey
    {
        private static final long serialVersionUID = 1L;
        
        public EdgeForeignKeyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FULLDESCRIPTION$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "fulldescription");
        private static final javax.xml.namespace.QName IMPLEMENTSENTITY$2 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "implementsEntity");
        private static final javax.xml.namespace.QName CREATEHISTOGRAM$4 = 
            new javax.xml.namespace.QName("", "createhistogram");
        private static final javax.xml.namespace.QName DELETEFK$6 = 
            new javax.xml.namespace.QName("", "deletefk");
        private static final javax.xml.namespace.QName DEPRECATED$8 = 
            new javax.xml.namespace.QName("", "deprecated");
        private static final javax.xml.namespace.QName DESC$10 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName EDGETABLEENTITYNAME$12 = 
            new javax.xml.namespace.QName("", "edgeTableEntityName");
        private static final javax.xml.namespace.QName EDGETABLENAME$14 = 
            new javax.xml.namespace.QName("", "edgeTableName");
        private static final javax.xml.namespace.QName EXPORTABLE$16 = 
            new javax.xml.namespace.QName("", "exportable");
        private static final javax.xml.namespace.QName EXPORTASID$18 = 
            new javax.xml.namespace.QName("", "exportasid");
        private static final javax.xml.namespace.QName FKENTITY$20 = 
            new javax.xml.namespace.QName("", "fkentity");
        private static final javax.xml.namespace.QName GENERATECODE$22 = 
            new javax.xml.namespace.QName("", "generateCode");
        private static final javax.xml.namespace.QName GETTERSCRIPTABILITY$24 = 
            new javax.xml.namespace.QName("", "getterScriptability");
        private static final javax.xml.namespace.QName IGNOREFOREVENTS$26 = 
            new javax.xml.namespace.QName("", "ignoreforevents");
        private static final javax.xml.namespace.QName IMPORTABLEAGAINSTEXISTINGOBJECT$28 = 
            new javax.xml.namespace.QName("", "importableagainstexistingobject");
        private static final javax.xml.namespace.QName LOADABLE$30 = 
            new javax.xml.namespace.QName("", "loadable");
        private static final javax.xml.namespace.QName NAME$32 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName NULLOK$34 = 
            new javax.xml.namespace.QName("", "nullok");
        private static final javax.xml.namespace.QName ONDELETE$36 = 
            new javax.xml.namespace.QName("", "ondelete");
        private static final javax.xml.namespace.QName OVERWRITTENINSTAGINGTABLE$38 = 
            new javax.xml.namespace.QName("", "overwrittenInStagingTable");
        private static final javax.xml.namespace.QName SETTERSCRIPTABILITY$40 = 
            new javax.xml.namespace.QName("", "setterScriptability");
        private static final javax.xml.namespace.QName SOAPNULLOK$42 = 
            new javax.xml.namespace.QName("", "soapnullok");
        
        
        /**
         * Gets array of all "fulldescription" elements
         */
        public com.guidewire.datamodel.FulldescriptionDocument.Fulldescription[] getFulldescriptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FULLDESCRIPTION$0, targetList);
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
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().find_element_user(FULLDESCRIPTION$0, i);
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
                return get_store().count_elements(FULLDESCRIPTION$0);
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
                arraySetterHelper(fulldescriptionArray, FULLDESCRIPTION$0);
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
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().find_element_user(FULLDESCRIPTION$0, i);
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
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().insert_element_user(FULLDESCRIPTION$0, i);
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
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().add_element_user(FULLDESCRIPTION$0);
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
                get_store().remove_element(FULLDESCRIPTION$0, i);
            }
        }
        
        /**
         * Gets array of all "implementsEntity" elements
         */
        public com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity[] getImplementsEntityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IMPLEMENTSENTITY$2, targetList);
                com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity[] result = new com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "implementsEntity" element
         */
        public com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity getImplementsEntityArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity target = null;
                target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().find_element_user(IMPLEMENTSENTITY$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "implementsEntity" element
         */
        public int sizeOfImplementsEntityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IMPLEMENTSENTITY$2);
            }
        }
        
        /**
         * Sets array of all "implementsEntity" element
         */
        public void setImplementsEntityArray(com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity[] implementsEntityArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(implementsEntityArray, IMPLEMENTSENTITY$2);
            }
        }
        
        /**
         * Sets ith "implementsEntity" element
         */
        public void setImplementsEntityArray(int i, com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity implementsEntity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity target = null;
                target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().find_element_user(IMPLEMENTSENTITY$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(implementsEntity);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "implementsEntity" element
         */
        public com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity insertNewImplementsEntity(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity target = null;
                target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().insert_element_user(IMPLEMENTSENTITY$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "implementsEntity" element
         */
        public com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity addNewImplementsEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity target = null;
                target = (com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity)get_store().add_element_user(IMPLEMENTSENTITY$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "implementsEntity" element
         */
        public void removeImplementsEntity(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IMPLEMENTSENTITY$2, i);
            }
        }
        
        /**
         * Gets the "createhistogram" attribute
         */
        public boolean getCreatehistogram()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEHISTOGRAM$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CREATEHISTOGRAM$4);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "createhistogram" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetCreatehistogram()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CREATEHISTOGRAM$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CREATEHISTOGRAM$4);
                }
                return target;
            }
        }
        
        /**
         * True if has "createhistogram" attribute
         */
        public boolean isSetCreatehistogram()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CREATEHISTOGRAM$4) != null;
            }
        }
        
        /**
         * Sets the "createhistogram" attribute
         */
        public void setCreatehistogram(boolean createhistogram)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEHISTOGRAM$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CREATEHISTOGRAM$4);
                }
                target.setBooleanValue(createhistogram);
            }
        }
        
        /**
         * Sets (as xml) the "createhistogram" attribute
         */
        public void xsetCreatehistogram(org.apache.xmlbeans.XmlBoolean createhistogram)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CREATEHISTOGRAM$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CREATEHISTOGRAM$4);
                }
                target.set(createhistogram);
            }
        }
        
        /**
         * Unsets the "createhistogram" attribute
         */
        public void unsetCreatehistogram()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CREATEHISTOGRAM$4);
            }
        }
        
        /**
         * Gets the "deletefk" attribute
         */
        public boolean getDeletefk()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELETEFK$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DELETEFK$6);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "deletefk" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetDeletefk()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DELETEFK$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DELETEFK$6);
                }
                return target;
            }
        }
        
        /**
         * True if has "deletefk" attribute
         */
        public boolean isSetDeletefk()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DELETEFK$6) != null;
            }
        }
        
        /**
         * Sets the "deletefk" attribute
         */
        public void setDeletefk(boolean deletefk)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELETEFK$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DELETEFK$6);
                }
                target.setBooleanValue(deletefk);
            }
        }
        
        /**
         * Sets (as xml) the "deletefk" attribute
         */
        public void xsetDeletefk(org.apache.xmlbeans.XmlBoolean deletefk)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DELETEFK$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DELETEFK$6);
                }
                target.set(deletefk);
            }
        }
        
        /**
         * Unsets the "deletefk" attribute
         */
        public void unsetDeletefk()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DELETEFK$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPRECATED$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DEPRECATED$8);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEPRECATED$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DEPRECATED$8);
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
                return get_store().find_attribute_user(DEPRECATED$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPRECATED$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEPRECATED$8);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEPRECATED$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DEPRECATED$8);
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
                get_store().remove_attribute(DEPRECATED$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$10);
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
                return get_store().find_attribute_user(DESC$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$10);
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
                get_store().remove_attribute(DESC$10);
            }
        }
        
        /**
         * Gets the "edgeTableEntityName" attribute
         */
        public java.lang.String getEdgeTableEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDGETABLEENTITYNAME$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "edgeTableEntityName" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetEdgeTableEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(EDGETABLEENTITYNAME$12);
                return target;
            }
        }
        
        /**
         * True if has "edgeTableEntityName" attribute
         */
        public boolean isSetEdgeTableEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EDGETABLEENTITYNAME$12) != null;
            }
        }
        
        /**
         * Sets the "edgeTableEntityName" attribute
         */
        public void setEdgeTableEntityName(java.lang.String edgeTableEntityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDGETABLEENTITYNAME$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EDGETABLEENTITYNAME$12);
                }
                target.setStringValue(edgeTableEntityName);
            }
        }
        
        /**
         * Sets (as xml) the "edgeTableEntityName" attribute
         */
        public void xsetEdgeTableEntityName(org.apache.xmlbeans.XmlNMTOKEN edgeTableEntityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(EDGETABLEENTITYNAME$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(EDGETABLEENTITYNAME$12);
                }
                target.set(edgeTableEntityName);
            }
        }
        
        /**
         * Unsets the "edgeTableEntityName" attribute
         */
        public void unsetEdgeTableEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EDGETABLEENTITYNAME$12);
            }
        }
        
        /**
         * Gets the "edgeTableName" attribute
         */
        public java.lang.String getEdgeTableName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDGETABLENAME$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "edgeTableName" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetEdgeTableName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(EDGETABLENAME$14);
                return target;
            }
        }
        
        /**
         * Sets the "edgeTableName" attribute
         */
        public void setEdgeTableName(java.lang.String edgeTableName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDGETABLENAME$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EDGETABLENAME$14);
                }
                target.setStringValue(edgeTableName);
            }
        }
        
        /**
         * Sets (as xml) the "edgeTableName" attribute
         */
        public void xsetEdgeTableName(org.apache.xmlbeans.XmlNMTOKEN edgeTableName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(EDGETABLENAME$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(EDGETABLENAME$14);
                }
                target.set(edgeTableName);
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
         * Gets the "exportasid" attribute
         */
        public boolean getExportasid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPORTASID$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EXPORTASID$18);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "exportasid" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetExportasid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXPORTASID$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EXPORTASID$18);
                }
                return target;
            }
        }
        
        /**
         * True if has "exportasid" attribute
         */
        public boolean isSetExportasid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EXPORTASID$18) != null;
            }
        }
        
        /**
         * Sets the "exportasid" attribute
         */
        public void setExportasid(boolean exportasid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPORTASID$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXPORTASID$18);
                }
                target.setBooleanValue(exportasid);
            }
        }
        
        /**
         * Sets (as xml) the "exportasid" attribute
         */
        public void xsetExportasid(org.apache.xmlbeans.XmlBoolean exportasid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXPORTASID$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EXPORTASID$18);
                }
                target.set(exportasid);
            }
        }
        
        /**
         * Unsets the "exportasid" attribute
         */
        public void unsetExportasid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EXPORTASID$18);
            }
        }
        
        /**
         * Gets the "fkentity" attribute
         */
        public java.lang.String getFkentity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FKENTITY$20);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fkentity" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetFkentity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(FKENTITY$20);
                return target;
            }
        }
        
        /**
         * Sets the "fkentity" attribute
         */
        public void setFkentity(java.lang.String fkentity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FKENTITY$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FKENTITY$20);
                }
                target.setStringValue(fkentity);
            }
        }
        
        /**
         * Sets (as xml) the "fkentity" attribute
         */
        public void xsetFkentity(org.apache.xmlbeans.XmlNMTOKEN fkentity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(FKENTITY$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(FKENTITY$20);
                }
                target.set(fkentity);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GENERATECODE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GENERATECODE$22);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GENERATECODE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(GENERATECODE$22);
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
                return get_store().find_attribute_user(GENERATECODE$22) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GENERATECODE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GENERATECODE$22);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GENERATECODE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(GENERATECODE$22);
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
                get_store().remove_attribute(GENERATECODE$22);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GETTERSCRIPTABILITY$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GETTERSCRIPTABILITY$24);
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
                target = (com.guidewire.datamodel.ScriptabilityType)get_store().find_attribute_user(GETTERSCRIPTABILITY$24);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.ScriptabilityType)get_default_attribute_value(GETTERSCRIPTABILITY$24);
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
                return get_store().find_attribute_user(GETTERSCRIPTABILITY$24) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GETTERSCRIPTABILITY$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GETTERSCRIPTABILITY$24);
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
                target = (com.guidewire.datamodel.ScriptabilityType)get_store().find_attribute_user(GETTERSCRIPTABILITY$24);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.ScriptabilityType)get_store().add_attribute_user(GETTERSCRIPTABILITY$24);
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
                get_store().remove_attribute(GETTERSCRIPTABILITY$24);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IGNOREFOREVENTS$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(IGNOREFOREVENTS$26);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(IGNOREFOREVENTS$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(IGNOREFOREVENTS$26);
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
                return get_store().find_attribute_user(IGNOREFOREVENTS$26) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IGNOREFOREVENTS$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IGNOREFOREVENTS$26);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(IGNOREFOREVENTS$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(IGNOREFOREVENTS$26);
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
                get_store().remove_attribute(IGNOREFOREVENTS$26);
            }
        }
        
        /**
         * Gets the "importableagainstexistingobject" attribute
         */
        public boolean getImportableagainstexistingobject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMPORTABLEAGAINSTEXISTINGOBJECT$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(IMPORTABLEAGAINSTEXISTINGOBJECT$28);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "importableagainstexistingobject" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetImportableagainstexistingobject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(IMPORTABLEAGAINSTEXISTINGOBJECT$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(IMPORTABLEAGAINSTEXISTINGOBJECT$28);
                }
                return target;
            }
        }
        
        /**
         * True if has "importableagainstexistingobject" attribute
         */
        public boolean isSetImportableagainstexistingobject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(IMPORTABLEAGAINSTEXISTINGOBJECT$28) != null;
            }
        }
        
        /**
         * Sets the "importableagainstexistingobject" attribute
         */
        public void setImportableagainstexistingobject(boolean importableagainstexistingobject)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMPORTABLEAGAINSTEXISTINGOBJECT$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IMPORTABLEAGAINSTEXISTINGOBJECT$28);
                }
                target.setBooleanValue(importableagainstexistingobject);
            }
        }
        
        /**
         * Sets (as xml) the "importableagainstexistingobject" attribute
         */
        public void xsetImportableagainstexistingobject(org.apache.xmlbeans.XmlBoolean importableagainstexistingobject)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(IMPORTABLEAGAINSTEXISTINGOBJECT$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(IMPORTABLEAGAINSTEXISTINGOBJECT$28);
                }
                target.set(importableagainstexistingobject);
            }
        }
        
        /**
         * Unsets the "importableagainstexistingobject" attribute
         */
        public void unsetImportableagainstexistingobject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(IMPORTABLEAGAINSTEXISTINGOBJECT$28);
            }
        }
        
        /**
         * Gets the "loadable" attribute
         */
        public boolean getLoadable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOADABLE$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LOADABLE$30);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "loadable" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetLoadable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOADABLE$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(LOADABLE$30);
                }
                return target;
            }
        }
        
        /**
         * True if has "loadable" attribute
         */
        public boolean isSetLoadable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LOADABLE$30) != null;
            }
        }
        
        /**
         * Sets the "loadable" attribute
         */
        public void setLoadable(boolean loadable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOADABLE$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOADABLE$30);
                }
                target.setBooleanValue(loadable);
            }
        }
        
        /**
         * Sets (as xml) the "loadable" attribute
         */
        public void xsetLoadable(org.apache.xmlbeans.XmlBoolean loadable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOADABLE$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LOADABLE$30);
                }
                target.set(loadable);
            }
        }
        
        /**
         * Unsets the "loadable" attribute
         */
        public void unsetLoadable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LOADABLE$30);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$32);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$32);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$32);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(NAME$32);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "nullok" attribute
         */
        public boolean getNullok()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLOK$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NULLOK$34);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "nullok" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetNullok()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NULLOK$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(NULLOK$34);
                }
                return target;
            }
        }
        
        /**
         * True if has "nullok" attribute
         */
        public boolean isSetNullok()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NULLOK$34) != null;
            }
        }
        
        /**
         * Sets the "nullok" attribute
         */
        public void setNullok(boolean nullok)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLOK$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLOK$34);
                }
                target.setBooleanValue(nullok);
            }
        }
        
        /**
         * Sets (as xml) the "nullok" attribute
         */
        public void xsetNullok(org.apache.xmlbeans.XmlBoolean nullok)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NULLOK$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NULLOK$34);
                }
                target.set(nullok);
            }
        }
        
        /**
         * Unsets the "nullok" attribute
         */
        public void unsetNullok()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NULLOK$34);
            }
        }
        
        /**
         * Gets the "ondelete" attribute
         */
        public com.guidewire.datamodel.OnDelete.Enum getOndelete()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONDELETE$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ONDELETE$36);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.guidewire.datamodel.OnDelete.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "ondelete" attribute
         */
        public com.guidewire.datamodel.OnDelete xgetOndelete()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.OnDelete target = null;
                target = (com.guidewire.datamodel.OnDelete)get_store().find_attribute_user(ONDELETE$36);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.OnDelete)get_default_attribute_value(ONDELETE$36);
                }
                return target;
            }
        }
        
        /**
         * True if has "ondelete" attribute
         */
        public boolean isSetOndelete()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ONDELETE$36) != null;
            }
        }
        
        /**
         * Sets the "ondelete" attribute
         */
        public void setOndelete(com.guidewire.datamodel.OnDelete.Enum ondelete)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONDELETE$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONDELETE$36);
                }
                target.setEnumValue(ondelete);
            }
        }
        
        /**
         * Sets (as xml) the "ondelete" attribute
         */
        public void xsetOndelete(com.guidewire.datamodel.OnDelete ondelete)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.OnDelete target = null;
                target = (com.guidewire.datamodel.OnDelete)get_store().find_attribute_user(ONDELETE$36);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.OnDelete)get_store().add_attribute_user(ONDELETE$36);
                }
                target.set(ondelete);
            }
        }
        
        /**
         * Unsets the "ondelete" attribute
         */
        public void unsetOndelete()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ONDELETE$36);
            }
        }
        
        /**
         * Gets the "overwrittenInStagingTable" attribute
         */
        public boolean getOverwrittenInStagingTable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OVERWRITTENINSTAGINGTABLE$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OVERWRITTENINSTAGINGTABLE$38);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "overwrittenInStagingTable" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetOverwrittenInStagingTable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OVERWRITTENINSTAGINGTABLE$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(OVERWRITTENINSTAGINGTABLE$38);
                }
                return target;
            }
        }
        
        /**
         * True if has "overwrittenInStagingTable" attribute
         */
        public boolean isSetOverwrittenInStagingTable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OVERWRITTENINSTAGINGTABLE$38) != null;
            }
        }
        
        /**
         * Sets the "overwrittenInStagingTable" attribute
         */
        public void setOverwrittenInStagingTable(boolean overwrittenInStagingTable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OVERWRITTENINSTAGINGTABLE$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OVERWRITTENINSTAGINGTABLE$38);
                }
                target.setBooleanValue(overwrittenInStagingTable);
            }
        }
        
        /**
         * Sets (as xml) the "overwrittenInStagingTable" attribute
         */
        public void xsetOverwrittenInStagingTable(org.apache.xmlbeans.XmlBoolean overwrittenInStagingTable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OVERWRITTENINSTAGINGTABLE$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(OVERWRITTENINSTAGINGTABLE$38);
                }
                target.set(overwrittenInStagingTable);
            }
        }
        
        /**
         * Unsets the "overwrittenInStagingTable" attribute
         */
        public void unsetOverwrittenInStagingTable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OVERWRITTENINSTAGINGTABLE$38);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETTERSCRIPTABILITY$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SETTERSCRIPTABILITY$40);
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
                target = (com.guidewire.datamodel.ScriptabilityType)get_store().find_attribute_user(SETTERSCRIPTABILITY$40);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.ScriptabilityType)get_default_attribute_value(SETTERSCRIPTABILITY$40);
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
                return get_store().find_attribute_user(SETTERSCRIPTABILITY$40) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETTERSCRIPTABILITY$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SETTERSCRIPTABILITY$40);
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
                target = (com.guidewire.datamodel.ScriptabilityType)get_store().find_attribute_user(SETTERSCRIPTABILITY$40);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.ScriptabilityType)get_store().add_attribute_user(SETTERSCRIPTABILITY$40);
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
                get_store().remove_attribute(SETTERSCRIPTABILITY$40);
            }
        }
        
        /**
         * Gets the "soapnullok" attribute
         */
        public boolean getSoapnullok()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOAPNULLOK$42);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "soapnullok" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetSoapnullok()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SOAPNULLOK$42);
                return target;
            }
        }
        
        /**
         * True if has "soapnullok" attribute
         */
        public boolean isSetSoapnullok()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SOAPNULLOK$42) != null;
            }
        }
        
        /**
         * Sets the "soapnullok" attribute
         */
        public void setSoapnullok(boolean soapnullok)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOAPNULLOK$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOAPNULLOK$42);
                }
                target.setBooleanValue(soapnullok);
            }
        }
        
        /**
         * Sets (as xml) the "soapnullok" attribute
         */
        public void xsetSoapnullok(org.apache.xmlbeans.XmlBoolean soapnullok)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SOAPNULLOK$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SOAPNULLOK$42);
                }
                target.set(soapnullok);
            }
        }
        
        /**
         * Unsets the "soapnullok" attribute
         */
        public void unsetSoapnullok()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SOAPNULLOK$42);
            }
        }
    }
}
