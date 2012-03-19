/*
 * An XML document type.
 * Localname: jointableconsistencycheck
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.JointableconsistencycheckDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel.impl;
/**
 * A document containing one jointableconsistencycheck(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public class JointableconsistencycheckDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.JointableconsistencycheckDocument
{
    private static final long serialVersionUID = 1L;
    
    public JointableconsistencycheckDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JOINTABLECONSISTENCYCHECK$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/datamodel", "jointableconsistencycheck");
    
    
    /**
     * Gets the "jointableconsistencycheck" element
     */
    public com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck getJointableconsistencycheck()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck target = null;
            target = (com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck)get_store().find_element_user(JOINTABLECONSISTENCYCHECK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "jointableconsistencycheck" element
     */
    public void setJointableconsistencycheck(com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck jointableconsistencycheck)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck target = null;
            target = (com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck)get_store().find_element_user(JOINTABLECONSISTENCYCHECK$0, 0);
            if (target == null)
            {
                target = (com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck)get_store().add_element_user(JOINTABLECONSISTENCYCHECK$0);
            }
            target.set(jointableconsistencycheck);
        }
    }
    
    /**
     * Appends and returns a new empty "jointableconsistencycheck" element
     */
    public com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck addNewJointableconsistencycheck()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck target = null;
            target = (com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck)get_store().add_element_user(JOINTABLECONSISTENCYCHECK$0);
            return target;
        }
    }
    /**
     * An XML jointableconsistencycheck(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public static class JointableconsistencycheckImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck
    {
        private static final long serialVersionUID = 1L;
        
        public JointableconsistencycheckImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MATCHINGCOLUMN$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/datamodel", "matchingcolumn");
        private static final javax.xml.namespace.QName JOINTABLE$2 = 
            new javax.xml.namespace.QName("", "jointable");
        private static final javax.xml.namespace.QName RUNAFTERPOPULATINGSOURCETABLES$4 = 
            new javax.xml.namespace.QName("", "runafterpopulatingsourcetables");
        
        
        /**
         * Gets array of all "matchingcolumn" elements
         */
        public com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn[] getMatchingcolumnArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MATCHINGCOLUMN$0, targetList);
                com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn[] result = new com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "matchingcolumn" element
         */
        public com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn getMatchingcolumnArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn target = null;
                target = (com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn)get_store().find_element_user(MATCHINGCOLUMN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "matchingcolumn" element
         */
        public int sizeOfMatchingcolumnArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MATCHINGCOLUMN$0);
            }
        }
        
        /**
         * Sets array of all "matchingcolumn" element
         */
        public void setMatchingcolumnArray(com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn[] matchingcolumnArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(matchingcolumnArray, MATCHINGCOLUMN$0);
            }
        }
        
        /**
         * Sets ith "matchingcolumn" element
         */
        public void setMatchingcolumnArray(int i, com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn matchingcolumn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn target = null;
                target = (com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn)get_store().find_element_user(MATCHINGCOLUMN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(matchingcolumn);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "matchingcolumn" element
         */
        public com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn insertNewMatchingcolumn(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn target = null;
                target = (com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn)get_store().insert_element_user(MATCHINGCOLUMN$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "matchingcolumn" element
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
         * Removes the ith "matchingcolumn" element
         */
        public void removeMatchingcolumn(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MATCHINGCOLUMN$0, i);
            }
        }
        
        /**
         * Gets the "jointable" attribute
         */
        public java.lang.String getJointable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JOINTABLE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "jointable" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetJointable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(JOINTABLE$2);
                return target;
            }
        }
        
        /**
         * Sets the "jointable" attribute
         */
        public void setJointable(java.lang.String jointable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JOINTABLE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JOINTABLE$2);
                }
                target.setStringValue(jointable);
            }
        }
        
        /**
         * Sets (as xml) the "jointable" attribute
         */
        public void xsetJointable(org.apache.xmlbeans.XmlNMTOKEN jointable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(JOINTABLE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(JOINTABLE$2);
                }
                target.set(jointable);
            }
        }
        
        /**
         * Gets the "runafterpopulatingsourcetables" attribute
         */
        public boolean getRunafterpopulatingsourcetables()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RUNAFTERPOPULATINGSOURCETABLES$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RUNAFTERPOPULATINGSOURCETABLES$4);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "runafterpopulatingsourcetables" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetRunafterpopulatingsourcetables()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RUNAFTERPOPULATINGSOURCETABLES$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(RUNAFTERPOPULATINGSOURCETABLES$4);
                }
                return target;
            }
        }
        
        /**
         * True if has "runafterpopulatingsourcetables" attribute
         */
        public boolean isSetRunafterpopulatingsourcetables()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RUNAFTERPOPULATINGSOURCETABLES$4) != null;
            }
        }
        
        /**
         * Sets the "runafterpopulatingsourcetables" attribute
         */
        public void setRunafterpopulatingsourcetables(boolean runafterpopulatingsourcetables)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RUNAFTERPOPULATINGSOURCETABLES$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RUNAFTERPOPULATINGSOURCETABLES$4);
                }
                target.setBooleanValue(runafterpopulatingsourcetables);
            }
        }
        
        /**
         * Sets (as xml) the "runafterpopulatingsourcetables" attribute
         */
        public void xsetRunafterpopulatingsourcetables(org.apache.xmlbeans.XmlBoolean runafterpopulatingsourcetables)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RUNAFTERPOPULATINGSOURCETABLES$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(RUNAFTERPOPULATINGSOURCETABLES$4);
                }
                target.set(runafterpopulatingsourcetables);
            }
        }
        
        /**
         * Unsets the "runafterpopulatingsourcetables" attribute
         */
        public void unsetRunafterpopulatingsourcetables()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RUNAFTERPOPULATINGSOURCETABLES$4);
            }
        }
    }
}
