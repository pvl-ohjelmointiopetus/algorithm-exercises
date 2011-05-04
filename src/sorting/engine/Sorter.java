package sorting.engine;

import java.util.Random;

public abstract class Sorter {
	
	/**
	 * Fixed value, used to decide how many numbers are being sorted.
	 * */
	public static final int COUNT_OF_NUMBERS = 10;
	
	/**
	 * Most-recent-holder, stores the numbers in an array.
	 * */
	protected int[] numbers = null;
	
	/**
	 * Stepper used to count the amount of rounds we have passed.
	 * */
	protected int roundCount = 0;
	
	/**
	 * Creates a new BubbleSort-object and fills it with numbers;
	 * */
	public Sorter(){
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
	public abstract void sortOneRound();
	
	/**
	 * Sorts the whole array.
	 * */
	public void sort() {
		for(int i = roundCount; i < COUNT_OF_NUMBERS; i++ ) {
			sortOneRound();
		}
	}

}
