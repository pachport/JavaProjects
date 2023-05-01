package com.model;

public class CartItems {
	
	private int cartItemId;
	private Cart cart;
	private Product product;
	private int quantity;
	private Status status;
	
	public CartItems() {
		
	}

	public CartItems(int cartItemId, Cart cart, Product product, int quantity, Status status) {
		this.cartItemId = cartItemId;
		this.cart = cart;
		this.product = product;
		this.quantity = quantity;
		this.status = status;
	}

	public int getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	

}
