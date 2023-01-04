
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package org.example.www.flightwsdlfile;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://xml.netbeans.org/schema/Flight".equals(namespaceURI) &&
                  "Ticket_type0".equals(typeName)){
                   
                            return  org.netbeans.xml.schema.flight.Ticket_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://xml.netbeans.org/schema/Flight".equals(namespaceURI) &&
                  "FlightRequestType".equals(typeName)){
                   
                            return  org.netbeans.xml.schema.flight.FlightRequestType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://xml.netbeans.org/schema/Flight".equals(namespaceURI) &&
                  "FlightResponseType".equals(typeName)){
                   
                            return  org.netbeans.xml.schema.flight.FlightResponseType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://xml.netbeans.org/schema/Flight".equals(namespaceURI) &&
                  "NearWindow_type0".equals(typeName)){
                   
                            return  org.netbeans.xml.schema.flight.NearWindow_type0.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    