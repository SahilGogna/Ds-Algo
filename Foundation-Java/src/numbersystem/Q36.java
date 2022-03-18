package numbersystem;

import java.util.Scanner;

/**
 * any base addition
 */
public class Q36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int sum = 0;
        int carry = 0;
        int pow = 1;

        while(n1> 0 || n2>0 || carry>0){
            int d1 = n1%10;
            int d2 = n2%10;

            n1 = n1/10;
            n2 = n2/10;

            int d = d1+d2+carry;
            carry = d/base;
            d = d%base;

            sum += d*pow;
            pow*=10;

        }
        System.out.print(sum);
    }
}
