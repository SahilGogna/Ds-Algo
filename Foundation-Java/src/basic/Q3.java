package basic;

import java.util.Scanner;

/**
 * print first n numbers of fibonacci series
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();
        int a = 0;
        int b = 1;
        for(int i= 0 ; i<n ; i++){
            System.out.println(a);
            int c = a+b;
            a = b;
            b = c;
        }
    }
}
