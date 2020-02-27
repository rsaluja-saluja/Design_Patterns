package com.test.strategy;

public class ShoppingCartTest {

	public static void main(String[] args) {
		Item item1 = new Item("1234", 300);
		Item item2 = new Item("4567", 200);
		
		ShoppingCart  cart = new ShoppingCart();
		cart.addItem(item1);
		cart.addItem(item2);
		
		System.out.println("Total price: "+cart.calculatePrice());
		
		cart.payAmount(new CreditCardPaymentStrategy("Rajni", "12234", "234", "121220"));
		
		cart.payAmount(new PayPalPaymentStrategy("abc@gmail.com", "abc123"));
		
	}
}
