/**
 * LibraryItem.java abstract class
 */
package librarySystem;

/**
 * @author Nora P.
 * DATE: 3/23/20
 * Description: a LibraryItem object represents a generic instance of an item that
 * can be borrowed / loaned / reserved at a library. Implements the Printable
 * interface as a standardized way to print a summary of a library item’s base data.
 * 
 */

import java.time.LocalDate; // access LocalDate class

public abstract class LibraryItem implements Printable {
	// CLASS CONSTANT 
	public static final double FEE = 0.5;
	public static final int LOAN_TIME = 21; // item can be on loan for 3 weeks before fees accrue
	
	// fields
	private int itemID;
	private String title;
	private int year; // should it be date?
	private double finesAccrued;
	private LocalDate borrowed; // TODO: better to use array of LocalDate instances?
	private LocalDate returned;
	private boolean reserved; // true or false if item is on hold
	
	
	/**
	 * Constructs a generic LibraryItem object with the given ID;
	 * sets other field values to 'zero'
	 * @param itemID
	 */
	public LibraryItem(int itemID) {
		this.itemID = itemID;
		this.title = "";
		this.year = 0;
		this.finesAccrued = 0.0;
		this.setBorrowed(LocalDate.now()); // sets default borrowed, returned to equal current date
		this.returned = LocalDate.now();  
		this.reserved = false;
	}
	
	
	/**
	 * 2nd constructor: a generic LibraryItem object with the given
	 * @param itemID
	 * @param title
	 * @param year
	 * sets other field values to 'zero' equivalents
	 */
	public LibraryItem(int itemID, String title, int year) {
		this.itemID = itemID;
		this.title = title;
		this.year = year;
		this.setBorrowed(LocalDate.now()); 
		this.returned = LocalDate.now();  
		this.reserved = false;
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
	 * @return the borrowed
	 */
	public LocalDate getBorrowed() {
		return borrowed;
	}


	/**
	 * @return the returned
	 */
	public LocalDate getReturned() {
		return returned;
	}

	/**
	 * @return the finesAccrued
	 */
	public double getFinesAccrued() {
		//if ()
		return finesAccrued;
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
	 * @param borrowed the borrowed to set
	 */
	public void setBorrowed(LocalDate borrowed) {
		this.borrowed = borrowed;
	}
	
	/**
	 * @param returned the returned to set
	 */
	public void setReturned(LocalDate returned) {
		this.returned = returned;
	}
	/**
	 * @param finesAccrued the finesAccrued to set
	 * based on days overdue int
	 */
	public void setFinesAccrued(int daysOver) {
		this.finesAccrued = FEE * daysOver;
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
	public int daysLate() //throws DateTimeException? 
	{
		LocalDate dueDate = this.borrowed.plusDays(LOAN_TIME); // get due date by adding constant 
		// if date returned > dueDate --> late
		int daysLate = 0;
		if (returned.isAfter(dueDate)) {
			// get number of days late
			daysLate = dueDate.compareTo(this.returned);
			
		}
		
		return daysLate;
	}
	
	@Override
	public String toString() {
		// output item ID number, title and year
		return "Item ID: " + this.itemID + "\tTitle: " + this.title +
				"\tPublished: " + this.year;
	}
	@Override // implement Printable interface method
	public void printInfo() {
		System.out.printf("Item ID:        %5s\n", this.itemID);
		System.out.printf("Title:          %5s\n", this.title);
		System.out.printf("Year Published: %5d\n", this.year);
		System.out.printf("Fines Accrued:  $%5.2f\n", this.finesAccrued);
		System.out.printf("On hold:        %5s\n", this.reserved);
	}
}
