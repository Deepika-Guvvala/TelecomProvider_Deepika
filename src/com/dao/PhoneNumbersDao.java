package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.beans.PhoneData;
import com.handlers.Interface.PhoneNumbers;
import com.stubs.DataStub;

public class PhoneNumbersDao implements PhoneNumbers{

	@Override
	public List<String> getAllPhoneNumbers() {
		List<PhoneData> phonedata = new DataStub().getPhoneData();
		List<String> phoneNums = new ArrayList<>();
		for(int i=0;i<phonedata.size();i++) {
			phoneNums.add(phonedata.get(i).getPhoneNum());
		}

		return phoneNums;
	}

	@Override
	public List<String> getAllPhoneNumbersofCustomer(String customer) {
		List<PhoneData> phonedata = new DataStub().getPhoneData();
		List<String> phoneNums = new ArrayList<>();
		if(customer != null) {
			for(int i=0;i<phonedata.size();i++) {
				if(customer.equals(phonedata.get(i).getCustomer())) {
					phoneNums.add(phonedata.get(i).getPhoneNum());
				}
			}
		}

		return phoneNums;
	}

	@Override
	public void activatePhoneNumber(String number) {
		
		List<PhoneData> phonedata = new DataStub().getPhoneData();
		if(number != null) {
			for(int i=0;i<phonedata.size();i++) {
				if(number.equals(phonedata.get(i).getPhoneNum())) {
					phonedata.get(i).setActive(true);
					break;
				}
			}
		}
		
	}

}
