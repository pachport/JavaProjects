package com.model;

public class CreditCard {
	
	private Client client;
	private long cardNumber;
	private String bankProcessor;
	private String expDate;
	private int cvv;
	
	public CreditCard(Client client, long cardNumber, String bankProcessor, String expDate) {
		this.client = client;
		this.cardNumber = cardNumber;
		this.bankProcessor = bankProcessor;
		this.expDate = expDate;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getBankProcessor() {
		return bankProcessor;
	}

	public void setBankProcessor(String bankProcessor) {
		this.bankProcessor = bankProcessor;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	

}
