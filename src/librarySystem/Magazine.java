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
	/**  Constructs a Magazine instance with the given
	 * @param itemID
	 * @param title
	 * @param year
	 * @param issueNum
	 */
	public Magazine(int itemID, String title, int year, int issueNum) {
		super(itemID, title, year); // constructor from PrintMedia
		this.issueNum = issueNum;
	}
	
	/** 2nd Constructor: constructs instance with all given
	 * @param itemID
	 * @param pages
	 * @param author
	 * @param publisher
	 */
	public Magazine(int itemID, String title, int year, int pages, String author, 
			String publisher, int issueNum) {
		super(itemID, title, year, pages, author, publisher); // constructor from PrintMedia	
		this.issueNum = issueNum;
	}
	
}
