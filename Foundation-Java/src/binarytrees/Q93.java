package binarytrees;

import java.util.Stack;

public class Q93 {

    public static BTreeNode create(Integer[] arr){

        BTreeNode node = new BTreeNode(arr[0], null, null);
        Q86.Pair pair = new Q86.Pair(node,1);
        Stack<Q86.Pair> stack = new Stack<>();
        stack.push(pair);
        int index = 0;

        while (stack.size() > 0){

            Q86.Pair top = stack.peek();

            if(top.state == 1){
                index++;
                if(arr[index] != null){
                    top.node.left = new BTreeNode(arr[index], null, null);
                    Q86.Pair p = new Q86.Pair(top.node.left,1);
                    stack.push(p);
                }else {
                    top.node.left = null;
                }
                top.state++;
            }else if(top.state == 2){
                index++;
                if(arr[index] != null){
                    top.node.right = new BTreeNode(arr[index], null, null);
                    Q86.Pair p = new Q86.Pair(top.node.right,1);
                    stack.push(p);
                }else {
                    top.node.right = null;
                }
                top.state++;
            }else {
                stack.pop();
            }
        }

        return node;
    }

    public static void pathToLeafFromRoot(BTreeNode node, String path, int sum, int low, int high){
        if(node == null) return;

        if(node.left == null && node.right == null){
            sum += node.data;
            if( sum >= low && sum <= high){
                System.out.println(path + node.data);
            }
            return;
        }
        pathToLeafFromRoot(node.left, path + node.data + " ", sum + node.data, low,high);
        pathToLeafFromRoot(node.right, path + node.data + " ", sum + node.data, low,high);
    }

    public static void main(String[] args) {
        Integer[] arr = {50,25, 12, null ,null, 37, null, null, 75, 62, null ,null ,87, null, null};
        BTreeNode root = create(arr);
        pathToLeafFromRoot(root, " ", 0, 20, 100);
    }
}
