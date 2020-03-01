package ch7_arrays;
//*******************************************************************
//	class SortedArray --> method isSorted
//
//	Building Java Programs ch7ex4 - example of a method called isSorted()
//		that accepts an array of real numbers as a parameter and outputs true if 
//		the list values are sorted (nondecreasing) in order, or false otherwise. 
//		It's assumed that the array has at least 1 element.
//	By: Nora P.
//	ITC 115 
//	03.01.20
//*******************************************************************

public class SortedArray {

	public static void main(String[] args) {
		double[] list1 = {16.1, 12.3, 22.2, 14.4};
		double[] list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		double[] list3 = {2.2};
		System.out.println(isSorted(list1));
		System.out.println(isSorted(list2));
		System.out.println(isSorted(list3));

	}
	
	public static boolean isSorted(double[] list) {
		//pre: array length is 1, nothing to sort hence true
		if (list.length <= 1) {
	        return true;
	    } 
		// post: loop stops at 2nd to last value due to contained conditional statement
		for (int i = 0; i < list.length - 1; i++) { 
	        if (list[i] > list[i + 1]) {
	            return false;
	        }
	   }
		return true;
	}
	

}
