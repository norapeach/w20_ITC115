package ch7_arrays;
//*******************************************************************
//class UniqueArray --> method isUnique
//
//Building Java Programs ch7ex11 - example of a method called isUnique()
//	that accepts an array of integers as a parameter and outputs a boolean value  
//	indicating whether or not the values in the array are unique (true if yes,  
//	otherwise false. The values in the list are considered unique if there is 
//	no pair of values that are equal.
//By: Nora P.
//ITC 115 
//03.01.20
//*******************************************************************

public class UniqueArray {

	public static void main(String[] args) {
		// method test arrays
		int[] list1 = {3, 8, 12, 2, 9, 17, 43, -8, 46};
		int[] list2 = {4, 7, 3, 9, 12, -47, 3, 74};
		int[] list3 = {2, 20, 2};
		int[] list4 = new int[1];
		// method test calls
		System.out.println(isUnique(list1));
		System.out.println(isUnique(list2));
		System.out.println(isUnique(list3));
		System.out.println(isUnique(list4));

	}
	
	public static boolean isUnique(int[] numbers) {
	    if (numbers.length == 1) {
	        return true;
	    }
	    ;;
	    for (int i = 0; i < numbers.length - 1; i++) {
	    	// starts at front of list and local variable first checks each
	    	// value in sequence minus the last --> it will be checked below
	        int first = numbers[i];
	        // reverse loop starts at back of list, but does not decrease past 
	        // index location of list[i]
	        for (int j = numbers.length -1; j > i; j--) { 
	            if (first == numbers[j]) {
	                return false; // numbers are not unique
	            }
	        }
	    }
	    return true;
	}


}
