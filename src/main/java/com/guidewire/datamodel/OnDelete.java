/*
 * XML Type:  OnDelete
 * Namespace: http://guidewire.com/datamodel
 * Java type: com.guidewire.datamodel.OnDelete
 *
 * Automatically generated - do not modify.
 */
package com.guidewire.datamodel;


/**
 * An XML OnDelete(@http://guidewire.com/datamodel).
 *
 * This is an atomic type that is a restriction of com.guidewire.datamodel.OnDelete.
 */
public interface OnDelete extends org.apache.xmlbeans.XmlNMTOKEN
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OnDelete.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9587339C31721F4D1AB33B21A0364588").resolveHandle("ondeleted29ftype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum CASCADE = Enum.forString("cascade");
    static final Enum NOACTION = Enum.forString("noaction");
    static final Enum SETNULL = Enum.forString("setnull");
    
    static final int INT_CASCADE = Enum.INT_CASCADE;
    static final int INT_NOACTION = Enum.INT_NOACTION;
    static final int INT_SETNULL = Enum.INT_SETNULL;
    
    /**
     * Enumeration value class for com.guidewire.datamodel.OnDelete.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_CASCADE
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_CASCADE = 1;
        static final int INT_NOACTION = 2;
        static final int INT_SETNULL = 3;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("cascade", INT_CASCADE),
                new Enum("noaction", INT_NOACTION),
                new Enum("setnull", INT_SETNULL),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.guidewire.datamodel.OnDelete newValue(java.lang.Object obj) {
          return (com.guidewire.datamodel.OnDelete) type.newValue( obj ); }
        
        public static com.guidewire.datamodel.OnDelete newInstance() {
          return (com.guidewire.datamodel.OnDelete) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.guidewire.datamodel.OnDelete newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.guidewire.datamodel.OnDelete) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.guidewire.datamodel.OnDelete parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.OnDelete) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.guidewire.datamodel.OnDelete parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.OnDelete) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.guidewire.datamodel.OnDelete parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.OnDelete) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.guidewire.datamodel.OnDelete parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.OnDelete) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.guidewire.datamodel.OnDelete parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.OnDelete) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.guidewire.datamodel.OnDelete parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.OnDelete) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.guidewire.datamodel.OnDelete parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.OnDelete) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.guidewire.datamodel.OnDelete parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.OnDelete) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.guidewire.datamodel.OnDelete parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.OnDelete) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.guidewire.datamodel.OnDelete parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.guidewire.datamodel.OnDelete) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.guidewire.datamodel.OnDelete parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.OnDelete) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.guidewire.datamodel.OnDelete parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.OnDelete) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.guidewire.datamodel.OnDelete parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.OnDelete) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.guidewire.datamodel.OnDelete parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.guidewire.datamodel.OnDelete) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.OnDelete parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.OnDelete) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.guidewire.datamodel.OnDelete parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.guidewire.datamodel.OnDelete) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
