package dp;

import java.util.Scanner;

public class Q160 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] arr = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        int[][] dp = new int[n][m];
        int max = Integer.MIN_VALUE;

        for(int i = dp[0].length-1 ; i>= 0 ; i--){
            for(int j = 0; j <= dp.length - 1; j++){
                // last column
                if(i == dp[0].length-1 ){
                    dp[j][i] = arr[j][i];
                }
                // top row
                else if( j == 0){
                    dp[j][i] = arr[j][i] + Math.max(dp[j+1][i+1], dp[j][i+1]);
                }
                // bottom row
                else if( j == dp.length - 1){
                    dp[j][i] = arr[j][i] + Math.max(dp[j-1][i+1], dp[j][i+1]);
                }
                else {
                    dp[j][i] = arr[j][i] + Math.max(dp[j-1][i+1], Math.max(dp[j][i+1],dp[j+1][i+1]));
                }
            }
        }

        for(int i = 0; i< dp.length; i++){
            max = Math.max(max, dp[i][0]);
        }

        System.out.println(max);

    }
}
