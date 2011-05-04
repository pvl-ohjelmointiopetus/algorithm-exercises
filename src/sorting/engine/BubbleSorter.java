package sorting.engine;

import java.util.Random;

/**
 * This class implements <a href="http://en.wikipedia.org/wiki/Bubble_sort">a Bubble sort</a> of an array.
 * 
 * For demonstration purposes, it is possible to demonstrate the functionality round by round or to sort the whole array at once.
 * 
 * @version 1.0
 * */
public class BubbleSorter {
	
	/**
	 * Fixed value, used to decide how many numbers are being sorted.
	 * */
	public static final int COUNT_OF_NUMBERS = 10;
	
	/**
	 * Most-recent-holder, stores the numbers in an array.
	 * */
	private int[] numbers = null;
	
	/**
	 * Stepper used to count the amount of rounds we have passed.
	 * */
	private int roundCount = 0;
	
	/**
	 * Creates a new BubbleSort-object and fills it with numbers;
	 * */
	public BubbleSorter(){
		numbers = new int[ COUNT_OF_NUMBERS ];
		fillNumbers();
	}
	
	/**
	 * Fills the numbers-array with random numbers.
	 * */
	private void fillNumbers() {
		Random r = new Random(); // Temporary variable, allows generation on variables
		for( int i = 0; i < numbers.length; i++ ) {
			numbers[i] = r.nextInt(99);
		}
	}
	
	/**
	 * Getter, used to request the numbers-array.
	 * */
	public int[] getNumbers(){
		return numbers;
	}
	
	/**
	 * Getter, used to request the roundCount.
	 * */
	public int getRoundCount(){
		return roundCount;
	}
	

	/**
	 * Sorts the array by one round.
	 * */
	public void sortOneRound() {
		for(int i = 0; i < numbers.length - 1; i++ ) {
			if( numbers[i+1] < numbers[i] ) {
				// swap!
				int temp = numbers[i];
				numbers[i] = numbers[i+1];
				numbers[i+1] = temp;
			}
		}
		// increace the number of rounds.
		roundCount++;
	}
	
	/**
	 * Sorts the whole array.
	 * */
	public void sort() {
		for(int i = roundCount; i < COUNT_OF_NUMBERS; i++ ) {
			sortOneRound();
		}
	}
	
}
