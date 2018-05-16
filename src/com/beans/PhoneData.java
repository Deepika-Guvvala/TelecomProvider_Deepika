package com.beans;

import javax.xml.bind.annotation.XmlElement;

public class PhoneData {
	
	private String phoneNum;
	private String customer;
	private boolean active;
	
	public PhoneData(String phoneNum, String customer, boolean active){  
	      this.phoneNum = phoneNum; 
	      this.customer = customer; 
	      this.active = active; 
	   }  
	
	
	public String getPhoneNum() {
		return phoneNum;
	}
	@XmlElement
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public String getCustomer() {
		return customer;
	}
	@XmlElement
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	
	public boolean isActive() {
		return active;
	}
	@XmlElement
	public void setActive(boolean active) {
		this.active = active;
	}
	
	

}
