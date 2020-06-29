package stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Prefix Evaluations and Conversion
 */
public class Q52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        Stack<String> inf = new Stack<>();
        Stack<String> post = new Stack<>();
        Stack<Integer> result = new Stack<>();

        for(int i = expression.length() - 1; i>=0; i--){
            char ch = expression.charAt(i);
            if(Character.isDigit(ch)){
                inf.push(ch + "");
                post.push(ch +"");
                result.push(ch - '0');
            }else{
                int n1 = result.pop();
                int n2 = result.pop();
                int answer = operation(n1,n2,ch);
                result.push(answer);

                String ex1 = inf.pop();
                String ex2 = inf.pop();
                String inAns = formInfix(ex1,ex2,ch);
                inf.push(inAns);

                String pex1 = post.pop();
                String pex2 = post.pop();
                String pans = formPostfix(pex1,pex2,ch);
                post.push(pans);
            }
        }

        System.out.println( "Evaluated Answer: "+ result.peek());
        System.out.println("Infix Expression: "+inf.peek());
        System.out.println("Prefix Expression: " + post.peek());
    }

    public static String formInfix(String c1, String c2, char operator) {
        return "(" + c1 + operator + c2 + ")";
    }

    public static String formPostfix(String c1, String c2, char operator) {
        return c1 + c2 + operator;
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
