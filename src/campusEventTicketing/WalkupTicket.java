package campusEventTicketing;

/**
 * @author Nora P.
 * WalkupTicket.java extends Ticket.java
 * 
 * Ex 6 Building Java Programs e5
 * ITC 115 03.17.20
 * 
 * A WalkupTicket represents a subclass of Ticket e.g. a type of ticket 
 * that is constructed with a given number and a starting price of $50.
 * This class will implement the abstract superclass methods getPrice()
 * and setPrice()
 */
public class WalkupTicket extends Ticket {
	
	/**
	 * subclass constructor calls superclass Ticket constructor with id
	 * calls setPrice to initialize price to $50
	 */
	public WalkupTicket(int ticketID) {
		super(ticketID);
		setPrice(50.0); // initialize at 50.0 for walkup using subclass method
	}

	@Override
	public void setPrice(double newPrice) {
		changePrice(newPrice); // mutator for Ticket.price value
	}

}
