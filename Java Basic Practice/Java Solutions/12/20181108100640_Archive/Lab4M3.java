package mymac;

import java.util.Scanner;

public class Lab4M3 {
	public static void main(String[] arags) {


		int i=0, option=0;
		//create Scanner object inputValue with constructor Scanner() for user inputs
		Scanner inputValue = new Scanner(System.in);
		//double array of two dimensions to hold up to ten by two numbers from user
		double[][] arr_Two = new double[10][2];
		char[] operations = new char[10];
		int j = 0;
		
		do {
			System.out.println("Enter the value for the option you want: ");
			System.out.println("1 for adding two values ");
			System.out.println("2 for subtracting two values ");
			System.out.println("3 for multiplying two values ");
			System.out.println("4 for dividing two values ");
			System.out.println("5 for displaying the operation(s) ");
			System.out.println("0 for quitting app. ");
			option = inputValue.nextInt();
			
			switch(option) {
			case 1 : {
				System.out.println("Enter the first value: ");
				arr_Two[i][0] = inputValue.nextDouble();
				System.out.println("Enter the second value: ");
				arr_Two[i][1] = inputValue.nextDouble();
				i++;
				operations[j] = '+';
				j++;
			}break;
			case 2 : {
				System.out.println("Enter the first value: ");
				arr_Two[i][0] = inputValue.nextDouble();
				System.out.println("Enter the second value: ");
				arr_Two[i][1] = inputValue.nextDouble();
				i++;
				operations[j] = '-';
				j++;
			}break;
			case 3 : {
				System.out.println("Enter the first value: ");
				arr_Two[i][0] = inputValue.nextDouble();
				System.out.println("Enter the second value: ");
				arr_Two[i][1] = inputValue.nextDouble();
				i++;
				operations[j] = '*';
				j++;
			}break;
			case 4 : {
				System.out.println("Enter the first value: ");
				arr_Two[i][0] = inputValue.nextDouble();
				System.out.println("Enter the second value: ");
				arr_Two[i][1] = inputValue.nextDouble();
				while(arr_Two[i][1] == 0) {
					System.out.println("For division second number cannot be zero! Enter again.");
					arr_Two[i][1] = inputValue.nextDouble();
				}
				i++;
				operations[j] = '/';
				j++;
			}break;
			case 5 : {
				Calculator calc = new Calculator();
				for(i=0,j=0; i < arr_Two.length; i++,j++ ) {
					if(operations[j] == '+') {
						double result = calc.add(arr_Two[i][0] , arr_Two[i][1]);
						System.out.println(arr_Two[i][0] + " + " + arr_Two[i][1] + " = " + result);
					}else if(operations[j] == '-'){
						double result = calc.subtract(arr_Two[i][0] , arr_Two[i][1]);
						System.out.println(arr_Two[i][0] + " - " + arr_Two[i][1] + " = " + result);
					}else if(operations[j] == '*'){
						double result = calc.multiply(arr_Two[i][0] , arr_Two[i][1]);
						System.out.println(arr_Two[i][0] + " * " + arr_Two[i][1] + " = " + result);
					}else if(operations[j] == '/'){
						double result = calc.divide(arr_Two[i][0] , arr_Two[i][1]);
						System.out.println(arr_Two[i][0] + " / " + arr_Two[i][1] + " = " + result);
					}
				}
			}break;
			case 0 : {
				int op = 0;
				
				System.out.println("Are you sure you want to quit? Enter 0 to confirm, or other value to continue. ");
				op = inputValue.nextInt();
				if(op != 0) {
					System.out.println("You decide to continue. ");
					option = 4;
				}
				else {
					System.out.println("Bye. ");
					inputValue.close();
				}
			}break;
			default : {
				System.out.println("Enter 1,2 or 0 to quit! ");
			}break;
			}//end switch
		}while(option != 0);	
	
	}
}
