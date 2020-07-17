package generictrees;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Q73 {
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

    public static boolean findElement(int data, Node root){
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        while (queue.size() > 0){
            Node node = queue.remove();
            if(node.data == data) return true;

            for(Node child: node.children){
                queue.add(child);
            }
        }
        return false;
    }

    public static boolean findElementRec(int data, Node root){
        if(root.data == data) return true;

        for(Node child: root.children){
            boolean found = findElement(data, child);
            if(found) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1,
                80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        Node root = formGenericTree(arr);
        System.out.println(findElementRec(50, root));
    }
}
