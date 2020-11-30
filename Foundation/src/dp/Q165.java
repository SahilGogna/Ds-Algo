package dp;

import java.util.Scanner;

public class Q165 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] value = new int[n];
        int[] wt = new int[n];

        for(int i = 0; i< n; i++){
            value[i] = scanner.nextInt();
        }

        for(int i = 0; i< n; i++){
            wt[i] = scanner.nextInt();
        }

        int ans = scanner.nextInt();

        int[] dp = new int[ans+1];

        for(int i = 1; i<dp.length; i++){
            for(int j = 0; j< wt.length; j++){
                if( i >= wt[j]){
                    int val = value[j] + dp[ i - wt[j]];
                    if(val > dp[i]){
                        dp[i] = val;
                    }
                }
            }
        }
        System.out.println(dp[ans]);
    }
}
