//==============================================
// Andrew Asquith
// COMP 1131
// Assignment 5 
// RandomArrayDemonstrator Class 
//
// This is the RandomArrayDemonstrator class.
// It first creates an invalid RandomArray to prove it 
// will actually be created as 0 length
// It then creates a 0 length array to prove that works too
// Finally it creates 3 new arrays of sizes 1, 5 and 10 3
// times to demonstrate the contents are being chosen randomly
// 
//==============================================

public class RandomArrayDemonstrator {

	public static void main(String[] args) {

		// set up an invalid array with a negative size, should be empty
		RandomArray invalidArray = new RandomArray(-5);
		System.out.println("Invalid Array (-5):");
		System.out.println(invalidArray);
		System.out.println("====================");

		// set up a 0 length array, should be empty
		RandomArray arrayOne = new RandomArray(0);
		System.out.println("Array 1 (empty):");
		System.out.println(arrayOne);

		// loop through the other arrays 3 times to demonstrate 
		// contained values are random
		for (int i = 0; i < 3; i++) {
			
			// print out whatever pass number this is
			System.out.println("====================");
			System.out.println("Random Array Pass #" + (i + 1));
			System.out.println("====================");

			// single element array should be 0 or 1
			RandomArray arrayTwo = new RandomArray(1);
			System.out.println("Array 2 (single element):");
			System.out.println("Array 2 Max: " + arrayTwo.maxValue());
			System.out.println("Array 2 Min: " + arrayTwo.minValue());
			System.out.println("Array 2 Avg: " + arrayTwo.averageValue());
			System.out.println("Array 2 Contents:");
			System.out.println(arrayTwo);
			System.out.println("====================");

			// 5 element array should contain a random mix of 0 - 5
			RandomArray arrayThree = new RandomArray(5);
			System.out.println("Array 3 (5 elements):");
			System.out.println("Array 3 Max: " + arrayThree.maxValue());
			System.out.println("Array 3 Min: " + arrayThree.minValue());
			System.out.println("Array 3 Avg: " + arrayThree.averageValue());
			System.out.println("Array 3 Contents:");
			System.out.println(arrayThree);
			System.out.println("====================");

			// 10 element array should contain a random mix of 0 - 10
			RandomArray arrayFour = new RandomArray(10);
			System.out.println("Array 4 (10 elements):");
			System.out.println("Array 4 Max: " + arrayFour.maxValue());
			System.out.println("Array 4 Min: " + arrayFour.minValue());
			System.out.println("Array 4 Avg: " + arrayFour.averageValue());
			System.out.println("Array 4 Contents:");
			System.out.println(arrayFour);

		}
	}

}
