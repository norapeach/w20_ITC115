/**
 * Magazine.java
 */
package librarySystem;

/**
 * @author norapeach
 * Description: a Magazine object is a subclass of abstract PrintMedia, therefore 
 * a Magazine is also a LibraryItem instance.
 */
public class Magazine extends PrintMedia {
	private int issueNum;

	/** Constructs a magazine instance with the given
	 * @param itemID
	 * @param title
	 * @param year
	 * @param pages
	 * @param author
	 * @param publisher
	 * @param issueNum
	 */
	public Magazine(int itemID, String title, int year, int pages, 
					String author, String publisher, int issueNum) {
		super(itemID, title, year, pages, author, publisher);
		this.issueNum = issueNum;
	}

	/** Constructs a magazine instance with fewer given
	 * @param itemID
	 * @param title
	 * @param year
	 */
	public Magazine(int itemID, String title, int year) {
		super(itemID, title, year);
		this.issueNum = 0;
	} 
	
	
	
	
	
}
