/**
 * LibraryMain.java // client code
 */
package librarySystem;

import java.time.LocalDate;

/**
 * @author Nora P.
 * librarySystem 
 * ITC 115 03.23.20
 * 
 * Description: client code tests the  polymorphism by initializing 
 * an array of generic LibraryItem objects, each storing a different
 * subclass instance. Output is via a foreach loop that prints the
 * toString() value for each object.
 * 
 * TODO: Refactor borrowed/returned due date & fines due functionality.
 * TODO: Refactor client code tests
 */
public class LibraryMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		
		LibraryItem[] catalog = {new Book(101, "Until I Find You", 2005, 848, "Irving, John",
								"Ballantine Books"), 
								new Magazine(102, "VegNews", 2016, 114, "\t", "VegNews")};
		// set new borrowed dates
		catalog[0].setBorrowed(date.minusMonths(2));
		catalog[1].setBorrowed(date.minusDays(14));
		
		// test item loan dates
		printData(catalog[0]);
		System.out.println("\tDate borrowed: " + catalog[0].getBorrowed());
		System.out.println("\tDate returned: " + catalog[0].getReturned());
		System.out.println();
		
		printData(catalog[1]);
		System.out.print("\tDate borrowed: " + catalog[1].getBorrowed());
		System.out.println("\tDate returned: " + catalog[1].getReturned());
		System.out.println();
		
		// set new borrowed dates
		catalog[0].setBorrowed(date.minusMonths(2));
		
		// test LibraryItem.toString() 
				for (LibraryItem i: catalog) {
					System.out.println(i);
					System.out.println();
				}
				
				// test LibraryItem.toString() 
				for (int i = 0; i < catalog.length; i++) {
					catalog[i].printInfo();
					System.out.println();
				}

	}
	
	public static void printData(LibraryItem i) {
		System.out.printf("Item ID: %d     ", i.getItemID());
	}

}
