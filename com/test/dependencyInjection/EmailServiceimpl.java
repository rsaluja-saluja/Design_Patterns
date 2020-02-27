package com.test.dependencyInjection;

public class EmailServiceimpl implements MessageService {

	@Override
	public void sendMessage(String message, String rec) {
		// TODO Auto-generated method stub
		System.out.println("Sending Email message: "+message+" to "+rec);
		
	}
	
	

}
