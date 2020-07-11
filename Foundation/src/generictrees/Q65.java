package generictrees;

import java.util.Stack;

public class Q65 {

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

    public static void display(Node root) {
        String string = root.data + "->";
        for (Node child : root.children) {
            string += child.data + ",";
        }
        string += ".";
        System.out.println(string);
        for (Node child : root.children) {
            display(child);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1,
                80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        Node  root = formGenericTree(arr);
        display(root);
    }
}
