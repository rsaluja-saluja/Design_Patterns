package com.test.dependencyInjection;

public class MyCient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String msg = "Hi !!!";
		String smsRec = "123456789";
		String emailRec = "abc@gmail.com";
		//MyConsumer c = null;
		Injector inj = null;
		
		inj = new EmailInjector();
		inj.getConsumer().processMessage(msg, emailRec);
		
		inj = new SmsInjector();
		inj.getConsumer().processMessage(msg, smsRec);
	}

}
