/*
 * An XML document type.
 * Localname: dependentfields
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.DependentfieldsDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel;


/**
 * A document containing one dependentfields(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public interface DependentfieldsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DependentfieldsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("dependentfields6233doctype");
    
    /**
     * Gets the "dependentfields" element
     */
    com.guidewire.datamodel.DependentfieldsDocument.Dependentfields getDependentfields();
    
    /**
     * Sets the "dependentfields" element
     */
    void setDependentfields(com.guidewire.datamodel.DependentfieldsDocument.Dependentfields dependentfields);
    
    /**
     * Appends and returns a new empty "dependentfields" element
     */
    com.guidewire.datamodel.DependentfieldsDocument.Dependentfields addNewDependentfields();
    
    /**
     * An XML dependentfields(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public interface Dependentfields extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Dependentfields.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("dependentfields53cfelemtype");
        
        /**
         * Gets array of all "column" elements
         */
        com.guidewire.datamodel.ColumnDocument.Column[] getColumnArray();
        
        /**
         * Gets ith "column" element
         */
        com.guidewire.datamodel.ColumnDocument.Column getColumnArray(int i);
        
        /**
         * Returns number of "column" element
         */
        int sizeOfColumnArray();
        
        /**
         * Sets array of all "column" element
         */
        void setColumnArray(com.guidewire.datamodel.ColumnDocument.Column[] columnArray);
        
        /**
         * Sets ith "column" element
         */
        void setColumnArray(int i, com.guidewire.datamodel.ColumnDocument.Column column);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "column" element
         */
        com.guidewire.datamodel.ColumnDocument.Column insertNewColumn(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "column" element
         */
        com.guidewire.datamodel.ColumnDocument.Column addNewColumn();
        
        /**
         * Removes the ith "column" element
         */
        void removeColumn(int i);
        
        /**
         * Gets array of all "dependentkey" elements
         */
        com.guidewire.datamodel.DependentkeyDocument.Dependentkey[] getDependentkeyArray();
        
        /**
         * Gets ith "dependentkey" element
         */
        com.guidewire.datamodel.DependentkeyDocument.Dependentkey getDependentkeyArray(int i);
        
        /**
         * Returns number of "dependentkey" element
         */
        int sizeOfDependentkeyArray();
        
        /**
         * Sets array of all "dependentkey" element
         */
        void setDependentkeyArray(com.guidewire.datamodel.DependentkeyDocument.Dependentkey[] dependentkeyArray);
        
        /**
         * Sets ith "dependentkey" element
         */
        void setDependentkeyArray(int i, com.guidewire.datamodel.DependentkeyDocument.Dependentkey dependentkey);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dependentkey" element
         */
        com.guidewire.datamodel.DependentkeyDocument.Dependentkey insertNewDependentkey(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dependentkey" element
         */
        com.guidewire.datamodel.DependentkeyDocument.Dependentkey addNewDependentkey();
        
        /**
         * Removes the ith "dependentkey" element
         */
        void removeDependentkey(int i);
        
        /**
         * Gets array of all "typekey" elements
         */
        com.guidewire.datamodel.TypekeyDocument.Typekey[] getTypekeyArray();
        
        /**
         * Gets ith "typekey" element
         */
        com.guidewire.datamodel.TypekeyDocument.Typekey getTypekeyArray(int i);
        
        /**
         * Returns number of "typekey" element
         */
        int sizeOfTypekeyArray();
        
        /**
         * Sets array of all "typekey" element
         */
        void setTypekeyArray(com.guidewire.datamodel.TypekeyDocument.Typekey[] typekeyArray);
        
        /**
         * Sets ith "typekey" element
         */
        void setTypekeyArray(int i, com.guidewire.datamodel.TypekeyDocument.Typekey typekey);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "typekey" element
         */
        com.guidewire.datamodel.TypekeyDocument.Typekey insertNewTypekey(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "typekey" element
         */
        com.guidewire.datamodel.TypekeyDocument.Typekey addNewTypekey();
        
        /**
         * Removes the ith "typekey" element
         */
        void removeTypekey(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.guidewire.datamodel.DependentfieldsDocument.Dependentfields newInstance() {
              return (com.guidewire.datamodel.DependentfieldsDocument.Dependentfields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.guidewire.datamodel.DependentfieldsDocument.Dependentfields newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.guidewire.datamodel.DependentfieldsDocument.Dependentfields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.guidewire.datamodel.DependentfieldsDocument newInstance() {
          return (com.guidewire.datamodel.DependentfieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.guidewire.datamodel.DependentfieldsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.guidewire.datamodel.DependentfieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.guidewire.datamodel.DependentfieldsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.DependentfieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.guidewire.datamodel.DependentfieldsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.DependentfieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.guidewire.datamodel.DependentfieldsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.DependentfieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.guidewire.datamodel.DependentfieldsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.DependentfieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.guidewire.datamodel.DependentfieldsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.DependentfieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.guidewire.datamodel.DependentfieldsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.DependentfieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.guidewire.datamodel.DependentfieldsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.DependentfieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.guidewire.datamodel.DependentfieldsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.DependentfieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.guidewire.datamodel.DependentfieldsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.DependentfieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.guidewire.datamodel.DependentfieldsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.DependentfieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.guidewire.datamodel.DependentfieldsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.DependentfieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.guidewire.datamodel.DependentfieldsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.DependentfieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.guidewire.datamodel.DependentfieldsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.DependentfieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.guidewire.datamodel.DependentfieldsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.DependentfieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.DependentfieldsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.DependentfieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.DependentfieldsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.DependentfieldsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
