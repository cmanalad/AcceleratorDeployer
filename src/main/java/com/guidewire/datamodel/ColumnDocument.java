/*
 * An XML document type.
 * Localname: column
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.ColumnDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel;


/**
 * A document containing one column(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public interface ColumnDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ColumnDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("columne403doctype");
    
    /**
     * Gets the "column" element
     */
    com.guidewire.datamodel.ColumnDocument.Column getColumn();
    
    /**
     * Sets the "column" element
     */
    void setColumn(com.guidewire.datamodel.ColumnDocument.Column column);
    
    /**
     * Appends and returns a new empty "column" element
     */
    com.guidewire.datamodel.ColumnDocument.Column addNewColumn();
    
    /**
     * An XML column(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public interface Column extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Column.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("column93f5elemtype");
        
        /**
         * Gets array of all "columnParam" elements
         */
        com.guidewire.datamodel.ColumnParamDocument.ColumnParam[] getColumnParamArray();
        
        /**
         * Gets ith "columnParam" element
         */
        com.guidewire.datamodel.ColumnParamDocument.ColumnParam getColumnParamArray(int i);
        
        /**
         * Returns number of "columnParam" element
         */
        int sizeOfColumnParamArray();
        
        /**
         * Sets array of all "columnParam" element
         */
        void setColumnParamArray(com.guidewire.datamodel.ColumnParamDocument.ColumnParam[] columnParamArray);
        
        /**
         * Sets ith "columnParam" element
         */
        void setColumnParamArray(int i, com.guidewire.datamodel.ColumnParamDocument.ColumnParam columnParam);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "columnParam" element
         */
        com.guidewire.datamodel.ColumnParamDocument.ColumnParam insertNewColumnParam(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "columnParam" element
         */
        com.guidewire.datamodel.ColumnParamDocument.ColumnParam addNewColumnParam();
        
        /**
         * Removes the ith "columnParam" element
         */
        void removeColumnParam(int i);
        
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
         * Gets array of all "localization" elements
         */
        com.guidewire.datamodel.LocalizationDocument.Localization[] getLocalizationArray();
        
        /**
         * Gets ith "localization" element
         */
        com.guidewire.datamodel.LocalizationDocument.Localization getLocalizationArray(int i);
        
        /**
         * Returns number of "localization" element
         */
        int sizeOfLocalizationArray();
        
        /**
         * Sets array of all "localization" element
         */
        void setLocalizationArray(com.guidewire.datamodel.LocalizationDocument.Localization[] localizationArray);
        
        /**
         * Sets ith "localization" element
         */
        void setLocalizationArray(int i, com.guidewire.datamodel.LocalizationDocument.Localization localization);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "localization" element
         */
        com.guidewire.datamodel.LocalizationDocument.Localization insertNewLocalization(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "localization" element
         */
        com.guidewire.datamodel.LocalizationDocument.Localization addNewLocalization();
        
        /**
         * Removes the ith "localization" element
         */
        void removeLocalization(int i);
        
        /**
         * Gets the "autoincrement" attribute
         */
        java.lang.String getAutoincrement();
        
        /**
         * Gets (as xml) the "autoincrement" attribute
         */
        org.apache.xmlbeans.XmlNMTOKEN xgetAutoincrement();
        
        /**
         * True if has "autoincrement" attribute
         */
        boolean isSetAutoincrement();
        
        /**
         * Sets the "autoincrement" attribute
         */
        void setAutoincrement(java.lang.String autoincrement);
        
        /**
         * Sets (as xml) the "autoincrement" attribute
         */
        void xsetAutoincrement(org.apache.xmlbeans.XmlNMTOKEN autoincrement);
        
        /**
         * Unsets the "autoincrement" attribute
         */
        void unsetAutoincrement();
        
        /**
         * Gets the "columnName" attribute
         */
        java.lang.String getColumnName();
        
        /**
         * Gets (as xml) the "columnName" attribute
         */
        org.apache.xmlbeans.XmlNMTOKEN xgetColumnName();
        
        /**
         * True if has "columnName" attribute
         */
        boolean isSetColumnName();
        
        /**
         * Sets the "columnName" attribute
         */
        void setColumnName(java.lang.String columnName);
        
        /**
         * Sets (as xml) the "columnName" attribute
         */
        void xsetColumnName(org.apache.xmlbeans.XmlNMTOKEN columnName);
        
        /**
         * Unsets the "columnName" attribute
         */
        void unsetColumnName();
        
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
         * Gets the "default" attribute
         */
        java.lang.String getDefault();
        
        /**
         * Gets (as xml) the "default" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefault();
        
        /**
         * True if has "default" attribute
         */
        boolean isSetDefault();
        
        /**
         * Sets the "default" attribute
         */
        void setDefault(java.lang.String xdefault);
        
        /**
         * Sets (as xml) the "default" attribute
         */
        void xsetDefault(org.apache.xmlbeans.XmlString xdefault);
        
        /**
         * Unsets the "default" attribute
         */
        void unsetDefault();
        
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
         * Gets the "scalable" attribute
         */
        boolean getScalable();
        
        /**
         * Gets (as xml) the "scalable" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetScalable();
        
        /**
         * True if has "scalable" attribute
         */
        boolean isSetScalable();
        
        /**
         * Sets the "scalable" attribute
         */
        void setScalable(boolean scalable);
        
        /**
         * Sets (as xml) the "scalable" attribute
         */
        void xsetScalable(org.apache.xmlbeans.XmlBoolean scalable);
        
        /**
         * Unsets the "scalable" attribute
         */
        void unsetScalable();
        
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
         * Gets the "supportsLinguisticSearch" attribute
         */
        boolean getSupportsLinguisticSearch();
        
        /**
         * Gets (as xml) the "supportsLinguisticSearch" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetSupportsLinguisticSearch();
        
        /**
         * True if has "supportsLinguisticSearch" attribute
         */
        boolean isSetSupportsLinguisticSearch();
        
        /**
         * Sets the "supportsLinguisticSearch" attribute
         */
        void setSupportsLinguisticSearch(boolean supportsLinguisticSearch);
        
        /**
         * Sets (as xml) the "supportsLinguisticSearch" attribute
         */
        void xsetSupportsLinguisticSearch(org.apache.xmlbeans.XmlBoolean supportsLinguisticSearch);
        
        /**
         * Unsets the "supportsLinguisticSearch" attribute
         */
        void unsetSupportsLinguisticSearch();
        
        /**
         * Gets the "type" attribute
         */
        java.lang.String getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        org.apache.xmlbeans.XmlString xgetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(java.lang.String type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(org.apache.xmlbeans.XmlString type);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.guidewire.datamodel.ColumnDocument.Column newInstance() {
              return (com.guidewire.datamodel.ColumnDocument.Column) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.guidewire.datamodel.ColumnDocument.Column newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.guidewire.datamodel.ColumnDocument.Column) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.guidewire.datamodel.ColumnDocument newInstance() {
          return (com.guidewire.datamodel.ColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.guidewire.datamodel.ColumnDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.guidewire.datamodel.ColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.guidewire.datamodel.ColumnDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.guidewire.datamodel.ColumnDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.guidewire.datamodel.ColumnDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.guidewire.datamodel.ColumnDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.guidewire.datamodel.ColumnDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.guidewire.datamodel.ColumnDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.guidewire.datamodel.ColumnDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.guidewire.datamodel.ColumnDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.guidewire.datamodel.ColumnDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.guidewire.datamodel.ColumnDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.guidewire.datamodel.ColumnDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.guidewire.datamodel.ColumnDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.guidewire.datamodel.ColumnDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.guidewire.datamodel.ColumnDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.ColumnDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.ColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.ColumnDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.ColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
