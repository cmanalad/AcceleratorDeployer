/*
 * An XML document type.
 * Localname: typefilter
 * Namespace: http://guidewire.com/typelists
 * Java type: com.guidewire.typelists.TypefilterDocument
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.typelists;


/**
 * A document containing one typefilter(@http://guidewire.com/typelists) element.
 *
 * This is a complex type.
 */
public interface TypefilterDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TypefilterDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("typefiltercc03doctype");
    
    /**
     * Gets the "typefilter" element
     */
    com.guidewire.typelists.TypefilterDocument.Typefilter getTypefilter();
    
    /**
     * Sets the "typefilter" element
     */
    void setTypefilter(com.guidewire.typelists.TypefilterDocument.Typefilter typefilter);
    
    /**
     * Appends and returns a new empty "typefilter" element
     */
    com.guidewire.typelists.TypefilterDocument.Typefilter addNewTypefilter();
    
    /**
     * An XML typefilter(@http://guidewire.com/typelists).
     *
     * This is a complex type.
     */
    public interface Typefilter extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Typefilter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("typefilter80d1elemtype");
        
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
         * Gets array of all "exclude" elements
         */
        com.guidewire.typelists.ExcludeDocument.Exclude[] getExcludeArray();
        
        /**
         * Gets ith "exclude" element
         */
        com.guidewire.typelists.ExcludeDocument.Exclude getExcludeArray(int i);
        
        /**
         * Returns number of "exclude" element
         */
        int sizeOfExcludeArray();
        
        /**
         * Sets array of all "exclude" element
         */
        void setExcludeArray(com.guidewire.typelists.ExcludeDocument.Exclude[] excludeArray);
        
        /**
         * Sets ith "exclude" element
         */
        void setExcludeArray(int i, com.guidewire.typelists.ExcludeDocument.Exclude exclude);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "exclude" element
         */
        com.guidewire.typelists.ExcludeDocument.Exclude insertNewExclude(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "exclude" element
         */
        com.guidewire.typelists.ExcludeDocument.Exclude addNewExclude();
        
        /**
         * Removes the ith "exclude" element
         */
        void removeExclude(int i);
        
        /**
         * Gets array of all "include" elements
         */
        com.guidewire.typelists.IncludeDocument.Include[] getIncludeArray();
        
        /**
         * Gets ith "include" element
         */
        com.guidewire.typelists.IncludeDocument.Include getIncludeArray(int i);
        
        /**
         * Returns number of "include" element
         */
        int sizeOfIncludeArray();
        
        /**
         * Sets array of all "include" element
         */
        void setIncludeArray(com.guidewire.typelists.IncludeDocument.Include[] includeArray);
        
        /**
         * Sets ith "include" element
         */
        void setIncludeArray(int i, com.guidewire.typelists.IncludeDocument.Include include);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "include" element
         */
        com.guidewire.typelists.IncludeDocument.Include insertNewInclude(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "include" element
         */
        com.guidewire.typelists.IncludeDocument.Include addNewInclude();
        
        /**
         * Removes the ith "include" element
         */
        void removeInclude(int i);
        
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
         * Gets the "includeAll" attribute
         */
        boolean getIncludeAll();
        
        /**
         * Gets (as xml) the "includeAll" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetIncludeAll();
        
        /**
         * True if has "includeAll" attribute
         */
        boolean isSetIncludeAll();
        
        /**
         * Sets the "includeAll" attribute
         */
        void setIncludeAll(boolean includeAll);
        
        /**
         * Sets (as xml) the "includeAll" attribute
         */
        void xsetIncludeAll(org.apache.xmlbeans.XmlBoolean includeAll);
        
        /**
         * Unsets the "includeAll" attribute
         */
        void unsetIncludeAll();
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.guidewire.typelists.TypefilterDocument.Typefilter newInstance() {
              return (com.guidewire.typelists.TypefilterDocument.Typefilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.guidewire.typelists.TypefilterDocument.Typefilter newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.guidewire.typelists.TypefilterDocument.Typefilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.guidewire.typelists.TypefilterDocument newInstance() {
          return (com.guidewire.typelists.TypefilterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.guidewire.typelists.TypefilterDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.guidewire.typelists.TypefilterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.guidewire.typelists.TypefilterDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.typelists.TypefilterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.guidewire.typelists.TypefilterDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.typelists.TypefilterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.guidewire.typelists.TypefilterDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.typelists.TypefilterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.guidewire.typelists.TypefilterDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.typelists.TypefilterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.guidewire.typelists.TypefilterDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.typelists.TypefilterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.guidewire.typelists.TypefilterDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.typelists.TypefilterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.guidewire.typelists.TypefilterDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.typelists.TypefilterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.guidewire.typelists.TypefilterDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.typelists.TypefilterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.guidewire.typelists.TypefilterDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.typelists.TypefilterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.guidewire.typelists.TypefilterDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.typelists.TypefilterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.guidewire.typelists.TypefilterDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.typelists.TypefilterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.guidewire.typelists.TypefilterDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.typelists.TypefilterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.guidewire.typelists.TypefilterDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.typelists.TypefilterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.guidewire.typelists.TypefilterDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.typelists.TypefilterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.typelists.TypefilterDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.typelists.TypefilterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.typelists.TypefilterDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.typelists.TypefilterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
