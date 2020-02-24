/*
 * Antcrawl.java
 * 
 * ITC 115  
 * 02.24.20
 * Midterm
 * Nora P.
 * 
 * Midterm Problem 1
 * Description: program that simulates an ant trying to crawl up a building
 * with a height of 6 steps with a 50/50 chance of slipping and falling back to bottom.
 */
 

import java.util.*; // for random object

public class AntCrawl {
	public static final int HEIGHT = 6; 
	
	public static void main(String[] args) {
		Random rand = new Random();
		giveIntro();
		climbSteps(rand);
		

	}
	
	public static void giveIntro() {
		System.out.println("This program simulates an ant trying to crawl up 6 stairs.");
		System.out.println("There is a 50/50 chance that the ant will slip");
		System.out.println("and fall to the bottom to start climb again.");
		System.out.println("The output is the number of falls it took to reach the top.");
		
		System.out.println();
		
	}
	public static void climbSteps(Random rand) {
		int step = 0;
		int falls = 0;
		// pre: Ant starts at 0, number of falls 0
		// post: step == HEIGHT - 1
		while (step < HEIGHT) {
			// random number 1 or 2 for 50% chance of falling if 1 fall, if 2 climb
			int chance = rand.nextInt(2) + 1; 
			if (chance == 1) {
				step = 0;
				falls++;
			} else {
				step++;
			}
		}
		System.out.println("number of falls: " + falls);
	}
	
	
	// each iteration ant either up step++ or step reset to 0
	// 50 percent chance on each iteration of slip -- random(1, 2)
		// new random object 
	// post: ant is at top; output the number of falls it took

}
