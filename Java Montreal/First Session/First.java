package com.hackerrank;

public class First {

	public static void main(String[] args) {
		// print sum of 3,5,6
		// print sum of 45,6
		
		int a = 3;
		int b = 5;
		int c = 6;
//		int sum = add(a, b, c);
		int sum = a + b + c;
		int sum2 = add(3,5,6);
		System.out.println(sum);
		// print sum of 2,4,5
		// print sum of 5,7,8
		// print sum of 9, 6,3
		// print 55,44,55
		int q = 2;
		int p = 4;
		int r = 5;
		int newSum = p+q+r;
		int sum1 = add(p,q,r);
		
		int easySum = add(55,44,55);
		// print
		
		System.out.println(add(3,5,6));
		
	}
	
	// make 3 methods called subtract, multiply, divide*(only for 2 numbers)
	// overload these methods for 2,3,4 number of parameters - concept of method overloading
	// try with return type float and parameter type float
	

	public static int add(int a, int b) {
		int c = a+b;
		return c;
	}
	
	// concept of method overloading
	public static int add(int a, int b, int c) {
		int sum = a + b + c;
		return sum;
	}

}
