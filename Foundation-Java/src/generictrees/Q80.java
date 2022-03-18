package generictrees;

import java.util.Stack;

public class Q80 {
    private static int size;
    private static int min;
    private static int max;
    private static int height;

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

    public static void multiSolver(Node node, int depth){
        size++;
        min = Math.min(min,node.data);
        max = Math.max(max,node.data);
        height = Math.max(height,depth);
        for(Node child: node.children){
            multiSolver(child, depth+1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1,
                80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        Node root = formGenericTree(arr);
        size = 0;
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        height = 0;
        multiSolver(root,0);
        System.out.println("Size: "+size);
        System.out.println("Min: "+ min);
        System.out.println("Max: "+ max);
        System.out.println("Height: "+height);
    }
}
