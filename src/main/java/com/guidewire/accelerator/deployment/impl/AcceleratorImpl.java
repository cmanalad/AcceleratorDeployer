/*
 * XML Type:  accelerator
 * Namespace: http://guidewire.com/accelerator/deployment
 * Java type: com.guidewire.accelerator.deployment.Accelerator
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.accelerator.deployment.impl;
/**
 * An XML accelerator(@http://guidewire.com/accelerator/deployment).
 *
 * This is a complex type.
 */
public class AcceleratorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.accelerator.deployment.Accelerator
{
    private static final long serialVersionUID = 1L;
    
    public AcceleratorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PCFROOT$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "pcfRoot");
    private static final javax.xml.namespace.QName GOSUROOT$2 = 
        new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "gosuRoot");
    private static final javax.xml.namespace.QName GUNITROOT$4 = 
        new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "gunitRoot");
    private static final javax.xml.namespace.QName ANTBUILD$6 = 
        new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "antBuild");
    private static final javax.xml.namespace.QName LIBRARY$8 = 
        new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "library");
    private static final javax.xml.namespace.QName MAVENBUILD$10 = 
        new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "mavenBuild");
    private static final javax.xml.namespace.QName DATAEXTENSION$12 = 
        new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "dataExtension");
    private static final javax.xml.namespace.QName MESSAGEQUEUE$14 = 
        new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "messageQueue");
    private static final javax.xml.namespace.QName PLUGIN$16 = 
        new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "plugin");
    private static final javax.xml.namespace.QName DISPLAYKEY$18 = 
        new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "displaykey");
    
    
    /**
     * Gets array of all "pcfRoot" elements
     */
    public com.guidewire.accelerator.deployment.Accelerator.PcfRoot[] getPcfRootArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PCFROOT$0, targetList);
            com.guidewire.accelerator.deployment.Accelerator.PcfRoot[] result = new com.guidewire.accelerator.deployment.Accelerator.PcfRoot[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pcfRoot" element
     */
    public com.guidewire.accelerator.deployment.Accelerator.PcfRoot getPcfRootArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.PcfRoot target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.PcfRoot)get_store().find_element_user(PCFROOT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pcfRoot" element
     */
    public int sizeOfPcfRootArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PCFROOT$0);
        }
    }
    
    /**
     * Sets array of all "pcfRoot" element
     */
    public void setPcfRootArray(com.guidewire.accelerator.deployment.Accelerator.PcfRoot[] pcfRootArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(pcfRootArray, PCFROOT$0);
        }
    }
    
    /**
     * Sets ith "pcfRoot" element
     */
    public void setPcfRootArray(int i, com.guidewire.accelerator.deployment.Accelerator.PcfRoot pcfRoot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.PcfRoot target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.PcfRoot)get_store().find_element_user(PCFROOT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pcfRoot);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pcfRoot" element
     */
    public com.guidewire.accelerator.deployment.Accelerator.PcfRoot insertNewPcfRoot(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.PcfRoot target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.PcfRoot)get_store().insert_element_user(PCFROOT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pcfRoot" element
     */
    public com.guidewire.accelerator.deployment.Accelerator.PcfRoot addNewPcfRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.PcfRoot target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.PcfRoot)get_store().add_element_user(PCFROOT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "pcfRoot" element
     */
    public void removePcfRoot(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PCFROOT$0, i);
        }
    }
    
    /**
     * Gets array of all "gosuRoot" elements
     */
    public com.guidewire.accelerator.deployment.Accelerator.GosuRoot[] getGosuRootArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GOSUROOT$2, targetList);
            com.guidewire.accelerator.deployment.Accelerator.GosuRoot[] result = new com.guidewire.accelerator.deployment.Accelerator.GosuRoot[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "gosuRoot" element
     */
    public com.guidewire.accelerator.deployment.Accelerator.GosuRoot getGosuRootArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.GosuRoot target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.GosuRoot)get_store().find_element_user(GOSUROOT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "gosuRoot" element
     */
    public int sizeOfGosuRootArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GOSUROOT$2);
        }
    }
    
    /**
     * Sets array of all "gosuRoot" element
     */
    public void setGosuRootArray(com.guidewire.accelerator.deployment.Accelerator.GosuRoot[] gosuRootArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(gosuRootArray, GOSUROOT$2);
        }
    }
    
    /**
     * Sets ith "gosuRoot" element
     */
    public void setGosuRootArray(int i, com.guidewire.accelerator.deployment.Accelerator.GosuRoot gosuRoot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.GosuRoot target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.GosuRoot)get_store().find_element_user(GOSUROOT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(gosuRoot);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "gosuRoot" element
     */
    public com.guidewire.accelerator.deployment.Accelerator.GosuRoot insertNewGosuRoot(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.GosuRoot target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.GosuRoot)get_store().insert_element_user(GOSUROOT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "gosuRoot" element
     */
    public com.guidewire.accelerator.deployment.Accelerator.GosuRoot addNewGosuRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.GosuRoot target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.GosuRoot)get_store().add_element_user(GOSUROOT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "gosuRoot" element
     */
    public void removeGosuRoot(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GOSUROOT$2, i);
        }
    }
    
    /**
     * Gets array of all "gunitRoot" elements
     */
    public com.guidewire.accelerator.deployment.Accelerator.GunitRoot[] getGunitRootArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GUNITROOT$4, targetList);
            com.guidewire.accelerator.deployment.Accelerator.GunitRoot[] result = new com.guidewire.accelerator.deployment.Accelerator.GunitRoot[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "gunitRoot" element
     */
    public com.guidewire.accelerator.deployment.Accelerator.GunitRoot getGunitRootArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.GunitRoot target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.GunitRoot)get_store().find_element_user(GUNITROOT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "gunitRoot" element
     */
    public int sizeOfGunitRootArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GUNITROOT$4);
        }
    }
    
    /**
     * Sets array of all "gunitRoot" element
     */
    public void setGunitRootArray(com.guidewire.accelerator.deployment.Accelerator.GunitRoot[] gunitRootArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(gunitRootArray, GUNITROOT$4);
        }
    }
    
    /**
     * Sets ith "gunitRoot" element
     */
    public void setGunitRootArray(int i, com.guidewire.accelerator.deployment.Accelerator.GunitRoot gunitRoot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.GunitRoot target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.GunitRoot)get_store().find_element_user(GUNITROOT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(gunitRoot);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "gunitRoot" element
     */
    public com.guidewire.accelerator.deployment.Accelerator.GunitRoot insertNewGunitRoot(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.GunitRoot target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.GunitRoot)get_store().insert_element_user(GUNITROOT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "gunitRoot" element
     */
    public com.guidewire.accelerator.deployment.Accelerator.GunitRoot addNewGunitRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.GunitRoot target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.GunitRoot)get_store().add_element_user(GUNITROOT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "gunitRoot" element
     */
    public void removeGunitRoot(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GUNITROOT$4, i);
        }
    }
    
    /**
     * Gets array of all "antBuild" elements
     */
    public com.guidewire.accelerator.deployment.Accelerator.AntBuild[] getAntBuildArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ANTBUILD$6, targetList);
            com.guidewire.accelerator.deployment.Accelerator.AntBuild[] result = new com.guidewire.accelerator.deployment.Accelerator.AntBuild[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "antBuild" element
     */
    public com.guidewire.accelerator.deployment.Accelerator.AntBuild getAntBuildArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.AntBuild target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.AntBuild)get_store().find_element_user(ANTBUILD$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "antBuild" element
     */
    public int sizeOfAntBuildArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANTBUILD$6);
        }
    }
    
    /**
     * Sets array of all "antBuild" element
     */
    public void setAntBuildArray(com.guidewire.accelerator.deployment.Accelerator.AntBuild[] antBuildArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(antBuildArray, ANTBUILD$6);
        }
    }
    
    /**
     * Sets ith "antBuild" element
     */
    public void setAntBuildArray(int i, com.guidewire.accelerator.deployment.Accelerator.AntBuild antBuild)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.AntBuild target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.AntBuild)get_store().find_element_user(ANTBUILD$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(antBuild);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "antBuild" element
     */
    public com.guidewire.accelerator.deployment.Accelerator.AntBuild insertNewAntBuild(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.AntBuild target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.AntBuild)get_store().insert_element_user(ANTBUILD$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "antBuild" element
     */
    public com.guidewire.accelerator.deployment.Accelerator.AntBuild addNewAntBuild()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.AntBuild target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.AntBuild)get_store().add_element_user(ANTBUILD$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "antBuild" element
     */
    public void removeAntBuild(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANTBUILD$6, i);
        }
    }
    
    /**
     * Gets array of all "library" elements
     */
    public com.guidewire.accelerator.deployment.Accelerator.Library[] getLibraryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LIBRARY$8, targetList);
            com.guidewire.accelerator.deployment.Accelerator.Library[] result = new com.guidewire.accelerator.deployment.Accelerator.Library[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "library" element
     */
    public com.guidewire.accelerator.deployment.Accelerator.Library getLibraryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.Library target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.Library)get_store().find_element_user(LIBRARY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "library" element
     */
    public int sizeOfLibraryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIBRARY$8);
        }
    }
    
    /**
     * Sets array of all "library" element
     */
    public void setLibraryArray(com.guidewire.accelerator.deployment.Accelerator.Library[] libraryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(libraryArray, LIBRARY$8);
        }
    }
    
    /**
     * Sets ith "library" element
     */
    public void setLibraryArray(int i, com.guidewire.accelerator.deployment.Accelerator.Library library)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.Library target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.Library)get_store().find_element_user(LIBRARY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(library);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "library" element
     */
    public com.guidewire.accelerator.deployment.Accelerator.Library insertNewLibrary(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.Library target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.Library)get_store().insert_element_user(LIBRARY$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "library" element
     */
    public com.guidewire.accelerator.deployment.Accelerator.Library addNewLibrary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.Library target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.Library)get_store().add_element_user(LIBRARY$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "library" element
     */
    public void removeLibrary(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIBRARY$8, i);
        }
    }
    
    /**
     * Gets array of all "mavenBuild" elements
     */
    public com.guidewire.accelerator.deployment.Accelerator.MavenBuild[] getMavenBuildArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAVENBUILD$10, targetList);
            com.guidewire.accelerator.deployment.Accelerator.MavenBuild[] result = new com.guidewire.accelerator.deployment.Accelerator.MavenBuild[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "mavenBuild" element
     */
    public com.guidewire.accelerator.deployment.Accelerator.MavenBuild getMavenBuildArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.MavenBuild target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.MavenBuild)get_store().find_element_user(MAVENBUILD$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "mavenBuild" element
     */
    public int sizeOfMavenBuildArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAVENBUILD$10);
        }
    }
    
    /**
     * Sets array of all "mavenBuild" element
     */
    public void setMavenBuildArray(com.guidewire.accelerator.deployment.Accelerator.MavenBuild[] mavenBuildArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mavenBuildArray, MAVENBUILD$10);
        }
    }
    
    /**
     * Sets ith "mavenBuild" element
     */
    public void setMavenBuildArray(int i, com.guidewire.accelerator.deployment.Accelerator.MavenBuild mavenBuild)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.MavenBuild target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.MavenBuild)get_store().find_element_user(MAVENBUILD$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mavenBuild);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mavenBuild" element
     */
    public com.guidewire.accelerator.deployment.Accelerator.MavenBuild insertNewMavenBuild(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.MavenBuild target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.MavenBuild)get_store().insert_element_user(MAVENBUILD$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mavenBuild" element
     */
    public com.guidewire.accelerator.deployment.Accelerator.MavenBuild addNewMavenBuild()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.MavenBuild target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.MavenBuild)get_store().add_element_user(MAVENBUILD$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "mavenBuild" element
     */
    public void removeMavenBuild(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAVENBUILD$10, i);
        }
    }
    
    /**
     * Gets the "dataExtension" element
     */
    public com.guidewire.accelerator.deployment.Accelerator.DataExtension getDataExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.DataExtension target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.DataExtension)get_store().find_element_user(DATAEXTENSION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataExtension" element
     */
    public boolean isSetDataExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAEXTENSION$12) != 0;
        }
    }
    
    /**
     * Sets the "dataExtension" element
     */
    public void setDataExtension(com.guidewire.accelerator.deployment.Accelerator.DataExtension dataExtension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.DataExtension target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.DataExtension)get_store().find_element_user(DATAEXTENSION$12, 0);
            if (target == null)
            {
                target = (com.guidewire.accelerator.deployment.Accelerator.DataExtension)get_store().add_element_user(DATAEXTENSION$12);
            }
            target.set(dataExtension);
        }
    }
    
    /**
     * Appends and returns a new empty "dataExtension" element
     */
    public com.guidewire.accelerator.deployment.Accelerator.DataExtension addNewDataExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.DataExtension target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.DataExtension)get_store().add_element_user(DATAEXTENSION$12);
            return target;
        }
    }
    
    /**
     * Unsets the "dataExtension" element
     */
    public void unsetDataExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAEXTENSION$12, 0);
        }
    }
    
    /**
     * Gets array of all "messageQueue" elements
     */
    public com.guidewire.accelerator.deployment.Accelerator.MessageQueue[] getMessageQueueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MESSAGEQUEUE$14, targetList);
            com.guidewire.accelerator.deployment.Accelerator.MessageQueue[] result = new com.guidewire.accelerator.deployment.Accelerator.MessageQueue[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "messageQueue" element
     */
    public com.guidewire.accelerator.deployment.Accelerator.MessageQueue getMessageQueueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.MessageQueue target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue)get_store().find_element_user(MESSAGEQUEUE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "messageQueue" element
     */
    public int sizeOfMessageQueueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEQUEUE$14);
        }
    }
    
    /**
     * Sets array of all "messageQueue" element
     */
    public void setMessageQueueArray(com.guidewire.accelerator.deployment.Accelerator.MessageQueue[] messageQueueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(messageQueueArray, MESSAGEQUEUE$14);
        }
    }
    
    /**
     * Sets ith "messageQueue" element
     */
    public void setMessageQueueArray(int i, com.guidewire.accelerator.deployment.Accelerator.MessageQueue messageQueue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.MessageQueue target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue)get_store().find_element_user(MESSAGEQUEUE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(messageQueue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "messageQueue" element
     */
    public com.guidewire.accelerator.deployment.Accelerator.MessageQueue insertNewMessageQueue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.MessageQueue target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue)get_store().insert_element_user(MESSAGEQUEUE$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "messageQueue" element
     */
    public com.guidewire.accelerator.deployment.Accelerator.MessageQueue addNewMessageQueue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.MessageQueue target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue)get_store().add_element_user(MESSAGEQUEUE$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "messageQueue" element
     */
    public void removeMessageQueue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEQUEUE$14, i);
        }
    }
    
    /**
     * Gets array of all "plugin" elements
     */
    public com.guidewire.accelerator.deployment.Accelerator.Plugin[] getPluginArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PLUGIN$16, targetList);
            com.guidewire.accelerator.deployment.Accelerator.Plugin[] result = new com.guidewire.accelerator.deployment.Accelerator.Plugin[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "plugin" element
     */
    public com.guidewire.accelerator.deployment.Accelerator.Plugin getPluginArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.Plugin target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.Plugin)get_store().find_element_user(PLUGIN$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "plugin" element
     */
    public int sizeOfPluginArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLUGIN$16);
        }
    }
    
    /**
     * Sets array of all "plugin" element
     */
    public void setPluginArray(com.guidewire.accelerator.deployment.Accelerator.Plugin[] pluginArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(pluginArray, PLUGIN$16);
        }
    }
    
    /**
     * Sets ith "plugin" element
     */
    public void setPluginArray(int i, com.guidewire.accelerator.deployment.Accelerator.Plugin plugin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.Plugin target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.Plugin)get_store().find_element_user(PLUGIN$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(plugin);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "plugin" element
     */
    public com.guidewire.accelerator.deployment.Accelerator.Plugin insertNewPlugin(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.Plugin target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.Plugin)get_store().insert_element_user(PLUGIN$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "plugin" element
     */
    public com.guidewire.accelerator.deployment.Accelerator.Plugin addNewPlugin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.Plugin target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.Plugin)get_store().add_element_user(PLUGIN$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "plugin" element
     */
    public void removePlugin(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLUGIN$16, i);
        }
    }
    
    /**
     * Gets the "displaykey" element
     */
    public com.guidewire.accelerator.deployment.Accelerator.Displaykey getDisplaykey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.Displaykey target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.Displaykey)get_store().find_element_user(DISPLAYKEY$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "displaykey" element
     */
    public boolean isSetDisplaykey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYKEY$18) != 0;
        }
    }
    
    /**
     * Sets the "displaykey" element
     */
    public void setDisplaykey(com.guidewire.accelerator.deployment.Accelerator.Displaykey displaykey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.Displaykey target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.Displaykey)get_store().find_element_user(DISPLAYKEY$18, 0);
            if (target == null)
            {
                target = (com.guidewire.accelerator.deployment.Accelerator.Displaykey)get_store().add_element_user(DISPLAYKEY$18);
            }
            target.set(displaykey);
        }
    }
    
    /**
     * Appends and returns a new empty "displaykey" element
     */
    public com.guidewire.accelerator.deployment.Accelerator.Displaykey addNewDisplaykey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator.Displaykey target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator.Displaykey)get_store().add_element_user(DISPLAYKEY$18);
            return target;
        }
    }
    
    /**
     * Unsets the "displaykey" element
     */
    public void unsetDisplaykey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYKEY$18, 0);
        }
    }
    /**
     * An XML pcfRoot(@http://guidewire.com/accelerator/deployment).
     *
     * This is a complex type.
     */
    public static class PcfRootImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.accelerator.deployment.Accelerator.PcfRoot
    {
        private static final long serialVersionUID = 1L;
        
        public PcfRootImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DIRECTORY$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "directory");
        
        
        /**
         * Gets the "directory" element
         */
        public java.lang.String getDirectory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTORY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "directory" element
         */
        public org.apache.xmlbeans.XmlString xgetDirectory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECTORY$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "directory" element
         */
        public void setDirectory(java.lang.String directory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTORY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRECTORY$0);
                }
                target.setStringValue(directory);
            }
        }
        
        /**
         * Sets (as xml) the "directory" element
         */
        public void xsetDirectory(org.apache.xmlbeans.XmlString directory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECTORY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DIRECTORY$0);
                }
                target.set(directory);
            }
        }
    }
    /**
     * An XML gosuRoot(@http://guidewire.com/accelerator/deployment).
     *
     * This is a complex type.
     */
    public static class GosuRootImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.accelerator.deployment.Accelerator.GosuRoot
    {
        private static final long serialVersionUID = 1L;
        
        public GosuRootImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DIRECTORY$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "directory");
        
        
        /**
         * Gets the "directory" element
         */
        public java.lang.String getDirectory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTORY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "directory" element
         */
        public org.apache.xmlbeans.XmlString xgetDirectory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECTORY$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "directory" element
         */
        public void setDirectory(java.lang.String directory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTORY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRECTORY$0);
                }
                target.setStringValue(directory);
            }
        }
        
        /**
         * Sets (as xml) the "directory" element
         */
        public void xsetDirectory(org.apache.xmlbeans.XmlString directory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECTORY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DIRECTORY$0);
                }
                target.set(directory);
            }
        }
    }
    /**
     * An XML gunitRoot(@http://guidewire.com/accelerator/deployment).
     *
     * This is a complex type.
     */
    public static class GunitRootImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.accelerator.deployment.Accelerator.GunitRoot
    {
        private static final long serialVersionUID = 1L;
        
        public GunitRootImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DIRECTORY$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "directory");
        
        
        /**
         * Gets the "directory" element
         */
        public java.lang.String getDirectory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTORY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "directory" element
         */
        public org.apache.xmlbeans.XmlString xgetDirectory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECTORY$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "directory" element
         */
        public void setDirectory(java.lang.String directory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTORY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRECTORY$0);
                }
                target.setStringValue(directory);
            }
        }
        
        /**
         * Sets (as xml) the "directory" element
         */
        public void xsetDirectory(org.apache.xmlbeans.XmlString directory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECTORY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DIRECTORY$0);
                }
                target.set(directory);
            }
        }
    }
    /**
     * An XML antBuild(@http://guidewire.com/accelerator/deployment).
     *
     * This is a complex type.
     */
    public static class AntBuildImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.accelerator.deployment.Accelerator.AntBuild
    {
        private static final long serialVersionUID = 1L;
        
        public AntBuildImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DIRECTORY$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "directory");
        private static final javax.xml.namespace.QName BUILDFILE$2 = 
            new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "buildFile");
        private static final javax.xml.namespace.QName TARGET$4 = 
            new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "target");
        
        
        /**
         * Gets the "directory" element
         */
        public java.lang.String getDirectory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTORY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "directory" element
         */
        public org.apache.xmlbeans.XmlString xgetDirectory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECTORY$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "directory" element
         */
        public void setDirectory(java.lang.String directory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTORY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRECTORY$0);
                }
                target.setStringValue(directory);
            }
        }
        
        /**
         * Sets (as xml) the "directory" element
         */
        public void xsetDirectory(org.apache.xmlbeans.XmlString directory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECTORY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DIRECTORY$0);
                }
                target.set(directory);
            }
        }
        
        /**
         * Gets the "buildFile" element
         */
        public java.lang.String getBuildFile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUILDFILE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "buildFile" element
         */
        public org.apache.xmlbeans.XmlString xgetBuildFile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUILDFILE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "buildFile" element
         */
        public void setBuildFile(java.lang.String buildFile)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUILDFILE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUILDFILE$2);
                }
                target.setStringValue(buildFile);
            }
        }
        
        /**
         * Sets (as xml) the "buildFile" element
         */
        public void xsetBuildFile(org.apache.xmlbeans.XmlString buildFile)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUILDFILE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BUILDFILE$2);
                }
                target.set(buildFile);
            }
        }
        
        /**
         * Gets the "target" element
         */
        public java.lang.String getTarget()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGET$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "target" element
         */
        public org.apache.xmlbeans.XmlString xgetTarget()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGET$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "target" element
         */
        public void setTarget(java.lang.String targetValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGET$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGET$4);
                }
                target.setStringValue(targetValue);
            }
        }
        
        /**
         * Sets (as xml) the "target" element
         */
        public void xsetTarget(org.apache.xmlbeans.XmlString targetValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGET$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGET$4);
                }
                target.set(targetValue);
            }
        }
    }
    /**
     * An XML library(@http://guidewire.com/accelerator/deployment).
     *
     * This is a complex type.
     */
    public static class LibraryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.accelerator.deployment.Accelerator.Library
    {
        private static final long serialVersionUID = 1L;
        
        public LibraryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DIRECTORY$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "directory");
        private static final javax.xml.namespace.QName PLUGINDIRECTORY$2 = 
            new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "pluginDirectory");
        
        
        /**
         * Gets the "directory" element
         */
        public java.lang.String getDirectory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTORY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "directory" element
         */
        public org.apache.xmlbeans.XmlString xgetDirectory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECTORY$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "directory" element
         */
        public void setDirectory(java.lang.String directory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTORY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRECTORY$0);
                }
                target.setStringValue(directory);
            }
        }
        
        /**
         * Sets (as xml) the "directory" element
         */
        public void xsetDirectory(org.apache.xmlbeans.XmlString directory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECTORY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DIRECTORY$0);
                }
                target.set(directory);
            }
        }
        
        /**
         * Gets the "pluginDirectory" element
         */
        public java.lang.String getPluginDirectory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLUGINDIRECTORY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "pluginDirectory" element
         */
        public org.apache.xmlbeans.XmlString xgetPluginDirectory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLUGINDIRECTORY$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "pluginDirectory" element
         */
        public void setPluginDirectory(java.lang.String pluginDirectory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLUGINDIRECTORY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLUGINDIRECTORY$2);
                }
                target.setStringValue(pluginDirectory);
            }
        }
        
        /**
         * Sets (as xml) the "pluginDirectory" element
         */
        public void xsetPluginDirectory(org.apache.xmlbeans.XmlString pluginDirectory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLUGINDIRECTORY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PLUGINDIRECTORY$2);
                }
                target.set(pluginDirectory);
            }
        }
    }
    /**
     * An XML mavenBuild(@http://guidewire.com/accelerator/deployment).
     *
     * This is a complex type.
     */
    public static class MavenBuildImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.accelerator.deployment.Accelerator.MavenBuild
    {
        private static final long serialVersionUID = 1L;
        
        public MavenBuildImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DIRECTORY$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "directory");
        private static final javax.xml.namespace.QName GOALS$2 = 
            new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "goals");
        
        
        /**
         * Gets the "directory" element
         */
        public java.lang.String getDirectory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTORY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "directory" element
         */
        public org.apache.xmlbeans.XmlString xgetDirectory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECTORY$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "directory" element
         */
        public void setDirectory(java.lang.String directory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTORY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRECTORY$0);
                }
                target.setStringValue(directory);
            }
        }
        
        /**
         * Sets (as xml) the "directory" element
         */
        public void xsetDirectory(org.apache.xmlbeans.XmlString directory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECTORY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DIRECTORY$0);
                }
                target.set(directory);
            }
        }
        
        /**
         * Gets the "goals" element
         */
        public java.lang.String getGoals()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GOALS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "goals" element
         */
        public org.apache.xmlbeans.XmlString xgetGoals()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GOALS$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "goals" element
         */
        public void setGoals(java.lang.String goals)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GOALS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GOALS$2);
                }
                target.setStringValue(goals);
            }
        }
        
        /**
         * Sets (as xml) the "goals" element
         */
        public void xsetGoals(org.apache.xmlbeans.XmlString goals)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GOALS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GOALS$2);
                }
                target.set(goals);
            }
        }
    }
    /**
     * An XML dataExtension(@http://guidewire.com/accelerator/deployment).
     *
     * This is a complex type.
     */
    public static class DataExtensionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.accelerator.deployment.Accelerator.DataExtension
    {
        private static final long serialVersionUID = 1L;
        
        public DataExtensionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DIRECTORY$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "directory");
        
        
        /**
         * Gets the "directory" element
         */
        public java.lang.String getDirectory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTORY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "directory" element
         */
        public org.apache.xmlbeans.XmlString xgetDirectory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECTORY$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "directory" element
         */
        public void setDirectory(java.lang.String directory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTORY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRECTORY$0);
                }
                target.setStringValue(directory);
            }
        }
        
        /**
         * Sets (as xml) the "directory" element
         */
        public void xsetDirectory(org.apache.xmlbeans.XmlString directory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECTORY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DIRECTORY$0);
                }
                target.set(directory);
            }
        }
    }
    /**
     * An XML messageQueue(@http://guidewire.com/accelerator/deployment).
     *
     * This is a complex type.
     */
    public static class MessageQueueImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.accelerator.deployment.Accelerator.MessageQueue
    {
        private static final long serialVersionUID = 1L;
        
        public MessageQueueImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MESSAGEREQUEST$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "messageRequest");
        private static final javax.xml.namespace.QName MESSAGETRANSPORT$2 = 
            new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "messageTransport");
        private static final javax.xml.namespace.QName MESSAGEREPLY$4 = 
            new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "messageReply");
        private static final javax.xml.namespace.QName DISABLED$6 = 
            new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "disabled");
        private static final javax.xml.namespace.QName POLLINTERVAL$8 = 
            new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "pollInterval");
        private static final javax.xml.namespace.QName INITIALRETRYINTERVAL$10 = 
            new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "initialRetryInterval");
        private static final javax.xml.namespace.QName MAXRETRIES$12 = 
            new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "maxRetries");
        private static final javax.xml.namespace.QName RETRYBACKOFFMULTIPLIER$14 = 
            new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "retryBackoffMultiplier");
        private static final javax.xml.namespace.QName NUMBERTHREADS$16 = 
            new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "numberThreads");
        private static final javax.xml.namespace.QName CHUNKSIZE$18 = 
            new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "chunkSize");
        private static final javax.xml.namespace.QName SHUTDOWNTIMEOUT$20 = 
            new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "shutdownTimeout");
        private static final javax.xml.namespace.QName DESTINATION$22 = 
            new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "destination");
        
        
        /**
         * Gets the "messageRequest" element
         */
        public com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageRequest getMessageRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageRequest target = null;
                target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageRequest)get_store().find_element_user(MESSAGEREQUEST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "messageRequest" element
         */
        public void setMessageRequest(com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageRequest messageRequest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageRequest target = null;
                target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageRequest)get_store().find_element_user(MESSAGEREQUEST$0, 0);
                if (target == null)
                {
                    target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageRequest)get_store().add_element_user(MESSAGEREQUEST$0);
                }
                target.set(messageRequest);
            }
        }
        
        /**
         * Appends and returns a new empty "messageRequest" element
         */
        public com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageRequest addNewMessageRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageRequest target = null;
                target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageRequest)get_store().add_element_user(MESSAGEREQUEST$0);
                return target;
            }
        }
        
        /**
         * Gets the "messageTransport" element
         */
        public com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport getMessageTransport()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport target = null;
                target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport)get_store().find_element_user(MESSAGETRANSPORT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "messageTransport" element
         */
        public void setMessageTransport(com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport messageTransport)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport target = null;
                target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport)get_store().find_element_user(MESSAGETRANSPORT$2, 0);
                if (target == null)
                {
                    target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport)get_store().add_element_user(MESSAGETRANSPORT$2);
                }
                target.set(messageTransport);
            }
        }
        
        /**
         * Appends and returns a new empty "messageTransport" element
         */
        public com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport addNewMessageTransport()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport target = null;
                target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport)get_store().add_element_user(MESSAGETRANSPORT$2);
                return target;
            }
        }
        
        /**
         * Gets the "messageReply" element
         */
        public com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageReply getMessageReply()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageReply target = null;
                target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageReply)get_store().find_element_user(MESSAGEREPLY$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "messageReply" element
         */
        public void setMessageReply(com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageReply messageReply)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageReply target = null;
                target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageReply)get_store().find_element_user(MESSAGEREPLY$4, 0);
                if (target == null)
                {
                    target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageReply)get_store().add_element_user(MESSAGEREPLY$4);
                }
                target.set(messageReply);
            }
        }
        
        /**
         * Appends and returns a new empty "messageReply" element
         */
        public com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageReply addNewMessageReply()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageReply target = null;
                target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageReply)get_store().add_element_user(MESSAGEREPLY$4);
                return target;
            }
        }
        
        /**
         * Gets the "disabled" element
         */
        public boolean getDisabled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISABLED$6, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "disabled" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetDisabled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DISABLED$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "disabled" element
         */
        public boolean isSetDisabled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISABLED$6) != 0;
            }
        }
        
        /**
         * Sets the "disabled" element
         */
        public void setDisabled(boolean disabled)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISABLED$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISABLED$6);
                }
                target.setBooleanValue(disabled);
            }
        }
        
        /**
         * Sets (as xml) the "disabled" element
         */
        public void xsetDisabled(org.apache.xmlbeans.XmlBoolean disabled)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DISABLED$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DISABLED$6);
                }
                target.set(disabled);
            }
        }
        
        /**
         * Unsets the "disabled" element
         */
        public void unsetDisabled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISABLED$6, 0);
            }
        }
        
        /**
         * Gets the "pollInterval" element
         */
        public long getPollInterval()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLLINTERVAL$8, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "pollInterval" element
         */
        public org.apache.xmlbeans.XmlLong xgetPollInterval()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(POLLINTERVAL$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "pollInterval" element
         */
        public void setPollInterval(long pollInterval)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLLINTERVAL$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POLLINTERVAL$8);
                }
                target.setLongValue(pollInterval);
            }
        }
        
        /**
         * Sets (as xml) the "pollInterval" element
         */
        public void xsetPollInterval(org.apache.xmlbeans.XmlLong pollInterval)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(POLLINTERVAL$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(POLLINTERVAL$8);
                }
                target.set(pollInterval);
            }
        }
        
        /**
         * Gets the "initialRetryInterval" element
         */
        public long getInitialRetryInterval()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INITIALRETRYINTERVAL$10, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "initialRetryInterval" element
         */
        public org.apache.xmlbeans.XmlLong xgetInitialRetryInterval()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(INITIALRETRYINTERVAL$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "initialRetryInterval" element
         */
        public void setInitialRetryInterval(long initialRetryInterval)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INITIALRETRYINTERVAL$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INITIALRETRYINTERVAL$10);
                }
                target.setLongValue(initialRetryInterval);
            }
        }
        
        /**
         * Sets (as xml) the "initialRetryInterval" element
         */
        public void xsetInitialRetryInterval(org.apache.xmlbeans.XmlLong initialRetryInterval)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(INITIALRETRYINTERVAL$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(INITIALRETRYINTERVAL$10);
                }
                target.set(initialRetryInterval);
            }
        }
        
        /**
         * Gets the "maxRetries" element
         */
        public long getMaxRetries()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXRETRIES$12, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "maxRetries" element
         */
        public org.apache.xmlbeans.XmlLong xgetMaxRetries()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(MAXRETRIES$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "maxRetries" element
         */
        public void setMaxRetries(long maxRetries)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXRETRIES$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXRETRIES$12);
                }
                target.setLongValue(maxRetries);
            }
        }
        
        /**
         * Sets (as xml) the "maxRetries" element
         */
        public void xsetMaxRetries(org.apache.xmlbeans.XmlLong maxRetries)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(MAXRETRIES$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(MAXRETRIES$12);
                }
                target.set(maxRetries);
            }
        }
        
        /**
         * Gets the "retryBackoffMultiplier" element
         */
        public long getRetryBackoffMultiplier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETRYBACKOFFMULTIPLIER$14, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "retryBackoffMultiplier" element
         */
        public org.apache.xmlbeans.XmlLong xgetRetryBackoffMultiplier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(RETRYBACKOFFMULTIPLIER$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "retryBackoffMultiplier" element
         */
        public void setRetryBackoffMultiplier(long retryBackoffMultiplier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETRYBACKOFFMULTIPLIER$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETRYBACKOFFMULTIPLIER$14);
                }
                target.setLongValue(retryBackoffMultiplier);
            }
        }
        
        /**
         * Sets (as xml) the "retryBackoffMultiplier" element
         */
        public void xsetRetryBackoffMultiplier(org.apache.xmlbeans.XmlLong retryBackoffMultiplier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(RETRYBACKOFFMULTIPLIER$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(RETRYBACKOFFMULTIPLIER$14);
                }
                target.set(retryBackoffMultiplier);
            }
        }
        
        /**
         * Gets the "numberThreads" element
         */
        public long getNumberThreads()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERTHREADS$16, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "numberThreads" element
         */
        public org.apache.xmlbeans.XmlLong xgetNumberThreads()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(NUMBERTHREADS$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "numberThreads" element
         */
        public void setNumberThreads(long numberThreads)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERTHREADS$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBERTHREADS$16);
                }
                target.setLongValue(numberThreads);
            }
        }
        
        /**
         * Sets (as xml) the "numberThreads" element
         */
        public void xsetNumberThreads(org.apache.xmlbeans.XmlLong numberThreads)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(NUMBERTHREADS$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(NUMBERTHREADS$16);
                }
                target.set(numberThreads);
            }
        }
        
        /**
         * Gets the "chunkSize" element
         */
        public long getChunkSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHUNKSIZE$18, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "chunkSize" element
         */
        public org.apache.xmlbeans.XmlLong xgetChunkSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CHUNKSIZE$18, 0);
                return target;
            }
        }
        
        /**
         * True if has "chunkSize" element
         */
        public boolean isSetChunkSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CHUNKSIZE$18) != 0;
            }
        }
        
        /**
         * Sets the "chunkSize" element
         */
        public void setChunkSize(long chunkSize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHUNKSIZE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHUNKSIZE$18);
                }
                target.setLongValue(chunkSize);
            }
        }
        
        /**
         * Sets (as xml) the "chunkSize" element
         */
        public void xsetChunkSize(org.apache.xmlbeans.XmlLong chunkSize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CHUNKSIZE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CHUNKSIZE$18);
                }
                target.set(chunkSize);
            }
        }
        
        /**
         * Unsets the "chunkSize" element
         */
        public void unsetChunkSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CHUNKSIZE$18, 0);
            }
        }
        
        /**
         * Gets the "shutdownTimeout" element
         */
        public long getShutdownTimeout()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHUTDOWNTIMEOUT$20, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "shutdownTimeout" element
         */
        public org.apache.xmlbeans.XmlLong xgetShutdownTimeout()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(SHUTDOWNTIMEOUT$20, 0);
                return target;
            }
        }
        
        /**
         * True if has "shutdownTimeout" element
         */
        public boolean isSetShutdownTimeout()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SHUTDOWNTIMEOUT$20) != 0;
            }
        }
        
        /**
         * Sets the "shutdownTimeout" element
         */
        public void setShutdownTimeout(long shutdownTimeout)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHUTDOWNTIMEOUT$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHUTDOWNTIMEOUT$20);
                }
                target.setLongValue(shutdownTimeout);
            }
        }
        
        /**
         * Sets (as xml) the "shutdownTimeout" element
         */
        public void xsetShutdownTimeout(org.apache.xmlbeans.XmlLong shutdownTimeout)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(SHUTDOWNTIMEOUT$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(SHUTDOWNTIMEOUT$20);
                }
                target.set(shutdownTimeout);
            }
        }
        
        /**
         * Unsets the "shutdownTimeout" element
         */
        public void unsetShutdownTimeout()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SHUTDOWNTIMEOUT$20, 0);
            }
        }
        
        /**
         * Gets the "destination" element
         */
        public java.math.BigInteger getDestination()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESTINATION$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "destination" element
         */
        public org.apache.xmlbeans.XmlInteger xgetDestination()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DESTINATION$22, 0);
                return target;
            }
        }
        
        /**
         * Sets the "destination" element
         */
        public void setDestination(java.math.BigInteger destination)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESTINATION$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESTINATION$22);
                }
                target.setBigIntegerValue(destination);
            }
        }
        
        /**
         * Sets (as xml) the "destination" element
         */
        public void xsetDestination(org.apache.xmlbeans.XmlInteger destination)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DESTINATION$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(DESTINATION$22);
                }
                target.set(destination);
            }
        }
        /**
         * An XML messageRequest(@http://guidewire.com/accelerator/deployment).
         *
         * This is a complex type.
         */
        public static class MessageRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageRequest
        {
            private static final long serialVersionUID = 1L;
            
            public MessageRequestImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName REQUESTNAME$0 = 
                new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "requestName");
            private static final javax.xml.namespace.QName REQUESTTYPE$2 = 
                new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "requestType");
            private static final javax.xml.namespace.QName REQUESTCLASS$4 = 
                new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "requestClass");
            private static final javax.xml.namespace.QName REQUESTPARAMETERS$6 = 
                new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "requestParameters");
            
            
            /**
             * Gets the "requestName" element
             */
            public java.lang.String getRequestName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTNAME$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "requestName" element
             */
            public org.apache.xmlbeans.XmlString xgetRequestName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTNAME$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "requestName" element
             */
            public void setRequestName(java.lang.String requestName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTNAME$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTNAME$0);
                    }
                    target.setStringValue(requestName);
                }
            }
            
            /**
             * Sets (as xml) the "requestName" element
             */
            public void xsetRequestName(org.apache.xmlbeans.XmlString requestName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTNAME$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUESTNAME$0);
                    }
                    target.set(requestName);
                }
            }
            
            /**
             * Gets the "requestType" element
             */
            public java.lang.String getRequestType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTTYPE$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "requestType" element
             */
            public org.apache.xmlbeans.XmlString xgetRequestType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTTYPE$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "requestType" element
             */
            public void setRequestType(java.lang.String requestType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTTYPE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTTYPE$2);
                    }
                    target.setStringValue(requestType);
                }
            }
            
            /**
             * Sets (as xml) the "requestType" element
             */
            public void xsetRequestType(org.apache.xmlbeans.XmlString requestType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTTYPE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUESTTYPE$2);
                    }
                    target.set(requestType);
                }
            }
            
            /**
             * Gets the "requestClass" element
             */
            public java.lang.String getRequestClass()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTCLASS$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "requestClass" element
             */
            public org.apache.xmlbeans.XmlString xgetRequestClass()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTCLASS$4, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "requestClass" element
             */
            public void setRequestClass(java.lang.String requestClass)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTCLASS$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTCLASS$4);
                    }
                    target.setStringValue(requestClass);
                }
            }
            
            /**
             * Sets (as xml) the "requestClass" element
             */
            public void xsetRequestClass(org.apache.xmlbeans.XmlString requestClass)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTCLASS$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUESTCLASS$4);
                    }
                    target.set(requestClass);
                }
            }
            
            /**
             * Gets the "requestParameters" element
             */
            public com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageRequest.RequestParameters getRequestParameters()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageRequest.RequestParameters target = null;
                    target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageRequest.RequestParameters)get_store().find_element_user(REQUESTPARAMETERS$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "requestParameters" element
             */
            public boolean isSetRequestParameters()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(REQUESTPARAMETERS$6) != 0;
                }
            }
            
            /**
             * Sets the "requestParameters" element
             */
            public void setRequestParameters(com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageRequest.RequestParameters requestParameters)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageRequest.RequestParameters target = null;
                    target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageRequest.RequestParameters)get_store().find_element_user(REQUESTPARAMETERS$6, 0);
                    if (target == null)
                    {
                      target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageRequest.RequestParameters)get_store().add_element_user(REQUESTPARAMETERS$6);
                    }
                    target.set(requestParameters);
                }
            }
            
            /**
             * Appends and returns a new empty "requestParameters" element
             */
            public com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageRequest.RequestParameters addNewRequestParameters()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageRequest.RequestParameters target = null;
                    target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageRequest.RequestParameters)get_store().add_element_user(REQUESTPARAMETERS$6);
                    return target;
                }
            }
            
            /**
             * Unsets the "requestParameters" element
             */
            public void unsetRequestParameters()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(REQUESTPARAMETERS$6, 0);
                }
            }
            /**
             * An XML requestParameters(@http://guidewire.com/accelerator/deployment).
             *
             * This is a complex type.
             */
            public static class RequestParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageRequest.RequestParameters
            {
                private static final long serialVersionUID = 1L;
                
                public RequestParametersImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName PARAMETER$0 = 
                    new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "parameter");
                
                
                /**
                 * Gets array of all "parameter" elements
                 */
                public com.guidewire.accelerator.deployment.PluginParam[] getParameterArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(PARAMETER$0, targetList);
                      com.guidewire.accelerator.deployment.PluginParam[] result = new com.guidewire.accelerator.deployment.PluginParam[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "parameter" element
                 */
                public com.guidewire.accelerator.deployment.PluginParam getParameterArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.guidewire.accelerator.deployment.PluginParam target = null;
                      target = (com.guidewire.accelerator.deployment.PluginParam)get_store().find_element_user(PARAMETER$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "parameter" element
                 */
                public int sizeOfParameterArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(PARAMETER$0);
                    }
                }
                
                /**
                 * Sets array of all "parameter" element
                 */
                public void setParameterArray(com.guidewire.accelerator.deployment.PluginParam[] parameterArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(parameterArray, PARAMETER$0);
                    }
                }
                
                /**
                 * Sets ith "parameter" element
                 */
                public void setParameterArray(int i, com.guidewire.accelerator.deployment.PluginParam parameter)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.guidewire.accelerator.deployment.PluginParam target = null;
                      target = (com.guidewire.accelerator.deployment.PluginParam)get_store().find_element_user(PARAMETER$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(parameter);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "parameter" element
                 */
                public com.guidewire.accelerator.deployment.PluginParam insertNewParameter(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.guidewire.accelerator.deployment.PluginParam target = null;
                      target = (com.guidewire.accelerator.deployment.PluginParam)get_store().insert_element_user(PARAMETER$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "parameter" element
                 */
                public com.guidewire.accelerator.deployment.PluginParam addNewParameter()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.guidewire.accelerator.deployment.PluginParam target = null;
                      target = (com.guidewire.accelerator.deployment.PluginParam)get_store().add_element_user(PARAMETER$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "parameter" element
                 */
                public void removeParameter(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(PARAMETER$0, i);
                    }
                }
            }
        }
        /**
         * An XML messageTransport(@http://guidewire.com/accelerator/deployment).
         *
         * This is a complex type.
         */
        public static class MessageTransportImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport
        {
            private static final long serialVersionUID = 1L;
            
            public MessageTransportImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TRANSPORTNAME$0 = 
                new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "transportName");
            private static final javax.xml.namespace.QName TRANSPORTTYPE$2 = 
                new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "transportType");
            private static final javax.xml.namespace.QName TRANSPORTCLASS$4 = 
                new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "transportClass");
            private static final javax.xml.namespace.QName TRANSPORTPARAMETERS$6 = 
                new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "transportParameters");
            private static final javax.xml.namespace.QName EVENTS$8 = 
                new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "events");
            
            
            /**
             * Gets the "transportName" element
             */
            public java.lang.String getTransportName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSPORTNAME$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "transportName" element
             */
            public org.apache.xmlbeans.XmlString xgetTransportName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRANSPORTNAME$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "transportName" element
             */
            public void setTransportName(java.lang.String transportName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSPORTNAME$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSPORTNAME$0);
                    }
                    target.setStringValue(transportName);
                }
            }
            
            /**
             * Sets (as xml) the "transportName" element
             */
            public void xsetTransportName(org.apache.xmlbeans.XmlString transportName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRANSPORTNAME$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRANSPORTNAME$0);
                    }
                    target.set(transportName);
                }
            }
            
            /**
             * Gets the "transportType" element
             */
            public java.lang.String getTransportType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSPORTTYPE$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "transportType" element
             */
            public org.apache.xmlbeans.XmlString xgetTransportType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRANSPORTTYPE$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "transportType" element
             */
            public void setTransportType(java.lang.String transportType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSPORTTYPE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSPORTTYPE$2);
                    }
                    target.setStringValue(transportType);
                }
            }
            
            /**
             * Sets (as xml) the "transportType" element
             */
            public void xsetTransportType(org.apache.xmlbeans.XmlString transportType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRANSPORTTYPE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRANSPORTTYPE$2);
                    }
                    target.set(transportType);
                }
            }
            
            /**
             * Gets the "transportClass" element
             */
            public java.lang.String getTransportClass()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSPORTCLASS$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "transportClass" element
             */
            public org.apache.xmlbeans.XmlString xgetTransportClass()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRANSPORTCLASS$4, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "transportClass" element
             */
            public void setTransportClass(java.lang.String transportClass)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSPORTCLASS$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSPORTCLASS$4);
                    }
                    target.setStringValue(transportClass);
                }
            }
            
            /**
             * Sets (as xml) the "transportClass" element
             */
            public void xsetTransportClass(org.apache.xmlbeans.XmlString transportClass)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRANSPORTCLASS$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRANSPORTCLASS$4);
                    }
                    target.set(transportClass);
                }
            }
            
            /**
             * Gets the "transportParameters" element
             */
            public com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport.TransportParameters getTransportParameters()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport.TransportParameters target = null;
                    target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport.TransportParameters)get_store().find_element_user(TRANSPORTPARAMETERS$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "transportParameters" element
             */
            public boolean isSetTransportParameters()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(TRANSPORTPARAMETERS$6) != 0;
                }
            }
            
            /**
             * Sets the "transportParameters" element
             */
            public void setTransportParameters(com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport.TransportParameters transportParameters)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport.TransportParameters target = null;
                    target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport.TransportParameters)get_store().find_element_user(TRANSPORTPARAMETERS$6, 0);
                    if (target == null)
                    {
                      target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport.TransportParameters)get_store().add_element_user(TRANSPORTPARAMETERS$6);
                    }
                    target.set(transportParameters);
                }
            }
            
            /**
             * Appends and returns a new empty "transportParameters" element
             */
            public com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport.TransportParameters addNewTransportParameters()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport.TransportParameters target = null;
                    target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport.TransportParameters)get_store().add_element_user(TRANSPORTPARAMETERS$6);
                    return target;
                }
            }
            
            /**
             * Unsets the "transportParameters" element
             */
            public void unsetTransportParameters()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(TRANSPORTPARAMETERS$6, 0);
                }
            }
            
            /**
             * Gets the "events" element
             */
            public com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport.Events getEvents()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport.Events target = null;
                    target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport.Events)get_store().find_element_user(EVENTS$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "events" element
             */
            public boolean isSetEvents()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(EVENTS$8) != 0;
                }
            }
            
            /**
             * Sets the "events" element
             */
            public void setEvents(com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport.Events events)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport.Events target = null;
                    target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport.Events)get_store().find_element_user(EVENTS$8, 0);
                    if (target == null)
                    {
                      target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport.Events)get_store().add_element_user(EVENTS$8);
                    }
                    target.set(events);
                }
            }
            
            /**
             * Appends and returns a new empty "events" element
             */
            public com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport.Events addNewEvents()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport.Events target = null;
                    target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport.Events)get_store().add_element_user(EVENTS$8);
                    return target;
                }
            }
            
            /**
             * Unsets the "events" element
             */
            public void unsetEvents()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(EVENTS$8, 0);
                }
            }
            /**
             * An XML transportParameters(@http://guidewire.com/accelerator/deployment).
             *
             * This is a complex type.
             */
            public static class TransportParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport.TransportParameters
            {
                private static final long serialVersionUID = 1L;
                
                public TransportParametersImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName PARAMETER$0 = 
                    new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "parameter");
                
                
                /**
                 * Gets array of all "parameter" elements
                 */
                public com.guidewire.accelerator.deployment.PluginParam[] getParameterArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(PARAMETER$0, targetList);
                      com.guidewire.accelerator.deployment.PluginParam[] result = new com.guidewire.accelerator.deployment.PluginParam[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "parameter" element
                 */
                public com.guidewire.accelerator.deployment.PluginParam getParameterArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.guidewire.accelerator.deployment.PluginParam target = null;
                      target = (com.guidewire.accelerator.deployment.PluginParam)get_store().find_element_user(PARAMETER$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "parameter" element
                 */
                public int sizeOfParameterArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(PARAMETER$0);
                    }
                }
                
                /**
                 * Sets array of all "parameter" element
                 */
                public void setParameterArray(com.guidewire.accelerator.deployment.PluginParam[] parameterArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(parameterArray, PARAMETER$0);
                    }
                }
                
                /**
                 * Sets ith "parameter" element
                 */
                public void setParameterArray(int i, com.guidewire.accelerator.deployment.PluginParam parameter)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.guidewire.accelerator.deployment.PluginParam target = null;
                      target = (com.guidewire.accelerator.deployment.PluginParam)get_store().find_element_user(PARAMETER$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(parameter);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "parameter" element
                 */
                public com.guidewire.accelerator.deployment.PluginParam insertNewParameter(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.guidewire.accelerator.deployment.PluginParam target = null;
                      target = (com.guidewire.accelerator.deployment.PluginParam)get_store().insert_element_user(PARAMETER$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "parameter" element
                 */
                public com.guidewire.accelerator.deployment.PluginParam addNewParameter()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.guidewire.accelerator.deployment.PluginParam target = null;
                      target = (com.guidewire.accelerator.deployment.PluginParam)get_store().add_element_user(PARAMETER$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "parameter" element
                 */
                public void removeParameter(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(PARAMETER$0, i);
                    }
                }
            }
            /**
             * An XML events(@http://guidewire.com/accelerator/deployment).
             *
             * This is a complex type.
             */
            public static class EventsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageTransport.Events
            {
                private static final long serialVersionUID = 1L;
                
                public EventsImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName EVENTNAME$0 = 
                    new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "eventName");
                
                
                /**
                 * Gets array of all "eventName" elements
                 */
                public java.lang.String[] getEventNameArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(EVENTNAME$0, targetList);
                      java.lang.String[] result = new java.lang.String[targetList.size()];
                      for (int i = 0, len = targetList.size() ; i < len ; i++)
                          result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                      return result;
                    }
                }
                
                /**
                 * Gets ith "eventName" element
                 */
                public java.lang.String getEventNameArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTNAME$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) array of all "eventName" elements
                 */
                public org.apache.xmlbeans.XmlString[] xgetEventNameArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(EVENTNAME$0, targetList);
                      org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets (as xml) ith "eventName" element
                 */
                public org.apache.xmlbeans.XmlString xgetEventNameArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTNAME$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return (org.apache.xmlbeans.XmlString)target;
                    }
                }
                
                /**
                 * Returns number of "eventName" element
                 */
                public int sizeOfEventNameArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(EVENTNAME$0);
                    }
                }
                
                /**
                 * Sets array of all "eventName" element
                 */
                public void setEventNameArray(java.lang.String[] eventNameArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(eventNameArray, EVENTNAME$0);
                    }
                }
                
                /**
                 * Sets ith "eventName" element
                 */
                public void setEventNameArray(int i, java.lang.String eventName)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTNAME$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.setStringValue(eventName);
                    }
                }
                
                /**
                 * Sets (as xml) array of all "eventName" element
                 */
                public void xsetEventNameArray(org.apache.xmlbeans.XmlString[]eventNameArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(eventNameArray, EVENTNAME$0);
                    }
                }
                
                /**
                 * Sets (as xml) ith "eventName" element
                 */
                public void xsetEventNameArray(int i, org.apache.xmlbeans.XmlString eventName)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTNAME$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(eventName);
                    }
                }
                
                /**
                 * Inserts the value as the ith "eventName" element
                 */
                public void insertEventName(int i, java.lang.String eventName)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = 
                        (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(EVENTNAME$0, i);
                      target.setStringValue(eventName);
                    }
                }
                
                /**
                 * Appends the value as the last "eventName" element
                 */
                public void addEventName(java.lang.String eventName)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTNAME$0);
                      target.setStringValue(eventName);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "eventName" element
                 */
                public org.apache.xmlbeans.XmlString insertNewEventName(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(EVENTNAME$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "eventName" element
                 */
                public org.apache.xmlbeans.XmlString addNewEventName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTNAME$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "eventName" element
                 */
                public void removeEventName(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(EVENTNAME$0, i);
                    }
                }
            }
        }
        /**
         * An XML messageReply(@http://guidewire.com/accelerator/deployment).
         *
         * This is a complex type.
         */
        public static class MessageReplyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageReply
        {
            private static final long serialVersionUID = 1L;
            
            public MessageReplyImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName REPLYNAME$0 = 
                new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "replyName");
            private static final javax.xml.namespace.QName REPLYTYPE$2 = 
                new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "replyType");
            private static final javax.xml.namespace.QName REPLYCLASS$4 = 
                new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "replyClass");
            private static final javax.xml.namespace.QName REPLYPARAMETERS$6 = 
                new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "replyParameters");
            
            
            /**
             * Gets the "replyName" element
             */
            public java.lang.String getReplyName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPLYNAME$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "replyName" element
             */
            public org.apache.xmlbeans.XmlString xgetReplyName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPLYNAME$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "replyName" element
             */
            public void setReplyName(java.lang.String replyName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPLYNAME$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPLYNAME$0);
                    }
                    target.setStringValue(replyName);
                }
            }
            
            /**
             * Sets (as xml) the "replyName" element
             */
            public void xsetReplyName(org.apache.xmlbeans.XmlString replyName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPLYNAME$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REPLYNAME$0);
                    }
                    target.set(replyName);
                }
            }
            
            /**
             * Gets the "replyType" element
             */
            public java.lang.String getReplyType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPLYTYPE$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "replyType" element
             */
            public org.apache.xmlbeans.XmlString xgetReplyType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPLYTYPE$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "replyType" element
             */
            public void setReplyType(java.lang.String replyType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPLYTYPE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPLYTYPE$2);
                    }
                    target.setStringValue(replyType);
                }
            }
            
            /**
             * Sets (as xml) the "replyType" element
             */
            public void xsetReplyType(org.apache.xmlbeans.XmlString replyType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPLYTYPE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REPLYTYPE$2);
                    }
                    target.set(replyType);
                }
            }
            
            /**
             * Gets the "replyClass" element
             */
            public java.lang.String getReplyClass()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPLYCLASS$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "replyClass" element
             */
            public org.apache.xmlbeans.XmlString xgetReplyClass()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPLYCLASS$4, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "replyClass" element
             */
            public void setReplyClass(java.lang.String replyClass)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPLYCLASS$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPLYCLASS$4);
                    }
                    target.setStringValue(replyClass);
                }
            }
            
            /**
             * Sets (as xml) the "replyClass" element
             */
            public void xsetReplyClass(org.apache.xmlbeans.XmlString replyClass)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPLYCLASS$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REPLYCLASS$4);
                    }
                    target.set(replyClass);
                }
            }
            
            /**
             * Gets the "replyParameters" element
             */
            public com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageReply.ReplyParameters getReplyParameters()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageReply.ReplyParameters target = null;
                    target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageReply.ReplyParameters)get_store().find_element_user(REPLYPARAMETERS$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "replyParameters" element
             */
            public boolean isSetReplyParameters()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(REPLYPARAMETERS$6) != 0;
                }
            }
            
            /**
             * Sets the "replyParameters" element
             */
            public void setReplyParameters(com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageReply.ReplyParameters replyParameters)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageReply.ReplyParameters target = null;
                    target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageReply.ReplyParameters)get_store().find_element_user(REPLYPARAMETERS$6, 0);
                    if (target == null)
                    {
                      target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageReply.ReplyParameters)get_store().add_element_user(REPLYPARAMETERS$6);
                    }
                    target.set(replyParameters);
                }
            }
            
            /**
             * Appends and returns a new empty "replyParameters" element
             */
            public com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageReply.ReplyParameters addNewReplyParameters()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageReply.ReplyParameters target = null;
                    target = (com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageReply.ReplyParameters)get_store().add_element_user(REPLYPARAMETERS$6);
                    return target;
                }
            }
            
            /**
             * Unsets the "replyParameters" element
             */
            public void unsetReplyParameters()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(REPLYPARAMETERS$6, 0);
                }
            }
            /**
             * An XML replyParameters(@http://guidewire.com/accelerator/deployment).
             *
             * This is a complex type.
             */
            public static class ReplyParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.accelerator.deployment.Accelerator.MessageQueue.MessageReply.ReplyParameters
            {
                private static final long serialVersionUID = 1L;
                
                public ReplyParametersImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName PARAMETER$0 = 
                    new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "parameter");
                
                
                /**
                 * Gets array of all "parameter" elements
                 */
                public com.guidewire.accelerator.deployment.PluginParam[] getParameterArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(PARAMETER$0, targetList);
                      com.guidewire.accelerator.deployment.PluginParam[] result = new com.guidewire.accelerator.deployment.PluginParam[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "parameter" element
                 */
                public com.guidewire.accelerator.deployment.PluginParam getParameterArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.guidewire.accelerator.deployment.PluginParam target = null;
                      target = (com.guidewire.accelerator.deployment.PluginParam)get_store().find_element_user(PARAMETER$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "parameter" element
                 */
                public int sizeOfParameterArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(PARAMETER$0);
                    }
                }
                
                /**
                 * Sets array of all "parameter" element
                 */
                public void setParameterArray(com.guidewire.accelerator.deployment.PluginParam[] parameterArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(parameterArray, PARAMETER$0);
                    }
                }
                
                /**
                 * Sets ith "parameter" element
                 */
                public void setParameterArray(int i, com.guidewire.accelerator.deployment.PluginParam parameter)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.guidewire.accelerator.deployment.PluginParam target = null;
                      target = (com.guidewire.accelerator.deployment.PluginParam)get_store().find_element_user(PARAMETER$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(parameter);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "parameter" element
                 */
                public com.guidewire.accelerator.deployment.PluginParam insertNewParameter(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.guidewire.accelerator.deployment.PluginParam target = null;
                      target = (com.guidewire.accelerator.deployment.PluginParam)get_store().insert_element_user(PARAMETER$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "parameter" element
                 */
                public com.guidewire.accelerator.deployment.PluginParam addNewParameter()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.guidewire.accelerator.deployment.PluginParam target = null;
                      target = (com.guidewire.accelerator.deployment.PluginParam)get_store().add_element_user(PARAMETER$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "parameter" element
                 */
                public void removeParameter(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(PARAMETER$0, i);
                    }
                }
            }
        }
    }
    /**
     * An XML plugin(@http://guidewire.com/accelerator/deployment).
     *
     * This is a complex type.
     */
    public static class PluginImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.accelerator.deployment.Accelerator.Plugin
    {
        private static final long serialVersionUID = 1L;
        
        public PluginImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "name");
        private static final javax.xml.namespace.QName JAVA$2 = 
            new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "java");
        private static final javax.xml.namespace.QName GOSU$4 = 
            new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "gosu");
        
        
        /**
         * Gets the "name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" element
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "name" element
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" element
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets array of all "java" elements
         */
        public com.guidewire.accelerator.deployment.Accelerator.Plugin.Java[] getJavaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(JAVA$2, targetList);
                com.guidewire.accelerator.deployment.Accelerator.Plugin.Java[] result = new com.guidewire.accelerator.deployment.Accelerator.Plugin.Java[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "java" element
         */
        public com.guidewire.accelerator.deployment.Accelerator.Plugin.Java getJavaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.accelerator.deployment.Accelerator.Plugin.Java target = null;
                target = (com.guidewire.accelerator.deployment.Accelerator.Plugin.Java)get_store().find_element_user(JAVA$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "java" element
         */
        public int sizeOfJavaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(JAVA$2);
            }
        }
        
        /**
         * Sets array of all "java" element
         */
        public void setJavaArray(com.guidewire.accelerator.deployment.Accelerator.Plugin.Java[] javaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(javaArray, JAVA$2);
            }
        }
        
        /**
         * Sets ith "java" element
         */
        public void setJavaArray(int i, com.guidewire.accelerator.deployment.Accelerator.Plugin.Java java)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.accelerator.deployment.Accelerator.Plugin.Java target = null;
                target = (com.guidewire.accelerator.deployment.Accelerator.Plugin.Java)get_store().find_element_user(JAVA$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(java);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "java" element
         */
        public com.guidewire.accelerator.deployment.Accelerator.Plugin.Java insertNewJava(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.accelerator.deployment.Accelerator.Plugin.Java target = null;
                target = (com.guidewire.accelerator.deployment.Accelerator.Plugin.Java)get_store().insert_element_user(JAVA$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "java" element
         */
        public com.guidewire.accelerator.deployment.Accelerator.Plugin.Java addNewJava()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.accelerator.deployment.Accelerator.Plugin.Java target = null;
                target = (com.guidewire.accelerator.deployment.Accelerator.Plugin.Java)get_store().add_element_user(JAVA$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "java" element
         */
        public void removeJava(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(JAVA$2, i);
            }
        }
        
        /**
         * Gets array of all "gosu" elements
         */
        public com.guidewire.accelerator.deployment.Accelerator.Plugin.Gosu[] getGosuArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GOSU$4, targetList);
                com.guidewire.accelerator.deployment.Accelerator.Plugin.Gosu[] result = new com.guidewire.accelerator.deployment.Accelerator.Plugin.Gosu[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "gosu" element
         */
        public com.guidewire.accelerator.deployment.Accelerator.Plugin.Gosu getGosuArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.accelerator.deployment.Accelerator.Plugin.Gosu target = null;
                target = (com.guidewire.accelerator.deployment.Accelerator.Plugin.Gosu)get_store().find_element_user(GOSU$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "gosu" element
         */
        public int sizeOfGosuArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GOSU$4);
            }
        }
        
        /**
         * Sets array of all "gosu" element
         */
        public void setGosuArray(com.guidewire.accelerator.deployment.Accelerator.Plugin.Gosu[] gosuArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(gosuArray, GOSU$4);
            }
        }
        
        /**
         * Sets ith "gosu" element
         */
        public void setGosuArray(int i, com.guidewire.accelerator.deployment.Accelerator.Plugin.Gosu gosu)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.accelerator.deployment.Accelerator.Plugin.Gosu target = null;
                target = (com.guidewire.accelerator.deployment.Accelerator.Plugin.Gosu)get_store().find_element_user(GOSU$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(gosu);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "gosu" element
         */
        public com.guidewire.accelerator.deployment.Accelerator.Plugin.Gosu insertNewGosu(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.accelerator.deployment.Accelerator.Plugin.Gosu target = null;
                target = (com.guidewire.accelerator.deployment.Accelerator.Plugin.Gosu)get_store().insert_element_user(GOSU$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "gosu" element
         */
        public com.guidewire.accelerator.deployment.Accelerator.Plugin.Gosu addNewGosu()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.guidewire.accelerator.deployment.Accelerator.Plugin.Gosu target = null;
                target = (com.guidewire.accelerator.deployment.Accelerator.Plugin.Gosu)get_store().add_element_user(GOSU$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "gosu" element
         */
        public void removeGosu(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GOSU$4, i);
            }
        }
        /**
         * An XML java(@http://guidewire.com/accelerator/deployment).
         *
         * This is a complex type.
         */
        public static class JavaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.accelerator.deployment.Accelerator.Plugin.Java
        {
            private static final long serialVersionUID = 1L;
            
            public JavaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DISABLED$0 = 
                new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "disabled");
            private static final javax.xml.namespace.QName CLASSNAME$2 = 
                new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "classname");
            private static final javax.xml.namespace.QName PLUGINDIR$4 = 
                new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "plugindir");
            private static final javax.xml.namespace.QName ENV$6 = 
                new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "env");
            private static final javax.xml.namespace.QName SERVER$8 = 
                new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "server");
            private static final javax.xml.namespace.QName PLUGINPARAM$10 = 
                new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "pluginParam");
            
            
            /**
             * Gets the "disabled" element
             */
            public boolean getDisabled()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISABLED$0, 0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "disabled" element
             */
            public org.apache.xmlbeans.XmlBoolean xgetDisabled()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DISABLED$0, 0);
                    return target;
                }
            }
            
            /**
             * True if has "disabled" element
             */
            public boolean isSetDisabled()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DISABLED$0) != 0;
                }
            }
            
            /**
             * Sets the "disabled" element
             */
            public void setDisabled(boolean disabled)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISABLED$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISABLED$0);
                    }
                    target.setBooleanValue(disabled);
                }
            }
            
            /**
             * Sets (as xml) the "disabled" element
             */
            public void xsetDisabled(org.apache.xmlbeans.XmlBoolean disabled)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DISABLED$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DISABLED$0);
                    }
                    target.set(disabled);
                }
            }
            
            /**
             * Unsets the "disabled" element
             */
            public void unsetDisabled()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DISABLED$0, 0);
                }
            }
            
            /**
             * Gets the "classname" element
             */
            public java.lang.String getClassname()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASSNAME$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "classname" element
             */
            public org.apache.xmlbeans.XmlString xgetClassname()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASSNAME$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "classname" element
             */
            public void setClassname(java.lang.String classname)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASSNAME$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLASSNAME$2);
                    }
                    target.setStringValue(classname);
                }
            }
            
            /**
             * Sets (as xml) the "classname" element
             */
            public void xsetClassname(org.apache.xmlbeans.XmlString classname)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASSNAME$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLASSNAME$2);
                    }
                    target.set(classname);
                }
            }
            
            /**
             * Gets the "plugindir" element
             */
            public java.lang.String getPlugindir()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLUGINDIR$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "plugindir" element
             */
            public org.apache.xmlbeans.XmlString xgetPlugindir()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLUGINDIR$4, 0);
                    return target;
                }
            }
            
            /**
             * True if has "plugindir" element
             */
            public boolean isSetPlugindir()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PLUGINDIR$4) != 0;
                }
            }
            
            /**
             * Sets the "plugindir" element
             */
            public void setPlugindir(java.lang.String plugindir)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLUGINDIR$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLUGINDIR$4);
                    }
                    target.setStringValue(plugindir);
                }
            }
            
            /**
             * Sets (as xml) the "plugindir" element
             */
            public void xsetPlugindir(org.apache.xmlbeans.XmlString plugindir)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLUGINDIR$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PLUGINDIR$4);
                    }
                    target.set(plugindir);
                }
            }
            
            /**
             * Unsets the "plugindir" element
             */
            public void unsetPlugindir()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PLUGINDIR$4, 0);
                }
            }
            
            /**
             * Gets the "env" element
             */
            public java.lang.String getEnv()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENV$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "env" element
             */
            public org.apache.xmlbeans.XmlString xgetEnv()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENV$6, 0);
                    return target;
                }
            }
            
            /**
             * True if has "env" element
             */
            public boolean isSetEnv()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ENV$6) != 0;
                }
            }
            
            /**
             * Sets the "env" element
             */
            public void setEnv(java.lang.String env)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENV$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENV$6);
                    }
                    target.setStringValue(env);
                }
            }
            
            /**
             * Sets (as xml) the "env" element
             */
            public void xsetEnv(org.apache.xmlbeans.XmlString env)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENV$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENV$6);
                    }
                    target.set(env);
                }
            }
            
            /**
             * Unsets the "env" element
             */
            public void unsetEnv()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ENV$6, 0);
                }
            }
            
            /**
             * Gets the "server" element
             */
            public java.lang.String getServer()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVER$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "server" element
             */
            public org.apache.xmlbeans.XmlString xgetServer()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVER$8, 0);
                    return target;
                }
            }
            
            /**
             * True if has "server" element
             */
            public boolean isSetServer()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SERVER$8) != 0;
                }
            }
            
            /**
             * Sets the "server" element
             */
            public void setServer(java.lang.String server)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVER$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVER$8);
                    }
                    target.setStringValue(server);
                }
            }
            
            /**
             * Sets (as xml) the "server" element
             */
            public void xsetServer(org.apache.xmlbeans.XmlString server)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVER$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVER$8);
                    }
                    target.set(server);
                }
            }
            
            /**
             * Unsets the "server" element
             */
            public void unsetServer()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SERVER$8, 0);
                }
            }
            
            /**
             * Gets array of all "pluginParam" elements
             */
            public com.guidewire.accelerator.deployment.PluginParam[] getPluginParamArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(PLUGINPARAM$10, targetList);
                    com.guidewire.accelerator.deployment.PluginParam[] result = new com.guidewire.accelerator.deployment.PluginParam[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "pluginParam" element
             */
            public com.guidewire.accelerator.deployment.PluginParam getPluginParamArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.guidewire.accelerator.deployment.PluginParam target = null;
                    target = (com.guidewire.accelerator.deployment.PluginParam)get_store().find_element_user(PLUGINPARAM$10, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "pluginParam" element
             */
            public int sizeOfPluginParamArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PLUGINPARAM$10);
                }
            }
            
            /**
             * Sets array of all "pluginParam" element
             */
            public void setPluginParamArray(com.guidewire.accelerator.deployment.PluginParam[] pluginParamArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(pluginParamArray, PLUGINPARAM$10);
                }
            }
            
            /**
             * Sets ith "pluginParam" element
             */
            public void setPluginParamArray(int i, com.guidewire.accelerator.deployment.PluginParam pluginParam)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.guidewire.accelerator.deployment.PluginParam target = null;
                    target = (com.guidewire.accelerator.deployment.PluginParam)get_store().find_element_user(PLUGINPARAM$10, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(pluginParam);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "pluginParam" element
             */
            public com.guidewire.accelerator.deployment.PluginParam insertNewPluginParam(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.guidewire.accelerator.deployment.PluginParam target = null;
                    target = (com.guidewire.accelerator.deployment.PluginParam)get_store().insert_element_user(PLUGINPARAM$10, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "pluginParam" element
             */
            public com.guidewire.accelerator.deployment.PluginParam addNewPluginParam()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.guidewire.accelerator.deployment.PluginParam target = null;
                    target = (com.guidewire.accelerator.deployment.PluginParam)get_store().add_element_user(PLUGINPARAM$10);
                    return target;
                }
            }
            
            /**
             * Removes the ith "pluginParam" element
             */
            public void removePluginParam(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PLUGINPARAM$10, i);
                }
            }
        }
        /**
         * An XML gosu(@http://guidewire.com/accelerator/deployment).
         *
         * This is a complex type.
         */
        public static class GosuImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.accelerator.deployment.Accelerator.Plugin.Gosu
        {
            private static final long serialVersionUID = 1L;
            
            public GosuImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DISABLED$0 = 
                new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "disabled");
            private static final javax.xml.namespace.QName CLASSNAME$2 = 
                new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "classname");
            private static final javax.xml.namespace.QName ENV$4 = 
                new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "env");
            private static final javax.xml.namespace.QName SERVER$6 = 
                new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "server");
            private static final javax.xml.namespace.QName PLUGINPARAM$8 = 
                new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "pluginParam");
            
            
            /**
             * Gets the "disabled" element
             */
            public boolean getDisabled()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISABLED$0, 0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "disabled" element
             */
            public org.apache.xmlbeans.XmlBoolean xgetDisabled()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DISABLED$0, 0);
                    return target;
                }
            }
            
            /**
             * True if has "disabled" element
             */
            public boolean isSetDisabled()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DISABLED$0) != 0;
                }
            }
            
            /**
             * Sets the "disabled" element
             */
            public void setDisabled(boolean disabled)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISABLED$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISABLED$0);
                    }
                    target.setBooleanValue(disabled);
                }
            }
            
            /**
             * Sets (as xml) the "disabled" element
             */
            public void xsetDisabled(org.apache.xmlbeans.XmlBoolean disabled)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DISABLED$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DISABLED$0);
                    }
                    target.set(disabled);
                }
            }
            
            /**
             * Unsets the "disabled" element
             */
            public void unsetDisabled()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DISABLED$0, 0);
                }
            }
            
            /**
             * Gets the "classname" element
             */
            public java.lang.String getClassname()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASSNAME$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "classname" element
             */
            public org.apache.xmlbeans.XmlString xgetClassname()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASSNAME$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "classname" element
             */
            public void setClassname(java.lang.String classname)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASSNAME$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLASSNAME$2);
                    }
                    target.setStringValue(classname);
                }
            }
            
            /**
             * Sets (as xml) the "classname" element
             */
            public void xsetClassname(org.apache.xmlbeans.XmlString classname)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASSNAME$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLASSNAME$2);
                    }
                    target.set(classname);
                }
            }
            
            /**
             * Gets the "env" element
             */
            public java.lang.String getEnv()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENV$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "env" element
             */
            public org.apache.xmlbeans.XmlString xgetEnv()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENV$4, 0);
                    return target;
                }
            }
            
            /**
             * True if has "env" element
             */
            public boolean isSetEnv()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ENV$4) != 0;
                }
            }
            
            /**
             * Sets the "env" element
             */
            public void setEnv(java.lang.String env)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENV$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENV$4);
                    }
                    target.setStringValue(env);
                }
            }
            
            /**
             * Sets (as xml) the "env" element
             */
            public void xsetEnv(org.apache.xmlbeans.XmlString env)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENV$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENV$4);
                    }
                    target.set(env);
                }
            }
            
            /**
             * Unsets the "env" element
             */
            public void unsetEnv()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ENV$4, 0);
                }
            }
            
            /**
             * Gets the "server" element
             */
            public java.lang.String getServer()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVER$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "server" element
             */
            public org.apache.xmlbeans.XmlString xgetServer()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVER$6, 0);
                    return target;
                }
            }
            
            /**
             * True if has "server" element
             */
            public boolean isSetServer()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SERVER$6) != 0;
                }
            }
            
            /**
             * Sets the "server" element
             */
            public void setServer(java.lang.String server)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVER$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVER$6);
                    }
                    target.setStringValue(server);
                }
            }
            
            /**
             * Sets (as xml) the "server" element
             */
            public void xsetServer(org.apache.xmlbeans.XmlString server)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVER$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVER$6);
                    }
                    target.set(server);
                }
            }
            
            /**
             * Unsets the "server" element
             */
            public void unsetServer()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SERVER$6, 0);
                }
            }
            
            /**
             * Gets array of all "pluginParam" elements
             */
            public com.guidewire.accelerator.deployment.PluginParam[] getPluginParamArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(PLUGINPARAM$8, targetList);
                    com.guidewire.accelerator.deployment.PluginParam[] result = new com.guidewire.accelerator.deployment.PluginParam[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "pluginParam" element
             */
            public com.guidewire.accelerator.deployment.PluginParam getPluginParamArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.guidewire.accelerator.deployment.PluginParam target = null;
                    target = (com.guidewire.accelerator.deployment.PluginParam)get_store().find_element_user(PLUGINPARAM$8, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "pluginParam" element
             */
            public int sizeOfPluginParamArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PLUGINPARAM$8);
                }
            }
            
            /**
             * Sets array of all "pluginParam" element
             */
            public void setPluginParamArray(com.guidewire.accelerator.deployment.PluginParam[] pluginParamArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(pluginParamArray, PLUGINPARAM$8);
                }
            }
            
            /**
             * Sets ith "pluginParam" element
             */
            public void setPluginParamArray(int i, com.guidewire.accelerator.deployment.PluginParam pluginParam)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.guidewire.accelerator.deployment.PluginParam target = null;
                    target = (com.guidewire.accelerator.deployment.PluginParam)get_store().find_element_user(PLUGINPARAM$8, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(pluginParam);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "pluginParam" element
             */
            public com.guidewire.accelerator.deployment.PluginParam insertNewPluginParam(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.guidewire.accelerator.deployment.PluginParam target = null;
                    target = (com.guidewire.accelerator.deployment.PluginParam)get_store().insert_element_user(PLUGINPARAM$8, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "pluginParam" element
             */
            public com.guidewire.accelerator.deployment.PluginParam addNewPluginParam()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.guidewire.accelerator.deployment.PluginParam target = null;
                    target = (com.guidewire.accelerator.deployment.PluginParam)get_store().add_element_user(PLUGINPARAM$8);
                    return target;
                }
            }
            
            /**
             * Removes the ith "pluginParam" element
             */
            public void removePluginParam(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PLUGINPARAM$8, i);
                }
            }
        }
    }
    /**
     * An XML displaykey(@http://guidewire.com/accelerator/deployment).
     *
     * This is a complex type.
     */
    public static class DisplaykeyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.accelerator.deployment.Accelerator.Displaykey
    {
        private static final long serialVersionUID = 1L;
        
        public DisplaykeyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FILE$0 = 
            new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "file");
        
        
        /**
         * Gets the "file" element
         */
        public java.lang.String getFile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "file" element
         */
        public org.apache.xmlbeans.XmlString xgetFile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "file" element
         */
        public boolean isSetFile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FILE$0) != 0;
            }
        }
        
        /**
         * Sets the "file" element
         */
        public void setFile(java.lang.String file)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILE$0);
                }
                target.setStringValue(file);
            }
        }
        
        /**
         * Sets (as xml) the "file" element
         */
        public void xsetFile(org.apache.xmlbeans.XmlString file)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FILE$0);
                }
                target.set(file);
            }
        }
        
        /**
         * Unsets the "file" element
         */
        public void unsetFile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FILE$0, 0);
            }
        }
    }
}
