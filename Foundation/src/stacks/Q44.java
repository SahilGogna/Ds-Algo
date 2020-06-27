package stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 */
public class Q44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();

        int[] arr = new int[n];
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // pushing first index
        stack.push(0);
        result[n-1] = -1;

        // only larger value has ability to pop, else its index get pushed
        for(int i=1 ; i<n ; i++){
            while(stack.size()!=0 && arr[i] > arr[stack.peek()]){
                int pos = stack.peek();
                result[pos] = arr[i];
                stack.pop();
            }
            stack.push(i);
        }
        while(stack.size() != 0){
            int pos = stack.peek();
            result[pos] = -1;
            stack.pop();
        }

        for (int val : result) {
            System.out.print(val + "\t");
        }

    }
}
