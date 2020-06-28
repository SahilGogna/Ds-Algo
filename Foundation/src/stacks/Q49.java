package stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * infix evaluation
 */
public class Q49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        Stack<Integer> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(') {
                operators.push(ch);
            } else if (Character.isDigit(ch)) {
                int val = ch - '0';
                numbers.push(val); // char to int
            } else if (ch == ')') {
                while (operators.peek() != '(') {
                    int val2 = numbers.pop();
                    int val1 = numbers.pop();
                    char operator = operators.pop();
                    int result = operation(val1, val2, operator);
                    numbers.push(result);
                }
                operators.pop(); // to take out opening bracket (

            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                // ch is solving higher priority operators first
                while (operators.size() > 0 &&
                        operators.peek() != '(' &&
                        precedence(ch) <= precedence(operators.peek())) {
                    int val2 = numbers.pop();
                    int val1 = numbers.pop();
                    char operator = operators.pop();
                    int result = operation(val1, val2, operator);
                    numbers.push(result);
                }
                // character is pushing itself now
                operators.push(ch);
            }

        }

        while (operators.size() != 0) {
            int val2 = numbers.pop();
            int val1 = numbers.pop();
            char operator = operators.pop();
            int result = operation(val1, val2, operator);
            numbers.push(result);
        }
        System.out.print(numbers.peek());

    }

    public static int precedence(char operator) {
        if (operator == '+') {
            return 1;
        } else if (operator == '-') {
            return 1;
        } else if (operator == '*') {
            return 2;
        } else {
            return 2;
        }
    }

    public static int operation(int v1, int v2, char operator) {
        if (operator == '+') {
            return v1 + v2;
        } else if (operator == '-') {
            return v1 - v2;
        } else if (operator == '*') {
            return v1 * v2;
        } else {
            return v1 / v2;
        }
    }
}
