package basic;

import java.util.Scanner;

/**
 * printing z
 */
public class Q1 {

    public static void main(String[] args) {
//		for(int i = 0 ; i< 5 ; i++) {
//			for(int j= 0; j< 5; j++) {
//				if(i == 0 || i==4) {
//					System.out.print("*");
//				}else if(i+j == 4) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1) {
                    System.out.print("*");
                } else if (i + j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
