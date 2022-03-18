package stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Postfix Evaluations and Conversions
 */
public class Q51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        Stack<String> inf = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<Integer> result = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if(Character.isDigit(ch)){
                inf.push(ch + "");
                pre.push(ch +"");
                result.push(ch - '0');
            }else{
                int n2 = result.pop();
                int n1 = result.pop();
                int answer = operation(n1,n2,ch);
                result.push(answer);

                String ex2 = inf.pop();
                String ex1 = inf.pop();
                String inAns = formInfix(ex1,ex2,ch);
                inf.push(inAns);

                String pex2 = pre.pop();
                String pex1 = pre.pop();
                String pans = formPrefix(pex1,pex2,ch);
                pre.push(pans);

            }
        }

        System.out.println( "Evaluated Answer: "+ result.peek());
        System.out.println("Infix Expression: "+inf.peek());
        System.out.println("Prefix Expression: " + pre.peek());

    }

    public static String formInfix(String c1, String c2, char operator) {
        return "(" + c1 + operator + c2 + ")";
    }

    public static String formPrefix(String c1, String c2, char operator) {
        return "" + operator + c1 + c2;
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
