
/**
 * HotelReservationWSDLFileSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package org.example.www.hotelreservationwsdlfile;
    import java.text.SimpleDateFormat;  
    import java.text.ParseException;   
    import java.util.Date;   
import org.netbeans.xml.schema.hotelreservation.HotelRequestType;
import org.netbeans.xml.schema.hotelreservation.HotelResponse;
import org.netbeans.xml.schema.hotelreservation.HotelResponseType;

/**
     *  HotelReservationWSDLFileSkeleton java skeleton for the axisService
     */
    public class HotelReservationWSDLFileSkeleton{
        
         public static int romid=1;
        /**
         * Auto generated method signature
         * 
                                     * @param hotelRequest 
             * @return hotelResponse 
         */
        
                 public org.netbeans.xml.schema.hotelreservation.HotelResponse hotelReservation
                  (
                  org.netbeans.xml.schema.hotelreservation.HotelRequest hotelRequest
                  )
            {
                //TODO : fill this with the necessary business logic
                	 HotelResponse hr=new HotelResponse();
                    HotelResponseType hrt=new HotelResponseType();
                    
                    HotelRequestType hrqt=hotelRequest.getHotelRequest();
                    
                    
                    Date date1 = hrqt.getDateFrom();   
                    Date date2 = hrqt.getDateTo();   
                    // Calucalte time difference in milliseconds   
                    long time_difference = date2.getTime() - date1.getTime();  
                    
                    long days_difference = (time_difference / (1000*60*60*24)) % 365; 
                    
                    int pricefrom=hrqt.getPriceFrom();
                    int priceto=hrqt.getPriceTo();
                    int mprice=(pricefrom+priceto)/2;
                    int price=mprice*(int)days_difference;
                    
                    hrt.setRoomID(romid++);
                	hrt.setRoomPrice(price); 
                	
                	hr.setHotelResponse(hrt);
                	 return hr;
               // throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#hotelReservation");
        }
     
    }
    