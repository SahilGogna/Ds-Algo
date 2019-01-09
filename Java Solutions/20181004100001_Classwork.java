package mymac;

import java.util.Scanner;

/**
 * 
 * @author sahilgogna
 * 4 October, 2018
 * 
 * Program to find even odd numbers
 *
 */
public class Classwork {

	public static void main(String[] args) {
		int number; // variable to hold user input
		int remainder; // variable to be used for switch case
		Scanner scan = new Scanner(System.in); // scanner object to get command line input
		number = scan.nextInt();
		remainder = number%2;
		/*// using if else
		if(remainder == 0)  // if remainder is 0
			System.out.println("Number is Even");
		else  // if remainder is not 0 
			System.out.println("Number is Odd");
		*/
		
		/*// using switch case
		switch(remainder) {
		case 0: System.out.println("Number is Even"); 
		break;
		case 1: System.out.println("Number is Odd");
		break;
		} // end switch
		*/
		scan.close();  // close scanner object to free resources
	}// end main method 

}
