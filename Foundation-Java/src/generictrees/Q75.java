package generictrees;

import java.util.ArrayList;
import java.util.Stack;

public class Q75 {

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

    public static ArrayList<Integer> findNodeToRootPath(Node root, int data){
        if(root.data == data){
            ArrayList<Integer> al = new ArrayList<>();
            al.add(root.data);
            return al;
        }
        for(Node child: root.children){
            ArrayList<Integer> pathTillChild = findNodeToRootPath(child, data);
            if(pathTillChild.size() > 0){
                pathTillChild.add(root.data);
                return pathTillChild;
            }
        }
        return new ArrayList<Integer>();
    }

    public static int lCA(Node root, int d1, int d2){
        ArrayList<Integer> l1 = findNodeToRootPath(root,d1);
        ArrayList<Integer> l2 = findNodeToRootPath(root,d2);

        int i = l1.size()-1;
        int j = l2.size()-1;

        while (i > 0 && j > 0 && l1.get(i) == l2.get(j)){
            i--;
            j--;
        }
        i++;
        j++;

        return l1.get(i);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1,
                80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        Node root = formGenericTree(arr);
        System.out.print(lCA(root, 110, 80));
    }
}
