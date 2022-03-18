package generictrees;

import java.util.Stack;

public class Q82 {
    private static int ceil;
    private static int floor;

    public static Node formGenericTree(int[] arr) {
        Node root = new Node();
        Stack<Node> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                stack.pop();
            } else {
                Node node = new Node();
                node.data = arr[i];

                if (stack.size() > 0) {
                    stack.peek().children.add(node);
                } else {
                    root = node;
                }
                stack.push(node);
            }
        }
        return root;
    }

    public static void evaluate(Node node, int data) {

        if (node.data > data && ceil > node.data) {
            ceil = node.data;
        }

        if (node.data < data && floor < node.data) {
            floor = node.data;
        }

        for (Node child : node.children) {
            evaluate(child, data);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1,
                80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        Node root = formGenericTree(arr);
        ceil = Integer.MAX_VALUE; // smallest among larger
        floor = Integer.MIN_VALUE; // largest among smaller

        evaluate(root, 121);

        if (ceil == Integer.MAX_VALUE) {
            System.out.println("Ceil doesn't exist");
        } else {
            System.out.println("Ceil is " + ceil);
        }

        if (floor == Integer.MIN_VALUE) {
            System.out.println("Floor doesn't exist");
        } else {
            System.out.println("Floor is " + floor);
        }
    }
}
