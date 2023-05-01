package com.model;

import java.util.List;

public class Order {
	
	private int orderId;
	private String orderDate;
	private float subTotal;
	private float taxes;
	private float totalAmount;
	private Status status;
	private String shippingDate;
	private List<OrderItems> items;
	private Client client;
	
	public Order() {
		
	}



	public Order(int orderId, String orderDate, float subTotal, float taxes, Status status, String shippingDate,
			List<OrderItems> items, Client client) {
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.subTotal = subTotal;
		this.taxes = taxes;
		this.status = status;
		this.shippingDate = shippingDate;
		this.items = items;
		this.client = client;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public float getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(float subTotal) {
		this.subTotal = subTotal;
	}

	public float getTaxes() {
		return taxes;
	}

	public void setTaxes(float taxes) {
		this.taxes = taxes;
	}
	
	public void setTaxes() {
		this.taxes = (float) (this.subTotal*1.15);
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public void setTotalAmount() {
		this.totalAmount = subTotal+taxes;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getShippingDate() {
		return shippingDate;
	}

	public void setShippingDate(String shippingDate) {
		this.shippingDate = shippingDate;
	}

	public List<OrderItems> getItems() {
		return items;
	}

	public void setItems(List<OrderItems> items) {
		this.items = items;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItem(OrderItems item) {
		this.items.add(item);
	}
	
	public boolean removeItem(OrderItems item) {
		return this.items.remove(item);
	}
	

}
