package patterns;

import java.util.Scanner;

/**
 * pattern 20
 * diag are i == j or i+j == n+1
 */
public class Q32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                if(j==1|| j==n || (i>n/2 && (i==j || i+j == n+1))){
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}
