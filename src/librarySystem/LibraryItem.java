/**
 * LibraryItem.java abstract class
 */
package librarySystem;

/**
 * @author norapeach
 * DATE: 3/23/20
 * Description: a LibraryItem object represents a generic instance of an item that
 * can be borrowed / loaned / reserved at a library. Implements the Printable
 * interface as a standardized way to print a summary of a library item’s data.
 * 
 *  TODO: Does not yet implement Printable interface
 */

import java.util.*; // access Calendar class

public abstract class LibraryItem implements Printable {
	// CLASS CONSTANT 
	public static final double FEE = 0.5;
	
	// fields
	private int itemID;
	private String title;
	private int year; // should it be date?
	private double finesAccrued;
	private Date[] loanDates; // array to hold date instances for checkedOut, DueDate, dateRetured
	private boolean reserved; // true or false if item is on hold
	/** 
	 * Constructs a generic LibraryItem object with the given ID;
	 * sets field values to 'zero'
	 * @param itemID
	 */
	public LibraryItem(int itemID) {
		this.itemID = itemID;
		this.title = "";
		this.year = 0;
		this.finesAccrued = 0.0;
		this.loanDates = new Date[3];
		// call method to set default date values
	}
	/**
	 * 2nd Constructor: similar to above, allows for title & year published to be given
	 * @param itemID
	 * @param title
	 * @param year
	 */
	public LibraryItem(int itemID, String title, int year) {
		this.itemID = itemID;
		this.title = title;
		this.year = 0;
		this.finesAccrued = 0.0;
		this.loanDates = new Date[3];
	}
	///////// GETTERS 
	/**
	 * @return the itemID
	 */
	public int getItemID() {
		return itemID;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * @return the year published
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @return the finesAccrued
	 */
	public double getFinesAccrued() {
		return finesAccrued;
	}
	/**
	 * @return the loanDates
	 */
	public Date[] getLoanDates() {
		return loanDates;
	}
	/**
	 * @return the boolean value stored in reserved
	 * if true, item is reserved
	 * if false, item is not reserved
	 */
	public boolean isReserved() {
		return reserved;
	}
	
	/////// SETTERS
	
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @param finesAccrued the finesAccrued to set
	 */
	public void setFinesAccrued(double finesAccrued) {
		this.finesAccrued = finesAccrued;
	}
	/**
	 * @param loanDates the loanDates to set
	 * Order of loanDates instance array is always
	 * borrowedOn, checkedIn, dateDue
	 */
	public void setLoanDates(Date[] loanDates) {
		Date borrowedOn = this.loanDates[0];
		Date checkedIn = this.loanDates[1];
		Date dateDue = this.loanDates[2];
		borrowedOn = loanDates[0];
		checkedIn = loanDates[1];
		dateDue = loanDates[2];
	}
	/**
	 * @param reserved the reserved to set
	 */
	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}
	
	
	/**
	 * @return the number of days the book is late
	 */ 
	public int daysLate() {
		// date returned > date due
		return 0;
	}
	
	@Override
	public String toString() {
		// output item ID number, title and year
		return "Item ID: " + this.itemID + "\tTitle: " + this.title +
				"\tPublished: " + this.year;
	}
	@Override // implement Printable interface methods
	public void printInfo() {
		System.out.println("Item ID: " + this.itemID);
		System.out.println("Title: " + this.title);
		System.out.println("Year Published: " + this.year);
		System.out.println("Fines Accrued: " + this.finesAccrued);
		System.out.println("On hold: " + this.reserved);
	}

}
