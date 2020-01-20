/*
 * ITC 115
 * 01.18.20
 * Assignment 2
 * Nora Peachey
 * 
 * Program to print the first 12 numbers of the
 * Fibonacci Sequence using the formula Xn = X(n-1) + X(n-2) 
 * 	when n > 2; otherwise Xn = 1
 */
package chpt2_160120;

public class Fibonacci {

	public static void main(String[] args) {
		fibSequence();	
	}
	
	public static void fibSequence() {
		//declare variables to hold previous fibonacci numbers
		int prevFib1 = 1;
		int prevFib2 = 1;
		// first loop to output first two values as 1
		for (int i = 0; i < 2; i++) {
			int fib = prevFib1;
			System.out.print(fib + " ");
		}
		// 2nd loop for numbers 2 - 12
		for (int i = 2; i < 12; i++) {
			int fib = prevFib1 + prevFib2;
			System.out.print(fib + " ");
			// change values of prevFib variables to hold last
			// two known Fibonacci numbers
			prevFib1 = prevFib2;
			prevFib2 = fib;
		}
			
	}
}
