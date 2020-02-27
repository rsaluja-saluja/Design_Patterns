package com.test.dependencyInjection;

public class SmsInjector implements Injector {

	@Override
	public MyConsumer getConsumer() {
		// TODO Auto-generated method stub
		return new MyApplication(new SmsServiceImple());
	}
	

}
