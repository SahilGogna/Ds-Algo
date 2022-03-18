package dp;

import java.util.Scanner;

public class Q179 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] sp = new int[n];
        for(int i = 0; i<n; i++){
            sp[i] = scan.nextInt();
        }
        int buy = sp[0];
        int sell = sp[0];
        int profit = 0;
        for(int i = 1; i<n ;i++){
            // if the graph increases
            if(sp[i] >= sell){
                sell = sp[i];
            }else{
                profit += (sell - buy);
                sell = sp[i];
                buy = sp[i];
            }
        }
        profit += (sell - buy);
        System.out.println(profit);
    }
}
