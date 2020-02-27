package com.test.strategy;

public class PayPalPaymentStrategy implements PaymentStrategy {
	
	private String emailId;
	private String password;
	
	
	public PayPalPaymentStrategy(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println("payment done via pay pal for amount: "+amount);
	}
	

}
