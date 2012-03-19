/*
 * An XML document type.
 * Localname: viewEntityExtension
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.ViewEntityExtensionDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel;


/**
 * A document containing one viewEntityExtension(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public interface ViewEntityExtensionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ViewEntityExtensionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("viewentityextension6e14doctype");
    
    /**
     * Gets the "viewEntityExtension" element
     */
    com.guidewire.datamodel.ViewEntityExtensionDocument.ViewEntityExtension getViewEntityExtension();
    
    /**
     * Sets the "viewEntityExtension" element
     */
    void setViewEntityExtension(com.guidewire.datamodel.ViewEntityExtensionDocument.ViewEntityExtension viewEntityExtension);
    
    /**
     * Appends and returns a new empty "viewEntityExtension" element
     */
    com.guidewire.datamodel.ViewEntityExtensionDocument.ViewEntityExtension addNewViewEntityExtension();
    
    /**
     * An XML viewEntityExtension(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public interface ViewEntityExtension extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ViewEntityExtension.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("viewentityextension4751elemtype");
        
        /**
         * Gets array of all "computedcolumn" elements
         */
        com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn[] getComputedcolumnArray();
        
        /**
         * Gets ith "computedcolumn" element
         */
        com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn getComputedcolumnArray(int i);
        
        /**
         * Returns number of "computedcolumn" element
         */
        int sizeOfComputedcolumnArray();
        
        /**
         * Sets array of all "computedcolumn" element
         */
        void setComputedcolumnArray(com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn[] computedcolumnArray);
        
        /**
         * Sets ith "computedcolumn" element
         */
        void setComputedcolumnArray(int i, com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn computedcolumn);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "computedcolumn" element
         */
        com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn insertNewComputedcolumn(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "computedcolumn" element
         */
        com.guidewire.datamodel.ComputedcolumnDocument.Computedcolumn addNewComputedcolumn();
        
        /**
         * Removes the ith "computedcolumn" element
         */
        void removeComputedcolumn(int i);
        
        /**
         * Gets array of all "computedtypekey" elements
         */
        com.guidewire.datamodel.ComputedtypekeyDocument.Computedtypekey[] getComputedtypekeyArray();
        
        /**
         * Gets ith "computedtypekey" element
         */
        com.guidewire.datamodel.ComputedtypekeyDocument.Computedtypekey getComputedtypekeyArray(int i);
        
        /**
         * Returns number of "computedtypekey" element
         */
        int sizeOfComputedtypekeyArray();
        
        /**
         * Sets array of all "computedtypekey" element
         */
        void setComputedtypekeyArray(com.guidewire.datamodel.ComputedtypekeyDocument.Computedtypekey[] computedtypekeyArray);
        
        /**
         * Sets ith "computedtypekey" element
         */
        void setComputedtypekeyArray(int i, com.guidewire.datamodel.ComputedtypekeyDocument.Computedtypekey computedtypekey);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "computedtypekey" element
         */
        com.guidewire.datamodel.ComputedtypekeyDocument.Computedtypekey insertNewComputedtypekey(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "computedtypekey" element
         */
        com.guidewire.datamodel.ComputedtypekeyDocument.Computedtypekey addNewComputedtypekey();
        
        /**
         * Removes the ith "computedtypekey" element
         */
        void removeComputedtypekey(int i);
        
        /**
         * Gets array of all "description" elements
         */
        com.guidewire.datamodel.DescriptionDocument.Description[] getDescriptionArray();
        
        /**
         * Gets ith "description" element
         */
        com.guidewire.datamodel.DescriptionDocument.Description getDescriptionArray(int i);
        
        /**
         * Returns number of "description" element
         */
        int sizeOfDescriptionArray();
        
        /**
         * Sets array of all "description" element
         */
        void setDescriptionArray(com.guidewire.datamodel.DescriptionDocument.Description[] descriptionArray);
        
        /**
         * Sets ith "description" element
         */
        void setDescriptionArray(int i, com.guidewire.datamodel.DescriptionDocument.Description description);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "description" element
         */
        com.guidewire.datamodel.DescriptionDocument.Description insertNewDescription(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "description" element
         */
        com.guidewire.datamodel.DescriptionDocument.Description addNewDescription();
        
        /**
         * Removes the ith "description" element
         */
        void removeDescription(int i);
        
        /**
         * Gets array of all "viewEntityColumn" elements
         */
        com.guidewire.datamodel.ViewEntityColumnDocument.ViewEntityColumn[] getViewEntityColumnArray();
        
        /**
         * Gets ith "viewEntityColumn" element
         */
        com.guidewire.datamodel.ViewEntityColumnDocument.ViewEntityColumn getViewEntityColumnArray(int i);
        
        /**
         * Returns number of "viewEntityColumn" element
         */
        int sizeOfViewEntityColumnArray();
        
        /**
         * Sets array of all "viewEntityColumn" element
         */
        void setViewEntityColumnArray(com.guidewire.datamodel.ViewEntityColumnDocument.ViewEntityColumn[] viewEntityColumnArray);
        
        /**
         * Sets ith "viewEntityColumn" element
         */
        void setViewEntityColumnArray(int i, com.guidewire.datamodel.ViewEntityColumnDocument.ViewEntityColumn viewEntityColumn);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "viewEntityColumn" element
         */
        com.guidewire.datamodel.ViewEntityColumnDocument.ViewEntityColumn insertNewViewEntityColumn(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "viewEntityColumn" element
         */
        com.guidewire.datamodel.ViewEntityColumnDocument.ViewEntityColumn addNewViewEntityColumn();
        
        /**
         * Removes the ith "viewEntityColumn" element
         */
        void removeViewEntityColumn(int i);
        
        /**
         * Gets array of all "viewEntityLink" elements
         */
        com.guidewire.datamodel.ViewEntityLinkDocument.ViewEntityLink[] getViewEntityLinkArray();
        
        /**
         * Gets ith "viewEntityLink" element
         */
        com.guidewire.datamodel.ViewEntityLinkDocument.ViewEntityLink getViewEntityLinkArray(int i);
        
        /**
         * Returns number of "viewEntityLink" element
         */
        int sizeOfViewEntityLinkArray();
        
        /**
         * Sets array of all "viewEntityLink" element
         */
        void setViewEntityLinkArray(com.guidewire.datamodel.ViewEntityLinkDocument.ViewEntityLink[] viewEntityLinkArray);
        
        /**
         * Sets ith "viewEntityLink" element
         */
        void setViewEntityLinkArray(int i, com.guidewire.datamodel.ViewEntityLinkDocument.ViewEntityLink viewEntityLink);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "viewEntityLink" element
         */
        com.guidewire.datamodel.ViewEntityLinkDocument.ViewEntityLink insertNewViewEntityLink(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "viewEntityLink" element
         */
        com.guidewire.datamodel.ViewEntityLinkDocument.ViewEntityLink addNewViewEntityLink();
        
        /**
         * Removes the ith "viewEntityLink" element
         */
        void removeViewEntityLink(int i);
        
        /**
         * Gets array of all "viewEntityName" elements
         */
        com.guidewire.datamodel.ViewEntityNameDocument.ViewEntityName[] getViewEntityNameArray();
        
        /**
         * Gets ith "viewEntityName" element
         */
        com.guidewire.datamodel.ViewEntityNameDocument.ViewEntityName getViewEntityNameArray(int i);
        
        /**
         * Returns number of "viewEntityName" element
         */
        int sizeOfViewEntityNameArray();
        
        /**
         * Sets array of all "viewEntityName" element
         */
        void setViewEntityNameArray(com.guidewire.datamodel.ViewEntityNameDocument.ViewEntityName[] viewEntityNameArray);
        
        /**
         * Sets ith "viewEntityName" element
         */
        void setViewEntityNameArray(int i, com.guidewire.datamodel.ViewEntityNameDocument.ViewEntityName viewEntityName);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "viewEntityName" element
         */
        com.guidewire.datamodel.ViewEntityNameDocument.ViewEntityName insertNewViewEntityName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "viewEntityName" element
         */
        com.guidewire.datamodel.ViewEntityNameDocument.ViewEntityName addNewViewEntityName();
        
        /**
         * Removes the ith "viewEntityName" element
         */
        void removeViewEntityName(int i);
        
        /**
         * Gets array of all "viewEntityTypekey" elements
         */
        com.guidewire.datamodel.ViewEntityTypekeyDocument.ViewEntityTypekey[] getViewEntityTypekeyArray();
        
        /**
         * Gets ith "viewEntityTypekey" element
         */
        com.guidewire.datamodel.ViewEntityTypekeyDocument.ViewEntityTypekey getViewEntityTypekeyArray(int i);
        
        /**
         * Returns number of "viewEntityTypekey" element
         */
        int sizeOfViewEntityTypekeyArray();
        
        /**
         * Sets array of all "viewEntityTypekey" element
         */
        void setViewEntityTypekeyArray(com.guidewire.datamodel.ViewEntityTypekeyDocument.ViewEntityTypekey[] viewEntityTypekeyArray);
        
        /**
         * Sets ith "viewEntityTypekey" element
         */
        void setViewEntityTypekeyArray(int i, com.guidewire.datamodel.ViewEntityTypekeyDocument.ViewEntityTypekey viewEntityTypekey);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "viewEntityTypekey" element
         */
        com.guidewire.datamodel.ViewEntityTypekeyDocument.ViewEntityTypekey insertNewViewEntityTypekey(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "viewEntityTypekey" element
         */
        com.guidewire.datamodel.ViewEntityTypekeyDocument.ViewEntityTypekey addNewViewEntityTypekey();
        
        /**
         * Removes the ith "viewEntityTypekey" element
         */
        void removeViewEntityTypekey(int i);
        
        /**
         * Gets the "entityName" attribute
         */
        java.lang.String getEntityName();
        
        /**
         * Gets (as xml) the "entityName" attribute
         */
        org.apache.xmlbeans.XmlNMTOKEN xgetEntityName();
        
        /**
         * Sets the "entityName" attribute
         */
        void setEntityName(java.lang.String entityName);
        
        /**
         * Sets (as xml) the "entityName" attribute
         */
        void xsetEntityName(org.apache.xmlbeans.XmlNMTOKEN entityName);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.guidewire.datamodel.ViewEntityExtensionDocument.ViewEntityExtension newInstance() {
              return (com.guidewire.datamodel.ViewEntityExtensionDocument.ViewEntityExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.guidewire.datamodel.ViewEntityExtensionDocument.ViewEntityExtension newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.guidewire.datamodel.ViewEntityExtensionDocument.ViewEntityExtension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.guidewire.datamodel.ViewEntityExtensionDocument newInstance() {
          return (com.guidewire.datamodel.ViewEntityExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.guidewire.datamodel.ViewEntityExtensionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.guidewire.datamodel.ViewEntityExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.guidewire.datamodel.ViewEntityExtensionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ViewEntityExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.guidewire.datamodel.ViewEntityExtensionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ViewEntityExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.guidewire.datamodel.ViewEntityExtensionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ViewEntityExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.guidewire.datamodel.ViewEntityExtensionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ViewEntityExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.guidewire.datamodel.ViewEntityExtensionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ViewEntityExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.guidewire.datamodel.ViewEntityExtensionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ViewEntityExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.guidewire.datamodel.ViewEntityExtensionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ViewEntityExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.guidewire.datamodel.ViewEntityExtensionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ViewEntityExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.guidewire.datamodel.ViewEntityExtensionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ViewEntityExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.guidewire.datamodel.ViewEntityExtensionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ViewEntityExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.guidewire.datamodel.ViewEntityExtensionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ViewEntityExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.guidewire.datamodel.ViewEntityExtensionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ViewEntityExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.guidewire.datamodel.ViewEntityExtensionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ViewEntityExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.guidewire.datamodel.ViewEntityExtensionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ViewEntityExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.ViewEntityExtensionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.ViewEntityExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.ViewEntityExtensionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.ViewEntityExtensionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
