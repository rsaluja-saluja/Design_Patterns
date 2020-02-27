package com.test.obsever;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {
	
	private List<Observer> observersList;
	private String msg;
	private Boolean msgChanged;
	private final Object MUTEX = new Object();
	

	public MyTopic() {
	
		this.observersList = new ArrayList<Observer>();
	}


	@Override
	public void registerObserver(Observer ob) {
		// TODO Auto-generated method stub
		if(ob == null)
		{
			throw new NullPointerException("Observer parameter is null");
		}
		synchronized (MUTEX) {
			if(!observersList.contains(ob)) {
				observersList.add(ob);
			}
		}
	}

	@Override
	public void unregisterObserver(Observer ob) {
		// TODO Auto-generated method stub
		if(ob == null)
		{
			throw new NullPointerException("Observer parameter is null");
		}
		synchronized (MUTEX) {
			
			if(observersList.contains(ob)) {
				observersList.remove(ob);
			}
		}
		
	}


	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		List<Observer> observers = null;
		synchronized (MUTEX) {
			if(!msgChanged)
				return;
			observers = new ArrayList<Observer>(this.observersList);
			msgChanged = false;
			for(Observer ob:observers) {
				ob.update();
			}
		}
	}
	
	@Override
	public String getUpdate() {
		return this.msg;
	}
	
	public void postMessage(String str) {
		System.out.println("message update is: "+str);
		this.msg = str;
		this.msgChanged = true;
		notifyObservers();
	}
	
}
