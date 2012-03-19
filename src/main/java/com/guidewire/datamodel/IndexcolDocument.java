/*
 * An XML document type.
 * Localname: indexcol
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.IndexcolDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel;


/**
 * A document containing one indexcol(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public interface IndexcolDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndexcolDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("indexcol372bdoctype");
    
    /**
     * Gets the "indexcol" element
     */
    com.guidewire.datamodel.IndexcolDocument.Indexcol getIndexcol();
    
    /**
     * Sets the "indexcol" element
     */
    void setIndexcol(com.guidewire.datamodel.IndexcolDocument.Indexcol indexcol);
    
    /**
     * Appends and returns a new empty "indexcol" element
     */
    com.guidewire.datamodel.IndexcolDocument.Indexcol addNewIndexcol();
    
    /**
     * An XML indexcol(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public interface Indexcol extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Indexcol.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("indexcol4ab5elemtype");
        
        /**
         * Gets the "keyposition" attribute
         */
        java.math.BigInteger getKeyposition();
        
        /**
         * Gets (as xml) the "keyposition" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetKeyposition();
        
        /**
         * Sets the "keyposition" attribute
         */
        void setKeyposition(java.math.BigInteger keyposition);
        
        /**
         * Sets (as xml) the "keyposition" attribute
         */
        void xsetKeyposition(org.apache.xmlbeans.XmlInteger keyposition);
        
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
         * Gets the "sortascending" attribute
         */
        boolean getSortascending();
        
        /**
         * Gets (as xml) the "sortascending" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetSortascending();
        
        /**
         * True if has "sortascending" attribute
         */
        boolean isSetSortascending();
        
        /**
         * Sets the "sortascending" attribute
         */
        void setSortascending(boolean sortascending);
        
        /**
         * Sets (as xml) the "sortascending" attribute
         */
        void xsetSortascending(org.apache.xmlbeans.XmlBoolean sortascending);
        
        /**
         * Unsets the "sortascending" attribute
         */
        void unsetSortascending();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.guidewire.datamodel.IndexcolDocument.Indexcol newInstance() {
              return (com.guidewire.datamodel.IndexcolDocument.Indexcol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.guidewire.datamodel.IndexcolDocument.Indexcol newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.guidewire.datamodel.IndexcolDocument.Indexcol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.guidewire.datamodel.IndexcolDocument newInstance() {
          return (com.guidewire.datamodel.IndexcolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.guidewire.datamodel.IndexcolDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.guidewire.datamodel.IndexcolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.guidewire.datamodel.IndexcolDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.IndexcolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.guidewire.datamodel.IndexcolDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.IndexcolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.guidewire.datamodel.IndexcolDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.IndexcolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.guidewire.datamodel.IndexcolDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.IndexcolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.guidewire.datamodel.IndexcolDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.IndexcolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.guidewire.datamodel.IndexcolDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.IndexcolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.guidewire.datamodel.IndexcolDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.IndexcolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.guidewire.datamodel.IndexcolDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.IndexcolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.guidewire.datamodel.IndexcolDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.IndexcolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.guidewire.datamodel.IndexcolDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.IndexcolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.guidewire.datamodel.IndexcolDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.IndexcolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.guidewire.datamodel.IndexcolDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.IndexcolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.guidewire.datamodel.IndexcolDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.IndexcolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.guidewire.datamodel.IndexcolDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.IndexcolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.IndexcolDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.IndexcolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.IndexcolDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.IndexcolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
