package stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * next greater element on the right
 */
public class Q43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();

        int[] arr = new int[n];
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        stack.push(arr[n - 1]);
        result[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            while (stack.size() > 0 && arr[i] >= stack.peek()) {
                stack.pop();
            }
            if (stack.size() ==  0) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        for (int val : result) {
            System.out.print(val + "\t");
        }
    }
}
