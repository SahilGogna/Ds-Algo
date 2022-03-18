package patterns;

import java.util.Scanner;

/**
 * pattern 16
 */
public class Q28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int space = (2*n)-3;
        int star = 1;
        for(int i=1;i<=n;i++){
            int val = 1;
            for(int j=1;j<=star;j++){
                System.out.print(val++ + "\t");
            }
            for(int j=1; j<=space; j++){
                System.out.print("\t");
            }
            if( i == n){
                star--;
                val--;
            }
            for(int j=1;j<=star;j++){
                System.out.print(--val + "\t");
            }
            star++;
            space-=2;
            System.out.println();
        }
    }
}
