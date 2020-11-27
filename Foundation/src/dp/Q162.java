package dp;

import java.util.Scanner;

public class Q162 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        int amt = scan.nextInt();
        int[] dp = new int[amt+1];
        dp[0] = 1;
        for(int i=0; i<arr.length;i++){
            for(int j = arr[i]; j<dp.length; j++){
                dp[j] += dp[j - arr[i]];
            }
        }

        System.out.println(dp[amt]);
    }
}
