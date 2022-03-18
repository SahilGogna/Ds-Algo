package generictrees;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Q67 {

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

    public static void inorderTraversal(Node node){
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);
        while(queue.size() !=0){
            Node node1 = queue.remove();
            System.out.print(node1.data+" ");
            for(Node child: node1.children){
                queue.add(child);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, -1,30,50, -1, 60, -1,-1,40,-1,-1};
        Node node = formGenericTree(arr);
        inorderTraversal(node);
    }
}
