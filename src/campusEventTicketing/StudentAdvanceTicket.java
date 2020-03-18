/**
 * 
 */
package campusEventTicketing;

/**
 * StudentAdvanceTicket.java subclass of AdvanceTicket.java
 * @author Nora P.
 * 
 * Ex 9.8 Building Java Programs e5
 * ITC 115 03.17.20
 * 
 * Description: represents a ticket purchased in advance - but by a student.
 * Constructed with a ticketID and numbers of days in advance (int days) 
 * that the ticket was purchased. Student advance pricing is 1/2 of the
 * regular advance ticketing prices.
 */
public class StudentAdvanceTicket extends AdvanceTicket {
	/**
	 * subclass constructor calls superclass AdvanceTicket constructor with id
	 * and days parameters
	 */
	public StudentAdvanceTicket(int ticketID, int days) {
		super(ticketID, days);
		setPrice(EARLYBIRD);
	}
	
	//override setPrice method to reduce advance price by .5 for students
	public void setPrice(double EARLYBIRD) {
		// post: if days <= 10 : EARLYBIRD pricing else ADVPRICE
				if (getDays() >= 10) {
					changePrice(EARLYBIRD / 2);
				} else {
					changePrice(ADVPRICE / 2);	
				}
	}
	
	// override toString(); 
	// return superclass' value + (ID required)
	public String toString() {
		return super.toString() + " (ID required)";
	}

}
