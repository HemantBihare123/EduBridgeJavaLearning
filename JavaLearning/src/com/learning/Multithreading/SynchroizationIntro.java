package com.learning.Multithreading;

public class SynchroizationIntro {

	public static void main(String[] args) {
		TicketCounterPortal ticketCounterPortal = new TicketCounterPortal();
		TicketBooking t1 = new TicketBooking(ticketCounterPortal, "user1 ", 4);
		TicketBooking t2 = new TicketBooking(ticketCounterPortal, "user2 ", 1);
		
		t1.start();
		t2.start();

	}

}
