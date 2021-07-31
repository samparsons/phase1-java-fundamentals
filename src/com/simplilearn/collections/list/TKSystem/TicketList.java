package com.simplilearn.collections.list.TKSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TicketList {

	public static void main(String[] args) {
		// do the same thing we did with Employee to generate some tickets and display them.
		Ticket ticket1 = new Ticket(1001,50.00,"Sam Parsons","Officer Miller","Illegal Parking","DCPD","Car parked illegally on Ash St.");
		Ticket ticket2 = new Ticket(1002,50.00,"Georgina Candia","Officer Jones","Too Attractive","DCPD","The guilty party was way too pretty.");
		Ticket ticket3 = new Ticket(1003,150.00,"Sharon Parsons","Officer Ridgeline","Too Awesome","DCPD","Way too awesome, needs to calm it down.");
		Ticket ticket4 = new Ticket(1004,25.00,"David Parsons","Officer Bassnectar","Too Calm","DCPD","The monks are getting jealous.");		
		
		List<Ticket> listOfTickets = new ArrayList<Ticket>();
		
		listOfTickets.add(ticket1);
		listOfTickets.add(ticket2);
		listOfTickets.add(ticket3);
		listOfTickets.add(ticket4);
		
		System.out.println(listOfTickets);
		System.out.println("---------------------------");
		System.out.println("Insert Data Example:");
		//insert data at index
		listOfTickets.add(0,ticket4);
		System.out.println(listOfTickets);
		
		// replace
		System.out.println("---------------------------");
		System.out.println("Replace Data Example:");
		listOfTickets.set(2, ticket4);
		System.out.println(listOfTickets);
		
		// iterate over list
		System.out.println("---------------------------");
		System.out.println("Iteration w/ .iterator() Example:");
		Iterator<Ticket> itr = listOfTickets.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("---------------------------");
		System.out.println("Iteration w/ forEach Example:");
		for (Ticket emp : listOfTickets) {
			System.out.println(emp);
		}
		
		// update a value
		System.out.println("---------------------------");
		System.out.println("Update Data Example:");
		listOfTickets.get(0).offenderName = "Wasnt Me";
		System.out.println(listOfTickets);
		
	}

}
