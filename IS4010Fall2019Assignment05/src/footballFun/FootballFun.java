/*
 * IS4010 Fall 2019
 * Assignment 05
 * Kenneth Tritschler
 * tritsckc@mail.uc.edu
 * Due:October 3rd, 2019
 */
package footballFun;

public class FootballFun {

	public static void main(String[] args) {
		int correctCount = 0;
		if (translateScore(2).equals("safety") == true) { correctCount++;}
		if (translateScore(3).equals("field goal") == true) { correctCount++;}
		if (translateScore(6).equals("touchdown") == true) { correctCount++;}
		if (translateScore(7).equals("touchdown and extra point") == true) { correctCount++;}
		if (translateScore(8).equals("touchdown and 2-point conversion") == true) { correctCount++;}
		if (translateScore(-1).equals("") == true) { correctCount++;}
		if (translateScore(1).equals("invalid") == true) { correctCount++;}
		if (translateScore(10).equals("you must be playing Quidditch ") == true) { correctCount++;}
		
		if (correctCount == 8) {
			System.out.println("All tests passed");
		} else {
			System.out.println("At least one test failed");
		}
	}

	/**
	 * Create a method where you translate the football score and return as a string for the description of that score
	 * @param score
	 * @return All Tests passed
	 */
	
	
	
	public static String translateScore (int score) {
		
		if (score == 2) {
		return "safety"; 
		}
		else if (score == 3) {
		return "field goal";
		}
		else if (score == 6) {
		return "touchdown"; 
		}
		else if (score == 7) {
		return "touchdown and extra point"; 
		}
		else if (score == 8) {
		return "touchdown and 2-point conversion";
		}
		else if (score == 0) {
		return ""; 
		}
		else if (score == 1) {
		return "invalid"; 
		}
		else if (score == 10) {
		return "you must be playing Quidditch ";
		}
		else {
			return "";
		}
	}
	
}
