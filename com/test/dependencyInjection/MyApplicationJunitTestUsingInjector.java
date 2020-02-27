package com.test.dependencyInjection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyApplicationJunitTestUsingInjector {

	Injector inj;
	
	@BeforeEach
	void setUp() throws Exception {
		inj = new Injector() {
			
			@Override
			public MyConsumer getConsumer() {
				// TODO Auto-generated method stub
				return new MyConsumer() {
					
					@Override
					public void processMessage(String msg, String rec) {
						// TODO Auto-generated method stub
						System.out.println("Sending mock message via injector: "+msg+" to "+rec);
					}
				};
			}
		};
	}

	@AfterEach
	void tearDown() throws Exception {
		inj = null;
	}

	@Test
	void test() {
		inj.getConsumer().processMessage("Hi Everyone", "123456789");
	}

}
