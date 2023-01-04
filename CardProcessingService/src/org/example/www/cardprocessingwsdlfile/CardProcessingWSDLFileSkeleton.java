
/**
 * CardProcessingWSDLFileSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package org.example.www.cardprocessingwsdlfile;

import org.netbeans.xml.schema.cardprocessing.CreditRequestType;
import org.netbeans.xml.schema.cardprocessing.CreditResponse;
import org.netbeans.xml.schema.cardprocessing.CreditResponseType;

/**
     *  CardProcessingWSDLFileSkeleton java skeleton for the axisService
     */
    public class CardProcessingWSDLFileSkeleton{
      static  int ayabalance=700;
      static  int omerbalance=1500;
        public static Integer transid=0;
         
        /**
         * Auto generated method signature
         * 
                                     * @param creditRequest 
             * @return creditResponse 
         */
        
                 public org.netbeans.xml.schema.cardprocessing.CreditResponse cardProcessing
                  (
                  org.netbeans.xml.schema.cardprocessing.CreditRequest creditRequest
                  )
            {
                //TODO : fill this with the necessary business logic
                String name="";
                int amount=0;
                int cardnum=0;
                CreditRequestType crqt=creditRequest.getCreditRequest();
                name=crqt.getName();
                amount=crqt.getAmount();
                cardnum=crqt.getCardNumber();
                CreditResponse cr=new CreditResponse();
                CreditResponseType crt=new CreditResponseType();
                cr.setCreditResponse(crt);
                crt.setStatus("error name or card number");
                crt.setTransactionID(transid++);
                if(name.equalsIgnoreCase("aya") && cardnum==222) {
                	if(amount>ayabalance)
                		crt.setStatus("not enough balance");
                	else {
                		ayabalance-=amount;
                		crt.setStatus("success your current balance "+ayabalance);
                	}
                	
                }
                if(name.equalsIgnoreCase("omer") && cardnum==333) {
                	if(amount>omerbalance)
                		crt.setStatus("not enough balance");
                	else {
                		omerbalance-=amount;
                		crt.setStatus("success your current balance "+omerbalance);
                	}
                	
                }
                	 
                	 
              
                return cr;
                	//throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#cardProcessing");
        }
     
    }
    