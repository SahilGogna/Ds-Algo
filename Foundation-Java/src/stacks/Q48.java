package stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Sliding window maximum
 * given an array and sliding window, find the maximum in each sliding window
 */
public class Q48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] nge = new int[n];
        Stack<Integer> stack = new Stack<>();

        stack.push(n-1);
        nge[n-1] = n;

        for( int i = n-2; i>= 0 ; i--){
            while( stack.size() > 0 && arr[i] <= arr[stack.peek()]){
                stack.pop();
            }
            if(stack.size() == 0 ){
                nge[i] = n;
            }else{
                nge[i] = stack.peek();
            }
            stack.push(i);
        }

        int j = 0;
        for( int  i = 0; i<= n-k ; i++){
            if( j<i){
                j = i;
            }
            while(nge[j] < i+k){
                j = nge[j];
            }

            System.out.println(arr[j]);
        }

    }
}
