package generictrees;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Q71 {

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

    public static void levelOrderTraversal(Node node){
        Queue<Node> parentQueue = new ArrayDeque<>();
        Queue<Node> childQueue = new ArrayDeque<>();

        parentQueue.add(node);

        while(parentQueue.size() > 0 ){
            Node parent = parentQueue.remove();
            System.out.print(parent.data +"\t");
            for(Node child: parent.children){
                childQueue.add(child);
            }
            if(parentQueue.size() == 0){
                parentQueue = childQueue;
                childQueue = new ArrayDeque<>();
                System.out.println();

            }
        }
    }

    public static void removeLeaves(Node node){
        for(int i= node.children.size()-1; i>= 0; i--){
            Node child = node.children.get(i);
            if(child.children.size() == 0){
                node.children.remove(child);
            }
        }

        for(Node child : node.children){
            removeLeaves(child);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1,
                80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        Node root = formGenericTree(arr);
        removeLeaves(root);
        levelOrderTraversal(root);
    }
}
