/*
 * An XML document type.
 * Localname: internaltypelistextension
 * Namespace: http://guidewire.com/typelists
 * Java type: com.guidewire.typelists.InternaltypelistextensionDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.typelists.impl;
/**
 * A document containing one internaltypelistextension(@http://guidewire.com/typelists) element.
 *
 * This is a complex type.
 */
public class InternaltypelistextensionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.typelists.InternaltypelistextensionDocument
{
    private static final long serialVersionUID = 1L;
    
    public InternaltypelistextensionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERNALTYPELISTEXTENSION$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/typelists", "internaltypelistextension");
    
    
    /**
     * Gets the "internaltypelistextension" element
     */
    public com.guidewire.typelists.InternaltypelistextensionDocument.Internaltypelistextension getInternaltypelistextension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.typelists.InternaltypelistextensionDocument.Internaltypelistextension target = null;
            target = (com.guidewire.typelists.InternaltypelistextensionDocument.Internaltypelistextension)get_store().find_element_user(INTERNALTYPELISTEXTENSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "internaltypelistextension" element
     */
    public void setInternaltypelistextension(com.guidewire.typelists.InternaltypelistextensionDocument.Internaltypelistextension internaltypelistextension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.typelists.InternaltypelistextensionDocument.Internaltypelistextension target = null;
            target = (com.guidewire.typelists.InternaltypelistextensionDocument.Internaltypelistextension)get_store().find_element_user(INTERNALTYPELISTEXTENSION$0, 0);
            if (target == null)
            {
                target = (com.guidewire.typelists.InternaltypelistextensionDocument.Internaltypelistextension)get_store().add_element_user(INTERNALTYPELISTEXTENSION$0);
            }
            target.set(internaltypelistextension);
        }
    }
    
