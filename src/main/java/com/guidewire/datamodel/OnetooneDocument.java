/*
 * An XML document type.
 * Localname: onetoone
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.OnetooneDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel;


/**
 * A document containing one onetoone(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public interface OnetooneDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OnetooneDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("onetoone1c54doctype");
    
    /**
     * Gets the "onetoone" element
     */
    com.guidewire.datamodel.OnetooneDocument.Onetoone getOnetoone();
    
    /**
     * Sets the "onetoone" element
     */
    void setOnetoone(com.guidewire.datamodel.OnetooneDocument.Onetoone onetoone);
    
    /**
     * Appends and returns a new empty "onetoone" element
     */
    com.guidewire.datamodel.OnetooneDocument.Onetoone addNewOnetoone();
    
    /**
     * An XML onetoone(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public interface Onetoone extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Onetoone.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("onetoonea715elemtype");
        
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
         * Gets the "deprecated" attribute
         */
        boolean getDeprecated();
        
        /**
         * Gets (as xml) the "deprecated" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetDeprecated();
        
        /**
         * True if has "deprecated" attribute
         */
        boolean isSetDeprecated();
        
        /**
         * Sets the "deprecated" attribute
         */
        void setDeprecated(boolean deprecated);
        
        /**
         * Sets (as xml) the "deprecated" attribute
         */
        void xsetDeprecated(org.apache.xmlbeans.XmlBoolean deprecated);
        
        /**
         * Unsets the "deprecated" attribute
         */
        void unsetDeprecated();
        
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
         * Gets the "fkentity" attribute
         */
        java.lang.String getFkentity();
        
        /**
         * Gets (as xml) the "fkentity" attribute
         */
        org.apache.xmlbeans.XmlNMTOKEN xgetFkentity();
        
        /**
         * Sets the "fkentity" attribute
         */
        void setFkentity(java.lang.String fkentity);
        
        /**
         * Sets (as xml) the "fkentity" attribute
         */
        void xsetFkentity(org.apache.xmlbeans.XmlNMTOKEN fkentity);
        
        /**
         * Gets the "generateCode" attribute
         */
        boolean getGenerateCode();
        
        /**
         * Gets (as xml) the "generateCode" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetGenerateCode();
        
        /**
         * True if has "generateCode" attribute
         */
        boolean isSetGenerateCode();
        
        /**
         * Sets the "generateCode" attribute
         */
        void setGenerateCode(boolean generateCode);
        
        /**
         * Sets (as xml) the "generateCode" attribute
         */
        void xsetGenerateCode(org.apache.xmlbeans.XmlBoolean generateCode);
        
        /**
         * Unsets the "generateCode" attribute
         */
        void unsetGenerateCode();
        
        /**
         * Gets the "getterScriptability" attribute
         */
        com.guidewire.datamodel.ScriptabilityType.Enum getGetterScriptability();
        
        /**
         * Gets (as xml) the "getterScriptability" attribute
         */
        com.guidewire.datamodel.ScriptabilityType xgetGetterScriptability();
        
        /**
         * True if has "getterScriptability" attribute
         */
        boolean isSetGetterScriptability();
        
        /**
         * Sets the "getterScriptability" attribute
         */
        void setGetterScriptability(com.guidewire.datamodel.ScriptabilityType.Enum getterScriptability);
        
        /**
         * Sets (as xml) the "getterScriptability" attribute
         */
        void xsetGetterScriptability(com.guidewire.datamodel.ScriptabilityType getterScriptability);
        
        /**
         * Unsets the "getterScriptability" attribute
         */
        void unsetGetterScriptability();
        
        /**
         * Gets the "ignoreforevents" attribute
         */
        boolean getIgnoreforevents();
        
        /**
         * Gets (as xml) the "ignoreforevents" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetIgnoreforevents();
        
        /**
         * True if has "ignoreforevents" attribute
         */
        boolean isSetIgnoreforevents();
        
        /**
         * Sets the "ignoreforevents" attribute
         */
        void setIgnoreforevents(boolean ignoreforevents);
        
        /**
         * Sets (as xml) the "ignoreforevents" attribute
         */
        void xsetIgnoreforevents(org.apache.xmlbeans.XmlBoolean ignoreforevents);
        
        /**
         * Unsets the "ignoreforevents" attribute
         */
        void unsetIgnoreforevents();
        
        /**
         * Gets the "linkField" attribute
         */
        java.lang.String getLinkField();
        
        /**
         * Gets (as xml) the "linkField" attribute
         */
        org.apache.xmlbeans.XmlNMTOKEN xgetLinkField();
        
        /**
         * True if has "linkField" attribute
         */
        boolean isSetLinkField();
        
        /**
         * Sets the "linkField" attribute
         */
        void setLinkField(java.lang.String linkField);
        
        /**
         * Sets (as xml) the "linkField" attribute
         */
        void xsetLinkField(org.apache.xmlbeans.XmlNMTOKEN linkField);
        
        /**
         * Unsets the "linkField" attribute
         */
        void unsetLinkField();
        
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
         * Gets the "nullok" attribute
         */
        boolean getNullok();
        
        /**
         * Gets (as xml) the "nullok" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetNullok();
        
        /**
         * True if has "nullok" attribute
         */
        boolean isSetNullok();
        
        /**
         * Sets the "nullok" attribute
         */
        void setNullok(boolean nullok);
        
        /**
         * Sets (as xml) the "nullok" attribute
         */
        void xsetNullok(org.apache.xmlbeans.XmlBoolean nullok);
        
        /**
         * Unsets the "nullok" attribute
         */
        void unsetNullok();
        
        /**
         * Gets the "setterScriptability" attribute
         */
        com.guidewire.datamodel.ScriptabilityType.Enum getSetterScriptability();
        
        /**
         * Gets (as xml) the "setterScriptability" attribute
         */
        com.guidewire.datamodel.ScriptabilityType xgetSetterScriptability();
        
        /**
         * True if has "setterScriptability" attribute
         */
        boolean isSetSetterScriptability();
        
        /**
         * Sets the "setterScriptability" attribute
         */
        void setSetterScriptability(com.guidewire.datamodel.ScriptabilityType.Enum setterScriptability);
        
        /**
         * Sets (as xml) the "setterScriptability" attribute
         */
        void xsetSetterScriptability(com.guidewire.datamodel.ScriptabilityType setterScriptability);
        
        /**
         * Unsets the "setterScriptability" attribute
         */
        void unsetSetterScriptability();
        
        /**
         * Gets the "triggersValidation" attribute
         */
        boolean getTriggersValidation();
        
        /**
         * Gets (as xml) the "triggersValidation" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetTriggersValidation();
        
        /**
         * True if has "triggersValidation" attribute
         */
        boolean isSetTriggersValidation();
        
        /**
         * Sets the "triggersValidation" attribute
         */
        void setTriggersValidation(boolean triggersValidation);
        
        /**
         * Sets (as xml) the "triggersValidation" attribute
         */
        void xsetTriggersValidation(org.apache.xmlbeans.XmlBoolean triggersValidation);
        
        /**
         * Unsets the "triggersValidation" attribute
         */
        void unsetTriggersValidation();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.guidewire.datamodel.OnetooneDocument.Onetoone newInstance() {
              return (com.guidewire.datamodel.OnetooneDocument.Onetoone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.guidewire.datamodel.OnetooneDocument.Onetoone newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.guidewire.datamodel.OnetooneDocument.Onetoone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.guidewire.datamodel.OnetooneDocument newInstance() {
          return (com.guidewire.datamodel.OnetooneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.guidewire.datamodel.OnetooneDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.guidewire.datamodel.OnetooneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.guidewire.datamodel.OnetooneDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.OnetooneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.guidewire.datamodel.OnetooneDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.OnetooneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.guidewire.datamodel.OnetooneDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.OnetooneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.guidewire.datamodel.OnetooneDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.OnetooneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.guidewire.datamodel.OnetooneDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.OnetooneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.guidewire.datamodel.OnetooneDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.OnetooneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.guidewire.datamodel.OnetooneDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.OnetooneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.guidewire.datamodel.OnetooneDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.OnetooneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.guidewire.datamodel.OnetooneDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.OnetooneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.guidewire.datamodel.OnetooneDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.OnetooneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.guidewire.datamodel.OnetooneDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.OnetooneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.guidewire.datamodel.OnetooneDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.OnetooneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.guidewire.datamodel.OnetooneDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.OnetooneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.guidewire.datamodel.OnetooneDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.OnetooneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.OnetooneDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.OnetooneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.OnetooneDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.OnetooneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
