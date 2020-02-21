//*******************************************************************
// class Replica --> method repl
//
// Building Java Programs c4ex2 example of a method called repl
// 	that accepts 2 parameters: a String and a integer as the number of times
//	the string will be repeated. If the repetition parameters is 0 or less
//  the method will return an empty string.
//By: Nora P.
//ITC 115 
//02.01.20
//*******************************************************************

import java.util.*; // for Scanner

public class Replica {

	public static void main(String[] args) {
		giveIntro();
		
		// initialize Scanner & prompt user/collect values
		Scanner console = new Scanner(System.in);
		System.out.print("Enter a word or phrase: ");
		String phrase = console.nextLine();
		System.out.print("Enter the number of times to repeat: ");
		int number = console.nextInt();
		
		// run repl method to output repeated string
		String rep = repl(phrase, number);
		System.out.println(rep);
		
		//close Scanner
		console.close();
	}
	
	public static void giveIntro() {
		System.out.println("This program will ask you for a word or phrase");
		System.out.println("and then the number of times the word or phrase should");
		System.out.println("be repeated. Then it will output the phrase replicated");
	}
	
	public static String repl(String phrase, int number) {
		// check if number is 0 or less
		if (number <= 0) {
			return "";
		} else {
			String replica = "";
			for (int i = 1; i <= number; i++) {
				replica += phrase;
			}
			return replica;
		}
	}

}
