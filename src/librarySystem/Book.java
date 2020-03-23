/**
 * 
 */
package librarySystem;

/**
 * @author norapeach
 * Description: a Book object is a subclass of abstract PrintMedia, therefore also
 * is a LibraryItem.
 */
public class Book extends PrintMedia {

	/** Constructs a book instance with the given
	 * @param itemID
	 * @param title
	 * @param year
	 * @param pages
	 * @param author
	 * @param publisher
	 */
	public Book(int itemID, String title, int year, int pages, String author, String publisher) {
		super(itemID, title, year, pages, author, publisher);
		
	}

	/** Constructs a book instance the the given
	 * @param itemID
	 * @param title
	 * @param year
	 * initializes pages, author and publisher instance values to zero equivalent
	 */
	public Book(int itemID, String title, int year) {
		super(itemID, title, year); // PrintMedia constructor
		
	}
	
	
	
	
	
	

}
