package mymac;

/**
 * sum and average of array elements
 * 
 * @author sahilgogna
 *
 */
public class ArrayAssignment {
	public static void main(String[] args) {
		int array[] = {0,1,2,3,4,5}; // array of elements
		float sum = 0;  // variable to hold sum
		float average;  // variable to hold average
		for(int i=0; i<array.length; i++) { // for start
			sum += array[i];
		}// end of for
		average = sum/array.length; // calculating average
		System.out.println("Sum ="+sum+" Average ="+average); // printing results
	}
}
