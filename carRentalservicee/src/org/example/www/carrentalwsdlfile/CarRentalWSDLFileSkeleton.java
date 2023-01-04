package org.example.www.carrentalwsdlfile;

/**
 * CarRentalWSDLFileSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */


import org.netbeans.xml.schema.carrental.CarRequestType;
import org.netbeans.xml.schema.carrental.CarResponse;
import org.netbeans.xml.schema.carrental.CarResponseType;

/**
     *  CarRentalWSDLFileSkeleton java skeleton for the axisService
     */
    public class CarRentalWSDLFileSkeleton{
        
         public static int discount_ratio=10;
         public static int day_cost=50;
        /**
         * Auto generated method signature
         * 
                                     * @param carRequest 
             * @return carResponse 
         */
        
                 public org.netbeans.xml.schema.carrental.CarResponse carRental
                  (
                  org.netbeans.xml.schema.carrental.CarRequest carRequest
                  )
            {
                	 CarRequestType crqt=carRequest.getCarRequest();
                	 int priod=crqt.getRentPeriod();
                	 String car=crqt.getCar();
                	 
                	 CarResponse crs=new CarResponse();
                	 CarResponseType crst=new CarResponseType();
                	 
                	 int price=priod*day_cost;
                	 int discount=price/10;
                	// price-=discount;
                	 
                	 String msg= "total cost = "+( price-discount) ;
                	 
                	 crst.setDiscount(discount);
                	 crst.setPrice(price);
                	 crst.setPref(msg);
                	 
                	 
                	 crs.setCarResponse(crst); 
                	 return crs;
                //TODO : fill this with the necessary business logic
                //throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#carRental");
        }
     
    }
    