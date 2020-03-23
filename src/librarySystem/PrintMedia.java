/**
 * 
 */
package librarySystem;

/**
 * @author norapeach
 *
 * Description: a PrintMedia object is a specific type of LibraryItem.
 * A PrintMedia instance represents a general item that has pages and is 
 * written by an author(s). 
 * 
 * TODO: extend for digital; represents physical items
 */
public abstract class PrintMedia extends LibraryItem {
	private int pages;
	private String author;
	private String publisher; 
	/**
	 * Constructs a PrintMedia instance with the given
	 * @param itemID
	 * @param title
	 * @param year
	 * Auto-initializes other field values to their zero equivalent
	 */
	public PrintMedia(int itemID, String title, int year) {
		super(itemID, title, year); // LibraryItem constructor
		this.pages = 0;
		this.author = "";
		this.publisher = "";
	
	}

	/** 2nd Constructor: constructs instance with all given
	 * @param itemID
	 * @param title
	 * @param year
	 * @param pages
	 * @param author
	 * @param publisher
	 */
	public PrintMedia(int itemID, String title, int year, 
			int pages, String author, String publisher) {
		super(itemID);
		this.pages = pages;
		this.author = author;
		this.publisher = publisher;
	}

	/**
	 * @return the pages
	 */
	public int getPages() {
		return pages;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * @param pages the pages to set
	 */
	public void setPages(int pages) {
		this.pages = pages;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return super.toString() + "\tAuthor: " + this.author + 
				"\tPublisher: " + this.publisher;
	}
	
	

}
