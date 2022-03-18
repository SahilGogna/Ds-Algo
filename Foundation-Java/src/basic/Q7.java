package basic;

import java.util.Scanner;

/**
 * new type of inverses
 * https://www.youtube.com/watch?v=dbk42TKwk4M&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=23
 */
public class Q7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        int sum = 0;
        while (n != 0) {
            int x = n % 10;
            x = (int) Math.pow(10, x - 1);
            sum = sum + (i * x);
            i++;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
