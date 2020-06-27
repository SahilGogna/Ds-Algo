package stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Largest area histogram
 */
public class Q47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] rightBoundary = new int[n]; // next smallest element on the right
        Stack<Integer> stack = new Stack<>();
        stack.push(n-1);
        rightBoundary[n-1] = n;
        for( int i = n-2; i>= 0 ; i--){
            while( stack.size() > 0 && arr[i] <= arr[stack.peek()]){
                stack.pop();
            }
            if(stack.size() == 0 ){
                rightBoundary[i] = n;
            }else{
                rightBoundary[i] = stack.peek();
            }
            stack.push(i);
        }

        int[] leftBoundary = new int[n];
        stack = new Stack<>();
        stack.push(0);
        rightBoundary[0] = -1;
        for( int i = 1; i<n ; i++){
            while( stack.size() > 0 && arr[i] < arr[stack.peek()]){
                stack.pop();
            }
            if(stack.size() == 0 ){
                leftBoundary[i] = -1;
            }else{
                leftBoundary[i] = stack.peek();
            }
            stack.push(i);
        }

        int maxArea = 0;

        for(int i=0 ; i< n ; i++){
            int width = rightBoundary[i] - leftBoundary[i] - 1;
            int area = width * arr[i];
            if( area > maxArea) maxArea = area;
        }
        System.out.print(maxArea);
    }
}
