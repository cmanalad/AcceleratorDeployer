/*
 * An XML document type.
 * Localname: componentref
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.ComponentrefDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one componentref(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class ComponentrefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ComponentrefDocument
{
    private static final long serialVersionUID = 1L;
    
    public ComponentrefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPONENTREF$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "componentref");
    
    
    /**
     * Gets the "componentref" element
     */
    public com.guidewire.datamodel.ComponentrefDocument.Componentref getComponentref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ComponentrefDocument.Componentref target = null;
            target = (com.guidewire.datamodel.ComponentrefDocument.Componentref)get_store().find_element_user(COMPONENTREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "componentref" element
     */
    public void setComponentref(com.guidewire.datamodel.ComponentrefDocument.Componentref componentref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ComponentrefDocument.Componentref target = null;
            target = (com.guidewire.datamodel.ComponentrefDocument.Componentref)get_store().find_element_user(COMPONENTREF$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.ComponentrefDocument.Componentref)get_store().add_element_user(COMPONENTREF$0);
            }
            target.set(componentref);
        }
    }
    
    /**
     * Appends and returns a new empty "componentref" element
     */
    public com.guidewire.datamodel.ComponentrefDocument.Componentref addNewComponentref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ComponentrefDocument.Componentref target = null;
            target = (com.guidewire.datamodel.ComponentrefDocument.Componentref)get_store().add_element_user(COMPONENTREF$0);
            return target;
        }
    }
    /**
     * An XML componentref(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class ComponentrefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ComponentrefDocument.Componentref
    {
        private static final long serialVersionUID = 1L;
        
        public ComponentrefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ANNOTATION$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "annotation");
        private static final javax.xml.namespace.QName FULLDESCRIPTION$2 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "fulldescription");
        private static final javax.xml.namespace.QName DEPRECATED$4 = 
            new javax.xml.namespace.QName("", "deprecated");
        private static final javax.xml.namespace.QName DESC$6 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName EXPORTABLE$8 = 
            new javax.xml.namespace.QName("", "exportable");
        private static final javax.xml.namespace.QName FLATTEN$10 = 
            new javax.xml.namespace.QName("", "flatten");
        private static final javax.xml.namespace.QName GENERATECODE$12 = 
            new javax.xml.namespace.QName("", "generateCode");
        private static final javax.xml.namespace.QName GETTERSCRIPTABILITY$14 = 
            new javax.xml.namespace.QName("", "getterScriptability");
        private static final javax.xml.namespace.QName NAME$16 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName PREFIX$18 = 
            new javax.xml.namespace.QName("", "prefix");
        private static final javax.xml.namespace.QName REF$20 = 
            new javax.xml.namespace.QName("", "ref");
        private static final javax.xml.namespace.QName SETTERSCRIPTABILITY$22 = 
            new javax.xml.namespace.QName("", "setterScriptability");
        
        
        /**
         * Gets array of all "annotation" elements
         */
        public com.guidewire.datamodel.AnnotationDocument.Annotation[] getAnnotationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ANNOTATION$0, targetList);
                com.guidewire.datamodel.AnnotationDocument.Annotation[] result = new com.guidewire.datamodel.AnnotationDocument.Annotation[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "annotation" element
         */
        public com.guidewire.datamodel.AnnotationDocument.Annotation getAnnotationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.AnnotationDocument.Annotation target = null;
                target = (com.guidewire.datamodel.AnnotationDocument.Annotation)get_store().find_element_user(ANNOTATION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "annotation" element
         */
        public int sizeOfAnnotationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ANNOTATION$0);
            }
        }
        
        /**
         * Sets array of all "annotation" element
         */
        public void setAnnotationArray(com.guidewire.datamodel.AnnotationDocument.Annotation[] annotationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(annotationArray, ANNOTATION$0);
            }
        }
        
        /**
         * Sets ith "annotation" element
         */
        public void setAnnotationArray(int i, com.guidewire.datamodel.AnnotationDocument.Annotation annotation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.AnnotationDocument.Annotation target = null;
                target = (com.guidewire.datamodel.AnnotationDocument.Annotation)get_store().find_element_user(ANNOTATION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(annotation);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "annotation" element
         */
        public com.guidewire.datamodel.AnnotationDocument.Annotation insertNewAnnotation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.AnnotationDocument.Annotation target = null;
                target = (com.guidewire.datamodel.AnnotationDocument.Annotation)get_store().insert_element_user(ANNOTATION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "annotation" element
         */
        public com.guidewire.datamodel.AnnotationDocument.Annotation addNewAnnotation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.AnnotationDocument.Annotation target = null;
                target = (com.guidewire.datamodel.AnnotationDocument.Annotation)get_store().add_element_user(ANNOTATION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "annotation" element
         */
        public void removeAnnotation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ANNOTATION$0, i);
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
         * Gets the "deprecated" attribute
         */
        public boolean getDeprecated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPRECATED$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DEPRECATED$4);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEPRECATED$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DEPRECATED$4);
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
                return get_store().find_attribute_user(DEPRECATED$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPRECATED$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEPRECATED$4);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEPRECATED$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DEPRECATED$4);
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
                get_store().remove_attribute(DEPRECATED$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$6);
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
                return get_store().find_attribute_user(DESC$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$6);
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
                get_store().remove_attribute(DESC$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPORTABLE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EXPORTABLE$8);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXPORTABLE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EXPORTABLE$8);
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
                return get_store().find_attribute_user(EXPORTABLE$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPORTABLE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXPORTABLE$8);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXPORTABLE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EXPORTABLE$8);
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
                get_store().remove_attribute(EXPORTABLE$8);
            }
        }
        
        /**
         * Gets the "flatten" attribute
         */
        public boolean getFlatten()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLATTEN$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FLATTEN$10);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "flatten" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetFlatten()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FLATTEN$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FLATTEN$10);
                }
                return target;
            }
        }
        
        /**
         * True if has "flatten" attribute
         */
        public boolean isSetFlatten()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FLATTEN$10) != null;
            }
        }
        
        /**
         * Sets the "flatten" attribute
         */
        public void setFlatten(boolean flatten)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLATTEN$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FLATTEN$10);
                }
                target.setBooleanValue(flatten);
            }
        }
        
        /**
         * Sets (as xml) the "flatten" attribute
         */
        public void xsetFlatten(org.apache.xmlbeans.XmlBoolean flatten)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FLATTEN$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FLATTEN$10);
                }
                target.set(flatten);
            }
        }
        
        /**
         * Unsets the "flatten" attribute
         */
        public void unsetFlatten()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FLATTEN$10);
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
         * Gets the "prefix" attribute
         */
        public java.lang.String getPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREFIX$18);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "prefix" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(PREFIX$18);
                return target;
            }
        }
        
        /**
         * True if has "prefix" attribute
         */
        public boolean isSetPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PREFIX$18) != null;
            }
        }
        
        /**
         * Sets the "prefix" attribute
         */
        public void setPrefix(java.lang.String prefix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREFIX$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PREFIX$18);
                }
                target.setStringValue(prefix);
            }
        }
        
        /**
         * Sets (as xml) the "prefix" attribute
         */
        public void xsetPrefix(org.apache.xmlbeans.XmlNMTOKEN prefix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(PREFIX$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(PREFIX$18);
                }
                target.set(prefix);
            }
        }
        
        /**
         * Unsets the "prefix" attribute
         */
        public void unsetPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PREFIX$18);
            }
        }
        
        /**
         * Gets the "ref" attribute
         */
        public java.lang.String getRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$20);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ref" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(REF$20);
                return target;
            }
        }
        
        /**
         * Sets the "ref" attribute
         */
        public void setRef(java.lang.String ref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$20);
                }
                target.setStringValue(ref);
            }
        }
        
        /**
         * Sets (as xml) the "ref" attribute
         */
        public void xsetRef(org.apache.xmlbeans.XmlNMTOKEN ref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(REF$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(REF$20);
                }
                target.set(ref);
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
