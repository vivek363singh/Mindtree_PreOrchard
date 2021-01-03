package com.mindtree.bank;

class Account {
	
	int AccNo;
	float AccBalance;
	String AccName,AccType,City;
	
	
	
	public Account() {
		super();
	}
	public Account(int accNo, float accBalance, String accName, String accType, String city) {
		super();
		AccNo = accNo;
		AccBalance = accBalance;
		AccName = accName;
		AccType = accType;
		City = city;
	}
	public int getAccNo() {
		return AccNo;
	}
	public void setAccNo(int accNo) {
		AccNo = accNo;
	}
	public float getAccBalance() {
		return AccBalance;
	}
	public void setAccBalance(float accBalance) {
		AccBalance = accBalance;
	}
	public String getAccName() {
		return AccName;
	}
	public void setAccName(String accName) {
		AccName = accName;
	}
	public String getAccType() {
		return AccType;
	}
	public void setAccType(String accType) {
		AccType = accType;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	@Override
	public String toString() {
		return "Account Details [AccNo=" + AccNo + ", AccBalance=" + AccBalance + ", AccName=" + AccName + ", AccType="
				+ AccType + ", City=" + City + "]";
	}
	
	
	

}
