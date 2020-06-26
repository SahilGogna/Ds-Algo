package arrays;

import java.util.Scanner;

/**
 * bar graph
 */
public class Q38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) max = arr[i];
        }

        for(int i=max; i>=1; i--){
            for(int j= 0; j< arr.length; j++){
                if(arr[j] >= i){
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}
