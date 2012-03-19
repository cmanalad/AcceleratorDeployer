/*
 * An XML document type.
 * Localname: array-association
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.ArrayAssociationDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel;


/**
 * A document containing one array-association(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public interface ArrayAssociationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrayAssociationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("arrayassociationb0bedoctype");
    
    /**
     * Gets the "array-association" element
     */
    com.guidewire.datamodel.ArrayAssociationDocument.ArrayAssociation getArrayAssociation();
    
    /**
     * Sets the "array-association" element
     */
    void setArrayAssociation(com.guidewire.datamodel.ArrayAssociationDocument.ArrayAssociation arrayAssociation);
    
    /**
     * Appends and returns a new empty "array-association" element
     */
    com.guidewire.datamodel.ArrayAssociationDocument.ArrayAssociation addNewArrayAssociation();
    
    /**
     * An XML array-association(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public interface ArrayAssociation extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrayAssociation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("arrayassociationaaa5elemtype");
        
        /**
         * Gets array of all "constant-map" elements
         */
        com.guidewire.datamodel.ConstantMapDocument.ConstantMap[] getConstantMapArray();
        
        /**
         * Gets ith "constant-map" element
         */
        com.guidewire.datamodel.ConstantMapDocument.ConstantMap getConstantMapArray(int i);
        
        /**
         * Returns number of "constant-map" element
         */
        int sizeOfConstantMapArray();
        
        /**
         * Sets array of all "constant-map" element
         */
        void setConstantMapArray(com.guidewire.datamodel.ConstantMapDocument.ConstantMap[] constantMapArray);
        
        /**
         * Sets ith "constant-map" element
         */
        void setConstantMapArray(int i, com.guidewire.datamodel.ConstantMapDocument.ConstantMap constantMap);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "constant-map" element
         */
        com.guidewire.datamodel.ConstantMapDocument.ConstantMap insertNewConstantMap(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "constant-map" element
         */
        com.guidewire.datamodel.ConstantMapDocument.ConstantMap addNewConstantMap();
        
        /**
         * Removes the ith "constant-map" element
         */
        void removeConstantMap(int i);
        
        /**
         * Gets array of all "subtype-map" elements
         */
        com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap[] getSubtypeMapArray();
        
        /**
         * Gets ith "subtype-map" element
         */
        com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap getSubtypeMapArray(int i);
        
        /**
         * Returns number of "subtype-map" element
         */
        int sizeOfSubtypeMapArray();
        
        /**
         * Sets array of all "subtype-map" element
         */
        void setSubtypeMapArray(com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap[] subtypeMapArray);
        
        /**
         * Sets ith "subtype-map" element
         */
        void setSubtypeMapArray(int i, com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap subtypeMap);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "subtype-map" element
         */
        com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap insertNewSubtypeMap(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "subtype-map" element
         */
        com.guidewire.datamodel.SubtypeMapDocument.SubtypeMap addNewSubtypeMap();
        
        /**
         * Removes the ith "subtype-map" element
         */
        void removeSubtypeMap(int i);
        
        /**
         * Gets array of all "typelist-map" elements
         */
        com.guidewire.datamodel.TypelistMapDocument.TypelistMap[] getTypelistMapArray();
        
        /**
         * Gets ith "typelist-map" element
         */
        com.guidewire.datamodel.TypelistMapDocument.TypelistMap getTypelistMapArray(int i);
        
        /**
         * Returns number of "typelist-map" element
         */
        int sizeOfTypelistMapArray();
        
        /**
         * Sets array of all "typelist-map" element
         */
        void setTypelistMapArray(com.guidewire.datamodel.TypelistMapDocument.TypelistMap[] typelistMapArray);
        
        /**
         * Sets ith "typelist-map" element
         */
        void setTypelistMapArray(int i, com.guidewire.datamodel.TypelistMapDocument.TypelistMap typelistMap);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "typelist-map" element
         */
        com.guidewire.datamodel.TypelistMapDocument.TypelistMap insertNewTypelistMap(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "typelist-map" element
         */
        com.guidewire.datamodel.TypelistMapDocument.TypelistMap addNewTypelistMap();
        
        /**
         * Removes the ith "typelist-map" element
         */
        void removeTypelistMap(int i);
        
        /**
         * Gets the "hasContains" attribute
         */
        boolean getHasContains();
        
        /**
         * Gets (as xml) the "hasContains" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetHasContains();
        
        /**
         * True if has "hasContains" attribute
         */
        boolean isSetHasContains();
        
        /**
         * Sets the "hasContains" attribute
         */
        void setHasContains(boolean hasContains);
        
        /**
         * Sets (as xml) the "hasContains" attribute
         */
        void xsetHasContains(org.apache.xmlbeans.XmlBoolean hasContains);
        
        /**
         * Unsets the "hasContains" attribute
         */
        void unsetHasContains();
        
        /**
         * Gets the "hasGetter" attribute
         */
        boolean getHasGetter();
        
        /**
         * Gets (as xml) the "hasGetter" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetHasGetter();
        
        /**
         * True if has "hasGetter" attribute
         */
        boolean isSetHasGetter();
        
        /**
         * Sets the "hasGetter" attribute
         */
        void setHasGetter(boolean hasGetter);
        
        /**
         * Sets (as xml) the "hasGetter" attribute
         */
        void xsetHasGetter(org.apache.xmlbeans.XmlBoolean hasGetter);
        
        /**
         * Unsets the "hasGetter" attribute
         */
        void unsetHasGetter();
        
        /**
         * Gets the "hasSetter" attribute
         */
        boolean getHasSetter();
        
        /**
         * Gets (as xml) the "hasSetter" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetHasSetter();
        
        /**
         * True if has "hasSetter" attribute
         */
        boolean isSetHasSetter();
        
        /**
         * Sets the "hasSetter" attribute
         */
        void setHasSetter(boolean hasSetter);
        
        /**
         * Sets (as xml) the "hasSetter" attribute
         */
        void xsetHasSetter(org.apache.xmlbeans.XmlBoolean hasSetter);
        
        /**
         * Unsets the "hasSetter" attribute
         */
        void unsetHasSetter();
        
        /**
         * Gets the "valueField" attribute
         */
        java.lang.String getValueField();
        
        /**
         * Gets (as xml) the "valueField" attribute
         */
        org.apache.xmlbeans.XmlString xgetValueField();
        
        /**
         * True if has "valueField" attribute
         */
        boolean isSetValueField();
        
        /**
         * Sets the "valueField" attribute
         */
        void setValueField(java.lang.String valueField);
        
        /**
         * Sets (as xml) the "valueField" attribute
         */
        void xsetValueField(org.apache.xmlbeans.XmlString valueField);
        
        /**
         * Unsets the "valueField" attribute
         */
        void unsetValueField();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.guidewire.datamodel.ArrayAssociationDocument.ArrayAssociation newInstance() {
              return (com.guidewire.datamodel.ArrayAssociationDocument.ArrayAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.guidewire.datamodel.ArrayAssociationDocument.ArrayAssociation newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.guidewire.datamodel.ArrayAssociationDocument.ArrayAssociation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.guidewire.datamodel.ArrayAssociationDocument newInstance() {
          return (com.guidewire.datamodel.ArrayAssociationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.guidewire.datamodel.ArrayAssociationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.guidewire.datamodel.ArrayAssociationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.guidewire.datamodel.ArrayAssociationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ArrayAssociationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.guidewire.datamodel.ArrayAssociationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ArrayAssociationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.guidewire.datamodel.ArrayAssociationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ArrayAssociationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.guidewire.datamodel.ArrayAssociationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ArrayAssociationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.guidewire.datamodel.ArrayAssociationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ArrayAssociationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.guidewire.datamodel.ArrayAssociationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ArrayAssociationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.guidewire.datamodel.ArrayAssociationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ArrayAssociationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.guidewire.datamodel.ArrayAssociationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ArrayAssociationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.guidewire.datamodel.ArrayAssociationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ArrayAssociationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.guidewire.datamodel.ArrayAssociationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.ArrayAssociationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.guidewire.datamodel.ArrayAssociationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ArrayAssociationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.guidewire.datamodel.ArrayAssociationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ArrayAssociationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.guidewire.datamodel.ArrayAssociationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ArrayAssociationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.guidewire.datamodel.ArrayAssociationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.ArrayAssociationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.ArrayAssociationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.ArrayAssociationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.ArrayAssociationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.ArrayAssociationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
