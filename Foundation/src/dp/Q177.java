package dp;

import java.util.Scanner;

public class Q177 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int k= scanner.nextInt();

        if( n ==0 || k == 0 || n<k){
            System.out.println(0);
            return;
        }

        long[][] dp = new long[k+1][n+1];

        for(int t = 1 ; t<=k; t++){
            for(int p = 1; p<=n; p++){
                if(p < t){
                    dp[t][p] = 0;
                } else if( t == p){
                    dp[t][p] = 1;
                } else{
                    dp[t][p] = (dp[t][p-1] * t) + dp[t-1][p-1];
                }
            }
        }

        System.out.println(dp[k][n]);
    }
}
