/*
 * An XML document type.
 * Localname: datetimeordering
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.DatetimeorderingDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel;


/**
 * A document containing one datetimeordering(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public interface DatetimeorderingDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DatetimeorderingDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("datetimeorderingdd2adoctype");
    
    /**
     * Gets the "datetimeordering" element
     */
    com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering getDatetimeordering();
    
    /**
     * Sets the "datetimeordering" element
     */
    void setDatetimeordering(com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering datetimeordering);
    
    /**
     * Appends and returns a new empty "datetimeordering" element
     */
    com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering addNewDatetimeordering();
    
    /**
     * An XML datetimeordering(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public interface Datetimeordering extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Datetimeordering.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("datetimeorderingbb55elemtype");
        
        /**
         * Gets the "firstcolumnname" attribute
         */
        java.lang.String getFirstcolumnname();
        
        /**
         * Gets (as xml) the "firstcolumnname" attribute
         */
        org.apache.xmlbeans.XmlNMTOKEN xgetFirstcolumnname();
        
        /**
         * Sets the "firstcolumnname" attribute
         */
        void setFirstcolumnname(java.lang.String firstcolumnname);
        
        /**
         * Sets (as xml) the "firstcolumnname" attribute
         */
        void xsetFirstcolumnname(org.apache.xmlbeans.XmlNMTOKEN firstcolumnname);
        
        /**
         * Gets the "operator" attribute
         */
        com.guidewire.datamodel.Operator.Enum getOperator();
        
        /**
         * Gets (as xml) the "operator" attribute
         */
        com.guidewire.datamodel.Operator xgetOperator();
        
        /**
         * Sets the "operator" attribute
         */
        void setOperator(com.guidewire.datamodel.Operator.Enum operator);
        
        /**
         * Sets (as xml) the "operator" attribute
         */
        void xsetOperator(com.guidewire.datamodel.Operator operator);
        
        /**
         * Gets the "secondcolumnname" attribute
         */
        java.lang.String getSecondcolumnname();
        
        /**
         * Gets (as xml) the "secondcolumnname" attribute
         */
        org.apache.xmlbeans.XmlNMTOKEN xgetSecondcolumnname();
        
        /**
         * Sets the "secondcolumnname" attribute
         */
        void setSecondcolumnname(java.lang.String secondcolumnname);
        
        /**
         * Sets (as xml) the "secondcolumnname" attribute
         */
        void xsetSecondcolumnname(org.apache.xmlbeans.XmlNMTOKEN secondcolumnname);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering newInstance() {
              return (com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.guidewire.datamodel.DatetimeorderingDocument newInstance() {
          return (com.guidewire.datamodel.DatetimeorderingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.guidewire.datamodel.DatetimeorderingDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.guidewire.datamodel.DatetimeorderingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.guidewire.datamodel.DatetimeorderingDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.DatetimeorderingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.guidewire.datamodel.DatetimeorderingDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.DatetimeorderingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.guidewire.datamodel.DatetimeorderingDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.DatetimeorderingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.guidewire.datamodel.DatetimeorderingDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.DatetimeorderingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.guidewire.datamodel.DatetimeorderingDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.DatetimeorderingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.guidewire.datamodel.DatetimeorderingDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.DatetimeorderingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.guidewire.datamodel.DatetimeorderingDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.DatetimeorderingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.guidewire.datamodel.DatetimeorderingDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.DatetimeorderingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.guidewire.datamodel.DatetimeorderingDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.DatetimeorderingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.guidewire.datamodel.DatetimeorderingDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.DatetimeorderingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.guidewire.datamodel.DatetimeorderingDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.DatetimeorderingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.guidewire.datamodel.DatetimeorderingDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.DatetimeorderingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.guidewire.datamodel.DatetimeorderingDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.DatetimeorderingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.guidewire.datamodel.DatetimeorderingDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.DatetimeorderingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.DatetimeorderingDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.DatetimeorderingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.DatetimeorderingDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.DatetimeorderingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
