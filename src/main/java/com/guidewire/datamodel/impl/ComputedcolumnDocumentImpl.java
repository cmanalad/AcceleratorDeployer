/*
 * An XML document type.
 * Localname: computedcolumn
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.ComputedcolumnDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one computedcolumn(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class ComputedcolumnDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ComputedcolumnDocument
{
    private static final long serialVersionUID = 1L;
    
    public ComputedcolumnDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPUTEDCOLUMN$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "computedcolumn");
    
    
    /**
     * Gets the "computedcolumn" element
     */
    public com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn getComputedcolumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn target = null;
            target = (com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn)get_store().find_element_user(COMPUTEDCOLUMN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "computedcolumn" element
     */
    public void setComputedcolumn(com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn computedcolumn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn target = null;
            target = (com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn)get_store().find_element_user(COMPUTEDCOLUMN$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn)get_store().add_element_user(COMPUTEDCOLUMN$0);
            }
            target.set(computedcolumn);
        }
    }
    
    /**
     * Appends and returns a new empty "computedcolumn" element
     */
    public com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn addNewComputedcolumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn target = null;
            target = (com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn)get_store().add_element_user(COMPUTEDCOLUMN$0);
            return target;
        }
    }
    /**
     * An XML computedcolumn(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class ComputedcolumnImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn
    {
        private static final long serialVersionUID = 1L;
        
        public ComputedcolumnImpl(org.apache.xmlbeans.SchemaType sType)
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
        private static final javax.xml.namespace.QName EXPRESSION$8 = 
            new javax.xml.namespace.QName("", "expression");
        private static final javax.xml.namespace.QName FUNCTION$10 = 
            new javax.xml.namespace.QName("", "function");
        private static final javax.xml.namespace.QName GENERATECODE$12 = 
            new javax.xml.namespace.QName("", "generateCode");
        private static final javax.xml.namespace.QName GETTERSCRIPTABILITY$14 = 
            new javax.xml.namespace.QName("", "getterScriptability");
        private static final javax.xml.namespace.QName NAME$16 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName PATHS$18 = 
            new javax.xml.namespace.QName("", "paths");
        private static final javax.xml.namespace.QName PRIMARYPATH$20 = 
            new javax.xml.namespace.QName("", "primaryPath");
        private static final javax.xml.namespace.QName SETTERSCRIPTABILITY$22 = 
            new javax.xml.namespace.QName("", "setterScriptability");
        
        
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
         * Gets the "expression" attribute
         */
        public java.lang.String getExpression()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPRESSION$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "expression" attribute
         */
        public org.apache.xmlbeans.XmlString xgetExpression()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EXPRESSION$8);
                return target;
            }
        }
        
        /**
         * Sets the "expression" attribute
         */
        public void setExpression(java.lang.String expression)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPRESSION$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXPRESSION$8);
                }
                target.setStringValue(expression);
            }
        }
        
        /**
         * Sets (as xml) the "expression" attribute
         */
        public void xsetExpression(org.apache.xmlbeans.XmlString expression)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EXPRESSION$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EXPRESSION$8);
                }
                target.set(expression);
            }
        }
        
        /**
         * Gets the "function" attribute
         */
        public java.lang.String getFunction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FUNCTION$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "function" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFunction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FUNCTION$10);
                return target;
            }
        }
        
        /**
         * True if has "function" attribute
         */
        public boolean isSetFunction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FUNCTION$10) != null;
            }
        }
        
        /**
         * Sets the "function" attribute
         */
        public void setFunction(java.lang.String function)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FUNCTION$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FUNCTION$10);
                }
                target.setStringValue(function);
            }
        }
        
        /**
         * Sets (as xml) the "function" attribute
         */
        public void xsetFunction(org.apache.xmlbeans.XmlString function)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FUNCTION$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FUNCTION$10);
                }
                target.set(function);
            }
        }
        
        /**
         * Unsets the "function" attribute
         */
        public void unsetFunction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FUNCTION$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GENERATECODE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GENERATECODE$12);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GENERATECODE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(GENERATECODE$12);
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
                return get_store().find_attribute_user(GENERATECODE$12) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GENERATECODE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GENERATECODE$12);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GENERATECODE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(GENERATECODE$12);
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
                get_store().remove_attribute(GENERATECODE$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GETTERSCRIPTABILITY$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GETTERSCRIPTABILITY$14);
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
                target = (com.guidewire.datamodel.ScriptabilityType)get_store().find_attribute_user(GETTERSCRIPTABILITY$14);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.ScriptabilityType)get_default_attribute_value(GETTERSCRIPTABILITY$14);
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
                return get_store().find_attribute_user(GETTERSCRIPTABILITY$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GETTERSCRIPTABILITY$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GETTERSCRIPTABILITY$14);
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
                target = (com.guidewire.datamodel.ScriptabilityType)get_store().find_attribute_user(GETTERSCRIPTABILITY$14);
                if (target == null)
                {
                    target = (com.guidewire.datamodel.ScriptabilityType)get_store().add_attribute_user(GETTERSCRIPTABILITY$14);
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
                get_store().remove_attribute(GETTERSCRIPTABILITY$14);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$16);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$16);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$16);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(NAME$16);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "paths" attribute
         */
        public java.lang.String getPaths()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATHS$18);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "paths" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPaths()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PATHS$18);
                return target;
            }
        }
        
        /**
         * Sets the "paths" attribute
         */
        public void setPaths(java.lang.String paths)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATHS$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PATHS$18);
                }
                target.setStringValue(paths);
            }
        }
        
        /**
         * Sets (as xml) the "paths" attribute
         */
        public void xsetPaths(org.apache.xmlbeans.XmlString paths)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PATHS$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PATHS$18);
                }
                target.set(paths);
            }
        }
        
        /**
         * Gets the "primaryPath" attribute
         */
        public java.lang.String getPrimaryPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIMARYPATH$20);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "primaryPath" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPrimaryPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PRIMARYPATH$20);
                return target;
            }
        }
        
        /**
         * True if has "primaryPath" attribute
         */
        public boolean isSetPrimaryPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PRIMARYPATH$20) != null;
            }
        }
        
        /**
         * Sets the "primaryPath" attribute
         */
        public void setPrimaryPath(java.lang.String primaryPath)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIMARYPATH$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRIMARYPATH$20);
                }
                target.setStringValue(primaryPath);
            }
        }
        
        /**
         * Sets (as xml) the "primaryPath" attribute
         */
        public void xsetPrimaryPath(org.apache.xmlbeans.XmlString primaryPath)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PRIMARYPATH$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PRIMARYPATH$20);
                }
                target.set(primaryPath);
            }
        }
        
        /**
         * Unsets the "primaryPath" attribute
         */
        public void unsetPrimaryPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PRIMARYPATH$20);
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
    }
}
