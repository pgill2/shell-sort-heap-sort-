import java.io.*;
import java.io.PrintWriter;
import java.util.*;

// The strategy behind a Shell Sort is to create a more nearly optimal environment for a simple, relatively 
// inefficient sort technique, namely Simple Insertion Sort. This optimal environment allows the simple 
// strategy to be efficient. Use the following sets of increments  

// Set the initial value of gap to n/2 
// while gap > 0 
// for each array element from position gap to the last element 
// Insert this element where it belongs in its sub array
// if gap is 2, set it to 1
// else gap = gap/2.2

// Basis 

// 1. We will store the random set of numbers in an array.
// 2. We will traverse this array and insert each element of this array, to its correct position where it should actually be, by shifting the other elements on the left if required.
// 3. The first element in the array is considered as sorted, even if it is an unsorted array. The array is sub-divided into smaller sub-part, each part must have equal intervals.
// 4. Sort the sub-lists using insertion sort algorithm.
// 5. This goes until the last element in list gets sorted and is placed in correct position in the output array.
// 6. Now, we have the array in sorted order.

// use this

public class shell_sort {

	
	// declare the required variables as static

	// bring in scanner, will need to read in files (no user input, we are reading in files)
	//	Scanner scanner = new Scanner (System.in);
	
	// our scanner and we need a way to output our information 
	 static Scanner in;
	 static FileWriter fw;
//	 static Scanner in;
	 static PrintWriter pw;
	 
	 
	
	//create input file of four sizes: 25, 50, 200, 500 integers
	//
	
	 
	// initializing our ArrayLists (writing for heap and shell)
	 // shell vs heap comparison
	static ArrayList<Long> shellSortAlgorithm = new ArrayList<Long>();
	static ArrayList<Long> heapSortAlgorithm = new ArrayList<Long>();
	 
	 
	 
	// so for the heap we will need to create input files of four sizes
	
	// so what we will also be doing is making 3 different versions for each size file. 
	// The three being random, reverse, and ascending
	
	//this might get tricky, but the key is to remember three versions will need to be made and we can check this in the output accordingly
	
	public static String nameOfDifferentFiles[] = { "Random", "Reverse", "Ascending" };
//	private static String nameOfDifferentFiles[] = { "Random" , "Reverse" , "Ascending "};
	
	public static int differentSizesInput [] = { 50, 500, 1000, 2000, 5000 };


// we need to figure out a way to show our array values 
	
	
//	public void shellSortArray
	
	
	public int[] shellSort; 

	
	// SHELL SORT:
	
		// 1. The array is being sorted
		// 2. The position of element to insert
		// 3. The gap between elements in the sub array
	
	
	
	
	public static void main(String args[]) {

//		filesUsed();
		shellSortComparison();
		heapSortOutput();
		printShellHeapComparison();
		
		
		filesUsed();


	}
	
	
	
	public void heapSortAlgorithm (int cap) {
		
		int heapSort = 50;
		int max = 0;
		
//		heapSort = new int[cap];
				
		for (int i = 0; i < cap; i++) {
			
			while (heapSort < max) {
				
				System.out.println("test");
			}
			
		}
	}
	

	public void shellSortAlgorithm (int cap) {
		
		// setting a max capacity 
		shellSort = new int[cap];
		
		for (int i = 0; i < cap; i++) {
//			shell[i] = random.nextInt(cap) + 1;
		}
	}

	
	
	public static void displayOutput (String fileBeingUsed, int array[], int currentSize, int method) {

// we will use a try and then switch between different cases 

	try {
		///////
	}
		
	catch (Exception e) {
		
	}
	
		try {

			pw = new PrintWriter(new File(fileBeingUsed));

// switch 

			switch (method) {


// in this case our values will be random hence we do not have Arrays.sort or anything else 

//			(if case = 0)
			case 0:

				break;

				
// 1 = reverse Order	- since this was one of the three types		
			
			//(if case = 1)
			case 1:

				Arrays.sort(array);
				
				
				
				// reverse order 
				array = reverseOrder(array, currentSize);
				
				break;

// if the case is 2, then convert the array values

// to in order(ascending)
				
				
				
//				private int[] shell; 
//
//				
//
//				public void shellSortArray (int cap) {
//					shell = new int[cap];
//					for (int i = 0; i < cap; i++) {
////						shell[i] = random.nextInt(cap) + 1;
//					}
//				}


			case 2:

				// regularly
				Arrays.sort(array);
				
				break;
				
			
			// random portion is taken care of so not necessary here .. idk will come back to this if necessary

//			case 3:
//				array.random(array);
//				break;
			
			
//				
			}
			

			// we need to get the current file

			for (int i = 0; i < currentSize; i++) {

				pw.println(array[i]);

			}

			// close or all of our values read to become 0
			pw.close();

		}
			
//
//		try {
//			
//		}
		
//			throw new Exception("Exception message")
			catch (Exception e) {

			System.out.println(e.getMessage());

		}
	}
	
	
	// random array - length, iterate over, and then be being able to randomize it - length?
	
