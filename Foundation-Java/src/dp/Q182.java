package dp;

import java.util.Scanner;

public class Q182 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        int mpist = 0;
        int lsf = arr[0];
        int[] dp1 = new int[n];

        for(int i = 1; i<n; i++){
            if(arr[i] < lsf ){
                lsf = arr[i];
            }

            mpist = arr[i] - lsf;
            if(mpist > dp1[i-1]){
                dp1[i] = mpist;
            }else{
                dp1[i] = dp1[i-1];
            }
        }

        int mpibt = 0;
        int msf = arr[n-1];
        int[] dp2 = new int[n];

        for(int i = n-2; i>=0 ; i--){
            if(arr[i] > msf){
                msf = arr[i];
            }

            mpibt = msf - arr[i];

            if(mpibt > dp2[i+1]){
                dp2[i] = mpibt;
            }else{
                dp2[i] = dp2[i+1];
            }
        }

        int op = 0;
        for(int i = 0; i<n; i++){
            int m = dp1[i] + dp2[i];
            if( op < m){
                op = m;
            }
        }

        System.out.println(op);
    }
}
