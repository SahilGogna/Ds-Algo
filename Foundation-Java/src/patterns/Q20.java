package patterns;

import java.util.Scanner;

/**
 * pattern 8
 */
public class Q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = n; i>=1 ; i--){
            for(int j = i-1; j >= 1; j--){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
