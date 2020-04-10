package com.hackerrank;

public class MethodOverloading {
	
	// In this example 2 methods are overloaded, add and multiply
	// What does it mean?
	// It means that there are two or more methods with name "add" but they have different parameters and different roles.
	// Role of first add is to add 2 integer numbers.
	// Role of second add is to add 3 integer numbers.
	// Role of third add is to add 2 float numbers.
	// So method over loading means when functionality required is same ( like here we are adding numbers) and we require same name.
	// but each method has different role ( like to add 2 numbers, or sometime we might need to add 3 numbers)
	
	
	// write explaination for multiply

	public static void main(String[] args) {
		
		System.out.println(add(2,3));
		System.out.println(add(4,5,6));
		System.out.println(add(2.5f,6.7f));
		System.out.println(multiply(4, 5));
		System.out.println(multiply(4.5f, 5.5f, 3.4f));
		
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public static float add(float a, float b) {
		return a+b;
	}
	
	public static int multiply(int a, int b) {
		return a*b;
	}
	
	public static float multiply(float a, float b, float c) {
		return a*b*c;
	}

}
