package dp;

import java.util.Scanner;

public class Q163 {
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

        for(int i = 1; i<dp.length; i++){
            for(int j = 0; j<arr.length; j++){
                int coin = arr[j];
                if(i >= coin){
                    dp[i] += dp[i - coin];
                }
            }
        }

        System.out.println(dp[amt]);
    }
}
