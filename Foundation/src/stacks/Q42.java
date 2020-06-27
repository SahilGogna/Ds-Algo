package stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * balanced brackets
 */
public class Q42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String equation = scanner.nextLine();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < equation.length(); i++) {
            char element = equation.charAt(i);
            if (element == '(' || element == '{' || element == '[') {
                stack.push(element);
            } else if (element == ')') {
                boolean val =  handleClosing(stack,'(');
                if(val == false){
                    System.out.println(false);
                    return;
                }
            } else if (element == ']') {
                boolean val = handleClosing(stack,'[');
                if(val == false){
                    System.out.println(false);
                    return;
                }
            } else if (element == '}') {
                boolean val =  handleClosing(stack,'{');
                if(val == false){
                    System.out.println(false);
                    return;
                }
            }
        }
        if(stack.size() != 0 ) System.out.println(false);
        else System.out.println(true);
    }

    public static boolean handleClosing(Stack<Character> stack, char openingChar){
        if(stack.size() == 0){
            return false;
        }else if(stack.peek() != openingChar){
            System.out.println("False");
            return false;
        } else {
            stack.pop();
            return true;
        }
    }
}
