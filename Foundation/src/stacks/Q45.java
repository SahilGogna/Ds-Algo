package stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * next greatest element on the left
 */
public class Q45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();

        int[] arr = new int[n];
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        stack.push(arr[0]);
        result[0] = -1;

        for (int i = 1; i < n; i++) {
            while (stack.size() > 0 && arr[i] >= stack.peek()) {
                stack.pop();
            }
            if (stack.size() != 0) {
                result[i] = stack.peek();
            } else {
                result[i] = -1;
            }
            stack.push(arr[i]);
        }
        for (int val : result) {
            System.out.print(val + "\t");
        }
    }
}
