package com.test.dependencyInjection;

import java.util.function.Consumer;

public class MyApplication implements MyConsumer {

	MessageService msgSrv;
	
	
	public MyApplication(MessageService msgSrv) {
		super();
		this.msgSrv = msgSrv;
	}


	@Override
	public void processMessage(String msg, String rec) {
		// TODO Auto-generated method stub
		msgSrv.sendMessage(msg, rec);
	}

	

}
