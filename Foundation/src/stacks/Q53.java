package stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Celebrity Problem
 */
public class Q53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }

        while(stack.size()>=2){
            int i = stack.pop();
            int j = stack.pop();

            if(arr[i][j] == 1){
                // i knows j -> i is not a celebrity
                stack.push(j);
            }else {
                // i don't know j -> j is definitely not a celebrity
                stack.push(i);
            }
        }

        int pot = stack.pop();
        boolean flag = true;
        for(int i = 0 ; i<n ; i++){
            if( i != pot){
                if(arr[i][pot] == 0 || arr[pot][i] == 1){
                    flag = false;
                }
            }
        }

        if(flag){
            System.out.println(pot +" is a celebrity!");
        }else {
            System.out.println("None is a celebrity!");
        }

    }
}

