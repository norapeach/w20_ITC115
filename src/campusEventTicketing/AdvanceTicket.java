/**
 * 
 */
package campusEventTicketing;

/**
 * AdvanceTicket.java subclass of Ticket.java
 * @author Nora P.
 * 
 * Ex 9.7 Building Java Programs e5
 * ITC 115 03.17.20
 * 
 * Description: represents a ticket purchased in advance. Constructed
 * with a ticketID and numbers of days in advance (int days) that the
 * ticket was purchased. Depending on days value price is $30 or $40.
 * 
 */
public class AdvanceTicket extends Ticket {
	// class constants for AdvanceTicket Prices
	public static final double EARLYBIRD = 30.0;
	public static final double ADVPRICE = 40.0;
	/**
	 subclass constructor calls 2nd superclass Ticket constructor with id
	 * and date parameters
	 */
	public AdvanceTicket(int ticketID, int days) {
		super(ticketID, days);
		setPrice(EARLYBIRD);
		
	}

	@Override
	public void setPrice(double EARLYBIRD) {
		// post: if days >= 10 : EARLYBIRD pricing; else ADVPRICE
		if (getDays() >= 10) {
			changePrice(EARLYBIRD);
		} else {
			changePrice(ADVPRICE);	
		}
		
	}
	
	
}
