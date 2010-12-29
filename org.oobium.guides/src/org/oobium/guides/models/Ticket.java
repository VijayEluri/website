package org.oobium.guides.models;

public class Ticket {

	public final String display;
	public final String number;
	
	public Ticket() {
		this.display = "Work in progress, not yet released";
		this.number = null;
	}
	
	public Ticket(String display) {
		this.display = display;
		this.number = null;
	}
	
	public Ticket(String display, String number) {
		this.display = display;
		this.number = number;
	}
	
	public String getUrl() {
		return "";
	}
	
}
