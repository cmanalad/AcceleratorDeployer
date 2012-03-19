/*
 * An XML document type.
 * Localname: index
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.IndexDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel;


/**
 * A document containing one index(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public interface IndexDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndexDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("indexdfd9doctype");
    
    /**
     * Gets the "index" element
     */
    com.guidewire.datamodel.IndexDocument.Index getIndex();
    
    /**
     * Sets the "index" element
     */
    void setIndex(com.guidewire.datamodel.IndexDocument.Index index);
    
    /**
     * Appends and returns a new empty "index" element
     */
    com.guidewire.datamodel.IndexDocument.Index addNewIndex();
    
    /**
     * An XML index(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public interface Index extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Index.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("index96dbelemtype");
        
        /**
         * Gets array of all "forceindex" elements
         */
        com.guidewire.datamodel.ForceindexDocument.Forceindex[] getForceindexArray();
        
        /**
         * Gets ith "forceindex" element
         */
        com.guidewire.datamodel.ForceindexDocument.Forceindex getForceindexArray(int i);
        
        /**
         * Returns number of "forceindex" element
         */
        int sizeOfForceindexArray();
        
        /**
         * Sets array of all "forceindex" element
         */
        void setForceindexArray(com.guidewire.datamodel.ForceindexDocument.Forceindex[] forceindexArray);
        
        /**
         * Sets ith "forceindex" element
         */
        void setForceindexArray(int i, com.guidewire.datamodel.ForceindexDocument.Forceindex forceindex);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "forceindex" element
         */
        com.guidewire.datamodel.ForceindexDocument.Forceindex insertNewForceindex(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "forceindex" element
         */
        com.guidewire.datamodel.ForceindexDocument.Forceindex addNewForceindex();
        
        /**
         * Removes the ith "forceindex" element
         */
        void removeForceindex(int i);
        
        /**
         * Gets array of all "indexcol" elements
         */
        com.guidewire.datamodel.IndexcolDocument.Indexcol[] getIndexcolArray();
        
        /**
         * Gets ith "indexcol" element
         */
        com.guidewire.datamodel.IndexcolDocument.Indexcol getIndexcolArray(int i);
        
        /**
         * Returns number of "indexcol" element
         */
        int sizeOfIndexcolArray();
        
        /**
         * Sets array of all "indexcol" element
         */
        void setIndexcolArray(com.guidewire.datamodel.IndexcolDocument.Indexcol[] indexcolArray);
        
        /**
         * Sets ith "indexcol" element
         */
        void setIndexcolArray(int i, com.guidewire.datamodel.IndexcolDocument.Indexcol indexcol);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "indexcol" element
         */
        com.guidewire.datamodel.IndexcolDocument.Indexcol insertNewIndexcol(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "indexcol" element
         */
        com.guidewire.datamodel.IndexcolDocument.Indexcol addNewIndexcol();
        
        /**
         * Removes the ith "indexcol" element
         */
        void removeIndexcol(int i);
        
        /**
         * Gets the "clustered" attribute
         */
        boolean getClustered();
        
        /**
         * Gets (as xml) the "clustered" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetClustered();
        
        /**
         * True if has "clustered" attribute
         */
        boolean isSetClustered();
        
        /**
         * Sets the "clustered" attribute
         */
        void setClustered(boolean clustered);
        
        /**
         * Sets (as xml) the "clustered" attribute
         */
        void xsetClustered(org.apache.xmlbeans.XmlBoolean clustered);
        
        /**
         * Unsets the "clustered" attribute
         */
        void unsetClustered();
        
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
         * Gets the "expectedtobecovering" attribute
         */
        boolean getExpectedtobecovering();
        
        /**
         * Gets (as xml) the "expectedtobecovering" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetExpectedtobecovering();
        
        /**
         * True if has "expectedtobecovering" attribute
         */
        boolean isSetExpectedtobecovering();
        
        /**
         * Sets the "expectedtobecovering" attribute
         */
        void setExpectedtobecovering(boolean expectedtobecovering);
        
        /**
         * Sets (as xml) the "expectedtobecovering" attribute
         */
        void xsetExpectedtobecovering(org.apache.xmlbeans.XmlBoolean expectedtobecovering);
        
        /**
         * Unsets the "expectedtobecovering" attribute
         */
        void unsetExpectedtobecovering();
        
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
         * Gets the "trackUsage" attribute
         */
        boolean getTrackUsage();
        
        /**
         * Gets (as xml) the "trackUsage" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetTrackUsage();
        
        /**
         * True if has "trackUsage" attribute
         */
        boolean isSetTrackUsage();
        
        /**
         * Sets the "trackUsage" attribute
         */
        void setTrackUsage(boolean trackUsage);
        
        /**
         * Sets (as xml) the "trackUsage" attribute
         */
        void xsetTrackUsage(org.apache.xmlbeans.XmlBoolean trackUsage);
        
        /**
         * Unsets the "trackUsage" attribute
         */
        void unsetTrackUsage();
        
        /**
         * Gets the "unique" attribute
         */
        boolean getUnique();
        
        /**
         * Gets (as xml) the "unique" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetUnique();
        
        /**
         * True if has "unique" attribute
         */
        boolean isSetUnique();
        
        /**
         * Sets the "unique" attribute
         */
        void setUnique(boolean unique);
        
        /**
         * Sets (as xml) the "unique" attribute
         */
        void xsetUnique(org.apache.xmlbeans.XmlBoolean unique);
        
        /**
         * Unsets the "unique" attribute
         */
        void unsetUnique();
        
        /**
         * Gets the "verifyInLoader" attribute
         */
        boolean getVerifyInLoader();
        
        /**
         * Gets (as xml) the "verifyInLoader" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetVerifyInLoader();
        
        /**
         * True if has "verifyInLoader" attribute
         */
        boolean isSetVerifyInLoader();
        
        /**
         * Sets the "verifyInLoader" attribute
         */
        void setVerifyInLoader(boolean verifyInLoader);
        
        /**
         * Sets (as xml) the "verifyInLoader" attribute
         */
        void xsetVerifyInLoader(org.apache.xmlbeans.XmlBoolean verifyInLoader);
        
        /**
         * Unsets the "verifyInLoader" attribute
         */
        void unsetVerifyInLoader();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.guidewire.datamodel.IndexDocument.Index newInstance() {
              return (com.guidewire.datamodel.IndexDocument.Index) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.guidewire.datamodel.IndexDocument.Index newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.guidewire.datamodel.IndexDocument.Index) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.guidewire.datamodel.IndexDocument newInstance() {
          return (com.guidewire.datamodel.IndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.guidewire.datamodel.IndexDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.guidewire.datamodel.IndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.guidewire.datamodel.IndexDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.IndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.guidewire.datamodel.IndexDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.IndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.guidewire.datamodel.IndexDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.IndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.guidewire.datamodel.IndexDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.IndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.guidewire.datamodel.IndexDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.IndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.guidewire.datamodel.IndexDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.IndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.guidewire.datamodel.IndexDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.IndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.guidewire.datamodel.IndexDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.IndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.guidewire.datamodel.IndexDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.IndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.guidewire.datamodel.IndexDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.IndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.guidewire.datamodel.IndexDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.IndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.guidewire.datamodel.IndexDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.IndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.guidewire.datamodel.IndexDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.IndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.guidewire.datamodel.IndexDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.IndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.IndexDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.IndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.IndexDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.IndexDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
