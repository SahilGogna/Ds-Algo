package patterns;

import java.util.Scanner;

/**
 * pattern 6
 */
public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int hash = 1;
        int star = (n/2)+1;

        for(int i=1; i<=n ; i++){
            for(int j = 1; j<= star; j++){
                System.out.print("*");
            }
            for(int k = 1; k<= hash; k++){
                System.out.print(" ");
            }
            for(int l = 1; l<= star; l++){
                System.out.print("*");
            }
            if(i <= n/2){
                hash+=2;
                star--;
            }else {
                hash-=2;
                star++;
            }
            System.out.println();
        }
    }
}
