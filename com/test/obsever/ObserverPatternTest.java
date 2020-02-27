package com.test.obsever;

public class ObserverPatternTest {
	
public static void main(String[] args) {
	

	Observer ob1 = new MyTopicSubscriber("obj1");
	Observer ob2 = new MyTopicSubscriber("obj2");
	Observer ob3 = new MyTopicSubscriber("obj3");
	
	MyTopic topic = new MyTopic();
	
	ob1.setSubject(topic);
	ob2.setSubject(topic);
	ob3.setSubject(topic);
	
	topic.registerObserver(ob1);
	topic.registerObserver(ob2);
	topic.registerObserver(ob3);
	
	topic.postMessage("Hello World");
	
	Observer ob4 = new MyTopicSubscriber("obj4");
	ob4.setSubject(topic);
	topic.registerObserver(ob4);
	
	topic.postMessage("Hello World Again");
	
}
	
}
