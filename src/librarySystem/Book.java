/**
 * Book.java
 */
package librarySystem;

/**
 * @author norapeach
 * Description: a Book object is a subclass of abstract PrintMedia, therefore also
 * is a LibraryItem.
 */
public class Book extends PrintMedia {

	/**
	 * Constructs a Book object with the given
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
	
	
	
	

}
