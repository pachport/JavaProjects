package com.model;

public class Status {
	
	private int statusID;
	private String title;
	
	public Status(int statusID, String title) {
		this.statusID = statusID;
		this.title = title;
	}

	public int getStatusID() {
		return statusID;
	}

	public void setStatusID(int statusID) {
		this.statusID = statusID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	

}
