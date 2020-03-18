package campusEventTicketing;
// Ticket.java abstract class
// Ex 9.5 Building Java Programs e5
// ITC 115 03.17.20
// By: Nora P.

// A Ticket represents a general ticket that that is identified by its number and
// 	is assigned a price. Should not be instantialized.
// 	utilizes abstract methods for accessor and mutator to be implemented by
//	subclasses

public abstract class Ticket {
	private int ticketID;
	private double price;
	private int days; // for AdvanceTicket subclass
	
	// constructs a new general ticket instance with given id
	// and initializes price to 0.0
	public Ticket(int ticketID) {
		this.ticketID = ticketID;
		price = 0.0;
		days = 0; // default is 0 for subclass WalkupTicket
	}
	
	// 2nd constructor allows for days value to be passed
	//		for subclass
	public Ticket(int ticketID, int days) {
		this.ticketID = ticketID;
		this.days = days; // number of days in advance ticket was bought
		price = 0.0;
	}
		
	// return ticketID value
	public int getTicketID() {
		return ticketID;
	}
	
	// return the ticket price
	public double getPrice() {
		return price;
	}
	// return # of days in advance ticket was purchased
	public int getDays() {
		return days;
	}
		
	// change a ticket price - allows for price to be set in subclass
	public void changePrice(double newPrice) {
		price = newPrice;
	}
	
	///// ABSTRACT INSTANCE METH0D requires subclass to implement
	// modify the ticket price
	public abstract void setPrice(double newPrice);
	
	//// OVERRIDE toString()
	//		return String with ticket ID number and price
	public String toString() {
		return "Number: " + getTicketID() + ", Price: $" + getPrice();
	}
}
