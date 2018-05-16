package com.handlers.Interface;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.dao.PhoneNumbersDao;

@Path("/PhoneService")
public class NumbersService {
	PhoneNumbersDao phoneDao = new PhoneNumbersDao();  
	   @GET 
	   @Path("/numbers") 
	   @Produces(MediaType.APPLICATION_XML) 
	   public List<String> getAllNumbers(){ 
	      return phoneDao.getAllPhoneNumbers();
	   }  
	   
	   @GET 
	   @Path("/customerNumbers") 
	   @Produces(MediaType.APPLICATION_XML) 
	   public List<String> getNumOfCust(@QueryParam("customer") String cust){ 
	      return phoneDao.getAllPhoneNumbersofCustomer(cust);
	   }  
	   
	   @GET 
	   @Path("/activateNumber") 
	   @Produces(MediaType.APPLICATION_XML) 
	   public void activateNum(@QueryParam("number") String number){ 
	       phoneDao.activatePhoneNumber(number);
	   }  

}
