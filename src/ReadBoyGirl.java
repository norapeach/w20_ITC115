/* Method boyGirl
 * 
 * Description: Method that accepts a Scanner object as a parameter that reads
 * 		input from a file containing a series of names followed by integers
 * 		starting with a boy name, the name number pairs alternate between boy & girl
 * 		The method outputs count of boys and girls
 * 		and the absolute difference between the boy numbers & girl numbers
 * 		
 * Building Java Programs p439 ex 1
 * By: Nora P.
 * ITC115 2/21/20
 */


import java.io.*; // for File Class
import java.util.*; // for Scanner Class

public class ReadBoyGirl {

	public static void main(String[] args) 
		throws FileNotFoundException {
		giveIntro();
		Scanner input = new Scanner(new File("../../boysgirls.txt"));
		
		boyGirl(input);
	}
	
	public static void giveIntro() {
		System.out.println("This program reads input from a file");
		System.out.println("containing pairs of name & number values, starting");
		System.out.println("with a boy pair followed by a girl pair.");
		System.out.println("This pattern alternates, but the file could end with boy or girl");
		System.out.println("Output: the respective counts of boys & girls");
		System.out.println("Followed by absolute difference of boy - girl numbers");
		System.out.println();
	}
	
	// The declared package "file_processing" does not match the expected package ""
	public static void boyGirl(Scanner input) {
		int boyCount = 0;
		int girlCount = 0;
		int boySum = 0;
		int girlSum = 0;
		int absDiff = 0;
		
		// pre: start with boy values - check Scanner for String token
		// consume boy values and if another String token follows boy int
		// consume String token and int token as girl values
		// post: Scanner input cursor is at end of file
		while (input.hasNext()) {
			String boyName = input.next();
			boyCount++;
			boySum += input.nextInt();
			if (input.hasNext()) {
				String girlName = input.next();
				girlCount++;
				girlSum += input.nextInt();
			}
		}
		
		absDiff = Math.abs(boySum - girlSum);
		System.out.println(boyCount + " boys, " + girlCount + " girls");
		System.out.println("Difference between boys' and girls' sums: " + absDiff);
	}

}
