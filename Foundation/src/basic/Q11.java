package basic;

import java.util.Scanner;

/**
 * given 3 numbers, check ik they can form sides of a right angled triangle
 */
public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        int hy = n1;
        int b = n2;
        int p = n3;
        if (n2 > hy) {
            hy = n2;
            b =n1;
        }
        if (n3 > hy) {
            hy = n3;
            b = n1;
            p = n2;
        }

        if((hy * hy) == (b*b)+(p*p)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

}