	public static int[] randomArray(int arrayLength)	{

		// new array
//		int randomizedArray[];
		int randomizedArray[] = new int[arrayLength];
		
		

		for (int i = 0; i < arrayLength; i++) {
			
			
		// we can use the math.random here since we need to randomize it
			
			
			randomizedArray[i] = (int) (Math.random() * (differentSizesInput[differentSizesInput.length - 1]) - 1) + 1;
	
//	System.out.print(false);
	System.out.println(randomizedArray[i]);

		}

		return randomizedArray;

	}
	
// we will use this to print the actual values of the arrays
	// printing the array 
	
	public static void createArray(int createArray[], int size) {

		
		// 50 is the number in differentInputSizes - 
		for (int x = 0; x < 50; x++) {

			System.out.printf("%5d \t", createArray[x]);
			System.out.println(createArray[x]);
		
		
			if ((x + 1) % 10 == 0) 
				
				System.out.println();
	
			}
		
		//		else {

		}
//
//	
//		while ((x + 1) % 10 == 0) {
//			
//		}
//			

	// reverseOrder() method reverses the elements in the

	// given array and returns the new array
	// SECOND

	private static int[] reverseOrder(int reverseArray[], int sizeType) {

		int newArray[] = new int[sizeType];
		int array[];
		int reverseOrder[];
		

		for (int i = 0; i < sizeType; i++) {

	// array - reverse order
			
			newArray[i] = reverseArray[sizeType - i - 1];

		}

		return newArray;

	}

// 

	public static void filesUsed() {
		
		
		//array int
		
		int arrayModified[];

// loop through each type of different size and create 

		for (int i = 0; i < differentSizesInput.length; i++) {

			arrayModified = new int[differentSizesInput[i]];

// arraylist ->>> array

			arrayModified = randomArray (differentSizesInput[i]);

// loop to create these files we are talking about using .length to get size 

			for (int x = 0; x < nameOfDifferentFiles.length; x++) {

				
				// helping us with printing the different name of files

				String fileName = nameOfDifferentFiles[x] + differentSizesInput[i] + "file";


// index(Random/Reverse/In-order)

				displayOutput(fileName, arrayModified, differentSizesInput[i], x);

			}

		}

	}

// getArrayValues() method to get the values from the

// text file and store them in array and return the array value

	private static int[] getArrayValues(String nameOfFile, int arrayType[]) {

		try {

			in = new Scanner(new File(nameOfFile));

			int i = 0;

			// if (in.hasNext());
			
			// we need to run a loop until we get all the way through 
			// while (in.hasNext) == True - THEN...
			
			while (in.hasNext()) {

//index i will be where the value is stored, we were able to read this in, along with a counter we have setup for i
				
				arrayType[i] = in.nextInt();
				
				//increment
				i++;
			}

			
//			while (array.equals(array)) 
			
			
// no longer will need 
			
			in.close();

		}

// catch the exception and display the error message

		catch (Exception e) {

			System.out.println(e.getMessage());

		}

// return the array

		return arrayType;

	}

	
	//print

	private static void printStatements (char print, int currentSize) {

		for (int i = 0; i <= currentSize; i++)

			System.out.print(print);

			System.out.println();

	}
	
	
	private static void PrintComparison(int compareArray ) {
		
		for (int i = 0; i <= compareArray; i++); 
			
	}

// printAnalysis() method which display the analysis of the

// different size of array and the time analysis of the Shell Sort

// and Heap Sort for the three different files

	
	
	//  
	
