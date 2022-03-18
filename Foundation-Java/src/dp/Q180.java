package dp;

import java.util.Scanner;

public class Q180 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        int fee = scan.nextInt();

        int obsp = -1*arr[0];
        int ossp = 0;

        for(int i = 1; i<n; i++){
            int nbsp = 0;
            int nssp = 0;

            if(ossp - arr[i] > obsp){
                nbsp = ossp - arr[i];
            }else{
                nbsp = obsp;
            }

            if(arr[i] + obsp - fee > ossp){
                nssp = arr[i] + obsp - fee;
            }else{
                nssp = ossp;
            }
            obsp = nbsp;
            ossp = nssp;
        }
        System.out.println(ossp);
    }
}