    /**
     * Appends and returns a new empty "internaltypelistextension" element
     */
    public com.guidewire.typelists.InternaltypelistextensionDocument.Internaltypelistextension addNewInternaltypelistextension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.typelists.InternaltypelistextensionDocument.Internaltypelistextension target = null;
            target = (com.guidewire.typelists.InternaltypelistextensionDocument.Internaltypelistextension)get_store().add_element_user(INTERNALTYPELISTEXTENSION$0);
            return target;
        }
    }
    /**
     * An XML internaltypelistextension(@http://guidewire.com/typelists).
     *
     * This is a complex type.
     */
    public static class InternaltypelistextensionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.typelists.InternaltypelistextensionDocument.Internaltypelistextension
    {
        private static final long serialVersionUID = 1L;
        
        public InternaltypelistextensionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPECODE$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/typelists", "typecode");
        private static final javax.xml.namespace.QName TYPEFILTER$2 = 
            new javax.xml.namespace.QName("http://guidewire.com/typelists", "typefilter");
        private static final javax.xml.namespace.QName DESC$4 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName JAVACLASS$6 = 
            new javax.xml.namespace.QName("", "javaClass");
        private static final javax.xml.namespace.QName NAME$8 = 
            new javax.xml.namespace.QName("", "name");
        
        
        /**
         * Gets array of all "typecode" elements
         */
        public com.guidewire.typelists.TypecodeDocument.Typecode[] getTypecodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TYPECODE$0, targetList);
                com.guidewire.typelists.TypecodeDocument.Typecode[] result = new com.guidewire.typelists.TypecodeDocument.Typecode[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "typecode" element
         */
        public com.guidewire.typelists.TypecodeDocument.Typecode getTypecodeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.typelists.TypecodeDocument.Typecode target = null;
                target = (com.guidewire.typelists.TypecodeDocument.Typecode)get_store().find_element_user(TYPECODE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "typecode" element
         */
        public int sizeOfTypecodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TYPECODE$0);
            }
        }
        
        /**
         * Sets array of all "typecode" element
         */
        public void setTypecodeArray(com.guidewire.typelists.TypecodeDocument.Typecode[] typecodeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(typecodeArray, TYPECODE$0);
            }
        }
        
        /**
         * Sets ith "typecode" element
         */
        public void setTypecodeArray(int i, com.guidewire.typelists.TypecodeDocument.Typecode typecode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.typelists.TypecodeDocument.Typecode target = null;
                target = (com.guidewire.typelists.TypecodeDocument.Typecode)get_store().find_element_user(TYPECODE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(typecode);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "typecode" element
         */
        public com.guidewire.typelists.TypecodeDocument.Typecode insertNewTypecode(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.typelists.TypecodeDocument.Typecode target = null;
                target = (com.guidewire.typelists.TypecodeDocument.Typecode)get_store().insert_element_user(TYPECODE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "typecode" element
         */
        public com.guidewire.typelists.TypecodeDocument.Typecode addNewTypecode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.typelists.TypecodeDocument.Typecode target = null;
                target = (com.guidewire.typelists.TypecodeDocument.Typecode)get_store().add_element_user(TYPECODE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "typecode" element
         */
        public void removeTypecode(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TYPECODE$0, i);
            }
        }
        
        /**
         * Gets array of all "typefilter" elements
         */
        public com.guidewire.typelists.TypefilterDocument.Typefilter[] getTypefilterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TYPEFILTER$2, targetList);
                com.guidewire.typelists.TypefilterDocument.Typefilter[] result = new com.guidewire.typelists.TypefilterDocument.Typefilter[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "typefilter" element
         */
        public com.guidewire.typelists.TypefilterDocument.Typefilter getTypefilterArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.typelists.TypefilterDocument.Typefilter target = null;
                target = (com.guidewire.typelists.TypefilterDocument.Typefilter)get_store().find_element_user(TYPEFILTER$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "typefilter" element
         */
        public int sizeOfTypefilterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TYPEFILTER$2);
            }
        }
        
        /**
         * Sets array of all "typefilter" element
         */
        public void setTypefilterArray(com.guidewire.typelists.TypefilterDocument.Typefilter[] typefilterArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(typefilterArray, TYPEFILTER$2);
            }
        }
        
        /**
         * Sets ith "typefilter" element
         */
        public void setTypefilterArray(int i, com.guidewire.typelists.TypefilterDocument.Typefilter typefilter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.typelists.TypefilterDocument.Typefilter target = null;
                target = (com.guidewire.typelists.TypefilterDocument.Typefilter)get_store().find_element_user(TYPEFILTER$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(typefilter);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "typefilter" element
         */
        public com.guidewire.typelists.TypefilterDocument.Typefilter insertNewTypefilter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.typelists.TypefilterDocument.Typefilter target = null;
                target = (com.guidewire.typelists.TypefilterDocument.Typefilter)get_store().insert_element_user(TYPEFILTER$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "typefilter" element
         */
        public com.guidewire.typelists.TypefilterDocument.Typefilter addNewTypefilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.typelists.TypefilterDocument.Typefilter target = null;
                target = (com.guidewire.typelists.TypefilterDocument.Typefilter)get_store().add_element_user(TYPEFILTER$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "typefilter" element
         */
        public void removeTypefilter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TYPEFILTER$2, i);
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
         * Gets the "javaClass" attribute
         */
        public java.lang.String getJavaClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JAVACLASS$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "javaClass" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetJavaClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(JAVACLASS$6);
                return target;
            }
        }
        
        /**
         * True if has "javaClass" attribute
         */
        public boolean isSetJavaClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(JAVACLASS$6) != null;
            }
        }
        
        /**
         * Sets the "javaClass" attribute
         */
        public void setJavaClass(java.lang.String javaClass)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JAVACLASS$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JAVACLASS$6);
                }
                target.setStringValue(javaClass);
            }
        }
        
        /**
         * Sets (as xml) the "javaClass" attribute
         */
        public void xsetJavaClass(org.apache.xmlbeans.XmlNMTOKEN javaClass)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(JAVACLASS$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(JAVACLASS$6);
                }
                target.set(javaClass);
            }
        }
        
        /**
         * Unsets the "javaClass" attribute
         */
        public void unsetJavaClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(JAVACLASS$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$8);
                }
                target.set(name);
            }
        }
    }
}
