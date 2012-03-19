/*
 * An XML document type.
 * Localname: edgeForeignKey
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.EdgeForeignKeyDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel;


/**
 * A document containing one edgeForeignKey(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public interface EdgeForeignKeyDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EdgeForeignKeyDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("edgeforeignkeyb391doctype");
    
    /**
     * Gets the "edgeForeignKey" element
     */
    com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey getEdgeForeignKey();
    
    /**
     * Sets the "edgeForeignKey" element
     */
    void setEdgeForeignKey(com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey edgeForeignKey);
    
    /**
     * Appends and returns a new empty "edgeForeignKey" element
     */
    com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey addNewEdgeForeignKey();
    
    /**
     * An XML edgeForeignKey(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public interface EdgeForeignKey extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EdgeForeignKey.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("edgeforeignkey80b5elemtype");
        
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
         * Gets the "createhistogram" attribute
         */
        boolean getCreatehistogram();
        
        /**
         * Gets (as xml) the "createhistogram" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetCreatehistogram();
        
        /**
         * True if has "createhistogram" attribute
         */
        boolean isSetCreatehistogram();
        
        /**
         * Sets the "createhistogram" attribute
         */
        void setCreatehistogram(boolean createhistogram);
        
        /**
         * Sets (as xml) the "createhistogram" attribute
         */
        void xsetCreatehistogram(org.apache.xmlbeans.XmlBoolean createhistogram);
        
        /**
         * Unsets the "createhistogram" attribute
         */
        void unsetCreatehistogram();
        
        /**
         * Gets the "deletefk" attribute
         */
        boolean getDeletefk();
        
        /**
         * Gets (as xml) the "deletefk" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetDeletefk();
        
        /**
         * True if has "deletefk" attribute
         */
        boolean isSetDeletefk();
        
        /**
         * Sets the "deletefk" attribute
         */
        void setDeletefk(boolean deletefk);
        
        /**
         * Sets (as xml) the "deletefk" attribute
         */
        void xsetDeletefk(org.apache.xmlbeans.XmlBoolean deletefk);
        
        /**
         * Unsets the "deletefk" attribute
         */
        void unsetDeletefk();
        
        /**
         * Gets the "deprecated" attribute
         */
        boolean getDeprecated();
        
        /**
         * Gets (as xml) the "deprecated" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetDeprecated();
        
        /**
         * True if has "deprecated" attribute
         */
        boolean isSetDeprecated();
        
        /**
         * Sets the "deprecated" attribute
         */
        void setDeprecated(boolean deprecated);
        
        /**
         * Sets (as xml) the "deprecated" attribute
         */
        void xsetDeprecated(org.apache.xmlbeans.XmlBoolean deprecated);
        
        /**
         * Unsets the "deprecated" attribute
         */
        void unsetDeprecated();
        
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
         * Gets the "edgeTableEntityName" attribute
         */
        java.lang.String getEdgeTableEntityName();
        
        /**
         * Gets (as xml) the "edgeTableEntityName" attribute
         */
        org.apache.xmlbeans.XmlNMTOKEN xgetEdgeTableEntityName();
        
        /**
         * True if has "edgeTableEntityName" attribute
         */
        boolean isSetEdgeTableEntityName();
        
        /**
         * Sets the "edgeTableEntityName" attribute
         */
        void setEdgeTableEntityName(java.lang.String edgeTableEntityName);
        
        /**
         * Sets (as xml) the "edgeTableEntityName" attribute
         */
        void xsetEdgeTableEntityName(org.apache.xmlbeans.XmlNMTOKEN edgeTableEntityName);
        
        /**
         * Unsets the "edgeTableEntityName" attribute
         */
        void unsetEdgeTableEntityName();
        
        /**
         * Gets the "edgeTableName" attribute
         */
        java.lang.String getEdgeTableName();
        
        /**
         * Gets (as xml) the "edgeTableName" attribute
         */
        org.apache.xmlbeans.XmlNMTOKEN xgetEdgeTableName();
        
        /**
         * Sets the "edgeTableName" attribute
         */
        void setEdgeTableName(java.lang.String edgeTableName);
        
        /**
         * Sets (as xml) the "edgeTableName" attribute
         */
        void xsetEdgeTableName(org.apache.xmlbeans.XmlNMTOKEN edgeTableName);
        
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
         * Gets the "exportasid" attribute
         */
        boolean getExportasid();
        
        /**
         * Gets (as xml) the "exportasid" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetExportasid();
        
        /**
         * True if has "exportasid" attribute
         */
        boolean isSetExportasid();
        
        /**
         * Sets the "exportasid" attribute
         */
        void setExportasid(boolean exportasid);
        
        /**
         * Sets (as xml) the "exportasid" attribute
         */
        void xsetExportasid(org.apache.xmlbeans.XmlBoolean exportasid);
        
        /**
         * Unsets the "exportasid" attribute
         */
        void unsetExportasid();
        
        /**
         * Gets the "fkentity" attribute
         */
        java.lang.String getFkentity();
        
        /**
         * Gets (as xml) the "fkentity" attribute
         */
        org.apache.xmlbeans.XmlNMTOKEN xgetFkentity();
        
        /**
         * Sets the "fkentity" attribute
         */
        void setFkentity(java.lang.String fkentity);
        
        /**
         * Sets (as xml) the "fkentity" attribute
         */
        void xsetFkentity(org.apache.xmlbeans.XmlNMTOKEN fkentity);
        
        /**
         * Gets the "generateCode" attribute
         */
        boolean getGenerateCode();
        
        /**
         * Gets (as xml) the "generateCode" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetGenerateCode();
        
        /**
         * True if has "generateCode" attribute
         */
        boolean isSetGenerateCode();
        
        /**
         * Sets the "generateCode" attribute
         */
        void setGenerateCode(boolean generateCode);
        
        /**
         * Sets (as xml) the "generateCode" attribute
         */
        void xsetGenerateCode(org.apache.xmlbeans.XmlBoolean generateCode);
        
        /**
         * Unsets the "generateCode" attribute
         */
        void unsetGenerateCode();
        
        /**
         * Gets the "getterScriptability" attribute
         */
        com.guidewire.datamodel.ScriptabilityType.Enum getGetterScriptability();
        
        /**
         * Gets (as xml) the "getterScriptability" attribute
         */
        com.guidewire.datamodel.ScriptabilityType xgetGetterScriptability();
        
        /**
         * True if has "getterScriptability" attribute
         */
        boolean isSetGetterScriptability();
        
        /**
         * Sets the "getterScriptability" attribute
         */
        void setGetterScriptability(com.guidewire.datamodel.ScriptabilityType.Enum getterScriptability);
        
        /**
         * Sets (as xml) the "getterScriptability" attribute
         */
        void xsetGetterScriptability(com.guidewire.datamodel.ScriptabilityType getterScriptability);
        
        /**
         * Unsets the "getterScriptability" attribute
         */
        void unsetGetterScriptability();
        
        /**
         * Gets the "ignoreforevents" attribute
         */
        boolean getIgnoreforevents();
        
        /**
         * Gets (as xml) the "ignoreforevents" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetIgnoreforevents();
        
        /**
         * True if has "ignoreforevents" attribute
         */
        boolean isSetIgnoreforevents();
        
        /**
         * Sets the "ignoreforevents" attribute
         */
        void setIgnoreforevents(boolean ignoreforevents);
        
        /**
         * Sets (as xml) the "ignoreforevents" attribute
         */
        void xsetIgnoreforevents(org.apache.xmlbeans.XmlBoolean ignoreforevents);
        
        /**
         * Unsets the "ignoreforevents" attribute
         */
        void unsetIgnoreforevents();
        
        /**
         * Gets the "importableagainstexistingobject" attribute
         */
        boolean getImportableagainstexistingobject();
        
        /**
         * Gets (as xml) the "importableagainstexistingobject" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetImportableagainstexistingobject();
        
        /**
         * True if has "importableagainstexistingobject" attribute
         */
        boolean isSetImportableagainstexistingobject();
        
        /**
         * Sets the "importableagainstexistingobject" attribute
         */
        void setImportableagainstexistingobject(boolean importableagainstexistingobject);
        
        /**
         * Sets (as xml) the "importableagainstexistingobject" attribute
         */
        void xsetImportableagainstexistingobject(org.apache.xmlbeans.XmlBoolean importableagainstexistingobject);
        
        /**
         * Unsets the "importableagainstexistingobject" attribute
         */
        void unsetImportableagainstexistingobject();
        
        /**
         * Gets the "loadable" attribute
         */
        boolean getLoadable();
        
        /**
         * Gets (as xml) the "loadable" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetLoadable();
        
        /**
         * True if has "loadable" attribute
         */
        boolean isSetLoadable();
        
        /**
         * Sets the "loadable" attribute
         */
        void setLoadable(boolean loadable);
        
        /**
         * Sets (as xml) the "loadable" attribute
         */
        void xsetLoadable(org.apache.xmlbeans.XmlBoolean loadable);
        
        /**
         * Unsets the "loadable" attribute
         */
        void unsetLoadable();
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlNMTOKEN xgetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlNMTOKEN name);
        
        /**
         * Gets the "nullok" attribute
         */
        boolean getNullok();
        
        /**
         * Gets (as xml) the "nullok" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetNullok();
        
        /**
         * True if has "nullok" attribute
         */
        boolean isSetNullok();
        
        /**
         * Sets the "nullok" attribute
         */
        void setNullok(boolean nullok);
        
        /**
         * Sets (as xml) the "nullok" attribute
         */
        void xsetNullok(org.apache.xmlbeans.XmlBoolean nullok);
        
        /**
         * Unsets the "nullok" attribute
         */
        void unsetNullok();
        
        /**
         * Gets the "ondelete" attribute
         */
        com.guidewire.datamodel.OnDelete.Enum getOndelete();
        
        /**
         * Gets (as xml) the "ondelete" attribute
         */
        com.guidewire.datamodel.OnDelete xgetOndelete();
        
        /**
         * True if has "ondelete" attribute
         */
        boolean isSetOndelete();
        
        /**
         * Sets the "ondelete" attribute
         */
        void setOndelete(com.guidewire.datamodel.OnDelete.Enum ondelete);
        
        /**
         * Sets (as xml) the "ondelete" attribute
         */
        void xsetOndelete(com.guidewire.datamodel.OnDelete ondelete);
        
        /**
         * Unsets the "ondelete" attribute
         */
        void unsetOndelete();
        
        /**
         * Gets the "overwrittenInStagingTable" attribute
         */
        boolean getOverwrittenInStagingTable();
        
        /**
         * Gets (as xml) the "overwrittenInStagingTable" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetOverwrittenInStagingTable();
        
        /**
         * True if has "overwrittenInStagingTable" attribute
         */
        boolean isSetOverwrittenInStagingTable();
        
        /**
         * Sets the "overwrittenInStagingTable" attribute
         */
        void setOverwrittenInStagingTable(boolean overwrittenInStagingTable);
        
        /**
         * Sets (as xml) the "overwrittenInStagingTable" attribute
         */
        void xsetOverwrittenInStagingTable(org.apache.xmlbeans.XmlBoolean overwrittenInStagingTable);
        
        /**
         * Unsets the "overwrittenInStagingTable" attribute
         */
        void unsetOverwrittenInStagingTable();
        
        /**
         * Gets the "setterScriptability" attribute
         */
        com.guidewire.datamodel.ScriptabilityType.Enum getSetterScriptability();
        
        /**
         * Gets (as xml) the "setterScriptability" attribute
         */
        com.guidewire.datamodel.ScriptabilityType xgetSetterScriptability();
        
        /**
         * True if has "setterScriptability" attribute
         */
        boolean isSetSetterScriptability();
        
        /**
         * Sets the "setterScriptability" attribute
         */
        void setSetterScriptability(com.guidewire.datamodel.ScriptabilityType.Enum setterScriptability);
        
        /**
         * Sets (as xml) the "setterScriptability" attribute
         */
        void xsetSetterScriptability(com.guidewire.datamodel.ScriptabilityType setterScriptability);
        
        /**
         * Unsets the "setterScriptability" attribute
         */
        void unsetSetterScriptability();
        
        /**
         * Gets the "soapnullok" attribute
         */
        boolean getSoapnullok();
        
        /**
         * Gets (as xml) the "soapnullok" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetSoapnullok();
        
        /**
         * True if has "soapnullok" attribute
         */
        boolean isSetSoapnullok();
        
        /**
         * Sets the "soapnullok" attribute
         */
        void setSoapnullok(boolean soapnullok);
        
        /**
         * Sets (as xml) the "soapnullok" attribute
         */
        void xsetSoapnullok(org.apache.xmlbeans.XmlBoolean soapnullok);
        
        /**
         * Unsets the "soapnullok" attribute
         */
        void unsetSoapnullok();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey newInstance() {
              return (com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.guidewire.datamodel.EdgeForeignKeyDocument.EdgeForeignKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.guidewire.datamodel.EdgeForeignKeyDocument newInstance() {
          return (com.guidewire.datamodel.EdgeForeignKeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.guidewire.datamodel.EdgeForeignKeyDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.guidewire.datamodel.EdgeForeignKeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.guidewire.datamodel.EdgeForeignKeyDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.EdgeForeignKeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.guidewire.datamodel.EdgeForeignKeyDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.EdgeForeignKeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.guidewire.datamodel.EdgeForeignKeyDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.EdgeForeignKeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.guidewire.datamodel.EdgeForeignKeyDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.EdgeForeignKeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.guidewire.datamodel.EdgeForeignKeyDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.EdgeForeignKeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.guidewire.datamodel.EdgeForeignKeyDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.EdgeForeignKeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.guidewire.datamodel.EdgeForeignKeyDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.EdgeForeignKeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.guidewire.datamodel.EdgeForeignKeyDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.EdgeForeignKeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.guidewire.datamodel.EdgeForeignKeyDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.EdgeForeignKeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.guidewire.datamodel.EdgeForeignKeyDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.EdgeForeignKeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.guidewire.datamodel.EdgeForeignKeyDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.EdgeForeignKeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.guidewire.datamodel.EdgeForeignKeyDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.EdgeForeignKeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.guidewire.datamodel.EdgeForeignKeyDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.EdgeForeignKeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.guidewire.datamodel.EdgeForeignKeyDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.EdgeForeignKeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.EdgeForeignKeyDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.EdgeForeignKeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.EdgeForeignKeyDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.EdgeForeignKeyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
