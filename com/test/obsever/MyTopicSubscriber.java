package com.test.obsever;

public class MyTopicSubscriber implements Observer {

	Subject topic;
	String name;
	
	
	public MyTopicSubscriber(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		//System.out.println("Update received");
		String msg = topic.getUpdate();
		if(msg != null) {
			System.out.println(name+"::Message received is: "+msg);
		} else
			System.out.println("No New message");
			
		
	}

	@Override
	public void setSubject(Subject sub) {
		// TODO Auto-generated method stub
		this.topic = sub;
	}
	
}
