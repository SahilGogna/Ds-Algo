package patterns;

import java.util.Scanner;

/**
 * pattern 12
 */
public class Q24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int n1 = 0;
        int n2 = 1;
        for(int i=1; i<=n;i++){
            for(int j= 1; j<= i; j++){
                System.out.print(n1 + "\t");
                int temp = n1 + n2;
                n1= n2;
                n2= temp;
            }
            System.out.println();
        }
    }
}
