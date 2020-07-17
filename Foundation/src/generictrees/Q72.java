package generictrees;

import java.util.Stack;

public class Q72 {
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

    public static void preOrderTraversal(Node node) {
        // pre area
        System.out.print(node.data + "\t");
        for (Node child : node.children) {
            preOrderTraversal(child);
        }
    }

    public static Node getTail(Node node) {
        while (node.children.size() == 1) {
            node = node.children.get(0);
        }
        return node;
    }

    public static void linearize(Node node) {
        for (Node child : node.children) {
            linearize(child);
        }

        while (node.children.size() > 1) {
            Node ln = node.children.remove(node.children.size() -1);
            Node sl = node.children.get(node.children.size() -1);

            Node tail = getTail(sl);
            tail.children.add(ln);

        }
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

    // efficient approach
    public static Node linearize2(Node node) {
        if(node.children.size() == 0) return node;

        Node leftMostTail = linearize2( node.children.get(node.children.size()-1));

        while (node.children.size() > 1) {
            Node ln = node.children.remove(node.children.size() -1);
            Node sl = node.children.get(node.children.size() -1);
            Node secondLastTail = linearize2 (sl);
            secondLastTail.children.add(ln);
        }

        return leftMostTail;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1,
                80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        Node root = formGenericTree(arr);
        linearize2(root);
        display(root);
    }
}
