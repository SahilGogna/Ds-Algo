package basic;

import java.util.Scanner;

/**
 * perfect squares
 */
public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 1; i*i < n; i++){
            System.out.println(i*i);
        }
    }
}
