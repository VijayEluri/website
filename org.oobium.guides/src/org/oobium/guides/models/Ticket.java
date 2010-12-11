package org.oobium.guides.models;

public class Ticket {

	public final String display;
	public final String url;
	
	public Ticket() {
		this.display = "Work in progress, not yet released";
		this.url = null;
	}
	
	public Ticket(String display) {
		this.display = display;
		this.url = null;
	}
	
	public Ticket(String display, String url) {
		this.display = display;
		this.url = url;
	}
	
}
