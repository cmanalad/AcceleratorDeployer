/*
 * An XML document type.
 * Localname: viewEntity
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.ViewEntityDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one viewEntity(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class ViewEntityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ViewEntityDocument
{
    private static final long serialVersionUID = 1L;
    
    public ViewEntityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VIEWENTITY$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "viewEntity");
    
    
    /**
     * Gets the "viewEntity" element
     */
    public com.guidewire.datamodel.ViewEntityDocument.ViewEntity getViewEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ViewEntityDocument.ViewEntity target = null;
            target = (com.guidewire.datamodel.ViewEntityDocument.ViewEntity)get_store().find_element_user(VIEWENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "viewEntity" element
     */
    public void setViewEntity(com.guidewire.datamodel.ViewEntityDocument.ViewEntity viewEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ViewEntityDocument.ViewEntity target = null;
            target = (com.guidewire.datamodel.ViewEntityDocument.ViewEntity)get_store().find_element_user(VIEWENTITY$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.ViewEntityDocument.ViewEntity)get_store().add_element_user(VIEWENTITY$0);
            }
            target.set(viewEntity);
        }
    }
    
    /**
     * Appends and returns a new empty "viewEntity" element
     */
    public com.guidewire.datamodel.ViewEntityDocument.ViewEntity addNewViewEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ViewEntityDocument.ViewEntity target = null;
            target = (com.guidewire.datamodel.ViewEntityDocument.ViewEntity)get_store().add_element_user(VIEWENTITY$0);
            return target;
        }
    }
    /**
     * An XML viewEntity(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class ViewEntityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ViewEntityDocument.ViewEntity
    {
        private static final long serialVersionUID = 1L;
        
        public ViewEntityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COMPUTEDCOLUMN$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "computedcolumn");
        private static final javax.xml.namespace.QName COMPUTEDTYPEKEY$2 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "computedtypekey");
        private static final javax.xml.namespace.QName FULLDESCRIPTION$4 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "fulldescription");
        private static final javax.xml.namespace.QName VIEWENTITYCOLUMN$6 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "viewEntityColumn");
        private static final javax.xml.namespace.QName VIEWENTITYLINK$8 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "viewEntityLink");
        private static final javax.xml.namespace.QName VIEWENTITYNAME$10 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "viewEntityName");
        private static final javax.xml.namespace.QName VIEWENTITYTYPEKEY$12 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "viewEntityTypekey");
        private static final javax.xml.namespace.QName ABSTRACT$14 = 
            new javax.xml.namespace.QName("", "abstract");
        private static final javax.xml.namespace.QName DESC$16 = 
            new javax.xml.namespace.QName("", "desc");
        private static final javax.xml.namespace.QName ENTITY$18 = 
            new javax.xml.namespace.QName("", "entity");
        private static final javax.xml.namespace.QName EXPORTABLE$20 = 
            new javax.xml.namespace.QName("", "exportable");
        private static final javax.xml.namespace.QName EXTENDABLE$22 = 
            new javax.xml.namespace.QName("", "extendable");
        private static final javax.xml.namespace.QName FINAL$24 = 
            new javax.xml.namespace.QName("", "final");
        private static final javax.xml.namespace.QName JAVACLASS$26 = 
            new javax.xml.namespace.QName("", "javaClass");
        private static final javax.xml.namespace.QName PRIMARYENTITY$28 = 
            new javax.xml.namespace.QName("", "primaryEntity");
        private static final javax.xml.namespace.QName SHOWRETIREDBEANS$30 = 
            new javax.xml.namespace.QName("", "showRetiredBeans");
        private static final javax.xml.namespace.QName SUPERTYPEENTITY$32 = 
            new javax.xml.namespace.QName("", "supertypeEntity");
        
        
        /**
         * Gets array of all "computedcolumn" elements
         */
        public com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn[] getComputedcolumnArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COMPUTEDCOLUMN$0, targetList);
                com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn[] result = new com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "computedcolumn" element
         */
        public com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn getComputedcolumnArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn target = null;
                target = (com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn)get_store().find_element_user(COMPUTEDCOLUMN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "computedcolumn" element
         */
        public int sizeOfComputedcolumnArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMPUTEDCOLUMN$0);
            }
        }
        
        /**
         * Sets array of all "computedcolumn" element
         */
        public void setComputedcolumnArray(com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn[] computedcolumnArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(computedcolumnArray, COMPUTEDCOLUMN$0);
            }
        }
        
        /**
         * Sets ith "computedcolumn" element
         */
        public void setComputedcolumnArray(int i, com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn computedcolumn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn target = null;
                target = (com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn)get_store().find_element_user(COMPUTEDCOLUMN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(computedcolumn);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "computedcolumn" element
         */
        public com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn insertNewComputedcolumn(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn target = null;
                target = (com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn)get_store().insert_element_user(COMPUTEDCOLUMN$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "computedcolumn" element
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
         * Removes the ith "computedcolumn" element
         */
        public void removeComputedcolumn(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMPUTEDCOLUMN$0, i);
            }
        }
        
        /**
         * Gets array of all "computedtypekey" elements
         */
        public com.guidewire.datamodel.ComputedtypekeyDocument.Computedtypekey[] getComputedtypekeyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COMPUTEDTYPEKEY$2, targetList);
                com.guidewire.datamodel.ComputedtypekeyDocument.Computedtypekey[] result = new com.guidewire.datamodel.ComputedtypekeyDocument.Computedtypekey[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "computedtypekey" element
         */
        public com.guidewire.datamodel.ComputedtypekeyDocument.Computedtypekey getComputedtypekeyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ComputedtypekeyDocument.Computedtypekey target = null;
                target = (com.guidewire.datamodel.ComputedtypekeyDocument.Computedtypekey)get_store().find_element_user(COMPUTEDTYPEKEY$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "computedtypekey" element
         */
        public int sizeOfComputedtypekeyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMPUTEDTYPEKEY$2);
            }
        }
        
        /**
         * Sets array of all "computedtypekey" element
         */
        public void setComputedtypekeyArray(com.guidewire.datamodel.ComputedtypekeyDocument.Computedtypekey[] computedtypekeyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(computedtypekeyArray, COMPUTEDTYPEKEY$2);
            }
        }
        
        /**
         * Sets ith "computedtypekey" element
         */
        public void setComputedtypekeyArray(int i, com.guidewire.datamodel.ComputedtypekeyDocument.Computedtypekey computedtypekey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ComputedtypekeyDocument.Computedtypekey target = null;
                target = (com.guidewire.datamodel.ComputedtypekeyDocument.Computedtypekey)get_store().find_element_user(COMPUTEDTYPEKEY$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(computedtypekey);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "computedtypekey" element
         */
        public com.guidewire.datamodel.ComputedtypekeyDocument.Computedtypekey insertNewComputedtypekey(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ComputedtypekeyDocument.Computedtypekey target = null;
                target = (com.guidewire.datamodel.ComputedtypekeyDocument.Computedtypekey)get_store().insert_element_user(COMPUTEDTYPEKEY$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "computedtypekey" element
         */
        public com.guidewire.datamodel.ComputedtypekeyDocument.Computedtypekey addNewComputedtypekey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ComputedtypekeyDocument.Computedtypekey target = null;
                target = (com.guidewire.datamodel.ComputedtypekeyDocument.Computedtypekey)get_store().add_element_user(COMPUTEDTYPEKEY$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "computedtypekey" element
         */
        public void removeComputedtypekey(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMPUTEDTYPEKEY$2, i);
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
                get_store().find_all_element_users(FULLDESCRIPTION$4, targetList);
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
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().find_element_user(FULLDESCRIPTION$4, i);
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
                return get_store().count_elements(FULLDESCRIPTION$4);
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
                arraySetterHelper(fulldescriptionArray, FULLDESCRIPTION$4);
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
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().find_element_user(FULLDESCRIPTION$4, i);
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
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().insert_element_user(FULLDESCRIPTION$4, i);
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
                target = (com.guidewire.datamodel.FulldescriptionDocument.Fulldescription)get_store().add_element_user(FULLDESCRIPTION$4);
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
                get_store().remove_element(FULLDESCRIPTION$4, i);
            }
        }
        
        /**
         * Gets array of all "viewEntityColumn" elements
         */
        public com.guidewire.datamodel.ViewEntityColumnDocument.ViewEntityColumn[] getViewEntityColumnArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VIEWENTITYCOLUMN$6, targetList);
                com.guidewire.datamodel.ViewEntityColumnDocument.ViewEntityColumn[] result = new com.guidewire.datamodel.ViewEntityColumnDocument.ViewEntityColumn[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "viewEntityColumn" element
         */
        public com.guidewire.datamodel.ViewEntityColumnDocument.ViewEntityColumn getViewEntityColumnArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ViewEntityColumnDocument.ViewEntityColumn target = null;
                target = (com.guidewire.datamodel.ViewEntityColumnDocument.ViewEntityColumn)get_store().find_element_user(VIEWENTITYCOLUMN$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "viewEntityColumn" element
         */
        public int sizeOfViewEntityColumnArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VIEWENTITYCOLUMN$6);
            }
        }
        
        /**
         * Sets array of all "viewEntityColumn" element
         */
        public void setViewEntityColumnArray(com.guidewire.datamodel.ViewEntityColumnDocument.ViewEntityColumn[] viewEntityColumnArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(viewEntityColumnArray, VIEWENTITYCOLUMN$6);
            }
        }
        
        /**
         * Sets ith "viewEntityColumn" element
         */
        public void setViewEntityColumnArray(int i, com.guidewire.datamodel.ViewEntityColumnDocument.ViewEntityColumn viewEntityColumn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ViewEntityColumnDocument.ViewEntityColumn target = null;
                target = (com.guidewire.datamodel.ViewEntityColumnDocument.ViewEntityColumn)get_store().find_element_user(VIEWENTITYCOLUMN$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(viewEntityColumn);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "viewEntityColumn" element
         */
        public com.guidewire.datamodel.ViewEntityColumnDocument.ViewEntityColumn insertNewViewEntityColumn(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ViewEntityColumnDocument.ViewEntityColumn target = null;
                target = (com.guidewire.datamodel.ViewEntityColumnDocument.ViewEntityColumn)get_store().insert_element_user(VIEWENTITYCOLUMN$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "viewEntityColumn" element
         */
        public com.guidewire.datamodel.ViewEntityColumnDocument.ViewEntityColumn addNewViewEntityColumn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ViewEntityColumnDocument.ViewEntityColumn target = null;
                target = (com.guidewire.datamodel.ViewEntityColumnDocument.ViewEntityColumn)get_store().add_element_user(VIEWENTITYCOLUMN$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "viewEntityColumn" element
         */
        public void removeViewEntityColumn(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VIEWENTITYCOLUMN$6, i);
            }
        }
        
        /**
         * Gets array of all "viewEntityLink" elements
         */
        public com.guidewire.datamodel.ViewEntityLinkDocument.ViewEntityLink[] getViewEntityLinkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VIEWENTITYLINK$8, targetList);
                com.guidewire.datamodel.ViewEntityLinkDocument.ViewEntityLink[] result = new com.guidewire.datamodel.ViewEntityLinkDocument.ViewEntityLink[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "viewEntityLink" element
         */
        public com.guidewire.datamodel.ViewEntityLinkDocument.ViewEntityLink getViewEntityLinkArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ViewEntityLinkDocument.ViewEntityLink target = null;
                target = (com.guidewire.datamodel.ViewEntityLinkDocument.ViewEntityLink)get_store().find_element_user(VIEWENTITYLINK$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "viewEntityLink" element
         */
        public int sizeOfViewEntityLinkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VIEWENTITYLINK$8);
            }
        }
        
        /**
         * Sets array of all "viewEntityLink" element
         */
        public void setViewEntityLinkArray(com.guidewire.datamodel.ViewEntityLinkDocument.ViewEntityLink[] viewEntityLinkArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(viewEntityLinkArray, VIEWENTITYLINK$8);
            }
        }
        
        /**
         * Sets ith "viewEntityLink" element
         */
        public void setViewEntityLinkArray(int i, com.guidewire.datamodel.ViewEntityLinkDocument.ViewEntityLink viewEntityLink)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ViewEntityLinkDocument.ViewEntityLink target = null;
                target = (com.guidewire.datamodel.ViewEntityLinkDocument.ViewEntityLink)get_store().find_element_user(VIEWENTITYLINK$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(viewEntityLink);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "viewEntityLink" element
         */
        public com.guidewire.datamodel.ViewEntityLinkDocument.ViewEntityLink insertNewViewEntityLink(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ViewEntityLinkDocument.ViewEntityLink target = null;
                target = (com.guidewire.datamodel.ViewEntityLinkDocument.ViewEntityLink)get_store().insert_element_user(VIEWENTITYLINK$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "viewEntityLink" element
         */
        public com.guidewire.datamodel.ViewEntityLinkDocument.ViewEntityLink addNewViewEntityLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ViewEntityLinkDocument.ViewEntityLink target = null;
                target = (com.guidewire.datamodel.ViewEntityLinkDocument.ViewEntityLink)get_store().add_element_user(VIEWENTITYLINK$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "viewEntityLink" element
         */
        public void removeViewEntityLink(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VIEWENTITYLINK$8, i);
            }
        }
        
        /**
         * Gets array of all "viewEntityName" elements
         */
        public com.guidewire.datamodel.ViewEntityNameDocument.ViewEntityName[] getViewEntityNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VIEWENTITYNAME$10, targetList);
                com.guidewire.datamodel.ViewEntityNameDocument.ViewEntityName[] result = new com.guidewire.datamodel.ViewEntityNameDocument.ViewEntityName[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "viewEntityName" element
         */
        public com.guidewire.datamodel.ViewEntityNameDocument.ViewEntityName getViewEntityNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ViewEntityNameDocument.ViewEntityName target = null;
                target = (com.guidewire.datamodel.ViewEntityNameDocument.ViewEntityName)get_store().find_element_user(VIEWENTITYNAME$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "viewEntityName" element
         */
        public int sizeOfViewEntityNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VIEWENTITYNAME$10);
            }
        }
        
        /**
         * Sets array of all "viewEntityName" element
         */
        public void setViewEntityNameArray(com.guidewire.datamodel.ViewEntityNameDocument.ViewEntityName[] viewEntityNameArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(viewEntityNameArray, VIEWENTITYNAME$10);
            }
        }
        
        /**
         * Sets ith "viewEntityName" element
         */
        public void setViewEntityNameArray(int i, com.guidewire.datamodel.ViewEntityNameDocument.ViewEntityName viewEntityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ViewEntityNameDocument.ViewEntityName target = null;
                target = (com.guidewire.datamodel.ViewEntityNameDocument.ViewEntityName)get_store().find_element_user(VIEWENTITYNAME$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(viewEntityName);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "viewEntityName" element
         */
        public com.guidewire.datamodel.ViewEntityNameDocument.ViewEntityName insertNewViewEntityName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ViewEntityNameDocument.ViewEntityName target = null;
                target = (com.guidewire.datamodel.ViewEntityNameDocument.ViewEntityName)get_store().insert_element_user(VIEWENTITYNAME$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "viewEntityName" element
         */
        public com.guidewire.datamodel.ViewEntityNameDocument.ViewEntityName addNewViewEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ViewEntityNameDocument.ViewEntityName target = null;
                target = (com.guidewire.datamodel.ViewEntityNameDocument.ViewEntityName)get_store().add_element_user(VIEWENTITYNAME$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "viewEntityName" element
         */
        public void removeViewEntityName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VIEWENTITYNAME$10, i);
            }
        }
        
        /**
         * Gets array of all "viewEntityTypekey" elements
         */
        public com.guidewire.datamodel.ViewEntityTypekeyDocument.ViewEntityTypekey[] getViewEntityTypekeyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VIEWENTITYTYPEKEY$12, targetList);
                com.guidewire.datamodel.ViewEntityTypekeyDocument.ViewEntityTypekey[] result = new com.guidewire.datamodel.ViewEntityTypekeyDocument.ViewEntityTypekey[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "viewEntityTypekey" element
         */
        public com.guidewire.datamodel.ViewEntityTypekeyDocument.ViewEntityTypekey getViewEntityTypekeyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ViewEntityTypekeyDocument.ViewEntityTypekey target = null;
                target = (com.guidewire.datamodel.ViewEntityTypekeyDocument.ViewEntityTypekey)get_store().find_element_user(VIEWENTITYTYPEKEY$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "viewEntityTypekey" element
         */
        public int sizeOfViewEntityTypekeyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VIEWENTITYTYPEKEY$12);
            }
        }
        
        /**
         * Sets array of all "viewEntityTypekey" element
         */
        public void setViewEntityTypekeyArray(com.guidewire.datamodel.ViewEntityTypekeyDocument.ViewEntityTypekey[] viewEntityTypekeyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(viewEntityTypekeyArray, VIEWENTITYTYPEKEY$12);
            }
        }
        
        /**
         * Sets ith "viewEntityTypekey" element
         */
        public void setViewEntityTypekeyArray(int i, com.guidewire.datamodel.ViewEntityTypekeyDocument.ViewEntityTypekey viewEntityTypekey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ViewEntityTypekeyDocument.ViewEntityTypekey target = null;
                target = (com.guidewire.datamodel.ViewEntityTypekeyDocument.ViewEntityTypekey)get_store().find_element_user(VIEWENTITYTYPEKEY$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(viewEntityTypekey);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "viewEntityTypekey" element
         */
        public com.guidewire.datamodel.ViewEntityTypekeyDocument.ViewEntityTypekey insertNewViewEntityTypekey(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ViewEntityTypekeyDocument.ViewEntityTypekey target = null;
                target = (com.guidewire.datamodel.ViewEntityTypekeyDocument.ViewEntityTypekey)get_store().insert_element_user(VIEWENTITYTYPEKEY$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "viewEntityTypekey" element
         */
        public com.guidewire.datamodel.ViewEntityTypekeyDocument.ViewEntityTypekey addNewViewEntityTypekey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.ViewEntityTypekeyDocument.ViewEntityTypekey target = null;
                target = (com.guidewire.datamodel.ViewEntityTypekeyDocument.ViewEntityTypekey)get_store().add_element_user(VIEWENTITYTYPEKEY$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "viewEntityTypekey" element
         */
        public void removeViewEntityTypekey(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VIEWENTITYTYPEKEY$12, i);
            }
        }
        
        /**
         * Gets the "abstract" attribute
         */
        public boolean getAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABSTRACT$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ABSTRACT$14);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "abstract" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABSTRACT$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ABSTRACT$14);
                }
                return target;
            }
        }
        
        /**
         * True if has "abstract" attribute
         */
        public boolean isSetAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ABSTRACT$14) != null;
            }
        }
        
        /**
         * Sets the "abstract" attribute
         */
        public void setAbstract(boolean xabstract)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABSTRACT$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ABSTRACT$14);
                }
                target.setBooleanValue(xabstract);
            }
        }
        
        /**
         * Sets (as xml) the "abstract" attribute
         */
        public void xsetAbstract(org.apache.xmlbeans.XmlBoolean xabstract)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABSTRACT$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ABSTRACT$14);
                }
                target.set(xabstract);
            }
        }
        
        /**
         * Unsets the "abstract" attribute
         */
        public void unsetAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ABSTRACT$14);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$16);
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
                return get_store().find_attribute_user(DESC$16) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESC$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESC$16);
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
                get_store().remove_attribute(DESC$16);
            }
        }
        
        /**
         * Gets the "entity" attribute
         */
        public java.lang.String getEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITY$18);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "entity" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITY$18);
                return target;
            }
        }
        
        /**
         * Sets the "entity" attribute
         */
        public void setEntity(java.lang.String entity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITY$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTITY$18);
                }
                target.setStringValue(entity);
            }
        }
        
        /**
         * Sets (as xml) the "entity" attribute
         */
        public void xsetEntity(org.apache.xmlbeans.XmlString entity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITY$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENTITY$18);
                }
                target.set(entity);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPORTABLE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EXPORTABLE$20);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXPORTABLE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EXPORTABLE$20);
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
                return get_store().find_attribute_user(EXPORTABLE$20) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPORTABLE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXPORTABLE$20);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXPORTABLE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EXPORTABLE$20);
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
                get_store().remove_attribute(EXPORTABLE$20);
            }
        }
        
        /**
         * Gets the "extendable" attribute
         */
        public boolean getExtendable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENDABLE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EXTENDABLE$22);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "extendable" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetExtendable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXTENDABLE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EXTENDABLE$22);
                }
                return target;
            }
        }
        
        /**
         * True if has "extendable" attribute
         */
        public boolean isSetExtendable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EXTENDABLE$22) != null;
            }
        }
        
        /**
         * Sets the "extendable" attribute
         */
        public void setExtendable(boolean extendable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENDABLE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXTENDABLE$22);
                }
                target.setBooleanValue(extendable);
            }
        }
        
        /**
         * Sets (as xml) the "extendable" attribute
         */
        public void xsetExtendable(org.apache.xmlbeans.XmlBoolean extendable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXTENDABLE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EXTENDABLE$22);
                }
                target.set(extendable);
            }
        }
        
        /**
         * Unsets the "extendable" attribute
         */
        public void unsetExtendable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EXTENDABLE$22);
            }
        }
        
        /**
         * Gets the "final" attribute
         */
        public boolean getFinal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINAL$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FINAL$24);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "final" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetFinal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FINAL$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FINAL$24);
                }
                return target;
            }
        }
        
        /**
         * True if has "final" attribute
         */
        public boolean isSetFinal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FINAL$24) != null;
            }
        }
        
        /**
         * Sets the "final" attribute
         */
        public void setFinal(boolean xfinal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINAL$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FINAL$24);
                }
                target.setBooleanValue(xfinal);
            }
        }
        
        /**
         * Sets (as xml) the "final" attribute
         */
        public void xsetFinal(org.apache.xmlbeans.XmlBoolean xfinal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FINAL$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FINAL$24);
                }
                target.set(xfinal);
            }
        }
        
        /**
         * Unsets the "final" attribute
         */
        public void unsetFinal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FINAL$24);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JAVACLASS$26);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(JAVACLASS$26);
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
                return get_store().find_attribute_user(JAVACLASS$26) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JAVACLASS$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JAVACLASS$26);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(JAVACLASS$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(JAVACLASS$26);
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
                get_store().remove_attribute(JAVACLASS$26);
            }
        }
        
        /**
         * Gets the "primaryEntity" attribute
         */
        public java.lang.String getPrimaryEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIMARYENTITY$28);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "primaryEntity" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPrimaryEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PRIMARYENTITY$28);
                return target;
            }
        }
        
        /**
         * Sets the "primaryEntity" attribute
         */
        public void setPrimaryEntity(java.lang.String primaryEntity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIMARYENTITY$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRIMARYENTITY$28);
                }
                target.setStringValue(primaryEntity);
            }
        }
        
        /**
         * Sets (as xml) the "primaryEntity" attribute
         */
        public void xsetPrimaryEntity(org.apache.xmlbeans.XmlString primaryEntity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PRIMARYENTITY$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PRIMARYENTITY$28);
                }
                target.set(primaryEntity);
            }
        }
        
        /**
         * Gets the "showRetiredBeans" attribute
         */
        public boolean getShowRetiredBeans()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWRETIREDBEANS$30);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "showRetiredBeans" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetShowRetiredBeans()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWRETIREDBEANS$30);
                return target;
            }
        }
        
        /**
         * True if has "showRetiredBeans" attribute
         */
        public boolean isSetShowRetiredBeans()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SHOWRETIREDBEANS$30) != null;
            }
        }
        
        /**
         * Sets the "showRetiredBeans" attribute
         */
        public void setShowRetiredBeans(boolean showRetiredBeans)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWRETIREDBEANS$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWRETIREDBEANS$30);
                }
                target.setBooleanValue(showRetiredBeans);
            }
        }
        
        /**
         * Sets (as xml) the "showRetiredBeans" attribute
         */
        public void xsetShowRetiredBeans(org.apache.xmlbeans.XmlBoolean showRetiredBeans)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWRETIREDBEANS$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWRETIREDBEANS$30);
                }
                target.set(showRetiredBeans);
            }
        }
        
        /**
         * Unsets the "showRetiredBeans" attribute
         */
        public void unsetShowRetiredBeans()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SHOWRETIREDBEANS$30);
            }
        }
        
        /**
         * Gets the "supertypeEntity" attribute
         */
        public java.lang.String getSupertypeEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPERTYPEENTITY$32);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "supertypeEntity" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetSupertypeEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(SUPERTYPEENTITY$32);
                return target;
            }
        }
        
        /**
         * True if has "supertypeEntity" attribute
         */
        public boolean isSetSupertypeEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SUPERTYPEENTITY$32) != null;
            }
        }
        
        /**
         * Sets the "supertypeEntity" attribute
         */
        public void setSupertypeEntity(java.lang.String supertypeEntity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPERTYPEENTITY$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUPERTYPEENTITY$32);
                }
                target.setStringValue(supertypeEntity);
            }
        }
        
        /**
         * Sets (as xml) the "supertypeEntity" attribute
         */
        public void xsetSupertypeEntity(org.apache.xmlbeans.XmlNMTOKEN supertypeEntity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(SUPERTYPEENTITY$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(SUPERTYPEENTITY$32);
                }
                target.set(supertypeEntity);
            }
        }
        
        /**
         * Unsets the "supertypeEntity" attribute
         */
        public void unsetSupertypeEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SUPERTYPEENTITY$32);
            }
        }
    }
}
