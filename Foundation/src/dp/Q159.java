package dp;

import java.util.Scanner;

public class Q159 {
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

        for(int i = dp.length - 1; i >= 0; i--){
            for(int j = dp[0].length - 1; j >=0 ; j--){
                if( i == dp.length - 1 && j == dp[0].length - 1){
                    // bottom corner
                    dp[i][j] = arr[i][j];
                }else if(i == dp.length - 1){
                    // last row
                    dp[i][j] = arr[i][j] + dp[i][j+1];
                }else if(j == dp[0].length - 1){
                    // last column
                    dp[i][j] = arr[i][j] + dp[i+1][j];
                }else {
                    dp[i][j] = arr[i][j] + Math.min(dp[i+1][j], dp[i][j+1]);
                }
            }
        }

        System.out.println(dp[0][0]);
    }
}
