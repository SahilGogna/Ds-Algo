package mymac;

import java.util.Scanner;

/**
 * Classwork 1 Switch statements
 * 
 * @author sahilgogna
 *
 */
public class SwitchStatements2 {
	/*
	 * algo : 1) Take input from user, store in a varibale
	 * 		  2) Print the corresponding day of the week to the value using switch case
	 * 		  3) For wrong input print invalid input.
	 */
	public static void main(String[] args) {
		int input;  // variable to store user input
		Scanner scan = new Scanner(System.in); // scanner class object to get input
		System.out.println("Please enter a value between 1 to 7");
		input = scan.nextInt();  // command line input stored in varibale
		switch (input) {         // swich case on value of input variable
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
			
		case 4:
			System.out.println("Thursday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Weekend");
			break;
			
		case 7:
			System.out.println("Weekend");
			break;

		default:
			System.out.println("Wrong value. Enter a number between 1 to 7");
			break;
		}
		scan.close();
	}


}
