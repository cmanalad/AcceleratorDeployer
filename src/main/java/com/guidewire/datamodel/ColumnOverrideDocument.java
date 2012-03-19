/*
 * An XML document type.
 * Localname: column-override
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.ColumnOverrideDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel;


/**
 * A document containing one column-override(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public interface ColumnOverrideDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ColumnOverrideDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("columnoverridec6e8doctype");
    
    /**
     * Gets the "column-override" element
     */
    com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride getColumnOverride();
    
    /**
     * Sets the "column-override" element
     */
    void setColumnOverride(com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride columnOverride);
    
    /**
     * Appends and returns a new empty "column-override" element
     */
    com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride addNewColumnOverride();
    
    /**
     * An XML column-override(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public interface ColumnOverride extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ColumnOverride.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("columnoverride39f9elemtype");
        
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
         * True if has "type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(java.lang.String type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(org.apache.xmlbeans.XmlString type);
        
        /**
         * Unsets the "type" attribute
         */
        void unsetType();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride newInstance() {
              return (com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.guidewire.datamodel.ColumnOverrideDocument.ColumnOverride) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.guidewire.datamodel.ColumnOverrideDocument newInstance() {
          return (com.guidewire.datamodel.ColumnOverrideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.guidewire.datamodel.ColumnOverrideDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.guidewire.datamodel.ColumnOverrideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.guidewire.datamodel.ColumnOverrideDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ColumnOverrideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.guidewire.datamodel.ColumnOverrideDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ColumnOverrideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.guidewire.datamodel.ColumnOverrideDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ColumnOverrideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.guidewire.datamodel.ColumnOverrideDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ColumnOverrideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.guidewire.datamodel.ColumnOverrideDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ColumnOverrideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.guidewire.datamodel.ColumnOverrideDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ColumnOverrideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.guidewire.datamodel.ColumnOverrideDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ColumnOverrideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.guidewire.datamodel.ColumnOverrideDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ColumnOverrideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.guidewire.datamodel.ColumnOverrideDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ColumnOverrideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.guidewire.datamodel.ColumnOverrideDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ColumnOverrideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.guidewire.datamodel.ColumnOverrideDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ColumnOverrideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.guidewire.datamodel.ColumnOverrideDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ColumnOverrideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.guidewire.datamodel.ColumnOverrideDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ColumnOverrideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.guidewire.datamodel.ColumnOverrideDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ColumnOverrideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.ColumnOverrideDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.ColumnOverrideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.ColumnOverrideDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.ColumnOverrideDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
