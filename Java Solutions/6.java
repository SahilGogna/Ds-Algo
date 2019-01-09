import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		// Solution 1. code to print name
		String name= "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		name = scan.next();
		System.out.println("Hello "+name);
		
		// Solution 2. code to print the next number
		int n;
		System.out.println("Enter the number");
		n = scan.nextInt();
		System.out.println("next number is "+ (n+1));
		
		// solution 3. code to add 2 numbers
		System.out.println("Enter 2 numbers to add");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Rsult is "+ (a+b));
		scan.close();
		
		
		
	}
}
