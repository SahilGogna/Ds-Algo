package patterns;

import java.util.Scanner;

/**
 * pattern 17
 */
public class Q29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int spaces = n / 2;
        int star = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= spaces; j++) {
                if (i != (n / 2) + 1) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }
            for (int k = 1; k <= star; k++) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                star++;
            } else {
                star--;
            }
            System.out.println();
        }
    }
}
