package com.model;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
	
	private long invoiceID;
	private Client client;
	private Order order;
	private String date;

	public Invoice(long invoiceID, Client client, Order order, String date) {
		this.invoiceID = invoiceID;
		this.client = client;
		this.order = order;
		this.date = date;
	}

	public long getInvoiceID() {
		return invoiceID;
	}

	public void setInvoiceID(long invoiceID) {
		this.invoiceID = invoiceID;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String printInvoice() {
		String pInvoice= "Invoice " + invoiceID + " /n" + date + "/n Products";
		List<OrderItems> invoiceOrder = new ArrayList <OrderItems>();
		
		for (OrderItems item : invoiceOrder) 
			
			pInvoice= pInvoice+ item.getProduct().getTitle()+" Qty: "+item.getQuantity()+" Subtotal: "+(item.getQuantity()*item.getProduct().getPrice())+"/n";
		
		pInvoice= "Subtotal:" +order.getSubTotal() + "/n Taxes:" + order.getTaxes() + "/n Total:" + order.getTotalAmount();
		
		return pInvoice;
	}
	

	
	

}
