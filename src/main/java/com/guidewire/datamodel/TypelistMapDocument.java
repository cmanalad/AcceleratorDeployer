/*
 * An XML document type.
 * Localname: typelist-map
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.TypelistMapDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel;


/**
 * A document containing one typelist-map(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public interface TypelistMapDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TypelistMapDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("typelistmap0b12doctype");
    
    /**
     * Gets the "typelist-map" element
     */
    com.guidewire.datamodel.TypelistMapDocument.TypelistMap getTypelistMap();
    
    /**
     * Sets the "typelist-map" element
     */
    void setTypelistMap(com.guidewire.datamodel.TypelistMapDocument.TypelistMap typelistMap);
    
    /**
     * Appends and returns a new empty "typelist-map" element
     */
    com.guidewire.datamodel.TypelistMapDocument.TypelistMap addNewTypelistMap();
    
    /**
     * An XML typelist-map(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public interface TypelistMap extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TypelistMap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("typelistmapc355elemtype");
        
        /**
         * Gets the "customAccessor" attribute
         */
        java.lang.String getCustomAccessor();
        
        /**
         * Gets (as xml) the "customAccessor" attribute
         */
        org.apache.xmlbeans.XmlString xgetCustomAccessor();
        
        /**
         * True if has "customAccessor" attribute
         */
        boolean isSetCustomAccessor();
        
        /**
         * Sets the "customAccessor" attribute
         */
        void setCustomAccessor(java.lang.String customAccessor);
        
        /**
         * Sets (as xml) the "customAccessor" attribute
         */
        void xsetCustomAccessor(org.apache.xmlbeans.XmlString customAccessor);
        
        /**
         * Unsets the "customAccessor" attribute
         */
        void unsetCustomAccessor();
        
        /**
         * Gets the "field" attribute
         */
        java.lang.String getField();
        
        /**
         * Gets (as xml) the "field" attribute
         */
        org.apache.xmlbeans.XmlString xgetField();
        
        /**
         * Sets the "field" attribute
         */
        void setField(java.lang.String field);
        
        /**
         * Sets (as xml) the "field" attribute
         */
        void xsetField(org.apache.xmlbeans.XmlString field);
        
        /**
         * Gets the "propertyPrefix" attribute
         */
        java.lang.String getPropertyPrefix();
        
        /**
         * Gets (as xml) the "propertyPrefix" attribute
         */
        org.apache.xmlbeans.XmlString xgetPropertyPrefix();
        
        /**
         * True if has "propertyPrefix" attribute
         */
        boolean isSetPropertyPrefix();
        
        /**
         * Sets the "propertyPrefix" attribute
         */
        void setPropertyPrefix(java.lang.String propertyPrefix);
        
        /**
         * Sets (as xml) the "propertyPrefix" attribute
         */
        void xsetPropertyPrefix(org.apache.xmlbeans.XmlString propertyPrefix);
        
        /**
         * Unsets the "propertyPrefix" attribute
         */
        void unsetPropertyPrefix();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.guidewire.datamodel.TypelistMapDocument.TypelistMap newInstance() {
              return (com.guidewire.datamodel.TypelistMapDocument.TypelistMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.guidewire.datamodel.TypelistMapDocument.TypelistMap newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.guidewire.datamodel.TypelistMapDocument.TypelistMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.guidewire.datamodel.TypelistMapDocument newInstance() {
          return (com.guidewire.datamodel.TypelistMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.guidewire.datamodel.TypelistMapDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.guidewire.datamodel.TypelistMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.guidewire.datamodel.TypelistMapDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.TypelistMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.guidewire.datamodel.TypelistMapDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.TypelistMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.guidewire.datamodel.TypelistMapDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.TypelistMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.guidewire.datamodel.TypelistMapDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.TypelistMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.guidewire.datamodel.TypelistMapDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.TypelistMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.guidewire.datamodel.TypelistMapDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.TypelistMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.guidewire.datamodel.TypelistMapDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.TypelistMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.guidewire.datamodel.TypelistMapDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.TypelistMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.guidewire.datamodel.TypelistMapDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.TypelistMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.guidewire.datamodel.TypelistMapDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.TypelistMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.guidewire.datamodel.TypelistMapDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.TypelistMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.guidewire.datamodel.TypelistMapDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.TypelistMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.guidewire.datamodel.TypelistMapDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.TypelistMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.guidewire.datamodel.TypelistMapDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.TypelistMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.TypelistMapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.TypelistMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.TypelistMapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.TypelistMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
