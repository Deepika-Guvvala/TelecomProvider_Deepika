package com.stubs;

import java.util.ArrayList;
import java.util.List;

import com.beans.PhoneData;

public class DataStub {
	
	
	
	
	public List<PhoneData> getPhoneData(){
		
		List<PhoneData> phoneDataList = new ArrayList<>();
		
		
		PhoneData phoneData1 = new PhoneData("07732145895","A",true);
		phoneDataList.add(phoneData1);
		
		PhoneData phoneData2 = new PhoneData("07822145895","A",false);
		phoneDataList.add(phoneData2);
		
		
		PhoneData phoneData3 = new PhoneData("07832145895","A",true);
		phoneDataList.add(phoneData3);
		
		PhoneData phoneData4 = new PhoneData("07832145896","B",true);
		phoneDataList.add(phoneData4);
		
		PhoneData phoneData5 = new PhoneData("07835145895","C",true);
		phoneDataList.add(phoneData5);
		
		PhoneData phoneData6 = new PhoneData("07832145795","D",true);
		phoneDataList.add(phoneData6);
		
		PhoneData phoneData7 = new PhoneData("07832115895","E",false);
		phoneDataList.add(phoneData7);
		
		return phoneDataList;
	}
	
	

}
