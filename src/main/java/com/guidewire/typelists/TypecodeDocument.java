/*
 * An XML document type.
 * Localname: typecode
 * Namespace: http://guidewire.com/typelists
 * Java type: com.guidewire.typelists.TypecodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.typelists;


/**
 * A document containing one typecode(@http://guidewire.com/typelists) element.
 *
 * This is a complex type.
 */
public interface TypecodeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TypecodeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("typecode222edoctype");
    
    /**
     * Gets the "typecode" element
     */
    com.guidewire.typelists.TypecodeDocument.Typecode getTypecode();
    
    /**
     * Sets the "typecode" element
     */
    void setTypecode(com.guidewire.typelists.TypecodeDocument.Typecode typecode);
    
    /**
     * Appends and returns a new empty "typecode" element
     */
    com.guidewire.typelists.TypecodeDocument.Typecode addNewTypecode();
    
    /**
     * An XML typecode(@http://guidewire.com/typelists).
     *
     * This is a complex type.
     */
    public interface Typecode extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Typecode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("typecode7f31elemtype");
        
        /**
         * Gets array of all "category" elements
         */
        com.guidewire.typelists.CategoryDocument.Category[] getCategoryArray();
        
        /**
         * Gets ith "category" element
         */
        com.guidewire.typelists.CategoryDocument.Category getCategoryArray(int i);
        
        /**
         * Returns number of "category" element
         */
        int sizeOfCategoryArray();
        
        /**
         * Sets array of all "category" element
         */
        void setCategoryArray(com.guidewire.typelists.CategoryDocument.Category[] categoryArray);
        
        /**
         * Sets ith "category" element
         */
        void setCategoryArray(int i, com.guidewire.typelists.CategoryDocument.Category category);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "category" element
         */
        com.guidewire.typelists.CategoryDocument.Category insertNewCategory(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "category" element
         */
        com.guidewire.typelists.CategoryDocument.Category addNewCategory();
        
        /**
         * Removes the ith "category" element
         */
        void removeCategory(int i);
        
        /**
         * Gets array of all "categorylist" elements
         */
        com.guidewire.typelists.CategorylistDocument.Categorylist[] getCategorylistArray();
        
        /**
         * Gets ith "categorylist" element
         */
        com.guidewire.typelists.CategorylistDocument.Categorylist getCategorylistArray(int i);
        
        /**
         * Returns number of "categorylist" element
         */
        int sizeOfCategorylistArray();
        
        /**
         * Sets array of all "categorylist" element
         */
        void setCategorylistArray(com.guidewire.typelists.CategorylistDocument.Categorylist[] categorylistArray);
        
        /**
         * Sets ith "categorylist" element
         */
        void setCategorylistArray(int i, com.guidewire.typelists.CategorylistDocument.Categorylist categorylist);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "categorylist" element
         */
        com.guidewire.typelists.CategorylistDocument.Categorylist insertNewCategorylist(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "categorylist" element
         */
        com.guidewire.typelists.CategorylistDocument.Categorylist addNewCategorylist();
        
        /**
         * Removes the ith "categorylist" element
         */
        void removeCategorylist(int i);
        
        /**
         * Gets array of all "typecodelocalization" elements
         */
        com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization[] getTypecodelocalizationArray();
        
        /**
         * Gets ith "typecodelocalization" element
         */
        com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization getTypecodelocalizationArray(int i);
        
        /**
         * Returns number of "typecodelocalization" element
         */
        int sizeOfTypecodelocalizationArray();
        
        /**
         * Sets array of all "typecodelocalization" element
         */
        void setTypecodelocalizationArray(com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization[] typecodelocalizationArray);
        
        /**
         * Sets ith "typecodelocalization" element
         */
        void setTypecodelocalizationArray(int i, com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization typecodelocalization);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "typecodelocalization" element
         */
        com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization insertNewTypecodelocalization(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "typecodelocalization" element
         */
        com.guidewire.typelists.TypecodelocalizationDocument.Typecodelocalization addNewTypecodelocalization();
        
        /**
         * Removes the ith "typecodelocalization" element
         */
        void removeTypecodelocalization(int i);
        
        /**
         * Gets the "code" attribute
         */
        java.lang.String getCode();
        
        /**
         * Gets (as xml) the "code" attribute
         */
        org.apache.xmlbeans.XmlNMTOKEN xgetCode();
        
        /**
         * Sets the "code" attribute
         */
        void setCode(java.lang.String code);
        
        /**
         * Sets (as xml) the "code" attribute
         */
        void xsetCode(org.apache.xmlbeans.XmlNMTOKEN code);
        
        /**
         * Gets the "desc" attribute
         */
        java.lang.String getDesc();
        
        /**
         * Gets (as xml) the "desc" attribute
         */
        org.apache.xmlbeans.XmlString xgetDesc();
        
        /**
         * Sets the "desc" attribute
         */
        void setDesc(java.lang.String desc);
        
        /**
         * Sets (as xml) the "desc" attribute
         */
        void xsetDesc(org.apache.xmlbeans.XmlString desc);
        
        /**
         * Gets the "id" attribute
         */
        java.math.BigInteger getId();
        
        /**
         * Gets (as xml) the "id" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetId();
        
        /**
         * True if has "id" attribute
         */
        boolean isSetId();
        
        /**
         * Sets the "id" attribute
         */
        void setId(java.math.BigInteger id);
        
        /**
         * Sets (as xml) the "id" attribute
         */
        void xsetId(org.apache.xmlbeans.XmlInteger id);
        
        /**
         * Unsets the "id" attribute
         */
        void unsetId();
        
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
         * Gets the "priority" attribute
         */
        java.math.BigInteger getPriority();
        
        /**
         * Gets (as xml) the "priority" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetPriority();
        
        /**
         * True if has "priority" attribute
         */
        boolean isSetPriority();
        
        /**
         * Sets the "priority" attribute
         */
        void setPriority(java.math.BigInteger priority);
        
        /**
         * Sets (as xml) the "priority" attribute
         */
        void xsetPriority(org.apache.xmlbeans.XmlInteger priority);
        
        /**
         * Unsets the "priority" attribute
         */
        void unsetPriority();
        
        /**
         * Gets the "retired" attribute
         */
        boolean getRetired();
        
        /**
         * Gets (as xml) the "retired" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetRetired();
        
        /**
         * True if has "retired" attribute
         */
        boolean isSetRetired();
        
        /**
         * Sets the "retired" attribute
         */
        void setRetired(boolean retired);
        
        /**
         * Sets (as xml) the "retired" attribute
         */
        void xsetRetired(org.apache.xmlbeans.XmlBoolean retired);
        
        /**
         * Unsets the "retired" attribute
         */
        void unsetRetired();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.guidewire.typelists.TypecodeDocument.Typecode newInstance() {
              return (com.guidewire.typelists.TypecodeDocument.Typecode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.guidewire.typelists.TypecodeDocument.Typecode newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.guidewire.typelists.TypecodeDocument.Typecode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.guidewire.typelists.TypecodeDocument newInstance() {
          return (com.guidewire.typelists.TypecodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.guidewire.typelists.TypecodeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.guidewire.typelists.TypecodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.guidewire.typelists.TypecodeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.typelists.TypecodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.guidewire.typelists.TypecodeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.typelists.TypecodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.guidewire.typelists.TypecodeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.typelists.TypecodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.guidewire.typelists.TypecodeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.typelists.TypecodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.guidewire.typelists.TypecodeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.typelists.TypecodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.guidewire.typelists.TypecodeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.typelists.TypecodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.guidewire.typelists.TypecodeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.typelists.TypecodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.guidewire.typelists.TypecodeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.typelists.TypecodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.guidewire.typelists.TypecodeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.typelists.TypecodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.guidewire.typelists.TypecodeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.typelists.TypecodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.guidewire.typelists.TypecodeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.typelists.TypecodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.guidewire.typelists.TypecodeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.typelists.TypecodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.guidewire.typelists.TypecodeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.typelists.TypecodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.guidewire.typelists.TypecodeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.typelists.TypecodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.typelists.TypecodeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.typelists.TypecodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.typelists.TypecodeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.typelists.TypecodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
