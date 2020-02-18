package conditionals;


/* Method Season
 * 
 * Description: Method that takes 2 integers as parameters for month and day
 * 	and returns a String indicating the season for that month and day
 * Building Java Programs p314 ex 3
 * By: Nora P.
 * ITC115 2/17/20
 */

public class Season {

	public static void main(String[] args) {
		
		
		
		// method season test call
		System.out.println(season(1,4));
		System.out.println(season(7,16));
		
	}
	
	public static String season(int month, int day) {
		// initialize variable for output with empty string
	    String season = "";
	    
	    if (month == 12 && day >= 16) {
	        season = "Winter";
	    // jan - march
	    } else if (month <= 3) {
	        // if march check day if > 16 then spring
	        if (month == 3 && day >= 16) {
	            season = "Spring";
	            //less than 16 still winter
	        } else {
	            season = "Winter";
	        }
	    } else if (month >= 4 && month <= 6) {
	    	// if June, test if day is >= 16 for summer
	        if (month == 6 && day >= 16) {
	            season = "Summer";
	        } else {
	            season = "Spring";
	        }
	    } else if (month >= 7 && month <= 9) {
	        if (month == 9 && day >= 16) {
	            season = "Fall";
	        } else {
	            season = "Summer";
	        }
	    } else if (month >= 10 && month <= 12) {
	        season = "Fall";
	    } else {
	        season = "I couldn't figure it out, did you enter valid numbers?";
	    }
	    return season;
	}
	
}
