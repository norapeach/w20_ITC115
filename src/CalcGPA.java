
/* Method printGPA
 * 
 * Description: Method that accepts a Scanner for the console and calculates a
 * 	student's GPA
 * Building Java Programs p316 ex 10
 * By: Nora P.
 * ITC115 2/17/20
 */

import java.util.*;

public class CalcGPA {

	public static void main(String[] args) {
		giveIntro();
		Scanner console = new Scanner(System.in);
		printGPA(console);
		console.close();
	}
	
	public static void giveIntro() {
		System.out.println("GPA calculator: ");
		System.out.println("Enter a student's name and grade information.");
		System.out.println("Formatted as: name total_scores grade grade grade");
		System.out.println("Example: Maria 3 98 88 100");
	}
	
	public static void printGPA(Scanner console) {
		System.out.print("Enter a student record: ");
		String fullRecord = console.nextLine(); // saves entire token as a string
		
		// create 2nd instance of scanner to run next() method
		Scanner sc = new Scanner(fullRecord);
		String name = sc.next();
		int numScores = sc.nextInt(); // assign 1st integer after name for num of Scores
		double sum = 0.0;
		double gpa = 0.0;
		
		// loop through rest of scanner adding nextInt to sum
		while (sc.hasNextDouble()) {
			sum += sc.nextInt();
		}
		
		// calculate gpa
		gpa = sum / numScores;
		
		System.out.printf("\n%s's grade is %.2f", name, gpa);
		sc.close();
	}

}
