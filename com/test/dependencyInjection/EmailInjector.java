package com.test.dependencyInjection;

public class EmailInjector implements Injector {

	@Override
	public MyConsumer getConsumer() {
		// TODO Auto-generated method stub
		return new MyApplication(new EmailServiceimpl());
	}
	

}
