package com.test.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Item> items;

	public ShoppingCart() {
		this.items = new ArrayList<Item>();
	}

	public void addItem(Item item) {
		this.items.add(item);
	}
	
	public void removeItem(Item item) {
		this.items.remove(item);
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	public int calculatePrice()
	{
		int price = 0; 
		for (Item item : items)
		{
			price = price + item.getPrice();
		}
		return price;
	}
	
	public void payAmount(PaymentStrategy paymentstrategy)
	{
		int amount = calculatePrice();
		paymentstrategy.pay(amount);
		
	}
	
}
