package dp;

import java.util.Scanner;

public class Q164 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] value = new int[n];
        int[] weight = new int[n];
        for (int i = 0; i < n; i++) {
            value[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            weight[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        int dp[][] = new int[n + 1][target + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (j >= weight[i - 1]) {
                    dp[i][j] = Integer.max(dp[i - 1][j], dp[i - 1][j - weight[i - 1]] + value[i - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[n][target]);
    }
}
