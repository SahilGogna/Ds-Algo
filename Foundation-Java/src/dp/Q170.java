package dp;

import java.util.Scanner;

public class Q170 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i< n; i++){
            arr[i] = scan.nextInt();
        }

        int inc = arr[0];
        int exc = 0;

        for(int i = 1; i<n; i++){
            int newInc = exc + arr[i];
            int newExc = Math.max(inc, exc);

            exc = newExc;
            inc = newInc;
        }

        System.out.println(Math.max(inc,exc));
    }
}
