/*
 * An XML document type.
 * Localname: subtype
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.SubtypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel;


/**
 * A document containing one subtype(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public interface SubtypeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubtypeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("subtype2bf1doctype");
    
    /**
     * Gets the "subtype" element
     */
    com.guidewire.datamodel.SubtypeDocument.Subtype getSubtype();
    
    /**
     * Sets the "subtype" element
     */
    void setSubtype(com.guidewire.datamodel.SubtypeDocument.Subtype subtype);
    
    /**
     * Appends and returns a new empty "subtype" element
     */
    com.guidewire.datamodel.SubtypeDocument.Subtype addNewSubtype();
    
    /**
     * An XML subtype(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public interface Subtype extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Subtype.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("subtype3ccbelemtype");
        
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
         * Gets array of all "aspect" elements
         */
        com.guidewire.datamodel.AspectDocument.Aspect[] getAspectArray();
        
        /**
         * Gets ith "aspect" element
         */
        com.guidewire.datamodel.AspectDocument.Aspect getAspectArray(int i);
        
        /**
         * Returns number of "aspect" element
         */
        int sizeOfAspectArray();
        
        /**
         * Sets array of all "aspect" element
         */
        void setAspectArray(com.guidewire.datamodel.AspectDocument.Aspect[] aspectArray);
        
        /**
         * Sets ith "aspect" element
         */
        void setAspectArray(int i, com.guidewire.datamodel.AspectDocument.Aspect aspect);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "aspect" element
         */
        com.guidewire.datamodel.AspectDocument.Aspect insertNewAspect(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "aspect" element
         */
        com.guidewire.datamodel.AspectDocument.Aspect addNewAspect();
        
        /**
         * Removes the ith "aspect" element
         */
        void removeAspect(int i);
        
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
         * Gets array of all "datetimeordering" elements
         */
        com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering[] getDatetimeorderingArray();
        
        /**
         * Gets ith "datetimeordering" element
         */
        com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering getDatetimeorderingArray(int i);
        
        /**
         * Returns number of "datetimeordering" element
         */
        int sizeOfDatetimeorderingArray();
        
        /**
         * Sets array of all "datetimeordering" element
         */
        void setDatetimeorderingArray(com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering[] datetimeorderingArray);
        
        /**
         * Sets ith "datetimeordering" element
         */
        void setDatetimeorderingArray(int i, com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering datetimeordering);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "datetimeordering" element
         */
        com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering insertNewDatetimeordering(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "datetimeordering" element
         */
        com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering addNewDatetimeordering();
        
        /**
         * Removes the ith "datetimeordering" element
         */
        void removeDatetimeordering(int i);
        
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
         * Gets array of all "fulldescription" elements
         */
        com.guidewire.datamodel.FulldescriptionDocument.Fulldescription[] getFulldescriptionArray();
        
        /**
         * Gets ith "fulldescription" element
         */
        com.guidewire.datamodel.FulldescriptionDocument.Fulldescription getFulldescriptionArray(int i);
        
        /**
         * Returns number of "fulldescription" element
         */
        int sizeOfFulldescriptionArray();
        
        /**
         * Sets array of all "fulldescription" element
         */
        void setFulldescriptionArray(com.guidewire.datamodel.FulldescriptionDocument.Fulldescription[] fulldescriptionArray);
        
        /**
         * Sets ith "fulldescription" element
         */
        void setFulldescriptionArray(int i, com.guidewire.datamodel.FulldescriptionDocument.Fulldescription fulldescription);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "fulldescription" element
         */
        com.guidewire.datamodel.FulldescriptionDocument.Fulldescription insertNewFulldescription(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "fulldescription" element
         */
        com.guidewire.datamodel.FulldescriptionDocument.Fulldescription addNewFulldescription();
        
        /**
         * Removes the ith "fulldescription" element
         */
        void removeFulldescription(int i);
        
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
         * Gets array of all "tableAugmenter" elements
         */
        com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter[] getTableAugmenterArray();
        
        /**
         * Gets ith "tableAugmenter" element
         */
        com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter getTableAugmenterArray(int i);
        
        /**
         * Returns number of "tableAugmenter" element
         */
        int sizeOfTableAugmenterArray();
        
        /**
         * Sets array of all "tableAugmenter" element
         */
        void setTableAugmenterArray(com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter[] tableAugmenterArray);
        
        /**
         * Sets ith "tableAugmenter" element
         */
        void setTableAugmenterArray(int i, com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter tableAugmenter);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "tableAugmenter" element
         */
        com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter insertNewTableAugmenter(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "tableAugmenter" element
         */
        com.guidewire.datamodel.TableAugmenterDocument.TableAugmenter addNewTableAugmenter();
        
        /**
         * Removes the ith "tableAugmenter" element
         */
        void removeTableAugmenter(int i);
        
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
         * Gets array of all "validatetypekeyinset" elements
         */
        com.guidewire.datamodel.ValidatetypekeyinsetDocument.Validatetypekeyinset[] getValidatetypekeyinsetArray();
        
        /**
         * Gets ith "validatetypekeyinset" element
         */
        com.guidewire.datamodel.ValidatetypekeyinsetDocument.Validatetypekeyinset getValidatetypekeyinsetArray(int i);
        
        /**
         * Returns number of "validatetypekeyinset" element
         */
        int sizeOfValidatetypekeyinsetArray();
        
        /**
         * Sets array of all "validatetypekeyinset" element
         */
        void setValidatetypekeyinsetArray(com.guidewire.datamodel.ValidatetypekeyinsetDocument.Validatetypekeyinset[] validatetypekeyinsetArray);
        
        /**
         * Sets ith "validatetypekeyinset" element
         */
        void setValidatetypekeyinsetArray(int i, com.guidewire.datamodel.ValidatetypekeyinsetDocument.Validatetypekeyinset validatetypekeyinset);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "validatetypekeyinset" element
         */
        com.guidewire.datamodel.ValidatetypekeyinsetDocument.Validatetypekeyinset insertNewValidatetypekeyinset(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "validatetypekeyinset" element
         */
        com.guidewire.datamodel.ValidatetypekeyinsetDocument.Validatetypekeyinset addNewValidatetypekeyinset();
        
        /**
         * Removes the ith "validatetypekeyinset" element
         */
        void removeValidatetypekeyinset(int i);
        
        /**
         * Gets array of all "validatetypekeynotinset" elements
         */
        com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset[] getValidatetypekeynotinsetArray();
        
        /**
         * Gets ith "validatetypekeynotinset" element
         */
        com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset getValidatetypekeynotinsetArray(int i);
        
        /**
         * Returns number of "validatetypekeynotinset" element
         */
        int sizeOfValidatetypekeynotinsetArray();
        
        /**
         * Sets array of all "validatetypekeynotinset" element
         */
        void setValidatetypekeynotinsetArray(com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset[] validatetypekeynotinsetArray);
        
        /**
         * Sets ith "validatetypekeynotinset" element
         */
        void setValidatetypekeynotinsetArray(int i, com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset validatetypekeynotinset);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "validatetypekeynotinset" element
         */
        com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset insertNewValidatetypekeynotinset(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "validatetypekeynotinset" element
         */
        com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset addNewValidatetypekeynotinset();
        
        /**
         * Removes the ith "validatetypekeynotinset" element
         */
        void removeValidatetypekeynotinset(int i);
        
        /**
         * Gets the "abstract" attribute
         */
        boolean getAbstract();
        
        /**
         * Gets (as xml) the "abstract" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetAbstract();
        
        /**
         * True if has "abstract" attribute
         */
        boolean isSetAbstract();
        
        /**
         * Sets the "abstract" attribute
         */
        void setAbstract(boolean xabstract);
        
        /**
         * Sets (as xml) the "abstract" attribute
         */
        void xsetAbstract(org.apache.xmlbeans.XmlBoolean xabstract);
        
        /**
         * Unsets the "abstract" attribute
         */
        void unsetAbstract();
        
        /**
         * Gets the "desc" attribute
         */
        java.lang.String getDesc();
        
        /**
         * Gets (as xml) the "desc" attribute
         */
        org.apache.xmlbeans.XmlString xgetDesc();
        
        /**
         * True if has "desc" attribute
         */
        boolean isSetDesc();
        
        /**
         * Sets the "desc" attribute
         */
        void setDesc(java.lang.String desc);
        
        /**
         * Sets (as xml) the "desc" attribute
         */
        void xsetDesc(org.apache.xmlbeans.XmlString desc);
        
        /**
         * Unsets the "desc" attribute
         */
        void unsetDesc();
        
        /**
         * Gets the "displayName" attribute
         */
        java.lang.String getDisplayName();
        
        /**
         * Gets (as xml) the "displayName" attribute
         */
        org.apache.xmlbeans.XmlString xgetDisplayName();
        
        /**
         * True if has "displayName" attribute
         */
        boolean isSetDisplayName();
        
        /**
         * Sets the "displayName" attribute
         */
        void setDisplayName(java.lang.String displayName);
        
        /**
         * Sets (as xml) the "displayName" attribute
         */
        void xsetDisplayName(org.apache.xmlbeans.XmlString displayName);
        
        /**
         * Unsets the "displayName" attribute
         */
        void unsetDisplayName();
        
        /**
         * Gets the "entity" attribute
         */
        java.lang.String getEntity();
        
        /**
         * Gets (as xml) the "entity" attribute
         */
        org.apache.xmlbeans.XmlNMTOKEN xgetEntity();
        
        /**
         * Sets the "entity" attribute
         */
        void setEntity(java.lang.String entity);
        
        /**
         * Sets (as xml) the "entity" attribute
         */
        void xsetEntity(org.apache.xmlbeans.XmlNMTOKEN entity);
        
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
         * Gets the "priority" attribute
         */
        java.math.BigInteger getPriority();
        
        /**
         * Gets (as xml) the "priority" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetPriority();
        
        /**
         * True if has "priority" attribute
         */
        boolean isSetPriority();
        
        /**
         * Sets the "priority" attribute
         */
        void setPriority(java.math.BigInteger priority);
        
        /**
         * Sets (as xml) the "priority" attribute
         */
        void xsetPriority(org.apache.xmlbeans.XmlInteger priority);
        
        /**
         * Unsets the "priority" attribute
         */
        void unsetPriority();
        
        /**
         * Gets the "readOnly" attribute
         */
        boolean getReadOnly();
        
        /**
         * Gets (as xml) the "readOnly" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetReadOnly();
        
        /**
         * True if has "readOnly" attribute
         */
        boolean isSetReadOnly();
        
        /**
         * Sets the "readOnly" attribute
         */
        void setReadOnly(boolean readOnly);
        
        /**
         * Sets (as xml) the "readOnly" attribute
         */
        void xsetReadOnly(org.apache.xmlbeans.XmlBoolean readOnly);
        
        /**
         * Unsets the "readOnly" attribute
         */
        void unsetReadOnly();
        
        /**
         * Gets the "supertype" attribute
         */
        java.lang.String getSupertype();
        
        /**
         * Gets (as xml) the "supertype" attribute
         */
        org.apache.xmlbeans.XmlNMTOKEN xgetSupertype();
        
        /**
         * Sets the "supertype" attribute
         */
        void setSupertype(java.lang.String supertype);
        
        /**
         * Sets (as xml) the "supertype" attribute
         */
        void xsetSupertype(org.apache.xmlbeans.XmlNMTOKEN supertype);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.guidewire.datamodel.SubtypeDocument.Subtype newInstance() {
              return (com.guidewire.datamodel.SubtypeDocument.Subtype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.guidewire.datamodel.SubtypeDocument.Subtype newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.guidewire.datamodel.SubtypeDocument.Subtype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.guidewire.datamodel.SubtypeDocument newInstance() {
          return (com.guidewire.datamodel.SubtypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.guidewire.datamodel.SubtypeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.guidewire.datamodel.SubtypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.guidewire.datamodel.SubtypeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.SubtypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.guidewire.datamodel.SubtypeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.SubtypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.guidewire.datamodel.SubtypeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.SubtypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.guidewire.datamodel.SubtypeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.SubtypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.guidewire.datamodel.SubtypeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.SubtypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.guidewire.datamodel.SubtypeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.SubtypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.guidewire.datamodel.SubtypeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.SubtypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.guidewire.datamodel.SubtypeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.SubtypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.guidewire.datamodel.SubtypeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.SubtypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.guidewire.datamodel.SubtypeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.SubtypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.guidewire.datamodel.SubtypeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.SubtypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.guidewire.datamodel.SubtypeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.SubtypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.guidewire.datamodel.SubtypeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.SubtypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.guidewire.datamodel.SubtypeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.SubtypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.SubtypeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.SubtypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.SubtypeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.SubtypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
