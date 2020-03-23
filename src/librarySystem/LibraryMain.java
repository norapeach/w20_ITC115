/**
 * LibraryMain.java // client code
 */
package librarySystem;

/**
 * @author norapeach
 * librarySystem 
 * ITC 115 03.23.20
 * 
 * Description: client code tests the  polymorphism by initializing 
 * an array of generic Ticket objects, each storing a different
 * subclass instance. Output is via a foreach loop that prints the
 * toString() value for each object.
 * 
 * TODO: Refactor as tests do not compile correctly. Finsih implementing class methods.
 * Incomplete.
 */
public class LibraryMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LibraryItem[] catalog = {new Book(101, "Until I Find You", 2005, 848, "Irving, John",
								"Ballantine Books"), 
								new Magazine(102, "VegMews", 2016, 114, "", "VegNews", 4)};
		
		// test LibraryItem.toString() 
		for (LibraryItem i: catalog) {
			System.out.print(i);
			System.out.println();
		}
		
		// test LibraryItem.toString() 
		for (int i = 0; i < catalog.length; i++) {
			catalog[i].printInfo();
		}
	}

}
