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

    public static int calculateSize(Node root){
        int size = 0;
        for(Node child: root.children){
            int childSize = calculateSize(child);
            size += childSize;
        }
        return size+1;
    }

    public static int maximum(Node root){
        int max = Integer.MIN_VALUE;
        for(Node child: root.children){
            int childMax = maximum(child);
            if( childMax > max) max = childMax;
        }
        max = Math.max(root.data, max);
        return max;
    }

    public static int height(Node root){
        int height = -1; // we are calculating in terms of edges
        for(Node child: root.children){
            int childMaxHeight = height(child);
            height = Math.max(childMaxHeight, height);
        }
        height += 1;
        return height;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1,
                80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        Node  root = formGenericTree(arr);
//        display(root);

//        System.out.println(calculateSize(root));
        System.out.println(height(root));
    }
}
