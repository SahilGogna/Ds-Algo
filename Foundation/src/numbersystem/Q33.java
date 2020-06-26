package numbersystem;

import java.util.Scanner;

/**
 * convert number base 10 to any base
 */
public class Q33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
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
