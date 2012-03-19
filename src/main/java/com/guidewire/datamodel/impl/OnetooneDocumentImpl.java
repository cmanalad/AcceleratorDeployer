/*
 * An XML document type.
 * Localname: onetoone
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.OnetooneDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one onetoone(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class OnetooneDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.OnetooneDocument
{
    private static final long serialVersionUID = 1L;
    
    public OnetooneDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ONETOONE$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "onetoone");
    
    
    /**
     * Gets the "onetoone" element
     */
    public com.guidewire.datamodel.OnetooneDocument.Onetoone getOnetoone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.OnetooneDocument.Onetoone target = null;
            target = (com.guidewire.datamodel.OnetooneDocument.Onetoone)get_store().find_element_user(ONETOONE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "onetoone" element
     */
    public void setOnetoone(com.guidewire.datamodel.OnetooneDocument.Onetoone onetoone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.OnetooneDocument.Onetoone target = null;
            target = (com.guidewire.datamodel.OnetooneDocument.Onetoone)get_store().find_element_user(ONETOONE$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.OnetooneDocument.Onetoone)get_store().add_element_user(ONETOONE$0);
            }
            target.set(onetoone);
        }
    }
    
    /**
     * Appends and returns a new empty "onetoone" element
     */
    public com.guidewire.datamodel.OnetooneDocument.Onetoone addNewOnetoone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.OnetooneDocument.Onetoone target = null;
            target = (com.guidewire.datamodel.OnetooneDocument.Onetoone)get_store().add_element_user(ONETOONE$0);
            return target;
        }
    }
    /**
     * An XML onetoone(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class OnetooneImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.OnetooneDocument.Onetoone
    {
        private static final long serialVersionUID = 1L;
        
        public OnetooneImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FULLDESCRIPTION$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "fulldescription");
        private static final javax.xml.namespace.QName DEPRECATED$2 = 
            new javax.xml.namespace.QName("", "deprecated");
        private static final javax.xml.namespace.QName DESC$4 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName EXPORTABLE$6 = 
            new javax.xml.namespace.QName("", "exportable");
        private static final javax.xml.namespace.QName FKENTITY$8 = 
            new javax.xml.namespace.QName("", "fkentity");
        private static final javax.xml.namespace.QName GENERATECODE$10 = 
            new javax.xml.namespace.QName("", "generateCode");
        private static final javax.xml.namespace.QName GETTERSCRIPTABILITY$12 = 
            new javax.xml.namespace.QName("", "getterScriptability");
        private static final javax.xml.namespace.QName IGNOREFOREVENTS$14 = 
            new javax.xml.namespace.QName("", "ignoreforevents");
        private static final javax.xml.namespace.QName LINKFIELD$16 = 
            new javax.xml.namespace.QName("", "linkField");
        private static final javax.xml.namespace.QName NAME$18 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName NULLOK$20 = 
            new javax.xml.namespace.QName("", "nullok");
        private static final javax.xml.namespace.QName SETTERSCRIPTABILITY$22 = 
            new javax.xml.namespace.QName("", "setterScriptability");
        private static final javax.xml.namespace.QName TRIGGERSVALIDATION$24 = 
            new javax.xml.namespace.QName("", "triggersValidation");
        
        
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
         * Gets the "deprecated" attribute
         */
        public boolean getDeprecated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPRECATED$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DEPRECATED$2);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEPRECATED$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DEPRECATED$2);
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
                return get_store().find_attribute_user(DEPRECATED$2) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPRECATED$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEPRECATED$2);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEPRECATED$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DEPRECATED$2);
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
                get_store().remove_attribute(DEPRECATED$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$4);
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
                return get_store().find_attribute_user(DESC$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$4);
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
                get_store().remove_attribute(DESC$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPORTABLE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EXPORTABLE$6);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXPORTABLE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EXPORTABLE$6);
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
                return get_store().find_attribute_user(EXPORTABLE$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPORTABLE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXPORTABLE$6);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXPORTABLE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EXPORTABLE$6);
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
                get_store().remove_attribute(EXPORTABLE$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FKENTITY$8);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(FKENTITY$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FKENTITY$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FKENTITY$8);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(FKENTITY$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(FKENTITY$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GENERATECODE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GENERATECODE$10);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GENERATECODE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(GENERATECODE$10);
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
                return get_store().find_attribute_user(GENERATECODE$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GENERATECODE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GENERATECODE$10);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GENERATECODE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(GENERATECODE$10);
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
                get_store().remove_attribute(GENERATECODE$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GETTERSCRIPTABILITY$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GETTERSCRIPTABILITY$12);
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
                target = (com.guidewire.datamodel.ScriptabilityType)get_store().find_attribute_user(GETTERSCRIPTABILITY$12);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.ScriptabilityType)get_default_attribute_value(GETTERSCRIPTABILITY$12);
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
                return get_store().find_attribute_user(GETTERSCRIPTABILITY$12) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GETTERSCRIPTABILITY$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GETTERSCRIPTABILITY$12);
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
                target = (com.guidewire.datamodel.ScriptabilityType)get_store().find_attribute_user(GETTERSCRIPTABILITY$12);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.ScriptabilityType)get_store().add_attribute_user(GETTERSCRIPTABILITY$12);
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
                get_store().remove_attribute(GETTERSCRIPTABILITY$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IGNOREFOREVENTS$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(IGNOREFOREVENTS$14);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(IGNOREFOREVENTS$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(IGNOREFOREVENTS$14);
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
                return get_store().find_attribute_user(IGNOREFOREVENTS$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IGNOREFOREVENTS$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IGNOREFOREVENTS$14);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(IGNOREFOREVENTS$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(IGNOREFOREVENTS$14);
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
                get_store().remove_attribute(IGNOREFOREVENTS$14);
            }
        }
        
        /**
         * Gets the "linkField" attribute
         */
        public java.lang.String getLinkField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINKFIELD$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "linkField" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetLinkField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(LINKFIELD$16);
                return target;
            }
        }
        
        /**
         * True if has "linkField" attribute
         */
        public boolean isSetLinkField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LINKFIELD$16) != null;
            }
        }
        
        /**
         * Sets the "linkField" attribute
         */
        public void setLinkField(java.lang.String linkField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINKFIELD$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LINKFIELD$16);
                }
                target.setStringValue(linkField);
            }
        }
        
        /**
         * Sets (as xml) the "linkField" attribute
         */
        public void xsetLinkField(org.apache.xmlbeans.XmlNMTOKEN linkField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(LINKFIELD$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(LINKFIELD$16);
                }
                target.set(linkField);
            }
        }
        
        /**
         * Unsets the "linkField" attribute
         */
        public void unsetLinkField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LINKFIELD$16);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$18);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$18);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$18);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(NAME$18);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLOK$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NULLOK$20);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NULLOK$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(NULLOK$20);
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
                return get_store().find_attribute_user(NULLOK$20) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLOK$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLOK$20);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NULLOK$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NULLOK$20);
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
                get_store().remove_attribute(NULLOK$20);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETTERSCRIPTABILITY$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SETTERSCRIPTABILITY$22);
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
                target = (com.guidewire.datamodel.ScriptabilityType)get_store().find_attribute_user(SETTERSCRIPTABILITY$22);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.ScriptabilityType)get_default_attribute_value(SETTERSCRIPTABILITY$22);
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
                return get_store().find_attribute_user(SETTERSCRIPTABILITY$22) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETTERSCRIPTABILITY$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SETTERSCRIPTABILITY$22);
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
                target = (com.guidewire.datamodel.ScriptabilityType)get_store().find_attribute_user(SETTERSCRIPTABILITY$22);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.ScriptabilityType)get_store().add_attribute_user(SETTERSCRIPTABILITY$22);
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
                get_store().remove_attribute(SETTERSCRIPTABILITY$22);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRIGGERSVALIDATION$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TRIGGERSVALIDATION$24);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRIGGERSVALIDATION$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(TRIGGERSVALIDATION$24);
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
                return get_store().find_attribute_user(TRIGGERSVALIDATION$24) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRIGGERSVALIDATION$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRIGGERSVALIDATION$24);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRIGGERSVALIDATION$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TRIGGERSVALIDATION$24);
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
                get_store().remove_attribute(TRIGGERSVALIDATION$24);
            }
        }
    }
}
