package arrays;

import java.util.Scanner;

/**
 * sum of array
 */
public class Q39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();

        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        int n2 = scanner.nextInt();

        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        int[] sum = new int[n1 > n2 ? n1 : n2];
        int carry = 0;

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;

        while(k >= 0){
            int digit = carry;

            if( i>= 0){
                digit+=arr1[i];
            }
            if( j>=0){
                digit+=arr2[j];
            }
            carry = digit/10;
            digit = digit%10;

            sum[k] = digit;
            i--;
            j--;
            k--;
        }
        if(carry!=0){
            System.out.print(carry+"\t");
        }

        for(int p: sum){
            System.out.print(p+"\t");
        }
    }
}
