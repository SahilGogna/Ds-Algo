package patterns;

import java.util.Scanner;

/**
 * pattern 7
 */
public class Q19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i =1; i<=n ; i++){
            for(int j = 1; j<= i-1; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
