package com.model;

public class OrderItems{
	
	private int orderItemsID;
	private Order order;
	private Product product;
	private int quantity;
	private Status status;
	
	public OrderItems() {
		
	}

	public OrderItems(int orderItemsID, Order order, Product product, int quantity, Status status) {
		super();
		this.orderItemsID = orderItemsID;
		this.order = order;
		this.product = product;
		this.quantity = quantity;
		this.status = status;
	}

	public int getOrderItemsID() {
		return orderItemsID;
	}

	public void setOrderItemsID(int orderItemsID) {
		this.orderItemsID = orderItemsID;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
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
