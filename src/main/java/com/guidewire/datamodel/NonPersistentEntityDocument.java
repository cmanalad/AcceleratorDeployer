/*
 * An XML document type.
 * Localname: nonPersistentEntity
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.NonPersistentEntityDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel;


/**
 * A document containing one nonPersistentEntity(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public interface NonPersistentEntityDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NonPersistentEntityDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("nonpersistententity2c04doctype");
    
    /**
     * Gets the "nonPersistentEntity" element
     */
    com.guidewire.datamodel.NonPersistentEntityDocument.NonPersistentEntity getNonPersistentEntity();
    
    /**
     * Sets the "nonPersistentEntity" element
     */
    void setNonPersistentEntity(com.guidewire.datamodel.NonPersistentEntityDocument.NonPersistentEntity nonPersistentEntity);
    
    /**
     * Appends and returns a new empty "nonPersistentEntity" element
     */
    com.guidewire.datamodel.NonPersistentEntityDocument.NonPersistentEntity addNewNonPersistentEntity();
    
    /**
     * An XML nonPersistentEntity(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public interface NonPersistentEntity extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NonPersistentEntity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("nonpersistententityaf31elemtype");
        
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
         * Gets the "base" attribute
         */
        boolean getBase();
        
        /**
         * Gets (as xml) the "base" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetBase();
        
        /**
         * True if has "base" attribute
         */
        boolean isSetBase();
        
        /**
         * Sets the "base" attribute
         */
        void setBase(boolean base);
        
        /**
         * Sets (as xml) the "base" attribute
         */
        void xsetBase(org.apache.xmlbeans.XmlBoolean base);
        
        /**
         * Unsets the "base" attribute
         */
        void unsetBase();
        
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
         * Gets the "exportable" attribute
         */
        boolean getExportable();
        
        /**
         * Gets (as xml) the "exportable" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetExportable();
        
        /**
         * True if has "exportable" attribute
         */
        boolean isSetExportable();
        
        /**
         * Sets the "exportable" attribute
         */
        void setExportable(boolean exportable);
        
        /**
         * Sets (as xml) the "exportable" attribute
         */
        void xsetExportable(org.apache.xmlbeans.XmlBoolean exportable);
        
        /**
         * Unsets the "exportable" attribute
         */
        void unsetExportable();
        
        /**
         * Gets the "extendable" attribute
         */
        boolean getExtendable();
        
        /**
         * Gets (as xml) the "extendable" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetExtendable();
        
        /**
         * True if has "extendable" attribute
         */
        boolean isSetExtendable();
        
        /**
         * Sets the "extendable" attribute
         */
        void setExtendable(boolean extendable);
        
        /**
         * Sets (as xml) the "extendable" attribute
         */
        void xsetExtendable(org.apache.xmlbeans.XmlBoolean extendable);
        
        /**
         * Unsets the "extendable" attribute
         */
        void unsetExtendable();
        
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
         * Gets the "supertypeEntity" attribute
         */
        java.lang.String getSupertypeEntity();
        
        /**
         * Gets (as xml) the "supertypeEntity" attribute
         */
        org.apache.xmlbeans.XmlNMTOKEN xgetSupertypeEntity();
        
        /**
         * True if has "supertypeEntity" attribute
         */
        boolean isSetSupertypeEntity();
        
        /**
         * Sets the "supertypeEntity" attribute
         */
        void setSupertypeEntity(java.lang.String supertypeEntity);
        
        /**
         * Sets (as xml) the "supertypeEntity" attribute
         */
        void xsetSupertypeEntity(org.apache.xmlbeans.XmlNMTOKEN supertypeEntity);
        
        /**
         * Unsets the "supertypeEntity" attribute
         */
        void unsetSupertypeEntity();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.guidewire.datamodel.NonPersistentEntityDocument.NonPersistentEntity newInstance() {
              return (com.guidewire.datamodel.NonPersistentEntityDocument.NonPersistentEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.guidewire.datamodel.NonPersistentEntityDocument.NonPersistentEntity newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.guidewire.datamodel.NonPersistentEntityDocument.NonPersistentEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.guidewire.datamodel.NonPersistentEntityDocument newInstance() {
          return (com.guidewire.datamodel.NonPersistentEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.guidewire.datamodel.NonPersistentEntityDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.guidewire.datamodel.NonPersistentEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.guidewire.datamodel.NonPersistentEntityDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.NonPersistentEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.guidewire.datamodel.NonPersistentEntityDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.NonPersistentEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.guidewire.datamodel.NonPersistentEntityDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.NonPersistentEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.guidewire.datamodel.NonPersistentEntityDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.NonPersistentEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.guidewire.datamodel.NonPersistentEntityDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.NonPersistentEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.guidewire.datamodel.NonPersistentEntityDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.NonPersistentEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.guidewire.datamodel.NonPersistentEntityDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.NonPersistentEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.guidewire.datamodel.NonPersistentEntityDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.NonPersistentEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.guidewire.datamodel.NonPersistentEntityDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.NonPersistentEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.guidewire.datamodel.NonPersistentEntityDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.NonPersistentEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.guidewire.datamodel.NonPersistentEntityDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.NonPersistentEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.guidewire.datamodel.NonPersistentEntityDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.NonPersistentEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.guidewire.datamodel.NonPersistentEntityDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.NonPersistentEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.guidewire.datamodel.NonPersistentEntityDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.NonPersistentEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.NonPersistentEntityDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.NonPersistentEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.NonPersistentEntityDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.NonPersistentEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
