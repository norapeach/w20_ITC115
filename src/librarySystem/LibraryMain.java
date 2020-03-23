/**
 * LibraryMain.java // client code
 */
package librarySystem;

/**
 * @author norapeach
 * librarySystem 
 * ITC 115 03.23.20
 * 
 * Description: client code tests demonstrates polymorphism by initializing 
 * an array of generic LibraryItem objects, each storing a different
 * subclass instance. Output is via a foreach loop that prints the
 * toString() value for each object.
 * 
 * TODO: System needs to be finished; printInfo() is not outputting correctly. 
 * Finish implementing class methods.
 *
 */
 
public class LibraryMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LibraryItem[] catalog = {new Book(101, "Until I Find You", 2005, 848, "Irving, John",
								"Ballantine Books"), 
								new Magazine(102, "VegNews", 2016, 114, "", "VegNews", 4)};
		
		// test LibraryItem.toString() 
		for (LibraryItem i: catalog) {
			System.out.println(i);
			System.out.println();
		}
		
		// test LibraryItem.printInfo() 
		for (int i = 0; i < catalog.length; i++) {
			catalog[i].printInfo();
			System.out.println();
	
		}
	}

}
