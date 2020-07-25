package binarytrees;

import java.util.Stack;

public class Q87 {

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

    public static int size(BTreeNode node){
        if( node == null) return 0;
        int ls = size(node.left);
        int rs = size(node.right);
        int s = ls + rs + 1;
        return s;
    }

    public static int sum(BTreeNode node){
        if( node == null) return 0;
        int lsum = sum(node.left);
        int rsum = sum(node.right);
        int sum = lsum + rsum + node.data;
        return sum;
    }

    public static int max(BTreeNode node){
        if(node == null ) return Integer.MIN_VALUE;

        int lm = max(node.left);
        int rm = max(node.right);
        int m = Math.max(node.data, Math.max(lm,rm));
        return m;
    }

    public static int height(BTreeNode node){
        if(node == null) return -1; // 0 for in terms of nodes
        int lh = height(node.left);
        int rh = height(node.right);
        int ht = Math.max(lh,rh) + 1;
        return ht;
    }

    public static void main(String[] args) {
        Integer[] arr = {50, 25, 12, null, null, 37, 30,
                null, null, null, 75, 62, null,
                70, null,null, 87, null, null};
        BTreeNode root = create(arr);
        System.out.println("Size =  " +size(root));
        System.out.println("Sum =  " +sum(root));
        System.out.println("Max =  " +max(root));
        System.out.println("Height =  " +height(root));
    }
}
