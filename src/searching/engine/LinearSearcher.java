package searching.engine;

import java.util.Random;

/**
 * This class implements certain common search attributes.
 * 
 * @version 1.0
 * */
public class LinearSearcher {
	
	/**
	 * Fixed value, used to decide how many numbers are being sorted.
	 * */
	public static final int COUNT_OF_NUMBERS = 10; // fixed value
	
	/**
	 * Most-recent-holder, stores the numbers in an array.
	 * */
	private int[] numbers = null; // container
	
	/**
	 * Creates a new BubbleSort-object and fills it with numbers;
	 * */
	public LinearSearcher(){
		numbers = new int[ COUNT_OF_NUMBERS ];
		fillNumbers();
	}
	
	/**
	 * Fills the numbers-array with random numbers.
	 * */
	private void fillNumbers() {
		Random r = new Random(); // Temporary variable, allows generation on variables
		for( int i = 0; i < numbers.length; i++ ) { // stepper
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
	 * Find the minimal value of array.
	 * 
	 * @return minimal value
	 * */
	public int findMin() {
		int min = Integer.MAX_VALUE; // most wanted holder
		for( int i = 0; i < numbers.length ; i++ ) { // stepper
			if( numbers[i] < min ) {
				min = numbers[i];
			}
		}
		return min;
	}
	
	/**
	 * Find the maximal value of the array.
	 * 
	 * @return maximal value
	 * */
	public int findMax() {
		// TODO: Implement
		return Integer.MIN_VALUE;
	}
	
	/**
	 * Check if the array has the value given in the parameter.
	 * 
	 * @param search 
	 * */
	public boolean findValue(int search) {
		// TODO: Implement
		return false;
	}
	
	
}
