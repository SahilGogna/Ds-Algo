package dp;

import java.util.Scanner;

public class Q161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        boolean[][] dp = new boolean[n+1][tar+1];

        for(int i =0; i< dp.length; i++){
            for(int j = 0; j< dp[0].length; j++){

                // top left corner
                if( i == 0 && j == 0){
                    dp[i][j] = true;
                }
                // top row
                else if(i == 0){
                    dp[i][j] = false;
                }
                // left row
                else if(j == 0){
                    dp[i][j] = true;
                }
                else {
                    // if top box is true
                    if(dp[i-1][j] == true){
                        dp[i][j] = true;
                    }else{
                        int val = arr[i-1];
                        if( j >= val){
                            if(dp[i-1][j-val] == true){
                                dp[i][j] = true;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(dp[arr.length][tar]);
    }
}
