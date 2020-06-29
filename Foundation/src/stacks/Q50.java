package stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Infix Conversions
 */
public class Q50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        Stack<String> post = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '(') {
                operators.push(ch);
            } else if (ch == ')') {
                while (operators.peek() != '(') {
                    char operator = operators.pop();
                    String val2 = post.pop();
                    String val1 = post.pop();

                    String preVal2 = pre.pop();
                    String preVal1 = pre.pop();

                    String postExpression = val1 + val2 + operator;
                    String preExpression = operator + preVal1 + preVal2;

                    pre.push(preExpression);
                    post.push(postExpression);
                }
                operators.pop();

            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (operators.size() > 0 &&
                        operators.peek() != '(' &&
                        precedence(ch) <= precedence(operators.peek())) {
                    char operator = operators.pop();

                    String preVal2 = pre.pop();
                    String preVal1 = pre.pop();

                    String val2 = post.pop();
                    String val1 = post.pop();

                    String postExpression = val1 + val2 + operator;
                    String preExpression = operator + preVal1 + preVal2;

                    pre.push(preExpression);
                    post.push(postExpression);
                }
                operators.push(ch);

            } else if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                // if we get numbers
                post.push(ch + "");
                pre.push(ch + "");
            }
        }

        while (operators.size() > 0) {
            char operator = operators.pop();
            String val2 = post.pop();
            String val1 = post.pop();

            String preVal2 = pre.pop();
            String preVal1 = pre.pop();

            String postExpression = val1 + val2 + operator;
            String preExpression = operator + preVal1 + preVal2;

            pre.push(preExpression);
            post.push(postExpression);
        }

        System.out.println(post.peek());
        System.out.println(pre.peek());

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
}
