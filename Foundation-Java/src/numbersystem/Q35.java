package numbersystem;

import java.util.Scanner;

/**
 * any base to any base
 *
 */
public class Q35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int dec = getValueInDecimal(n,b);
        int val = getValueInBase(dec, c);
        System.out.print(val);

    }
    private static int getValueInDecimal(int n, int b) {
        int rv = 0;
        int pow = 1;
        while (n != 0) {
            int rem = n%10;
            n = n/10;
            rv+=rem * pow;
            pow*=b;
        }
        return rv;
    }

    private static int getValueInBase(int n, int b) {
        int rv = 0;
        int p = 1;
        while (n != 0) {
            int rem = n % b;
            n = n / b;
            rv += rem * p;
            p *= 10;
        }
        return rv;
    }
}
