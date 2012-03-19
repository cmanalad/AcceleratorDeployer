/*
 * An XML document type.
 * Localname: delegate
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.DelegateDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel;


/**
 * A document containing one delegate(@http://guidewire.com/datamodel) element.
 *
 * This is a complex type.
 */
public interface DelegateDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DelegateDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("delegate2634doctype");
    
    /**
     * Gets the "delegate" element
     */
    com.guidewire.datamodel.DelegateDocument.Delegate getDelegate();
    
    /**
     * Sets the "delegate" element
     */
    void setDelegate(com.guidewire.datamodel.DelegateDocument.Delegate delegate);
    
    /**
     * Appends and returns a new empty "delegate" element
     */
    com.guidewire.datamodel.DelegateDocument.Delegate addNewDelegate();
    
    /**
     * An XML delegate(@http://guidewire.com/datamodel).
     *
     * This is a complex type.
     */
    public interface Delegate extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Delegate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("delegatebb15elemtype");
        
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
         * Gets array of all "datetimeordering" elements
         */
        com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering[] getDatetimeorderingArray();
        
        /**
         * Gets ith "datetimeordering" element
         */
        com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering getDatetimeorderingArray(int i);
        
        /**
         * Returns number of "datetimeordering" element
         */
        int sizeOfDatetimeorderingArray();
        
        /**
         * Sets array of all "datetimeordering" element
         */
        void setDatetimeorderingArray(com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering[] datetimeorderingArray);
        
        /**
         * Sets ith "datetimeordering" element
         */
        void setDatetimeorderingArray(int i, com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering datetimeordering);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "datetimeordering" element
         */
        com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering insertNewDatetimeordering(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "datetimeordering" element
         */
        com.guidewire.datamodel.DatetimeorderingDocument.Datetimeordering addNewDatetimeordering();
        
        /**
         * Removes the ith "datetimeordering" element
         */
        void removeDatetimeordering(int i);
        
        /**
         * Gets array of all "foreignkey" elements
         */
        com.guidewire.datamodel.ForeignkeyDocument.Foreignkey[] getForeignkeyArray();
        
        /**
         * Gets ith "foreignkey" element
         */
        com.guidewire.datamodel.ForeignkeyDocument.Foreignkey getForeignkeyArray(int i);
        
        /**
         * Returns number of "foreignkey" element
         */
        int sizeOfForeignkeyArray();
        
        /**
         * Sets array of all "foreignkey" element
         */
        void setForeignkeyArray(com.guidewire.datamodel.ForeignkeyDocument.Foreignkey[] foreignkeyArray);
        
        /**
         * Sets ith "foreignkey" element
         */
        void setForeignkeyArray(int i, com.guidewire.datamodel.ForeignkeyDocument.Foreignkey foreignkey);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "foreignkey" element
         */
        com.guidewire.datamodel.ForeignkeyDocument.Foreignkey insertNewForeignkey(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "foreignkey" element
         */
        com.guidewire.datamodel.ForeignkeyDocument.Foreignkey addNewForeignkey();
        
        /**
         * Removes the ith "foreignkey" element
         */
        void removeForeignkey(int i);
        
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
         * Gets array of all "implementsEntity" elements
         */
        com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity[] getImplementsEntityArray();
        
        /**
         * Gets ith "implementsEntity" element
         */
        com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity getImplementsEntityArray(int i);
        
        /**
         * Returns number of "implementsEntity" element
         */
        int sizeOfImplementsEntityArray();
        
        /**
         * Sets array of all "implementsEntity" element
         */
        void setImplementsEntityArray(com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity[] implementsEntityArray);
        
        /**
         * Sets ith "implementsEntity" element
         */
        void setImplementsEntityArray(int i, com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity implementsEntity);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "implementsEntity" element
         */
        com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity insertNewImplementsEntity(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "implementsEntity" element
         */
        com.guidewire.datamodel.ImplementsEntityDocument.ImplementsEntity addNewImplementsEntity();
        
        /**
         * Removes the ith "implementsEntity" element
         */
        void removeImplementsEntity(int i);
        
        /**
         * Gets array of all "implementsInterface" elements
         */
        com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface[] getImplementsInterfaceArray();
        
        /**
         * Gets ith "implementsInterface" element
         */
        com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface getImplementsInterfaceArray(int i);
        
        /**
         * Returns number of "implementsInterface" element
         */
        int sizeOfImplementsInterfaceArray();
        
        /**
         * Sets array of all "implementsInterface" element
         */
        void setImplementsInterfaceArray(com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface[] implementsInterfaceArray);
        
        /**
         * Sets ith "implementsInterface" element
         */
        void setImplementsInterfaceArray(int i, com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface implementsInterface);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "implementsInterface" element
         */
        com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface insertNewImplementsInterface(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "implementsInterface" element
         */
        com.guidewire.datamodel.ImplementsInterfaceDocument.ImplementsInterface addNewImplementsInterface();
        
        /**
         * Removes the ith "implementsInterface" element
         */
        void removeImplementsInterface(int i);
        
        /**
         * Gets array of all "index" elements
         */
        com.guidewire.datamodel.IndexDocument.Index[] getIndexArray();
        
        /**
         * Gets ith "index" element
         */
        com.guidewire.datamodel.IndexDocument.Index getIndexArray(int i);
        
        /**
         * Returns number of "index" element
         */
        int sizeOfIndexArray();
        
        /**
         * Sets array of all "index" element
         */
        void setIndexArray(com.guidewire.datamodel.IndexDocument.Index[] indexArray);
        
        /**
         * Sets ith "index" element
         */
        void setIndexArray(int i, com.guidewire.datamodel.IndexDocument.Index index);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "index" element
         */
        com.guidewire.datamodel.IndexDocument.Index insertNewIndex(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "index" element
         */
        com.guidewire.datamodel.IndexDocument.Index addNewIndex();
        
        /**
         * Removes the ith "index" element
         */
        void removeIndex(int i);
        
        /**
         * Gets array of all "param" elements
         */
        com.guidewire.datamodel.ParamDocument.Param[] getParamArray();
        
        /**
         * Gets ith "param" element
         */
        com.guidewire.datamodel.ParamDocument.Param getParamArray(int i);
        
        /**
         * Returns number of "param" element
         */
        int sizeOfParamArray();
        
        /**
         * Sets array of all "param" element
         */
        void setParamArray(com.guidewire.datamodel.ParamDocument.Param[] paramArray);
        
        /**
         * Sets ith "param" element
         */
        void setParamArray(int i, com.guidewire.datamodel.ParamDocument.Param param);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "param" element
         */
        com.guidewire.datamodel.ParamDocument.Param insertNewParam(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "param" element
         */
        com.guidewire.datamodel.ParamDocument.Param addNewParam();
        
        /**
         * Removes the ith "param" element
         */
        void removeParam(int i);
        
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
         * Gets the "base" attribute
         */
        boolean getBase();
        
        /**
         * Gets (as xml) the "base" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetBase();
        
        /**
         * True if has "base" attribute
         */
        boolean isSetBase();
        
        /**
         * Sets the "base" attribute
         */
        void setBase(boolean base);
        
        /**
         * Sets (as xml) the "base" attribute
         */
        void xsetBase(org.apache.xmlbeans.XmlBoolean base);
        
        /**
         * Unsets the "base" attribute
         */
        void unsetBase();
        
        /**
         * Gets the "effdatedOnly" attribute
         */
        boolean getEffdatedOnly();
        
        /**
         * Gets (as xml) the "effdatedOnly" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetEffdatedOnly();
        
        /**
         * True if has "effdatedOnly" attribute
         */
        boolean isSetEffdatedOnly();
        
        /**
         * Sets the "effdatedOnly" attribute
         */
        void setEffdatedOnly(boolean effdatedOnly);
        
        /**
         * Sets (as xml) the "effdatedOnly" attribute
         */
        void xsetEffdatedOnly(org.apache.xmlbeans.XmlBoolean effdatedOnly);
        
        /**
         * Unsets the "effdatedOnly" attribute
         */
        void unsetEffdatedOnly();
        
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
         * Gets the "requires" attribute
         */
        java.lang.String getRequires();
        
        /**
         * Gets (as xml) the "requires" attribute
         */
        org.apache.xmlbeans.XmlString xgetRequires();
        
        /**
         * True if has "requires" attribute
         */
        boolean isSetRequires();
        
        /**
         * Sets the "requires" attribute
         */
        void setRequires(java.lang.String requires);
        
        /**
         * Sets (as xml) the "requires" attribute
         */
        void xsetRequires(org.apache.xmlbeans.XmlString requires);
        
        /**
         * Unsets the "requires" attribute
         */
        void unsetRequires();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.guidewire.datamodel.DelegateDocument.Delegate newInstance() {
              return (com.guidewire.datamodel.DelegateDocument.Delegate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.guidewire.datamodel.DelegateDocument.Delegate newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.guidewire.datamodel.DelegateDocument.Delegate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.guidewire.datamodel.DelegateDocument newInstance() {
          return (com.guidewire.datamodel.DelegateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.guidewire.datamodel.DelegateDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.guidewire.datamodel.DelegateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.guidewire.datamodel.DelegateDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.DelegateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.guidewire.datamodel.DelegateDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.DelegateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.guidewire.datamodel.DelegateDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.DelegateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.guidewire.datamodel.DelegateDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.DelegateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.guidewire.datamodel.DelegateDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.DelegateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.guidewire.datamodel.DelegateDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.DelegateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.guidewire.datamodel.DelegateDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.DelegateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.guidewire.datamodel.DelegateDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.DelegateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.guidewire.datamodel.DelegateDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.DelegateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.guidewire.datamodel.DelegateDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.DelegateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.guidewire.datamodel.DelegateDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.DelegateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.guidewire.datamodel.DelegateDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.DelegateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.guidewire.datamodel.DelegateDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.DelegateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.guidewire.datamodel.DelegateDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.DelegateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.DelegateDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.DelegateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.DelegateDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.DelegateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
