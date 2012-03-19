/*
 * An XML document type.
 * Localname: viewEntity
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.ViewEntityDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel;


/**
 * A document containing one viewEntity(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public interface ViewEntityDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ViewEntityDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("viewentity9eb1doctype");
    
    /**
     * Gets the "viewEntity" element
     */
    com.guidewire.datamodel.ViewEntityDocument.ViewEntity getViewEntity();
    
    /**
     * Sets the "viewEntity" element
     */
    void setViewEntity(com.guidewire.datamodel.ViewEntityDocument.ViewEntity viewEntity);
    
    /**
     * Appends and returns a new empty "viewEntity" element
     */
    com.guidewire.datamodel.ViewEntityDocument.ViewEntity addNewViewEntity();
    
    /**
     * An XML viewEntity(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public interface ViewEntity extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ViewEntity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("viewentity4e35elemtype");
        
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
         * Gets array of all "fulldescription" elements
         */
        com.guidewire.datamodel.FulldescriptionDocument.Fulldescription[] getFulldescriptionArray();
        
        /**
         * Gets ith "fulldescription" element
         */
        com.guidewire.datamodel.FulldescriptionDocument.Fulldescription getFulldescriptionArray(int i);
        
        /**
         * Returns number of "fulldescription" element
         */
        int sizeOfFulldescriptionArray();
        
        /**
         * Sets array of all "fulldescription" element
         */
        void setFulldescriptionArray(com.guidewire.datamodel.FulldescriptionDocument.Fulldescription[] fulldescriptionArray);
        
        /**
         * Sets ith "fulldescription" element
         */
        void setFulldescriptionArray(int i, com.guidewire.datamodel.FulldescriptionDocument.Fulldescription fulldescription);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "fulldescription" element
         */
        com.guidewire.datamodel.FulldescriptionDocument.Fulldescription insertNewFulldescription(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "fulldescription" element
         */
        com.guidewire.datamodel.FulldescriptionDocument.Fulldescription addNewFulldescription();
        
        /**
         * Removes the ith "fulldescription" element
         */
        void removeFulldescription(int i);
        
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
         * Gets the "abstract" attribute
         */
        boolean getAbstract();
        
        /**
         * Gets (as xml) the "abstract" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetAbstract();
        
        /**
         * True if has "abstract" attribute
         */
        boolean isSetAbstract();
        
        /**
         * Sets the "abstract" attribute
         */
        void setAbstract(boolean xabstract);
        
        /**
         * Sets (as xml) the "abstract" attribute
         */
        void xsetAbstract(org.apache.xmlbeans.XmlBoolean xabstract);
        
        /**
         * Unsets the "abstract" attribute
         */
        void unsetAbstract();
        
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
         * Gets the "entity" attribute
         */
        java.lang.String getEntity();
        
        /**
         * Gets (as xml) the "entity" attribute
         */
        org.apache.xmlbeans.XmlString xgetEntity();
        
        /**
         * Sets the "entity" attribute
         */
        void setEntity(java.lang.String entity);
        
        /**
         * Sets (as xml) the "entity" attribute
         */
        void xsetEntity(org.apache.xmlbeans.XmlString entity);
        
        /**
         * Gets the "exportable" attribute
         */
        boolean getExportable();
        
        /**
         * Gets (as xml) the "exportable" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetExportable();
        
        /**
         * True if has "exportable" attribute
         */
        boolean isSetExportable();
        
        /**
         * Sets the "exportable" attribute
         */
        void setExportable(boolean exportable);
        
        /**
         * Sets (as xml) the "exportable" attribute
         */
        void xsetExportable(org.apache.xmlbeans.XmlBoolean exportable);
        
        /**
         * Unsets the "exportable" attribute
         */
        void unsetExportable();
        
        /**
         * Gets the "extendable" attribute
         */
        boolean getExtendable();
        
        /**
         * Gets (as xml) the "extendable" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetExtendable();
        
        /**
         * True if has "extendable" attribute
         */
        boolean isSetExtendable();
        
        /**
         * Sets the "extendable" attribute
         */
        void setExtendable(boolean extendable);
        
        /**
         * Sets (as xml) the "extendable" attribute
         */
        void xsetExtendable(org.apache.xmlbeans.XmlBoolean extendable);
        
        /**
         * Unsets the "extendable" attribute
         */
        void unsetExtendable();
        
        /**
         * Gets the "final" attribute
         */
        boolean getFinal();
        
        /**
         * Gets (as xml) the "final" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetFinal();
        
        /**
         * True if has "final" attribute
         */
        boolean isSetFinal();
        
        /**
         * Sets the "final" attribute
         */
        void setFinal(boolean xfinal);
        
        /**
         * Sets (as xml) the "final" attribute
         */
        void xsetFinal(org.apache.xmlbeans.XmlBoolean xfinal);
        
        /**
         * Unsets the "final" attribute
         */
        void unsetFinal();
        
        /**
         * Gets the "javaClass" attribute
         */
        java.lang.String getJavaClass();
        
        /**
         * Gets (as xml) the "javaClass" attribute
         */
        org.apache.xmlbeans.XmlNMTOKEN xgetJavaClass();
        
        /**
         * True if has "javaClass" attribute
         */
        boolean isSetJavaClass();
        
        /**
         * Sets the "javaClass" attribute
         */
        void setJavaClass(java.lang.String javaClass);
        
        /**
         * Sets (as xml) the "javaClass" attribute
         */
        void xsetJavaClass(org.apache.xmlbeans.XmlNMTOKEN javaClass);
        
        /**
         * Unsets the "javaClass" attribute
         */
        void unsetJavaClass();
        
        /**
         * Gets the "primaryEntity" attribute
         */
        java.lang.String getPrimaryEntity();
        
        /**
         * Gets (as xml) the "primaryEntity" attribute
         */
        org.apache.xmlbeans.XmlString xgetPrimaryEntity();
        
        /**
         * Sets the "primaryEntity" attribute
         */
        void setPrimaryEntity(java.lang.String primaryEntity);
        
        /**
         * Sets (as xml) the "primaryEntity" attribute
         */
        void xsetPrimaryEntity(org.apache.xmlbeans.XmlString primaryEntity);
        
        /**
         * Gets the "showRetiredBeans" attribute
         */
        boolean getShowRetiredBeans();
        
        /**
         * Gets (as xml) the "showRetiredBeans" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetShowRetiredBeans();
        
        /**
         * True if has "showRetiredBeans" attribute
         */
        boolean isSetShowRetiredBeans();
        
        /**
         * Sets the "showRetiredBeans" attribute
         */
        void setShowRetiredBeans(boolean showRetiredBeans);
        
        /**
         * Sets (as xml) the "showRetiredBeans" attribute
         */
        void xsetShowRetiredBeans(org.apache.xmlbeans.XmlBoolean showRetiredBeans);
        
        /**
         * Unsets the "showRetiredBeans" attribute
         */
        void unsetShowRetiredBeans();
        
        /**
         * Gets the "supertypeEntity" attribute
         */
        java.lang.String getSupertypeEntity();
        
        /**
         * Gets (as xml) the "supertypeEntity" attribute
         */
        org.apache.xmlbeans.XmlNMTOKEN xgetSupertypeEntity();
        
        /**
         * True if has "supertypeEntity" attribute
         */
        boolean isSetSupertypeEntity();
        
        /**
         * Sets the "supertypeEntity" attribute
         */
        void setSupertypeEntity(java.lang.String supertypeEntity);
        
        /**
         * Sets (as xml) the "supertypeEntity" attribute
         */
        void xsetSupertypeEntity(org.apache.xmlbeans.XmlNMTOKEN supertypeEntity);
        
        /**
         * Unsets the "supertypeEntity" attribute
         */
        void unsetSupertypeEntity();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.guidewire.datamodel.ViewEntityDocument.ViewEntity newInstance() {
              return (com.guidewire.datamodel.ViewEntityDocument.ViewEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.guidewire.datamodel.ViewEntityDocument.ViewEntity newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.guidewire.datamodel.ViewEntityDocument.ViewEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.guidewire.datamodel.ViewEntityDocument newInstance() {
          return (com.guidewire.datamodel.ViewEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.guidewire.datamodel.ViewEntityDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.guidewire.datamodel.ViewEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.guidewire.datamodel.ViewEntityDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ViewEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.guidewire.datamodel.ViewEntityDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ViewEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.guidewire.datamodel.ViewEntityDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ViewEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.guidewire.datamodel.ViewEntityDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ViewEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.guidewire.datamodel.ViewEntityDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ViewEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.guidewire.datamodel.ViewEntityDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ViewEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.guidewire.datamodel.ViewEntityDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ViewEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.guidewire.datamodel.ViewEntityDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ViewEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.guidewire.datamodel.ViewEntityDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ViewEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.guidewire.datamodel.ViewEntityDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ViewEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.guidewire.datamodel.ViewEntityDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ViewEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.guidewire.datamodel.ViewEntityDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ViewEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.guidewire.datamodel.ViewEntityDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ViewEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.guidewire.datamodel.ViewEntityDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ViewEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.ViewEntityDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.ViewEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.ViewEntityDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.ViewEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
