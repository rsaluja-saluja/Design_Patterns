package com.test.obsever;

public interface Subject {

	public void registerObserver(Observer ob);
	public void unregisterObserver(Observer ob);
	public void notifyObservers();
	public String getUpdate();
}
