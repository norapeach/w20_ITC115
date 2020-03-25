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

	/**
	 * @param itemID
	 * @param title
	 * @param year
	 * @param pages
	 * @param author
	 * @param publisher
	 */
	public Magazine(int itemID, String title, int year, int pages, String author, String publisher) {
		super(itemID, title, year, pages, author, publisher);
		this.issueNum = 0;
	}

	/**
	 * @return the issueNum
	 */
	public int getIssueNum() {
		return issueNum;
	}

	/**
	 * @param issueNum the issueNum to set
	 */
	public void setIssueNum(int issueNum) {
		this.issueNum = issueNum;
	}
	
	
	
	
}
