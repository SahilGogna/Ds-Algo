package generictrees;

import java.util.Stack;

public class Q77 {

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

    public static boolean areSimilar(Node n1, Node n2){
        if (n1.children.size() != n2.children.size()){
            return false;
        }

        for (int i=0; i< n1.children.size()-1; i++){
            Node c1 = n1.children.get(i);
            Node c2 = n2.children.get(i);

            if(areSimilar(c1,c2) == false){
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1,
                80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        int[] arr2 = {10, 20, 60, -1, -1, 30, 70, -1,
                800, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        Node root1 = formGenericTree(arr);
        Node root2 = formGenericTree(arr2);
        System.out.print(areSimilar(root1,root2));
    }
}
