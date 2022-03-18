package dp;

import java.util.Scanner;

public class Q172 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int houses = scan.nextInt();
        int colours = scan.nextInt();

        int[][] arr = new int[houses][colours];

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length;j++){
                arr[i][j] = scan.nextInt();
            }
        }

        int[][] dp = new int[houses][colours];
        for(int i = 0; i<dp[0].length; i++){
            dp[0][i] = arr[0][i];
        }

        for(int i = 1; i<dp.length; i++){
            for(int j= 0; j<dp[0].length; j++){
                int min = Integer.MAX_VALUE;
                for(int k =0; k<dp[0].length; k++){
                    if( k != j){
                        if(dp[i-1][k] < min){
                            min = dp[i-1][k];
                        }
                    }
                }
                dp[i][j] = arr[i][j] + min;
            }
        }

        int min = Integer.MAX_VALUE;

        for(int i = 0; i<dp[0].length; i++){
            min = Math.min(dp[houses-1][i], min);
        }
        System.out.println(min);
    }
}
