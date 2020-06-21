package basic;

import java.util.Scanner;

/**
 * check if a number is prime is not
 * pq = n 
 * =>  p < sqrt n p will always be less than root n and also q
 * 
 * try variation:- print all prime numbers between a range
 * you will be given low and high value
 */
public class Q2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		for(int i = 0 ; i < t; i++) {
			int n = scan.nextInt();
			int count = 0;
			
			for( int div = 2; div*div <n ; div++ ) {
				
				// no need to check for all the numbers, when you get first number
				// get out of the loop
				if(n%div == 0) {
					count++;
					break;
				}
			}

			if(count == 0) {
				System.out.println("Prime");
			}else {
				System.out.println("Not prime");
			}
		}

	}

}
