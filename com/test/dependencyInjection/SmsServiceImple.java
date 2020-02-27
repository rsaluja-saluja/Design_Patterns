package com.test.dependencyInjection;

public class SmsServiceImple implements MessageService {

	@Override
	public void sendMessage(String message, String rec) {
		// TODO Auto-generated method stub
		System.out.println("Sending SMS message: "+message+" to "+rec);
	}
	

}
