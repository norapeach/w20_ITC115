/*********
 * 
 * PowerOfTwo.java
 * 
 * ITC 115  
 * 02.24.20
 * Midterm
 * Nora P.
 * 
 * Midterm Problem 2
 * Example of a method powOfTwo that takes an int n as a parameter and tests if n
 * is a power of 2. If yes, then the test returns true if no then test returns false. 
 * 	
 */
public class PowerOfTwo {

	public static void main(String[] args) {
		System.out.println(powerOfTwo(3));
		System.out.println(powerOfTwo(1));
		

	}
	
	// return true if n is pow of 2 
	public static boolean powerOfTwo(int n) {
		boolean isPow = false;
		// pre: n must be > 0
		// post: if n % 2 == 1 && n != 0
		if (n > 0) {
			while (n % 2 == 0) {
				n /= 2; // divide n by 2 
			}
			if (n == 1) {
				isPow = true;
			}
		}
		// post: if n % 2 == 1 || n == 0 --> not power of 2
		if (n == 0 || n != 1 ) {
			isPow = false;
		}
		return isPow;
	}

}
