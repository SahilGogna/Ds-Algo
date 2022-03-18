package patterns;

import java.util.Scanner;

/**
 * pattern 10
 */
public class Q22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int is = -1;
        int os = n/2;

        for (int i = 1; i<= n ; i++){

            for(int j=1 ; j<= os; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=1 ; j<= is; j++){
                System.out.print(" ");
            }
            if(is> 0){
                System.out.print("*");
            }
            if(i <= n/2){
                is+=2;
                os--;
            }else{
                is-=2;
                os++;
            }
            System.out.println();
        }
    }
}
