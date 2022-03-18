package basic;

import java.util.Scanner;

/**
 * reverse a number
 */
public class Q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n!=0){
            System.out.print(n%10);
            n/=10;
        }
    }
}
