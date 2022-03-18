package patterns;

import java.util.Scanner;

/**
 * pattern 5
 */
public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int star = 1;
        int space = n/2;
        for(int i=1; i<=n ; i++){
            for(int j = 1; j<= space; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<= star; k++){
                System.out.print("*");
            }
            if (i <= n/2){
                space--;
                star+=2;
            }else {
                space++;
                star-=2;
            }
            System.out.println();
        }
    }
}
