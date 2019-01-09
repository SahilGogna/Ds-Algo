package mymac;

import java.util.Scanner;


/**
 * mid term prepration
 * 
 * @author sahilgogna
 *
 */
public class DemoExam {
	
	/**
	 * method for solution of ques 2
	 */
	public static void answerTwo() {
		String name; // variable to store name
		float maximum; // variable to store maximum value
		float sum= 0;  // variable to store sum
		float array[] = new float[6];
		Scanner scan = new Scanner(System.in); // scanner object for command line input
		System.out.println("Enter you name");
		name = scan.nextLine();
		for(int i=0; i<6 ; i++) {// for started
			System.out.println("Enter the number "+(i+1));
			array[i] = scan.nextInt();
			sum += array[i]; // sum = sum + number entered
		}// end of for
		maximum = array[0];
		for(int i=1; i<6; i++) { // comparing each number with minimum
			if(array[i]> maximum) // if number is less than minimum
				maximum = array[i];
		}
		System.out.println("The Biggest number "+name+" entered is "+maximum+" The Average is "+sum/array.length);
	}
	
	/**
	 * method for solution of ques 4
	 */
	public static void answerFour() {
		String name;    // variable to store name
		float maximum = Float.MIN_VALUE;   // variable to store maximum value
		float minimum = Float.MAX_VALUE;   // variable to store minimum value
		Scanner scan = new Scanner(System.in);   // scanner object for command line input
		int choice = 1;   // variable to store user choice
		float number;     // variable to store number entered by user
		float sum = 0;    // variable to store sum
		int count =0;     // variable to store count of numbers
		System.out.println("Enter you name");
		name = scan.nextLine();
		do {
			count++; // increment counter
			System.out.println("Enter the number "+name+" or 0 to quit");
			number = scan.nextFloat();
			if(number== 0) choice = (int) number; // if user enters 0
			else {
				sum += number;
				if(number < minimum) // checking minimum
					minimum = number;
				if(number > maximum) // checking maximum
					maximum = number;
			} //end else
		}while(choice!=0);// end do
		System.out.println("The Biggest number is :"+maximum+" The smallest number is :"+minimum+" The Average is "+sum/count);
	}
	
	public static void answerFive() {
		int choice=0;
		Scanner scan = new Scanner(System.in);
		do {// do starts
			System.out.println("Press\n1 to run question 2\n2 to run question 4\n3 to quit");
			choice = scan.nextInt();
			switch(choice) {// switch begins
			 case 1: answerTwo(); 
			         break;
			 case 2: answerFour(); 
			         break;
			 case 3: break;
			 default: System.out.println("Invalid input");break;
			}	
		}while (choice!=3);// end do
	}
	
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
//		answerTwo();
//		answerFour();
		answerFive();
	}
}



/*
 * Question 1 :  Write an algorithm in pseudo-code, which will ask the user to enter the name and 6 numbers, 
 *               and then find out the bigger number entered. Calculate and print out the average.
	Answer 1: 1) Define a String variable as name.
			  2) Define an array of length 6.
			  3) Define variables maximum and average to store results.
			  4) Print "Enter your name" to ask for command line input.
			  5) Store the entered value inside string variable using Scanner class and nextLine() method.
			  6) Ask user for 6 numbers using for loop.
			  7) Store each variable in array and add to sum.
			  8) traverse array and find the maximum by comparing each value of array.
			  9) Print the results
 * 
 * */

/*
 * Question 3 :  Rewrite the algorithm (pseudo-code) from Q1, but this time without knowing in advance how many numbers the user wants to proceed. 
                 If the user enter 0, stop asking for a number, and display the maximum and the minimum of entered numbers, then the average.
	Answer 1: 1) Define a String varibale as name.
			  2) Define float variable as min which has value of maximum float value.
			  3) Define float variable as max which has value of minimum float value.
			  4) Define other variabels as choice, number and sum.
			  5) Print "Enter your name" to ask for command line input.
			  6) Store the entered value inside string variable using Scanner class and nextLine() method.
			  7) Start a do loop and keep on runing until user enters 0.
			  8) Inside do loop keep on adding the numbers in sum sum = sum+ number.
			  9) compare with minimum variabele if it is less store the number inside minimum. min= number
			  10) compare with maximum variabele if it is more store the number inside maximum. max = number
			  11) if user enters 0 exit and print results.
 * 
 * */






 