package binarytrees;

import java.util.Stack;

public class Q86 {

    public static class Pair {
        BTreeNode node;
        int state;

        Pair(BTreeNode node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static BTreeNode create(Integer[] arr){

        BTreeNode node = new BTreeNode(arr[0], null, null);
        Pair pair = new Pair(node,1);
        Stack<Pair> stack = new Stack<>();
        stack.push(pair);
        int index = 0;

        while (stack.size() > 0){

            Pair top = stack.peek();

            if(top.state == 1){
                index++;
                if(arr[index] != null){
                    top.node.left = new BTreeNode(arr[index], null, null);
                    Pair p = new Pair(top.node.left,1);
                    stack.push(p);
                }else {
                    top.node.left = null;
                }
                top.state++;
            }else if(top.state == 2){
                index++;
                if(arr[index] != null){
                    top.node.right = new BTreeNode(arr[index], null, null);
                    Pair p = new Pair(top.node.right,1);
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

    public static void display(BTreeNode node){
        if(node == null) return;
        String str = "";
        str += node.left == null ? "." : node.left.data + "";
        str += " <- "+ node.data + " -> ";
        str += node.right == null ? "." : node.right.data + "";

        System.out.println(str);

        display(node.left);
        display(node.right);

    }

    public static void main(String[] args) {

        Integer[] arr = {50, 25, 12, null, null, 37, 30,
                null, null, null, 75, 62, null,
                70, null,null, 87, null, null};
        BTreeNode root = create(arr);
        display(root);
    }
}
