package patterns;

import java.util.Scanner;

/**
 * pattern 11
 */
public class Q23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int counter = 1;

        for(int i=1; i<= n ; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(counter+"\t");
                counter++;
            }
            System.out.println();
        }
    }
}
