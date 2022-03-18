package dp;

import java.util.Scanner;

public class Q178 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] stockPrice = new int[n];
        for(int i = 0; i<n; i++){
            stockPrice[i] = scan.nextInt();
        }

        int[] profit = new int[n];
        int min = stockPrice[0];
        profit[0] = 0;

        for(int i = 1; i<n;i++){
            if(min >stockPrice[i]){
                min = stockPrice[i];
            }
            profit[i] = stockPrice[i] - min;
        }

        int maxProfit = profit[0];
        for(int i = 1; i<n;i++){
            if(profit[i] > maxProfit){
                maxProfit = profit[i];
            }
        }
        System.out.println(maxProfit);
    }
}
