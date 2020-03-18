package campusEventTicketing;

/**
 * TicketingMain.java 
 * 		client code tests for Ticket, WalkupTicket, AdvanceTicket, 
 * 		StudentAdvanceTicket classes
 * @author Nora P.
 * 
 * Ch9 Building Java Programs e5, ex: 5, 6, 7
 * ITC 115 03.17.20
 * 
 * Description: demponstrates polymorphism by initializing 
 * an array of generic Ticket objects, each storing a different
 * subclass instance. Output is via a foreach loop that prints the
 * toString() value for each object.
 * 
 */

// may need to import Date object?
// have a field for the event date to determine which ticket
// is bought when
public class TicketingMain {

	public static void main(String[] args) {
		// initialize Ticket array of subclass objects
		Ticket[] tix = new Ticket[3];
		// test for each type of ticket
		tix[0] = new WalkupTicket(1);
		tix[1] = new AdvanceTicket(2, 11);
		tix[2] = new StudentAdvanceTicket(3, 5);
		
		// for-each loop through tix array & output respective object's 
		// toString() value
		for (Ticket t: tix) {
			System.out.println("Ticket " + t);
		}

	}

}
