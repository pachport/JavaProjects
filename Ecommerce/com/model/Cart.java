package com.model;

import java.util.List;

public class Cart {
	
	private int cartID;
	private List<CartItems> items;
	private String modDate;
	private Client client;
	
	public Cart() {
		
	}

	public Cart(int cartID, String modDate, Client client) {
		this.cartID = cartID;
		this.modDate = modDate;
		this.client = client;
	}

	public int getCartID() {
		return cartID;
	}

	public void setCartID(int cartID) {
		this.cartID = cartID;
	}

	public List<CartItems> getItems() {
		return items;
	}

	public void setItems(List<CartItems> items) {
		this.items = items;
	}

	public String getModDate() {
		return modDate;
	}

	public void setModDate(String modDate) {
		this.modDate = modDate;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItem(CartItems item) {
		this.items.add(item);
	}
	
	public boolean removeItem(CartItems item) {
		return this.items.remove(item);
	}

}
