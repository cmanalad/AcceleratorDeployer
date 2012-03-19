/*
 * An XML document type.
 * Localname: checkconstraint
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.CheckconstraintDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel;


/**
 * A document containing one checkconstraint(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public interface CheckconstraintDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CheckconstraintDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("checkconstraint9226doctype");
    
    /**
     * Gets the "checkconstraint" element
     */
    com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint getCheckconstraint();
    
    /**
     * Sets the "checkconstraint" element
     */
    void setCheckconstraint(com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint checkconstraint);
    
    /**
     * Appends and returns a new empty "checkconstraint" element
     */
    com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint addNewCheckconstraint();
    
    /**
     * An XML checkconstraint(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public interface Checkconstraint extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Checkconstraint.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("checkconstraintbcf5elemtype");
        
        /**
         * Gets the "applicabletostagingtable" attribute
         */
        boolean getApplicabletostagingtable();
        
        /**
         * Gets (as xml) the "applicabletostagingtable" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetApplicabletostagingtable();
        
        /**
         * True if has "applicabletostagingtable" attribute
         */
        boolean isSetApplicabletostagingtable();
        
        /**
         * Sets the "applicabletostagingtable" attribute
         */
        void setApplicabletostagingtable(boolean applicabletostagingtable);
        
        /**
         * Sets (as xml) the "applicabletostagingtable" attribute
         */
        void xsetApplicabletostagingtable(org.apache.xmlbeans.XmlBoolean applicabletostagingtable);
        
        /**
         * Unsets the "applicabletostagingtable" attribute
         */
        void unsetApplicabletostagingtable();
        
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
         * Gets the "predicate" attribute
         */
        java.lang.String getPredicate();
        
        /**
         * Gets (as xml) the "predicate" attribute
         */
        org.apache.xmlbeans.XmlString xgetPredicate();
        
        /**
         * True if has "predicate" attribute
         */
        boolean isSetPredicate();
        
        /**
         * Sets the "predicate" attribute
         */
        void setPredicate(java.lang.String predicate);
        
        /**
         * Sets (as xml) the "predicate" attribute
         */
        void xsetPredicate(org.apache.xmlbeans.XmlString predicate);
        
        /**
         * Unsets the "predicate" attribute
         */
        void unsetPredicate();
        
        /**
         * Gets the "stagingtablepredicate" attribute
         */
        java.lang.String getStagingtablepredicate();
        
        /**
         * Gets (as xml) the "stagingtablepredicate" attribute
         */
        org.apache.xmlbeans.XmlString xgetStagingtablepredicate();
        
        /**
         * True if has "stagingtablepredicate" attribute
         */
        boolean isSetStagingtablepredicate();
        
        /**
         * Sets the "stagingtablepredicate" attribute
         */
        void setStagingtablepredicate(java.lang.String stagingtablepredicate);
        
        /**
         * Sets (as xml) the "stagingtablepredicate" attribute
         */
        void xsetStagingtablepredicate(org.apache.xmlbeans.XmlString stagingtablepredicate);
        
        /**
         * Unsets the "stagingtablepredicate" attribute
         */
        void unsetStagingtablepredicate();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint newInstance() {
              return (com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.guidewire.datamodel.CheckconstraintDocument.Checkconstraint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.guidewire.datamodel.CheckconstraintDocument newInstance() {
          return (com.guidewire.datamodel.CheckconstraintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.guidewire.datamodel.CheckconstraintDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.guidewire.datamodel.CheckconstraintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.guidewire.datamodel.CheckconstraintDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.CheckconstraintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.guidewire.datamodel.CheckconstraintDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.CheckconstraintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.guidewire.datamodel.CheckconstraintDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.CheckconstraintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.guidewire.datamodel.CheckconstraintDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.CheckconstraintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.guidewire.datamodel.CheckconstraintDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.CheckconstraintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.guidewire.datamodel.CheckconstraintDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.CheckconstraintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.guidewire.datamodel.CheckconstraintDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.CheckconstraintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.guidewire.datamodel.CheckconstraintDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.CheckconstraintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.guidewire.datamodel.CheckconstraintDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.CheckconstraintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.guidewire.datamodel.CheckconstraintDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.CheckconstraintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.guidewire.datamodel.CheckconstraintDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.CheckconstraintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.guidewire.datamodel.CheckconstraintDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.CheckconstraintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.guidewire.datamodel.CheckconstraintDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.CheckconstraintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.guidewire.datamodel.CheckconstraintDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.CheckconstraintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.CheckconstraintDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.CheckconstraintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.CheckconstraintDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.CheckconstraintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
