package com.handlers.Interface;

import java.util.List;

public interface PhoneNumbers {
	
	public List<String> getAllPhoneNumbers();
	
	public List<String> getAllPhoneNumbersofCustomer(String customer);
	
	public void activatePhoneNumber(String number);

}
