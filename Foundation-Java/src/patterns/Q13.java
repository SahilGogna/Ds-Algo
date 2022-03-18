package patterns;

import java.util.Scanner;

/**
 * p1
 */
public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 1; i<=n ; i++){
            int k = i;
            while(k !=0){
                System.out.print("*");
                k--;
            }
            System.out.println();
        }
    }
}
