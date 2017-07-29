//==============================================
// Andrew Asquith
// COMP 1131
// Assignment 5 
// RandomArray Class 
//
// This is the RandomArray class.
// It takes a single integer in the constructor that
// determines the size of the array to be created.
// The array is then populated with random values
// between 0 and the array size.
// Several methods are provided to get the min, 
// max and average values contained in the array
// and a nicely formatted description of it
// 
//==============================================

//import the Random class since we need bounds
import java.util.Random;

public class RandomArray {

	private int[] contents;

	//constructor accepting the size of the array to create
	//values less than 0 will be treated as 0
	public RandomArray(int size) {

		//if a positive number was provided, use it
		if (size > 0) {
			contents = new int[size];
		} else {
			//otherwise set up a 0 length array
			contents = new int[0];
		}
		populateArray();
	}

	// private helper method populates the array with random values
	private void populateArray() {
		// get a new random number generator
		Random rng = new Random();

		// for every element in the array, go through
		for (int index = 0; index < contents.length; index++) {

			// populate with a random value from 0 to 
			// the size of the array (inclusive)
			contents[index] = rng.nextInt(contents.length + 1);
		}
	}

	// public method to return the maximum value of the elements
	public int maxValue() {
		// set the first element as the current max
		int max = contents[0];

		// loop through the rest of the values
		for (int index = 1; index < contents.length; index++) {

			// if the current element is greater than max, set max to it
			if (contents[index] > max) {
				max = contents[index];
			}
		}
		// return the biggest number we found
		return max;
	}

	// public method to return the minimum value of the elements
	public int minValue() {
		// set the first element as the current minimum
		int min = contents[0];

		// loop through the rest of the values
		for (int index = 1; index < contents.length; index++) {

			// if the current element is smaller than min, set min to it
			if (contents[index] < min) {
				min = contents[index];
			}
		}
		// return the smallest number we found
		return min;
	}

	// public method to return average value of the elements
	public double averageValue() {

		// need the total sum of all the elements
		int sum = 0;

		// loop through increasing the sum by whatever the next value is
		for (int value : contents) {
			sum += value;
		}

		// divide the total sum by the number of elements and cast to a double
		// to keep precision
		return (double) sum / contents.length;
	}

	// prints a nice string representation of the array
	public String printArray() {

		// empty string buffer so we can concat each element nicely
		String buffer = new String();

		if (contents.length == 0) {
			//if it's an empty array, say so
			buffer = "Array is empty!" + System.lineSeparator();
		} else {
			//otherwise, pretty print it
			for (int index = 0; index < contents.length; index++) {

				// for each element write it's index and value on it's own line
				buffer += "Element at [" + index + "] is " + contents[index] + System.lineSeparator();
			}
		}
		// return the formatted output
		return buffer;
	}

	// implement toString by simply returning the result of the printArray method
	public String toString() {
		return printArray();
	}
}