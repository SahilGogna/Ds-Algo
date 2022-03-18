package basic;

import java.util.Scanner;

/**
 * print all digits of a number from left to right in a new line
 * <p>
 * Soln: first count number of digits, then 10^digit start div
 */
public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int nod = 0;
        int temp = n;
        while (temp != 0) {
            temp /= 10;
            nod++;
        }
        int div = (int) Math.pow(10, nod - 1);
        while (div != 0) {
            int digit = n / div;
            System.out.println(digit);
            n = n % div;
            div = div / 10;
        }


    }
}
