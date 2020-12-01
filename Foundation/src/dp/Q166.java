package dp;

import java.util.Scanner;

public class Q166 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int currZero = 1;
        int currOne = 1;

        int prevZero = 1;
        int prevOne = 1;

        for(int i = 2; i <= n; i++){
            currZero = prevOne;
            currOne = prevOne + prevZero;

            prevOne = currOne;
            prevZero = currZero;
        }

        System.out.println(currOne + currZero);
    }
}
