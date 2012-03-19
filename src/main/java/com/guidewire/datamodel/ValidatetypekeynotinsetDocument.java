/*
 * An XML document type.
 * Localname: validatetypekeynotinset
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.ValidatetypekeynotinsetDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel;


/**
 * A document containing one validatetypekeynotinset(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public interface ValidatetypekeynotinsetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ValidatetypekeynotinsetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("validatetypekeynotinset3d52doctype");
    
    /**
     * Gets the "validatetypekeynotinset" element
     */
    com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset getValidatetypekeynotinset();
    
    /**
     * Sets the "validatetypekeynotinset" element
     */
    void setValidatetypekeynotinset(com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset validatetypekeynotinset);
    
    /**
     * Appends and returns a new empty "validatetypekeynotinset" element
     */
    com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset addNewValidatetypekeynotinset();
    
    /**
     * An XML validatetypekeynotinset(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public interface Validatetypekeynotinset extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Validatetypekeynotinset.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("validatetypekeynotinset664delemtype");
        
        /**
         * Gets array of all "typecodes" elements
         */
        com.guidewire.datamodel.TypecodesDocument.Typecodes[] getTypecodesArray();
        
        /**
         * Gets ith "typecodes" element
         */
        com.guidewire.datamodel.TypecodesDocument.Typecodes getTypecodesArray(int i);
        
        /**
         * Returns number of "typecodes" element
         */
        int sizeOfTypecodesArray();
        
        /**
         * Sets array of all "typecodes" element
         */
        void setTypecodesArray(com.guidewire.datamodel.TypecodesDocument.Typecodes[] typecodesArray);
        
        /**
         * Sets ith "typecodes" element
         */
        void setTypecodesArray(int i, com.guidewire.datamodel.TypecodesDocument.Typecodes typecodes);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "typecodes" element
         */
        com.guidewire.datamodel.TypecodesDocument.Typecodes insertNewTypecodes(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "typecodes" element
         */
        com.guidewire.datamodel.TypecodesDocument.Typecodes addNewTypecodes();
        
        /**
         * Removes the ith "typecodes" element
         */
        void removeTypecodes(int i);
        
        /**
         * Gets the "columnname" attribute
         */
        java.lang.String getColumnname();
        
        /**
         * Gets (as xml) the "columnname" attribute
         */
        org.apache.xmlbeans.XmlNMTOKEN xgetColumnname();
        
        /**
         * Sets the "columnname" attribute
         */
        void setColumnname(java.lang.String columnname);
        
        /**
         * Sets (as xml) the "columnname" attribute
         */
        void xsetColumnname(org.apache.xmlbeans.XmlNMTOKEN columnname);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset newInstance() {
              return (com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.guidewire.datamodel.ValidatetypekeynotinsetDocument.Validatetypekeynotinset) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.guidewire.datamodel.ValidatetypekeynotinsetDocument newInstance() {
          return (com.guidewire.datamodel.ValidatetypekeynotinsetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.guidewire.datamodel.ValidatetypekeynotinsetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.guidewire.datamodel.ValidatetypekeynotinsetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.guidewire.datamodel.ValidatetypekeynotinsetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ValidatetypekeynotinsetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.guidewire.datamodel.ValidatetypekeynotinsetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ValidatetypekeynotinsetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.guidewire.datamodel.ValidatetypekeynotinsetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ValidatetypekeynotinsetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.guidewire.datamodel.ValidatetypekeynotinsetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ValidatetypekeynotinsetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.guidewire.datamodel.ValidatetypekeynotinsetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ValidatetypekeynotinsetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.guidewire.datamodel.ValidatetypekeynotinsetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ValidatetypekeynotinsetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.guidewire.datamodel.ValidatetypekeynotinsetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ValidatetypekeynotinsetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.guidewire.datamodel.ValidatetypekeynotinsetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ValidatetypekeynotinsetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.guidewire.datamodel.ValidatetypekeynotinsetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ValidatetypekeynotinsetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.guidewire.datamodel.ValidatetypekeynotinsetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ValidatetypekeynotinsetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.guidewire.datamodel.ValidatetypekeynotinsetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ValidatetypekeynotinsetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.guidewire.datamodel.ValidatetypekeynotinsetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ValidatetypekeynotinsetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.guidewire.datamodel.ValidatetypekeynotinsetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ValidatetypekeynotinsetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.guidewire.datamodel.ValidatetypekeynotinsetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ValidatetypekeynotinsetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.ValidatetypekeynotinsetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.ValidatetypekeynotinsetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.ValidatetypekeynotinsetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.ValidatetypekeynotinsetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