	public static void printShellHeapComparison()	{

		int x = 0;

		System.out.println("\n");
		System.out.println("Shell Sort & Heap Sort Comparison: ");



// loop through each sorts timer values for three different type of

// array values

		for (int i = 0, x1 = 0; i < shellSortAlgorithm.size() && x1 < heapSortAlgorithm.size();) {
			

// display the shell sort time complexities

			System.out.printf("|%-10d | %10d %10d %10d ", differentSizesInput[x1], shellSortAlgorithm.get(i),

					shellSortAlgorithm.get(i + 1), shellSortAlgorithm.get();

// display the heap sort time complexities

			System.out.printf("%s %10d %10d %10d %3s", "|", heapSortAlgorithm.get(x1), heapSortAlgorithm.get(x1 + 1),

					heapSortAlgorithm.get(), "|");
			
			//random
			long randomOrder = shellSortAlgorithm.get(i) - heapSortAlgorithm.get(x1);
			
			
			//subtract each one
			
			//reverse
			
			long reverseOrder = shellSortAlgorithm.get() - heapSortAlgorithm.get();
			
			//acsending
			long ascendingOrder = shellSortAlgorithm.get()) - heapSortAlgorithm.get();
			

//private static int[] timeComplexity (int array) {
//	return;
//}

// display the heap sort time complexities

//			System.out.printf("%10d %10d %10d %4s\n", randomDifference, reverseDifference, inorderDifference);
			System.out.printf("%10d %10d %10d %4s\n", randomOrder, reverseOrder, ascendingOrder, "|");
			
			// increment
			x1++;

		}
	}

	
	// shell sort 

	private static int[] shellSort(int[] array, int size) {

		// starting at one 
		int change = 1;
		int max;
		int cap;
		int temporary;

// calculate the interval values

		while (change <= size / 3) {

			change = (change * 3) + 1;

		}

// loop through the interval values
		
		while (change > 0) {
			
			for (int i = change; i < size; i++) {

// store the element at index i into temp

				temporary = array[i];
//				arrayPosition = array[x]
						
				System.out.println(temporary);
				

				int x;

// so we need to loop through the elements now - declared from x to i
// to move the elements from position (j - interval)

// to j'th position

				for (x = i; x > change - 1 && array[x - change] >= temporary; x -= change)	{

					array[x] = array[x - change];

				}


				array[x] = 
				
				
				//store value
				array[x] = temporary;

			}

// compute the interval

			change = (change - 1);
			change = change / 3;

		}

// return the array

		return array;

	}
	
// shellSortAnalysis() method to find the time complexities shell sort for

// different type of files and each of different sizes

	public static void shellSortComparison() {

		
		// file name as string
		String fileName = "";

		int array[];

		int startLength;
		int endLength;
		long start, end;
		long difference;

// loop through sizes array

		for (int i = 0; i < differentSizesInput.length; i++) {

// loop through file types

			for (int x = 0; x < nameOfDifferentFiles.length; x++) {

// create the file name

				fileName = nameOfDifferentFiles[x]  + differentSizesInput[i] + "file";

// define the array

				array = new int[differentSizesInput[i]];

// get the values from the file

				array = getArrayValues(fileName, array);

// to find the time complexity - the whole goal of all this right? 

// get the time in nano seconds - this is the most precise way to work 

				start = System.nanoTime();

// call the shellSort() method

				array = shellSort(array, differentSizesInput[i]);

// get the time

				start = System.nanoTime();
				end = System.nanoTime();

				// the difference
				long timecomplexity = end - start;

// find the difference of the end and start time

// and store it in shellSortTimer ArrayList

				shellSortAlgorithm.add(timecomplexity);
				
				// after sorting the file which was used the shell sort was able to ....
				System.out.println("\nAfter sorting " + fileName + " Using Shell Sort: ");

				createArray(array, differentSizesInput[i]);
//				deleteArray(array, differentSizeInput[i]);
				
				System.out.println("Time taken to sort " + differentSizesInput[i] + " elements is: " + timecomplexity);

			}

		}

	}

// buildHeap() methods will build the heap

	private static void buildHeap(int arrayInput[], int sizeType) {

//
		// the same way 
		for (int i = 1; i < sizeType; i++) 		{
			
			
			// parent is less than child you should ...

			if (arrayInput[(i - 1) / 2] < arrayInput[i]) {

				int x = i;

				
// heap sort algorithm

// Example: shows the array representation of the original heap. As before, the root, 89, is at position 0. The root's two childern, 76 and 74, are at positions 1 and 2. 
// for a node at position p, the left child is at 2p + 1 and the right child is at 2p + 2. A node at position c can find its parent at (c-1)/2. 
				
				
				while (arrayInput[(x - 1) / 2] < arrayInput[x]) {

					swapValuesAtIndex(arrayInput, x, (x - 1) / 2);
					x = (x - 1) / 2;

				}
		}
	}
}

// heapSort() method to sort the elements in the array using

// heap

