/*
 * An XML document type.
 * Localname: matchingcolumn
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.MatchingcolumnDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel;


/**
 * A document containing one matchingcolumn(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public interface MatchingcolumnDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MatchingcolumnDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("matchingcolumncb26doctype");
    
    /**
     * Gets the "matchingcolumn" element
     */
    com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn getMatchingcolumn();
    
    /**
     * Sets the "matchingcolumn" element
     */
    void setMatchingcolumn(com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn matchingcolumn);
    
    /**
     * Appends and returns a new empty "matchingcolumn" element
     */
    com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn addNewMatchingcolumn();
    
    /**
     * An XML matchingcolumn(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public interface Matchingcolumn extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Matchingcolumn.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("matchingcolumnfd55elemtype");
        
        /**
         * Gets the "joincolumn" attribute
         */
        java.lang.String getJoincolumn();
        
        /**
         * Gets (as xml) the "joincolumn" attribute
         */
        org.apache.xmlbeans.XmlNMTOKEN xgetJoincolumn();
        
        /**
         * Sets the "joincolumn" attribute
         */
        void setJoincolumn(java.lang.String joincolumn);
        
        /**
         * Sets (as xml) the "joincolumn" attribute
         */
        void xsetJoincolumn(org.apache.xmlbeans.XmlNMTOKEN joincolumn);
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn newInstance() {
              return (com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.guidewire.datamodel.MatchingcolumnDocument.Matchingcolumn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.guidewire.datamodel.MatchingcolumnDocument newInstance() {
          return (com.guidewire.datamodel.MatchingcolumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.guidewire.datamodel.MatchingcolumnDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.guidewire.datamodel.MatchingcolumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.guidewire.datamodel.MatchingcolumnDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.MatchingcolumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.guidewire.datamodel.MatchingcolumnDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.MatchingcolumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.guidewire.datamodel.MatchingcolumnDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.MatchingcolumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.guidewire.datamodel.MatchingcolumnDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.MatchingcolumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.guidewire.datamodel.MatchingcolumnDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.MatchingcolumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.guidewire.datamodel.MatchingcolumnDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.MatchingcolumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.guidewire.datamodel.MatchingcolumnDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.MatchingcolumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.guidewire.datamodel.MatchingcolumnDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.MatchingcolumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.guidewire.datamodel.MatchingcolumnDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.MatchingcolumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.guidewire.datamodel.MatchingcolumnDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.MatchingcolumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.guidewire.datamodel.MatchingcolumnDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.MatchingcolumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.guidewire.datamodel.MatchingcolumnDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.MatchingcolumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.guidewire.datamodel.MatchingcolumnDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.MatchingcolumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.guidewire.datamodel.MatchingcolumnDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.MatchingcolumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.MatchingcolumnDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.MatchingcolumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.MatchingcolumnDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.MatchingcolumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
