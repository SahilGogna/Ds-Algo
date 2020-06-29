package stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Smallest number following Pattern
 */
public class Q55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        Stack<Integer> stack = new Stack<>();
        int num = 1;

        for(int i = 0; i< expression.length(); i++){
            char ch = expression.charAt(i);
            if(ch == 'd'){
                stack.push(num);
                num++;
            }else{
                stack.push(num);
                num++;
                while( stack.size() > 0){
                    System.out.print(stack.pop()+"\t");
                }
            }
        }
        stack.push(num);
        while( stack.size() > 0){
            System.out.print(stack.pop()+"\t");
        }
    }
}
