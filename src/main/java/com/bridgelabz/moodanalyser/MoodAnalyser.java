
package com.bridgelabz.moodanalyser;

/**
 * MoodAnalyser is a class of public type.
 * In this class Handling Exception if User Provides Invalid Mood, like Null.
 *
 */
public class MoodAnalyser {

	public String message;
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

	/**
	 * Parameterized constructor of the class 
	 * @param message
	 */

	public MoodAnalyser(String message) {
		this.message = message;
	}
	public MoodAnalyser() {
		
	}

	/**
	 * exceptionAnallyseMood is a function if message contains sad return sad
	 * if contains happy return happy 
	 * 
	 * @return String value
	 */

	public String exceptionAnalyseMood() {
		try {
			if(message.contains("Sad"))
				return "Sad";
			return "Happy";
		} catch(NullPointerException e) {
			return "Happy";
		}
	}
}







