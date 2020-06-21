package basic;

import java.util.Scanner;

/**
 * count number of digits in a number
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int counter = 0;
        while(n!=0){
            n = n/10;
            counter++;
        }
        System.out.println(counter);
    }
}
