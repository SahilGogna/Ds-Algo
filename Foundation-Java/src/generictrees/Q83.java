package generictrees;

import java.util.Stack;

public class Q83 {

    private static int floor;

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

    public static void evaluateFloor(Node node, int data) {

        if (node.data < data && floor < node.data) {
            floor = node.data;
        }

        for (Node child : node.children) {
            evaluateFloor(child, data);
        }
    }

    public static int findKthLargest(Node node, int n){
        floor = Integer.MIN_VALUE; // largest among smaller
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i< n; i++){
            evaluateFloor(node, ans);
            ans = floor;
            floor = Integer.MIN_VALUE;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1,
                80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        Node root = formGenericTree(arr);

        System.out.println(findKthLargest(root, 3));

    }
}
