package stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Stock span
 */
public class Q46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();

        int[] arr = new int[n];
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        result[0] = 1;
        stack.push(0);

        for(int i=1 ; i<n ;i++){
            while(stack.size() > 0 && arr[i] >= arr[stack.peek()]){
                stack.pop();
            }
            if(stack.size() ==0){
                result[i] = i +1;
            }else{
                int val = stack.peek();
                result[i] = i - val;
            }
            stack.push(i);
        }

        for (int val : result) {
            System.out.print(val + "\t");
        }
    }
}
