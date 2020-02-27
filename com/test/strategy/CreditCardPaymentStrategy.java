package com.test.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy{
	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	
	public CreditCardPaymentStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
	}


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCardNumber() {
		return cardNumber;
	}



	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}



	public String getCvv() {
		return cvv;
	}



	public void setCvv(String cvv) {
		this.cvv = cvv;
	}



	public String getDateOfExpiry() {
		return dateOfExpiry;
	}



	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}



	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println("payment done cia credit card for amount: "+amount);
	}

}
