
/**
 * FlightWSDLFileSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package org.example.www.flightwsdlfile;

import org.netbeans.xml.schema.flight.FlightResponse;
import org.netbeans.xml.schema.flight.FlightResponseType;

/**
     *  FlightWSDLFileSkeleton java skeleton for the axisService
     */
    public class FlightWSDLFileSkeleton{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param flightRequest 
             * @return flightResponse 
         */
        
                 public org.netbeans.xml.schema.flight.FlightResponse flightRequest
                  (
                  org.netbeans.xml.schema.flight.FlightRequest flightRequest
                  )
            {
                	FlightResponse fr=new FlightResponse();
                	FlightResponseType frt=new FlightResponseType();
                	frt.setStatus("success");
                	
                	fr.setFlightResponse(frt);
                //TODO : fill this with the necessary business logic
                	return fr;
               // throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#flightRequest");
        }
     
    }
    