package com.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;
/**
 * MoodAnalyserTest is a class of public type
 * In this class we are testing user moods
 * If user states , user is in sad mood, Our mood analyzer returns sad
 * If user states , user is in happy mood, Our mood analyzer returns happy
 */

public class MoodAnalyserTest {
	/**
	 *@method givenSadMessageReturnSad is to test weather user in sad mood
	 *@Test user is in sad mood
	 *@return
	 */
	@Test
    public void givenSadMessageReturnSad() {
		MoodAnalyser moodAnalyserTest = new MoodAnalyser();
		String mood = moodAnalyserTest.analyseMood("Sad");
		Assert.assertEquals("Sad", mood);
    }
	/**
	 * @method givenHappyMessageReturnHappy is to test for users happy mood.
	 * @Test If user is in happy mood
	 * @return Happy
	 */

	@Test
	public void givenHappyMessageReturnHappy() {
		MoodAnalyser MoodAnalyserTest = new MoodAnalyser();
		String mood = MoodAnalyserTest.analyseMood("Happy");
		Assert.assertEquals("Happy", mood);
	}
}
