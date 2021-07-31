package com.simplilearn.collections.list.TKSystem;

public class Ticket {
	// WAP : POJO : id,name,price,details,description,source,destinations
	// POJO = Plain Old Java Object class. hides data using private, and expose using public get/set methods.
	public int id;
	public double price;
	public String offenderName;
	public String officerName;
	public String description;
	public String source;
	public String details;
	public Ticket(int id, double price, String offenderName, String officerName, String description, String source,
			String details) {
		super();
		this.id = id;
		this.price = price;
		this.offenderName = offenderName;
		this.officerName = officerName;
		this.description = description;
		this.source = source;
		this.details = details;
	}
	public Ticket() {
		super();
	}
	
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", price=" + price + ", offenderName=" + offenderName + ", officerName="
				+ officerName + ", description=" + description + ", source=" + source + ", details=" + details + "]";
	}
	
	
	
}
