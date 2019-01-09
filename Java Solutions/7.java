import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		// Assignment 3
		
		//solution 1 
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		
		if(a>b) {
			System.out.println("A is larger");
		}else {
			System.out.println("B is larger");
		}
		*/
		
		//solution2
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		
		if(a>b) {
			System.out.println("B is smaller");
		}else {
			System.out.println("A is smaller");
		}
		*/
		
		//solution 3
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		float a;
		float x = scan.nextFloat();
		float y = scan.nextFloat();
		float z = scan.nextFloat();
		if(x>y) {
			a=x;
		}else {
			a=y;
		}
		if(a>z) {
			a=a;
		}else {
			a=z;
		}
		System.out.println("Largest number is "+ a);
		
		if(x<y) {
			a=x;
		}else {
			a=y;
		}
		if(a<z) {
			a=a;
		}else {
			a=z;
		}
		System.out.println("Smallest number is "+ a); */
		
		//Solution 4
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		float x = scan.nextFloat();
		float y = scan.nextFloat();
		float z = scan.nextFloat();
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		if(x>0) {
			System.out.println("Result is "+ (x+y+z+a+b));
		}else {
			System.out.println("Result is "+ (x-y-z-a-b));
		}*/
	}
}
