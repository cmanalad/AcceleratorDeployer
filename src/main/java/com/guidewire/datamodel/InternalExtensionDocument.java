/*
 * An XML document type.
 * Localname: internalExtension
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.InternalExtensionDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel;


/**
 * A document containing one internalExtension(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public interface InternalExtensionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InternalExtensionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("internalextensionfb29doctype");
    
    /**
     * Gets the "internalExtension" element
     */
    com.guidewire.datamodel.InternalExtensionDocument.InternalExtension getInternalExtension();
    
    /**
     * Sets the "internalExtension" element
     */
    void setInternalExtension(com.guidewire.datamodel.InternalExtensionDocument.InternalExtension internalExtension);
    
    /**
     * Appends and returns a new empty "internalExtension" element
     */
    com.guidewire.datamodel.InternalExtensionDocument.InternalExtension addNewInternalExtension();
    
    /**
     * An XML internalExtension(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public interface InternalExtension extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InternalExtension.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("internalextensiondbfbelemtype");
        
        /**
         * Gets array of all "array" elements
         */
        com.guidewire.datamodel.ArrayDocument.Array[] getArrayArray();
        
        /**
         * Gets ith "array" element
         */
        com.guidewire.datamodel.ArrayDocument.Array getArrayArray(int i);
        
        /**
         * Returns number of "array" element
         */
        int sizeOfArrayArray();
        
        /**
         * Sets array of all "array" element
         */
        void setArrayArray(com.guidewire.datamodel.ArrayDocument.Array[] arrayArray);
        
        /**
         * Sets ith "array" element
         */
        void setArrayArray(int i, com.guidewire.datamodel.ArrayDocument.Array array);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "array" element
         */
        com.guidewire.datamodel.ArrayDocument.Array insertNewArray(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "array" element
         */
        com.guidewire.datamodel.ArrayDocument.Array addNewArray();
        
        /**
         * Removes the ith "array" element
         */
        void removeArray(int i);
        
        /**
         * Gets array of all "array-override" elements
         */
        com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride[] getArrayOverrideArray();
        
        /**
         * Gets ith "array-override" element
         */
        com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride getArrayOverrideArray(int i);
        
        /**
         * Returns number of "array-override" element
         */
        int sizeOfArrayOverrideArray();
        
        /**
         * Sets array of all "array-override" element
         */
        void setArrayOverrideArray(com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride[] arrayOverrideArray);
        
        /**
         * Sets ith "array-override" element
         */
        void setArrayOverrideArray(int i, com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride arrayOverride);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "array-override" element
         */
        com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride insertNewArrayOverride(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "array-override" element
         */
        com.guidewire.datamodel.ArrayOverrideDocument.ArrayOverride addNewArrayOverride();
        
        /**
         * Removes the ith "array-override" element
         */
        void removeArrayOverride(int i);
        
        /**
         * Gets array of all "checkconstraint" elements
         */
        com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint[] getCheckconstraintArray();
        
        /**
         * Gets ith "checkconstraint" element
         */
        com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint getCheckconstraintArray(int i);
        
        /**
         * Returns number of "checkconstraint" element
         */
        int sizeOfCheckconstraintArray();
        
        /**
         * Sets array of all "checkconstraint" element
         */
        void setCheckconstraintArray(com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint[] checkconstraintArray);
        
        /**
         * Sets ith "checkconstraint" element
         */
        void setCheckconstraintArray(int i, com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint checkconstraint);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "checkconstraint" element
         */
        com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint insertNewCheckconstraint(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "checkconstraint" element
         */
        com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint addNewCheckconstraint();
        
        /**
         * Removes the ith "checkconstraint" element
         */
        void removeCheckconstraint(int i);
        
        /**
         * Gets array of all "column" elements
         */
        com.guidewire.datamodel.ColumnDocument.Column[] getColumnArray();
        
        /**
         * Gets ith "column" element
         */
        com.guidewire.datamodel.ColumnDocument.Column getColumnArray(int i);
        
        /**
         * Returns number of "column" element
         */
        int sizeOfColumnArray();
        
        /**
         * Sets array of all "column" element
         */
        void setColumnArray(com.guidewire.datamodel.ColumnDocument.Column[] columnArray);
        
        /**
         * Sets ith "column" element
         */
        void setColumnArray(int i, com.guidewire.datamodel.ColumnDocument.Column column);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "column" element
         */
        com.guidewire.datamodel.ColumnDocument.Column insertNewColumn(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "column" element
         */
        com.guidewire.datamodel.ColumnDocument.Column addNewColumn();
        
        /**
         * Removes the ith "column" element
         */
        void removeColumn(int i);
        
        /**
         * Gets array of all "column-override" elements
         */
        com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride[] getColumnOverrideArray();
        
        /**
         * Gets ith "column-override" element
         */
        com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride getColumnOverrideArray(int i);
        
        /**
         * Returns number of "column-override" element
         */
        int sizeOfColumnOverrideArray();
        
        /**
         * Sets array of all "column-override" element
         */
        void setColumnOverrideArray(com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride[] columnOverrideArray);
        
        /**
         * Sets ith "column-override" element
         */
        void setColumnOverrideArray(int i, com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride columnOverride);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "column-override" element
         */
        com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride insertNewColumnOverride(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "column-override" element
         */
        com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride addNewColumnOverride();
        
        /**
         * Removes the ith "column-override" element
         */
        void removeColumnOverride(int i);
        
        /**
         * Gets array of all "componentref" elements
         */
        com.guidewire.datamodel.ComponentrefDocument.Componentref[] getComponentrefArray();
        
        /**
         * Gets ith "componentref" element
         */
        com.guidewire.datamodel.ComponentrefDocument.Componentref getComponentrefArray(int i);
        
        /**
         * Returns number of "componentref" element
         */
        int sizeOfComponentrefArray();
        
        /**
         * Sets array of all "componentref" element
         */
        void setComponentrefArray(com.guidewire.datamodel.ComponentrefDocument.Componentref[] componentrefArray);
        
        /**
         * Sets ith "componentref" element
         */
        void setComponentrefArray(int i, com.guidewire.datamodel.ComponentrefDocument.Componentref componentref);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "componentref" element
         */
        com.guidewire.datamodel.ComponentrefDocument.Componentref insertNewComponentref(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "componentref" element
         */
        com.guidewire.datamodel.ComponentrefDocument.Componentref addNewComponentref();
        
        /**
         * Removes the ith "componentref" element
         */
        void removeComponentref(int i);
        
        /**
         * Gets array of all "customconsistencycheck" elements
         */
        com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck[] getCustomconsistencycheckArray();
        
        /**
         * Gets ith "customconsistencycheck" element
         */
        com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck getCustomconsistencycheckArray(int i);
        
        /**
         * Returns number of "customconsistencycheck" element
         */
        int sizeOfCustomconsistencycheckArray();
        
        /**
         * Sets array of all "customconsistencycheck" element
         */
        void setCustomconsistencycheckArray(com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck[] customconsistencycheckArray);
        
        /**
         * Sets ith "customconsistencycheck" element
         */
        void setCustomconsistencycheckArray(int i, com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck customconsistencycheck);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "customconsistencycheck" element
         */
        com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck insertNewCustomconsistencycheck(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "customconsistencycheck" element
         */
        com.guidewire.datamodel.CustomconsistencycheckDocument.Customconsistencycheck addNewCustomconsistencycheck();
        
        /**
         * Removes the ith "customconsistencycheck" element
         */
        void removeCustomconsistencycheck(int i);
        
        /**
         * Gets array of all "dbcheckbuilder" elements
         */
        com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder[] getDbcheckbuilderArray();
        
        /**
         * Gets ith "dbcheckbuilder" element
         */
        com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder getDbcheckbuilderArray(int i);
        
        /**
         * Returns number of "dbcheckbuilder" element
         */
        int sizeOfDbcheckbuilderArray();
        
        /**
         * Sets array of all "dbcheckbuilder" element
         */
        void setDbcheckbuilderArray(com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder[] dbcheckbuilderArray);
        
        /**
         * Sets ith "dbcheckbuilder" element
         */
        void setDbcheckbuilderArray(int i, com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder dbcheckbuilder);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dbcheckbuilder" element
         */
        com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder insertNewDbcheckbuilder(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dbcheckbuilder" element
         */
        com.guidewire.datamodel.DbcheckbuilderDocument.Dbcheckbuilder addNewDbcheckbuilder();
        
        /**
         * Removes the ith "dbcheckbuilder" element
         */
        void removeDbcheckbuilder(int i);
        
        /**
         * Gets array of all "dependentfields" elements
         */
        com.guidewire.datamodel.DependentfieldsDocument.Dependentfields[] getDependentfieldsArray();
        
        /**
         * Gets ith "dependentfields" element
         */
        com.guidewire.datamodel.DependentfieldsDocument.Dependentfields getDependentfieldsArray(int i);
        
        /**
         * Returns number of "dependentfields" element
         */
        int sizeOfDependentfieldsArray();
        
        /**
         * Sets array of all "dependentfields" element
         */
        void setDependentfieldsArray(com.guidewire.datamodel.DependentfieldsDocument.Dependentfields[] dependentfieldsArray);
        
        /**
         * Sets ith "dependentfields" element
         */
        void setDependentfieldsArray(int i, com.guidewire.datamodel.DependentfieldsDocument.Dependentfields dependentfields);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dependentfields" element
         */
        com.guidewire.datamodel.DependentfieldsDocument.Dependentfields insertNewDependentfields(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dependentfields" element
         */
        com.guidewire.datamodel.DependentfieldsDocument.Dependentfields addNewDependentfields();
        
        /**
         * Removes the ith "dependentfields" element
         */
        void removeDependentfields(int i);
        
        /**
         * Gets array of all "description" elements
         */
        com.guidewire.datamodel.DescriptionDocument.Description[] getDescriptionArray();
        
        /**
         * Gets ith "description" element
         */
        com.guidewire.datamodel.DescriptionDocument.Description getDescriptionArray(int i);
        
        /**
         * Returns number of "description" element
         */
        int sizeOfDescriptionArray();
        
        /**
         * Sets array of all "description" element
         */
        void setDescriptionArray(com.guidewire.datamodel.DescriptionDocument.Description[] descriptionArray);
        
        /**
         * Sets ith "description" element
         */
        void setDescriptionArray(int i, com.guidewire.datamodel.DescriptionDocument.Description description);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "description" element
         */
        com.guidewire.datamodel.DescriptionDocument.Description insertNewDescription(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "description" element
         */
        com.guidewire.datamodel.DescriptionDocument.Description addNewDescription();
        
        /**
         * Removes the ith "description" element
         */
        void removeDescription(int i);
        
        /**
         * Gets array of all "edgeForeignKey" elements
         */
        com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey[] getEdgeForeignKeyArray();
        
        /**
         * Gets ith "edgeForeignKey" element
         */
        com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey getEdgeForeignKeyArray(int i);
        
        /**
         * Returns number of "edgeForeignKey" element
         */
        int sizeOfEdgeForeignKeyArray();
        
        /**
         * Sets array of all "edgeForeignKey" element
         */
        void setEdgeForeignKeyArray(com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey[] edgeForeignKeyArray);
        
        /**
         * Sets ith "edgeForeignKey" element
         */
        void setEdgeForeignKeyArray(int i, com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey edgeForeignKey);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "edgeForeignKey" element
         */
        com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey insertNewEdgeForeignKey(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "edgeForeignKey" element
         */
        com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey addNewEdgeForeignKey();
        
        /**
         * Removes the ith "edgeForeignKey" element
         */
        void removeEdgeForeignKey(int i);
        
        /**
         * Gets array of all "events" elements
         */
        com.guidewire.datamodel.EventsDocument.Events[] getEventsArray();
        
        /**
         * Gets ith "events" element
         */
        com.guidewire.datamodel.EventsDocument.Events getEventsArray(int i);
        
        /**
         * Returns number of "events" element
         */
        int sizeOfEventsArray();
        
        /**
         * Sets array of all "events" element
         */
        void setEventsArray(com.guidewire.datamodel.EventsDocument.Events[] eventsArray);
        
        /**
         * Sets ith "events" element
         */
        void setEventsArray(int i, com.guidewire.datamodel.EventsDocument.Events events);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "events" element
         */
        com.guidewire.datamodel.EventsDocument.Events insertNewEvents(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "events" element
         */
        com.guidewire.datamodel.EventsDocument.Events addNewEvents();
        
        /**
         * Removes the ith "events" element
         */
        void removeEvents(int i);
        
        /**
         * Gets array of all "foreignkey" elements
         */
        com.guidewire.datamodel.ForeignkeyDocument.Foreignkey[] getForeignkeyArray();
        
        /**
         * Gets ith "foreignkey" element
         */
        com.guidewire.datamodel.ForeignkeyDocument.Foreignkey getForeignkeyArray(int i);
        
        /**
         * Returns number of "foreignkey" element
         */
        int sizeOfForeignkeyArray();
        
        /**
         * Sets array of all "foreignkey" element
         */
        void setForeignkeyArray(com.guidewire.datamodel.ForeignkeyDocument.Foreignkey[] foreignkeyArray);
        
        /**
         * Sets ith "foreignkey" element
         */
        void setForeignkeyArray(int i, com.guidewire.datamodel.ForeignkeyDocument.Foreignkey foreignkey);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "foreignkey" element
         */
        com.guidewire.datamodel.ForeignkeyDocument.Foreignkey insertNewForeignkey(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "foreignkey" element
         */
        com.guidewire.datamodel.ForeignkeyDocument.Foreignkey addNewForeignkey();
        
        /**
         * Removes the ith "foreignkey" element
         */
        void removeForeignkey(int i);
        
        /**
         * Gets array of all "foreignkey-override" elements
         */
        com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride[] getForeignkeyOverrideArray();
        
        /**
         * Gets ith "foreignkey-override" element
         */
        com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride getForeignkeyOverrideArray(int i);
        
        /**
         * Returns number of "foreignkey-override" element
         */
        int sizeOfForeignkeyOverrideArray();
        
        /**
         * Sets array of all "foreignkey-override" element
         */
        void setForeignkeyOverrideArray(com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride[] foreignkeyOverrideArray);
        
        /**
         * Sets ith "foreignkey-override" element
         */
        void setForeignkeyOverrideArray(int i, com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride foreignkeyOverride);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "foreignkey-override" element
         */
        com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride insertNewForeignkeyOverride(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "foreignkey-override" element
         */
        com.guidewire.datamodel.ForeignkeyOverrideDocument.ForeignkeyOverride addNewForeignkeyOverride();
        
        /**
         * Removes the ith "foreignkey-override" element
         */
        void removeForeignkeyOverride(int i);
        
        /**
         * Gets array of all "implementsEntity" elements
         */
        com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity[] getImplementsEntityArray();
        
        /**
         * Gets ith "implementsEntity" element
         */
        com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity getImplementsEntityArray(int i);
        
        /**
         * Returns number of "implementsEntity" element
         */
        int sizeOfImplementsEntityArray();
        
        /**
         * Sets array of all "implementsEntity" element
         */
        void setImplementsEntityArray(com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity[] implementsEntityArray);
        
        /**
         * Sets ith "implementsEntity" element
         */
        void setImplementsEntityArray(int i, com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity implementsEntity);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "implementsEntity" element
         */
        com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity insertNewImplementsEntity(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "implementsEntity" element
         */
        com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity addNewImplementsEntity();
        
        /**
         * Removes the ith "implementsEntity" element
         */
        void removeImplementsEntity(int i);
        
        /**
         * Gets array of all "implementsInterface" elements
         */
        com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface[] getImplementsInterfaceArray();
        
        /**
         * Gets ith "implementsInterface" element
         */
        com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface getImplementsInterfaceArray(int i);
        
        /**
         * Returns number of "implementsInterface" element
         */
        int sizeOfImplementsInterfaceArray();
        
        /**
         * Sets array of all "implementsInterface" element
         */
        void setImplementsInterfaceArray(com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface[] implementsInterfaceArray);
        
        /**
         * Sets ith "implementsInterface" element
         */
        void setImplementsInterfaceArray(int i, com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface implementsInterface);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "implementsInterface" element
         */
        com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface insertNewImplementsInterface(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "implementsInterface" element
         */
        com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface addNewImplementsInterface();
        
        /**
         * Removes the ith "implementsInterface" element
         */
        void removeImplementsInterface(int i);
        
        /**
         * Gets array of all "index" elements
         */
        com.guidewire.datamodel.IndexDocument.Index[] getIndexArray();
        
        /**
         * Gets ith "index" element
         */
        com.guidewire.datamodel.IndexDocument.Index getIndexArray(int i);
        
        /**
         * Returns number of "index" element
         */
        int sizeOfIndexArray();
        
        /**
         * Sets array of all "index" element
         */
        void setIndexArray(com.guidewire.datamodel.IndexDocument.Index[] indexArray);
        
        /**
         * Sets ith "index" element
         */
        void setIndexArray(int i, com.guidewire.datamodel.IndexDocument.Index index);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "index" element
         */
        com.guidewire.datamodel.IndexDocument.Index insertNewIndex(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "index" element
         */
        com.guidewire.datamodel.IndexDocument.Index addNewIndex();
        
        /**
         * Removes the ith "index" element
         */
        void removeIndex(int i);
        
        /**
         * Gets array of all "jointableconsistencycheck" elements
         */
        com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck[] getJointableconsistencycheckArray();
        
        /**
         * Gets ith "jointableconsistencycheck" element
         */
        com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck getJointableconsistencycheckArray(int i);
        
        /**
         * Returns number of "jointableconsistencycheck" element
         */
        int sizeOfJointableconsistencycheckArray();
        
        /**
         * Sets array of all "jointableconsistencycheck" element
         */
        void setJointableconsistencycheckArray(com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck[] jointableconsistencycheckArray);
        
        /**
         * Sets ith "jointableconsistencycheck" element
         */
        void setJointableconsistencycheckArray(int i, com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck jointableconsistencycheck);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "jointableconsistencycheck" element
         */
        com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck insertNewJointableconsistencycheck(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "jointableconsistencycheck" element
         */
        com.guidewire.datamodel.JointableconsistencycheckDocument.Jointableconsistencycheck addNewJointableconsistencycheck();
        
        /**
         * Removes the ith "jointableconsistencycheck" element
         */
        void removeJointableconsistencycheck(int i);
        
        /**
         * Gets array of all "onetoone" elements
         */
        com.guidewire.datamodel.OnetooneDocument.Onetoone[] getOnetooneArray();
        
        /**
         * Gets ith "onetoone" element
         */
        com.guidewire.datamodel.OnetooneDocument.Onetoone getOnetooneArray(int i);
        
        /**
         * Returns number of "onetoone" element
         */
        int sizeOfOnetooneArray();
        
        /**
         * Sets array of all "onetoone" element
         */
        void setOnetooneArray(com.guidewire.datamodel.OnetooneDocument.Onetoone[] onetooneArray);
        
        /**
         * Sets ith "onetoone" element
         */
        void setOnetooneArray(int i, com.guidewire.datamodel.OnetooneDocument.Onetoone onetoone);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "onetoone" element
         */
        com.guidewire.datamodel.OnetooneDocument.Onetoone insertNewOnetoone(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "onetoone" element
         */
        com.guidewire.datamodel.OnetooneDocument.Onetoone addNewOnetoone();
        
        /**
         * Removes the ith "onetoone" element
         */
        void removeOnetoone(int i);
        
        /**
         * Gets array of all "onetoone-override" elements
         */
        com.guidewire.datamodel.OnetooneOverrideDocument.OnetooneOverride[] getOnetooneOverrideArray();
        
        /**
         * Gets ith "onetoone-override" element
         */
        com.guidewire.datamodel.OnetooneOverrideDocument.OnetooneOverride getOnetooneOverrideArray(int i);
        
        /**
         * Returns number of "onetoone-override" element
         */
        int sizeOfOnetooneOverrideArray();
        
        /**
         * Sets array of all "onetoone-override" element
         */
        void setOnetooneOverrideArray(com.guidewire.datamodel.OnetooneOverrideDocument.OnetooneOverride[] onetooneOverrideArray);
        
        /**
         * Sets ith "onetoone-override" element
         */
        void setOnetooneOverrideArray(int i, com.guidewire.datamodel.OnetooneOverrideDocument.OnetooneOverride onetooneOverride);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "onetoone-override" element
         */
        com.guidewire.datamodel.OnetooneOverrideDocument.OnetooneOverride insertNewOnetooneOverride(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "onetoone-override" element
         */
        com.guidewire.datamodel.OnetooneOverrideDocument.OnetooneOverride addNewOnetooneOverride();
        
        /**
         * Removes the ith "onetoone-override" element
         */
        void removeOnetooneOverride(int i);
        
        /**
         * Gets array of all "remove-index" elements
         */
        com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex[] getRemoveIndexArray();
        
        /**
         * Gets ith "remove-index" element
         */
        com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex getRemoveIndexArray(int i);
        
        /**
         * Returns number of "remove-index" element
         */
        int sizeOfRemoveIndexArray();
        
        /**
         * Sets array of all "remove-index" element
         */
        void setRemoveIndexArray(com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex[] removeIndexArray);
        
        /**
         * Sets ith "remove-index" element
         */
        void setRemoveIndexArray(int i, com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex removeIndex);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "remove-index" element
         */
        com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex insertNewRemoveIndex(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "remove-index" element
         */
        com.guidewire.datamodel.RemoveIndexDocument.RemoveIndex addNewRemoveIndex();
        
        /**
         * Removes the ith "remove-index" element
         */
        void removeRemoveIndex(int i);
        
        /**
         * Gets array of all "typekey" elements
         */
        com.guidewire.datamodel.TypekeyDocument.Typekey[] getTypekeyArray();
        
        /**
         * Gets ith "typekey" element
         */
        com.guidewire.datamodel.TypekeyDocument.Typekey getTypekeyArray(int i);
        
        /**
         * Returns number of "typekey" element
         */
        int sizeOfTypekeyArray();
        
        /**
         * Sets array of all "typekey" element
         */
        void setTypekeyArray(com.guidewire.datamodel.TypekeyDocument.Typekey[] typekeyArray);
        
        /**
         * Sets ith "typekey" element
         */
        void setTypekeyArray(int i, com.guidewire.datamodel.TypekeyDocument.Typekey typekey);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "typekey" element
         */
        com.guidewire.datamodel.TypekeyDocument.Typekey insertNewTypekey(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "typekey" element
         */
        com.guidewire.datamodel.TypekeyDocument.Typekey addNewTypekey();
        
        /**
         * Removes the ith "typekey" element
         */
        void removeTypekey(int i);
        
        /**
         * Gets array of all "typekey-override" elements
         */
        com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride[] getTypekeyOverrideArray();
        
        /**
         * Gets ith "typekey-override" element
         */
        com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride getTypekeyOverrideArray(int i);
        
        /**
         * Returns number of "typekey-override" element
         */
        int sizeOfTypekeyOverrideArray();
        
        /**
         * Sets array of all "typekey-override" element
         */
        void setTypekeyOverrideArray(com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride[] typekeyOverrideArray);
        
        /**
         * Sets ith "typekey-override" element
         */
        void setTypekeyOverrideArray(int i, com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride typekeyOverride);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "typekey-override" element
         */
        com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride insertNewTypekeyOverride(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "typekey-override" element
         */
        com.guidewire.datamodel.TypekeyOverrideDocument.TypekeyOverride addNewTypekeyOverride();
        
        /**
         * Removes the ith "typekey-override" element
         */
        void removeTypekeyOverride(int i);
        
        /**
         * Gets the "entityName" attribute
         */
        java.lang.String getEntityName();
        
        /**
         * Gets (as xml) the "entityName" attribute
         */
        org.apache.xmlbeans.XmlNMTOKEN xgetEntityName();
        
        /**
         * Sets the "entityName" attribute
         */
        void setEntityName(java.lang.String entityName);
        
        /**
         * Sets (as xml) the "entityName" attribute
         */
        void xsetEntityName(org.apache.xmlbeans.XmlNMTOKEN entityName);
        
        /**
         * Gets the "final" attribute
         */
        boolean getFinal();
        
        /**
         * Gets (as xml) the "final" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetFinal();
        
        /**
         * True if has "final" attribute
         */
        boolean isSetFinal();
        
        /**
         * Sets the "final" attribute
         */
        void setFinal(boolean xfinal);
        
        /**
         * Sets (as xml) the "final" attribute
         */
        void xsetFinal(org.apache.xmlbeans.XmlBoolean xfinal);
        
        /**
         * Unsets the "final" attribute
         */
        void unsetFinal();
        
        /**
         * Gets the "javaClass" attribute
         */
        java.lang.String getJavaClass();
        
        /**
         * Gets (as xml) the "javaClass" attribute
         */
        org.apache.xmlbeans.XmlNMTOKEN xgetJavaClass();
        
        /**
         * True if has "javaClass" attribute
         */
        boolean isSetJavaClass();
        
        /**
         * Sets the "javaClass" attribute
         */
        void setJavaClass(java.lang.String javaClass);
        
        /**
         * Sets (as xml) the "javaClass" attribute
         */
        void xsetJavaClass(org.apache.xmlbeans.XmlNMTOKEN javaClass);
        
        /**
         * Unsets the "javaClass" attribute
         */
        void unsetJavaClass();
        
        /**
         * Gets the "table" attribute
         */
        java.lang.String getTable();
        
        /**
         * Gets (as xml) the "table" attribute
         */
        org.apache.xmlbeans.XmlNMTOKEN xgetTable();
        
        /**
         * True if has "table" attribute
         */
        boolean isSetTable();
        
        /**
         * Sets the "table" attribute
         */
        void setTable(java.lang.String table);
        
        /**
         * Sets (as xml) the "table" attribute
         */
        void xsetTable(org.apache.xmlbeans.XmlNMTOKEN table);
        
        /**
         * Unsets the "table" attribute
         */
        void unsetTable();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.guidewire.datamodel.InternalExtensionDocument.InternalExtension newInstance() {
              return (com.guidewire.datamodel.InternalExtensionDocument.InternalExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.guidewire.datamodel.InternalExtensionDocument.InternalExtension newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.guidewire.datamodel.InternalExtensionDocument.InternalExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.guidewire.datamodel.InternalExtensionDocument newInstance() {
          return (com.guidewire.datamodel.InternalExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.guidewire.datamodel.InternalExtensionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.guidewire.datamodel.InternalExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.guidewire.datamodel.InternalExtensionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.InternalExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.guidewire.datamodel.InternalExtensionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.InternalExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.guidewire.datamodel.InternalExtensionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.InternalExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.guidewire.datamodel.InternalExtensionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.InternalExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.guidewire.datamodel.InternalExtensionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.InternalExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.guidewire.datamodel.InternalExtensionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.InternalExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.guidewire.datamodel.InternalExtensionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.InternalExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.guidewire.datamodel.InternalExtensionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.InternalExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.guidewire.datamodel.InternalExtensionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.InternalExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.guidewire.datamodel.InternalExtensionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.InternalExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.guidewire.datamodel.InternalExtensionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.InternalExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.guidewire.datamodel.InternalExtensionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.InternalExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.guidewire.datamodel.InternalExtensionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.InternalExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.guidewire.datamodel.InternalExtensionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.InternalExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.InternalExtensionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.InternalExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.InternalExtensionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.InternalExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
