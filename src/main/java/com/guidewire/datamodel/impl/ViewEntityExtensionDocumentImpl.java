/*
 * An XML document type.
 * Localname: viewEntityExtension
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.ViewEntityExtensionDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one viewEntityExtension(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class ViewEntityExtensionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ViewEntityExtensionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ViewEntityExtensionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VIEWENTITYEXTENSION$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "viewEntityExtension");
    
    
    /**
     * Gets the "viewEntityExtension" element
     */
    public com.guidewire.datamodel.ViewEntityExtensionDocument.ViewEntityExtension getViewEntityExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ViewEntityExtensionDocument.ViewEntityExtension target = null;
            target = (com.guidewire.datamodel.ViewEntityExtensionDocument.ViewEntityExtension)get_store().find_element_user(VIEWENTITYEXTENSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "viewEntityExtension" element
     */
    public void setViewEntityExtension(com.guidewire.datamodel.ViewEntityExtensionDocument.ViewEntityExtension viewEntityExtension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ViewEntityExtensionDocument.ViewEntityExtension target = null;
            target = (com.guidewire.datamodel.ViewEntityExtensionDocument.ViewEntityExtension)get_store().find_element_user(VIEWENTITYEXTENSION$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.ViewEntityExtensionDocument.ViewEntityExtension)get_store().add_element_user(VIEWENTITYEXTENSION$0);
            }
            target.set(viewEntityExtension);
        }
    }
    
    /**
     * Appends and returns a new empty "viewEntityExtension" element
     */
    public com.guidewire.datamodel.ViewEntityExtensionDocument.ViewEntityExtension addNewViewEntityExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.ViewEntityExtensionDocument.ViewEntityExtension target = null;
            target = (com.guidewire.datamodel.ViewEntityExtensionDocument.ViewEntityExtension)get_store().add_element_user(VIEWENTITYEXTENSION$0);
            return target;
        }
    }
    /**
     * An XML viewEntityExtension(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class ViewEntityExtensionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.ViewEntityExtensionDocument.ViewEntityExtension
    {
        private static final long serialVersionUID = 1L;
        
        public ViewEntityExtensionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COMPUTEDCOLUMN$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "computedcolumn");
        private static final javax.xml.namespace.QName COMPUTEDTYPEKEY$2 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "computedtypekey");
        private static final javax.xml.namespace.QName DESCRIPTION$4 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "description");
        private static final javax.xml.namespace.QName VIEWENTITYCOLUMN$6 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "viewEntityColumn");
        private static final javax.xml.namespace.QName VIEWENTITYLINK$8 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "viewEntityLink");
        private static final javax.xml.namespace.QName VIEWENTITYNAME$10 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "viewEntityName");
        private static final javax.xml.namespace.QName VIEWENTITYTYPEKEY$12 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "viewEntityTypekey");
        private static final javax.xml.namespace.QName ENTITYNAME$14 = 
            new javax.xml.namespace.QName("", "entityName");
        
        
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
         * Gets array of all "description" elements
         */
        public com.guidewire.datamodel.DescriptionDocument.Description[] getDescriptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DESCRIPTION$4, targetList);
                com.guidewire.datamodel.DescriptionDocument.Description[] result = new com.guidewire.datamodel.DescriptionDocument.Description[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "description" element
         */
        public com.guidewire.datamodel.DescriptionDocument.Description getDescriptionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.DescriptionDocument.Description target = null;
                target = (com.guidewire.datamodel.DescriptionDocument.Description)get_store().find_element_user(DESCRIPTION$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "description" element
         */
        public int sizeOfDescriptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESCRIPTION$4);
            }
        }
        
        /**
         * Sets array of all "description" element
         */
        public void setDescriptionArray(com.guidewire.datamodel.DescriptionDocument.Description[] descriptionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(descriptionArray, DESCRIPTION$4);
            }
        }
        
        /**
         * Sets ith "description" element
         */
        public void setDescriptionArray(int i, com.guidewire.datamodel.DescriptionDocument.Description description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.DescriptionDocument.Description target = null;
                target = (com.guidewire.datamodel.DescriptionDocument.Description)get_store().find_element_user(DESCRIPTION$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(description);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "description" element
         */
        public com.guidewire.datamodel.DescriptionDocument.Description insertNewDescription(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.DescriptionDocument.Description target = null;
                target = (com.guidewire.datamodel.DescriptionDocument.Description)get_store().insert_element_user(DESCRIPTION$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "description" element
         */
        public com.guidewire.datamodel.DescriptionDocument.Description addNewDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.DescriptionDocument.Description target = null;
                target = (com.guidewire.datamodel.DescriptionDocument.Description)get_store().add_element_user(DESCRIPTION$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "description" element
         */
        public void removeDescription(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESCRIPTION$4, i);
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
         * Gets the "entityName" attribute
         */
        public java.lang.String getEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "entityName" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(ENTITYNAME$14);
                return target;
            }
        }
        
        /**
         * Sets the "entityName" attribute
         */
        public void setEntityName(java.lang.String entityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTITYNAME$14);
                }
                target.setStringValue(entityName);
            }
        }
        
        /**
         * Sets (as xml) the "entityName" attribute
         */
        public void xsetEntityName(org.apache.xmlbeans.XmlNMTOKEN entityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(ENTITYNAME$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(ENTITYNAME$14);
                }
                target.set(entityName);
            }
        }
    }
}
