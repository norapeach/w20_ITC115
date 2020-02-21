
/*********
 * ITC 115  
 * 01.25.20
 * Assignment 3
 * Nora P.
 * 
 * Building Java Programs, 5th Ed. p195 ex. 3
 * Example of a method printPowersOfN that takes 2 parameters: 1st 
 * 	for the base number and 2nd for the maximum exponent n. The method prints
 * 	each power of base from base^0 to base^n.
 */

public class PowerOfN {

	public static void main(String[] args) {
		// example calls 
		printPowersOfN(2, 7);
		printPowersOfN(5, 3);
	}
	
	public static void printPowersOfN(int base, int n) {
		// to print each power of base, run loop action n times
		for (int i = 0; i <= n; i++) {
			// assign cast-to-int result of Math.pow method
			int pow = (int) (Math.pow(base, i));
			System.out.print(pow + " ");
		}
		System.out.println();
	}	
}
