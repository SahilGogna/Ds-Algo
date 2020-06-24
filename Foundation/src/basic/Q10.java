package basic;

import java.util.Scanner;

/**
 * prime factorization
 */
public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 2; i * i < n; i++) {
            while (n % i == 0) {
                n = n / i;
                System.out.println(i+" ");
            }
        }
        if (n != 1) System.out.println(n);
    }
}
