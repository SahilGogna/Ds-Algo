package patterns;

import java.util.Scanner;

/**
 * pattern 18
 */
public class Q30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int spaces = 0;
        int stars = n;

        for(int i = 1 ; i<= n; i++){
            for(int j= 1 ; j<=spaces; j++){
                System.out.print("\t");
            }
            for(int k= 1; k<= stars; k++){
                if( i> 1 && i<n/2 && k>1 && k<stars){
                    System.out.print("\t");
                }else{
                    System.out.print("*\t");
                }
            }
            if(i <= n/2){
                spaces++;
                stars-=2;
            }else {
                spaces--;
                stars+=2;
            }
            System.out.println();
        }
    }
}
