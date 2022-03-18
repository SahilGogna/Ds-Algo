package generictrees;

import java.util.Stack;

public class Q79 {

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

    public static boolean isAMirrorImage(Node root1, Node root2) {
        if (root1.children.size() != root2.children.size()) {
            return false;
        }
        int size = root1.children.size();
        for (int i = 0, j= size -1; i < size && j>=0; i++,j--) {
            Node leftTreeNode = root1.children.get(i);
            Node rightTreeNode = root2.children.get(j);
            if (isAMirrorImage(leftTreeNode, rightTreeNode) == false) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSymmetric(Node node){
        return isAMirrorImage(node,node);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1,
                80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        Node root1 = formGenericTree(arr);
        System.out.print(isSymmetric(root1));
    }
}
