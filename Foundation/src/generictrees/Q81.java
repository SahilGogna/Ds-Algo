package generictrees;

import java.util.Stack;

public class Q81 {

    public static Node predecessor;
    public static Node successor;
    public static int flag;

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

    public static void evaluate(Node node, int data){
        if(data == node.data){
            flag++;
        } else if(flag == 1){
            successor = node;
            flag++;
        } else if (flag == 0){
            predecessor = node;
        }

        for(Node child: node.children){
            evaluate(child, data);
        }

    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1,
                80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        Node root = formGenericTree(arr);
        flag = 0;
        evaluate(root, 10);

        if(predecessor == null){
            System.out.println("Predecessor doesn't exist");
        }else{
            System.out.println("Predecessor is "+predecessor.data);
        }

        if(successor == null){
            System.out.println("Successor doesn't exist");
        }else{
            System.out.println("Successor is "+successor.data);
        }
    }

}
