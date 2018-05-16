package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.dao.PhoneNumbersDao;
import com.handlers.Interface.PhoneNumbers;

public class TestNumbersService {

	@Test
	public void getAllPhoneNumbersPosTest() {
		PhoneNumbers ph =  new PhoneNumbersDao();
		
		List<String> numbers =  ph.getAllPhoneNumbers();
		List<String> checkNum = new ArrayList<>();
		checkNum.add("07732145895");
		checkNum.add("07822145895");
		checkNum.add("07832145895");
		checkNum.add("07832145896");
		checkNum.add("07835145895");
		checkNum.add("07832145795");
		checkNum.add("07832115895");
		
		assertEquals(checkNum, numbers);
	}
	
	@Test
	public void getAllPhoneNumbersNegTest() {
		PhoneNumbers ph =  new PhoneNumbersDao();
		
		List<String> numbers =  ph.getAllPhoneNumbers();
		List<String> checkNum = new ArrayList<>();
		checkNum.add("07732145895");
		
		
		assertNotSame(checkNum, numbers);
	}
	
	@Test
	public void getAllPhoneNumbersOfCustPosTest() {
		PhoneNumbers ph =  new PhoneNumbersDao();
		
		List<String> numbers =  ph.getAllPhoneNumbersofCustomer("A");
		List<String> checkNum = new ArrayList<>();
		checkNum.add("07732145895");
		checkNum.add("07822145895");
		checkNum.add("07832145895");
		
		
		assertEquals(checkNum, numbers);
	}
	
	@Test
	public void getAllPhoneNumbersOfCustNegTest() {
		PhoneNumbers ph =  new PhoneNumbersDao();
		
		List<String> numbers =  ph.getAllPhoneNumbersofCustomer("A");
		List<String> checkNum = new ArrayList<>();
		checkNum.add("07732145895");
		checkNum.add("07822145895");
		
		assertNotSame(checkNum, numbers);
	}

}
