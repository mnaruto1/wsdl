
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package org.netbeans.xml.schema.carrental;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://xml.netbeans.org/schema/carRental".equals(namespaceURI) &&
                  "CarResponseType".equals(typeName)){
                   
                            return  org.netbeans.xml.schema.carrental.CarResponseType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://xml.netbeans.org/schema/carRental".equals(namespaceURI) &&
                  "CarRequestType".equals(typeName)){
                   
                            return  org.netbeans.xml.schema.carrental.CarRequestType.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    