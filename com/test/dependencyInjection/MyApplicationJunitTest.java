package com.test.dependencyInjection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyApplicationJunitTest {

	private MyConsumer c;
	
	@BeforeEach
	void setUp() throws Exception {
		c = new MyApplication(new MessageService() {
			
			@Override
			public void sendMessage(String message, String rec) {
				// TODO Auto-generated method stub
				System.out.println("Sending mock message: "+message+" to "+rec);
			}
		});
	}

	@AfterEach
	void tearDown() throws Exception {
		c = null;
	}

	@Test
	void test() {
		c.processMessage("Hi", "123@gmail.com");
//		fail("Not yet implemented");
	}

}
