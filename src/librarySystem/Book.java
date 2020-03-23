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

	/** Constructs a PrintMedia instance with the given
	 * @param itemID
	 * @param title
	 * @param year
	 * Auto-initializes other field values to their zero equivalent
	 */
	public Book(int itemID, String title, int year) {
		super(itemID, title, year);
	}



	/** 101
	 * @param itemID
	 * @param pages
	 * @param author
	 */
	public Book(int itemID, String title, int year, int pages, 
				String author, String publisher) {
		super(itemID, title, year, pages, author, publisher);
	}
	
	
	
	

}
