package com.learning.Multithreading;

public class TicketBooking extends Thread{
	private TicketCounterPortal ticketCounterPortal;
	private String passengerName;
	private int numberOfSeats;
	
	public TicketBooking(TicketCounterPortal ticketCounterPortal, String passengerName, int numberOfSeats){
		this.ticketCounterPortal = ticketCounterPortal;
		this.passengerName = passengerName;
		this.numberOfSeats = numberOfSeats;
	}
	
	public void run() {
		ticketCounterPortal.bookTicket(passengerName, numberOfSeats);
	}
}
