package dp;

import java.util.Scanner;

public class Q172Optim {
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
        int l = Integer.MAX_VALUE;
        int sl = Integer.MAX_VALUE;
        for(int i = 0; i<dp[0].length; i++){
            dp[0][i] = arr[0][i];

            if(arr[0][i] <= l){
                sl = l;
                l = arr[0][i];
            }else if(arr[0][i] <= sl){
                sl = arr[0][i];
            }
        }

        for(int i = 1; i<dp.length; i++) {
            int nl = Integer.MAX_VALUE;
            int nsl = Integer.MAX_VALUE;
            for (int j = 0; j < dp[0].length; j++) {
                if(l == dp[i-1][j]){
                    dp[i][j] = sl + arr[i][j];
                }else {
                    dp[i][j] = l + arr[i][j];
                }

                if(dp[i][j] <= nl){
                    nsl = nl;
                    nl = dp[i][j];
                }else if(dp[i][j] <= nsl){
                    nsl = dp[i][j];
                }
            }
            l = nl;
            sl = nsl;
        }

        System.out.println(l);

    }
}