	private static int[] heapSortAlgorithm (int array[], int sizeType) {
		return array;
		
	
	}
	
	

	public static int[] heapSort(int arrayValues[], int size)	{

// to build the heap

		buildHeap (arrayValues, size);

		int x = 0;

	
//		buildheapSort(elements);
//		
//		for (int needsToBeSwapped = elements.length - 1; needsToBeSwapped > 0; needsToBeSwapped--) {
//		
//			//being able to move root to the end
//			
//			
//		}
//		
		
		
// loop through each values in the array

		for (int i = size - 1; i > 0; i--) {

// swap the values 


			swapValuesAtIndex(arrayValues, 0, i);
			// swapping values at the index, which we have declared
			
			
			x = 0;

			int currentPosition;

// loop until the index is less than our i value
			
			do {

				currentPosition = (2 * x + 1);

//				while (index < (i - 1) && arrayValues[index] < arrayValues[index + 1])
				//NO
					
				if (currentPosition < (i - 1) && arrayValues[currentPosition] < arrayValues[currentPosition + 1])


					currentPosition++;
				
				
				

				else {
					
					// array value
					
				}

				while (currentPosition < i && arrayValues[x] < arrayValues[currentPosition]) {
					
					
				}

				
				if (currentPosition < i && arrayValues[x] < arrayValues[currentPosition])

					swapValuesAtIndex(arrayValues, x, currentPosition);

				x = currentPosition;
				
				System.out.println(currentPosition);
				
//				
//			while (index == true) {
//				
//			}

				
			} while (currentPosition < i);
			
				System.out.println(currentPosition);

		}

// return the array

		return arrayValues;

	}

// swapValuesAtIndex() method to swap the elements in the array at

// index i and index j

	private static void swapValuesAtIndex(int[] arraySwap, int i, int j) {

		int temp = arraySwap[i];

		arraySwap[i] = arraySwap[j];
//		arraySwap[x] = arraySwap[x];
		arraySwap[j] = temp;

	}

// heapSortAnalysis() method to find the time complexities heap sort for

// different type of

// files and each of different sizes
	
	
	
	private static void heapSortOutput() {
		
		
		
//getting the time complexity for comparison
// declare the required variables


		int array[];

		String fileName = "";
		String fileType = "";
		int beginning, last;
		
		
// loop through sizes array

		for (int i = 0; i < differentSizesInput.length; i++) {

			for (int k = 0; k < nameOfDifferentFiles.length; k++) {

				// setting the file name 
				
				
				
				
				// name of the file + size
				fileName = nameOfDifferentFiles[k]  + differentSizesInput[i] + "File";


				array = new int[differentSizesInput[i]];

				// file values

				array = getArrayValues(fileName, array);
//				array = getArrayValues(fileType);


				beginning = (int) System.nanoTime();

				// calling the heapSort() method

				array = heapSort(array, differentSizesInput[i]);

				
				// getting the time 
				// why are we using nanoTime? Well, the nanoTime() method will help us get the most percise time, which in our case matters a lot 
				
				last = (int) System.nanoTime();
				beginning = (int) System.nanoTime();

				
				
				//taking the difference between the two 
				long timeComplexityHeapSort = last - beginning;

// find the difference of the end and start time

// since we will be comparing heap and shell time complexity 
				
				
				
				
				// getting the difference between the two
				heapSortAlgorithm.add(last - beginning);
				
				
				System.out.println("File name is: (labeled) " + fileName + " heap sort is used : ");
				
				//createArray();
				createArray(array, differentSizesInput[i]);
				
				
				
				//printing out time complexity 
				//print
				System.out.println("Time taken to sort " + differentSizesInput[i] + " elements is: " + timeComplexityHeapSort);

			}
		}
	}

public static int[] creatingArray(int max) {
		return null;
}



private static int[] getArrayValues(String fileType) {
	// TODO Auto-generated method stub
	return null;
}}

	
	
	// our main to print out values

//	public static void main(String args[]) {
//
////		filesUsed();
//		shellSortComparison();
//		heapSortAnalysis();
//		printShellHeapComparison();
//		
//		
//		filesUsed();
//
//
//	}
//}
//






