/*
 * An XML document type.
 * Localname: accelerator
 * Namespace: http://guidewire.com/accelerator/deployment
 * Java type: com.guidewire.accelerator.deployment.AcceleratorDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.accelerator.deployment.impl;
/**
 * A document containing one accelerator(@http://guidewire.com/accelerator/deployment) element.
 *
 * This is a complex type.
 */
public class AcceleratorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.guidewire.accelerator.deployment.AcceleratorDocument
{
    private static final long serialVersionUID = 1L;
    
    public AcceleratorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCELERATOR$0 = 
        new javax.xml.namespace.QName("http://guidewire.com/accelerator/deployment", "accelerator");
    
    
    /**
     * Gets the "accelerator" element
     */
    public com.guidewire.accelerator.deployment.Accelerator getAccelerator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator)get_store().find_element_user(ACCELERATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "accelerator" element
     */
    public void setAccelerator(com.guidewire.accelerator.deployment.Accelerator accelerator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator)get_store().find_element_user(ACCELERATOR$0, 0);
            if (target == null)
            {
                target = (com.guidewire.accelerator.deployment.Accelerator)get_store().add_element_user(ACCELERATOR$0);
            }
            target.set(accelerator);
        }
    }
    
    /**
     * Appends and returns a new empty "accelerator" element
     */
    public com.guidewire.accelerator.deployment.Accelerator addNewAccelerator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.guidewire.accelerator.deployment.Accelerator target = null;
            target = (com.guidewire.accelerator.deployment.Accelerator)get_store().add_element_user(ACCELERATOR$0);
            return target;
        }
    }
}
