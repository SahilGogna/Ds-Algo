package numbersystem;

import java.util.Scanner;

/**
 * any bast to base 10
 */
public class Q34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();
        int dn = getValueInDecimal(n, b);
        System.out.println(dn);
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
}
