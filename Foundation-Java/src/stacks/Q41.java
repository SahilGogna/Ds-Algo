package stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * duplicate brackets
 */
public class Q41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String equation = scanner.nextLine();
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i< equation.length(); i++){
            char ch = equation.charAt(i);
            if(ch == ')'){
                if(stack.peek() == '('){
                    System.out.println("True");
                    return;
                }else{
                    while (stack.peek() != '('){
                        stack.pop();
                    }
                }
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        System.out.println("False");
    }
}
