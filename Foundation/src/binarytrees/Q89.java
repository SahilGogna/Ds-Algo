package binarytrees;

import java.util.Stack;

public class Q89 {

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

    public static void traversal(BTreeNode node){
        String pre = "";
        String in = "";
        String post = "";

        Stack<Pair> stack = new Stack<>();
        Pair p = new Pair(node,1);
        stack.push(p);

        while(stack.size() > 0){
            Pair top = stack.peek();
            int state = top.state;

            if(state == 1){
                pre += top.node.data +"\t";
                top.state = 2;
                if(top.node.left != null){
                    stack.push(new Pair(top.node.left,1));
                }
            }else if( state == 2){
                in += top.node.data +"\t";
                top.state = 3;
                if(top.node.right != null){
                    stack.push(new Pair(top.node.right,1));
                }
            } else {
                post += top.node.data +"\t";
                stack.pop();
            }
        }
        System.out.println("Pre Order "+ pre);
        System.out.println();
        System.out.println("In Order "+ in);
        System.out.println();
        System.out.println("Post Order "+post);
    }

    public static void main(String[] args) {
        Integer[] arr = {50, 25, 12, null, null, 37, 30,
                null, null, null, 75, 62, null,
                70, null,null, 87, null, null};
        BTreeNode root = create(arr);
        traversal(root);
    }
}
