package com.kaustubh.spring.myspringproject.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	private int ticketID;
	private String name;
	public int getTicketID() {
		return ticketID;
	}
	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@PostConstruct
	public void hiiii() {
		System.out.println("This is the init method");
	}
	
	@PreDestroy
	public void byeee() {
		System.out.println("This is the destroy method");
	}
}
