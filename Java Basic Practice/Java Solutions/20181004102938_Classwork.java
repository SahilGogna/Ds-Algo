package mymac;

/**
 * 
 * @author sahilgogna
 * 4 October, 2018
 * 
 * Exercise: Write a program which displays all even, positive numbers smaller than 100
   1. Use for loop and the increment i += 2.
   2. Use for loop and use the modular operator (%).
   3. Use for loop for all odd, positive numbers smaller than 100.
 *
 */
public class Classwork {

	public static void main(String[] args) {
		/*
		 Solution 1 : printing even numbers from 0 to 100
		 for(int i=0; i<100;i+=2)
			System.out.println(""+i);
		 */
		
		/* 
		 Solution 2: Checking remainder of each number. If equal to 0 then even
		 for(int i =0;i<100;i++)
			if(i%2==0) System.out.println(""+i);
		*/
		/* Solution 3: start from 1 and add 2 each time to get next odd number
		 for(int i=1; i<100;i+=2)
			System.out.println(""+i);
		 */
	}// end main method 

}
