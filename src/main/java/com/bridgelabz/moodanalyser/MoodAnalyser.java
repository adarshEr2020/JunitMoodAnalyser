
package com.bridgelabz.moodanalyser;

/**
 * MoodAnalyser is a class of public type.
 * In this class we are just analyzing weather user mood is sad or happy.
 *
 */
public class MoodAnalyser {
	/**
	 * analyseMood is a method to check if sad message
	 * then contain sad if happy then return happy
	 * @param message
	 * @return String value
	 */
	public String analyseMood(String message) {
		
		if(message.contains("Sad"))
			return "Sad";
		return "Happy";
	}
}