package generictrees;

import java.util.Stack;

public class Q66 {

    public static void traverseTree(int[] arr){
        Stack<Node> stack = new Stack<>();

        for(int i=0; i< arr.length; i++){
            if(arr[i] == -1){
               Node node = stack.pop();
               System.out.println("Node post "+node.data);
               if(stack.size() != 0)
               System.out.println("Edge post "+stack.peek().data +"-"+node.data);
            }else{
                Node node = new Node();
                node.data = arr[i];
                if(stack.size() == 0 ){
                    stack.push(node);
                    System.out.println("Node pre "+node.data);
                }else{
                    stack.peek().children.add(node);
                    System.out.println("Edge pre "+stack.peek().data +"-"+node.data);
                    System.out.println("Node pre "+node.data);
                    stack.push(node);
                }
            }
        }
    }

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

    public static void traverseTreeRecursion(Node node){
        // Pre area -> Euler's left
        System.out.println("Node pre "+ node.data);
        for(Node child: node.children){
            // edge pre area
            System.out.println("Edge pre "+ node.data+ "--"+ child.data);
            traverseTreeRecursion(child);
            System.out.println("Edge post "+ node.data+ "--"+ child.data);
            // edge post area
        }
        // post area -> Euler's right
        System.out.println("Node post "+ node.data);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, -1,30,50, -1, 60, -1,-1,40,-1,-1};

        Node node = formGenericTree(arr);
        traverseTreeRecursion(node);
    }
}
