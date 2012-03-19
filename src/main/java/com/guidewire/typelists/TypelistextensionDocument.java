/*
 * An XML document type.
 * Localname: typelistextension
 * Namespace: http://guidewire.com/typelists
 * Java type: com.guidewire.typelists.TypelistextensionDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.typelists;


/**
 * A document containing one typelistextension(@http://guidewire.com/typelists) element.
 *
 * This is a complex type.
 */
public interface TypelistextensionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TypelistextensionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("typelistextensionef00doctype");
    
    /**
     * Gets the "typelistextension" element
     */
    com.guidewire.typelists.TypelistextensionDocument.Typelistextension getTypelistextension();
    
    /**
     * Sets the "typelistextension" element
     */
    void setTypelistextension(com.guidewire.typelists.TypelistextensionDocument.Typelistextension typelistextension);
    
    /**
     * Appends and returns a new empty "typelistextension" element
     */
    com.guidewire.typelists.TypelistextensionDocument.Typelistextension addNewTypelistextension();
    
    /**
     * An XML typelistextension(@http://guidewire.com/typelists).
     *
     * This is a complex type.
     */
    public interface Typelistextension extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Typelistextension.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("typelistextension754delemtype");
        
        /**
         * Gets array of all "typecode" elements
         */
        com.guidewire.typelists.TypecodeDocument.Typecode[] getTypecodeArray();
        
        /**
         * Gets ith "typecode" element
         */
        com.guidewire.typelists.TypecodeDocument.Typecode getTypecodeArray(int i);
        
        /**
         * Returns number of "typecode" element
         */
        int sizeOfTypecodeArray();
        
        /**
         * Sets array of all "typecode" element
         */
        void setTypecodeArray(com.guidewire.typelists.TypecodeDocument.Typecode[] typecodeArray);
        
        /**
         * Sets ith "typecode" element
         */
        void setTypecodeArray(int i, com.guidewire.typelists.TypecodeDocument.Typecode typecode);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "typecode" element
         */
        com.guidewire.typelists.TypecodeDocument.Typecode insertNewTypecode(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "typecode" element
         */
        com.guidewire.typelists.TypecodeDocument.Typecode addNewTypecode();
        
        /**
         * Removes the ith "typecode" element
         */
        void removeTypecode(int i);
        
        /**
         * Gets array of all "typefilter" elements
         */
        com.guidewire.typelists.TypefilterDocument.Typefilter[] getTypefilterArray();
        
        /**
         * Gets ith "typefilter" element
         */
        com.guidewire.typelists.TypefilterDocument.Typefilter getTypefilterArray(int i);
        
        /**
         * Returns number of "typefilter" element
         */
        int sizeOfTypefilterArray();
        
        /**
         * Sets array of all "typefilter" element
         */
        void setTypefilterArray(com.guidewire.typelists.TypefilterDocument.Typefilter[] typefilterArray);
        
        /**
         * Sets ith "typefilter" element
         */
        void setTypefilterArray(int i, com.guidewire.typelists.TypefilterDocument.Typefilter typefilter);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "typefilter" element
         */
        com.guidewire.typelists.TypefilterDocument.Typefilter insertNewTypefilter(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "typefilter" element
         */
        com.guidewire.typelists.TypefilterDocument.Typefilter addNewTypefilter();
        
        /**
         * Removes the ith "typefilter" element
         */
        void removeTypefilter(int i);
        
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
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.guidewire.typelists.TypelistextensionDocument.Typelistextension newInstance() {
              return (com.guidewire.typelists.TypelistextensionDocument.Typelistextension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.guidewire.typelists.TypelistextensionDocument.Typelistextension newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.guidewire.typelists.TypelistextensionDocument.Typelistextension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.guidewire.typelists.TypelistextensionDocument newInstance() {
          return (com.guidewire.typelists.TypelistextensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.guidewire.typelists.TypelistextensionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.guidewire.typelists.TypelistextensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.guidewire.typelists.TypelistextensionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.typelists.TypelistextensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.guidewire.typelists.TypelistextensionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.typelists.TypelistextensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.guidewire.typelists.TypelistextensionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.typelists.TypelistextensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.guidewire.typelists.TypelistextensionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.typelists.TypelistextensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.guidewire.typelists.TypelistextensionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.typelists.TypelistextensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.guidewire.typelists.TypelistextensionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.typelists.TypelistextensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.guidewire.typelists.TypelistextensionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.typelists.TypelistextensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.guidewire.typelists.TypelistextensionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.typelists.TypelistextensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.guidewire.typelists.TypelistextensionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.typelists.TypelistextensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.guidewire.typelists.TypelistextensionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.typelists.TypelistextensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.guidewire.typelists.TypelistextensionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.typelists.TypelistextensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.guidewire.typelists.TypelistextensionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.typelists.TypelistextensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.guidewire.typelists.TypelistextensionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.typelists.TypelistextensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.guidewire.typelists.TypelistextensionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.typelists.TypelistextensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.typelists.TypelistextensionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.typelists.TypelistextensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.typelists.TypelistextensionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.typelists.TypelistextensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
