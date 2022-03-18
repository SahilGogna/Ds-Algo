package dp;

import java.util.Scanner;

public class Q168 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int[] dp = new int[str.length()];
        dp[0] = 1;

        for(int i = 1; i< dp.length; i++){
            char last = str.charAt(i);
            char sLast = str.charAt(i-1);

            if( sLast == '0' && last == '0'){
                dp[i] = 0;
            }else if( sLast == '0' && last != '0'){
                dp[i] = dp[i-1];
            }else if( sLast != '0' && last == '0'){
                if(sLast == '1' || sLast == '2'){
                    dp[i] = ( i >=2 ? dp[i-2] : 1);
                }else {
                    dp[i] = 0;
                }
            }else{
                dp[i] = dp[i-1];
                if(Integer.parseInt(str.substring(i-1,i+1))<= 26){
                    dp[i] += ( i >=2 ? dp[i-2] : 1);
                }
            }
        }
        System.out.println(dp[str.length()-1]);
    }
}
