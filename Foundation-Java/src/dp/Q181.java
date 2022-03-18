package dp;

import java.util.Scanner;

public class Q181 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        int obsp = -1*arr[0];
        int ossp = 0;
        int ocsp = 0;

        for(int i = 1; i<n; i++){
            int nbsp = 0;
            int nssp = 0;
            int ncsp = 0;

            if(ocsp - arr[i] > obsp){
                nbsp = ocsp - arr[i];
            }else{
                nbsp = obsp;
            }

            if(obsp + arr[i] > ossp){
                nssp = obsp + arr[i];
            }else{
                nssp = ossp;
            }

            if(ossp > ocsp){
                ncsp = ossp;
            }else{
                ncsp = ocsp;
            }

            obsp = nbsp;
            ossp = nssp;
            ocsp = ncsp;
        }

        System.out.println(ossp);
    }
}
