package binarytrees;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Q88 {

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

    public static void preTraversal(BTreeNode node){
        if (node == null) return;
        System.out.print(node.data + "\t");
        preTraversal(node.left);
        preTraversal(node.right);
    }

    public static void postTraversal(BTreeNode node){
        if (node == null) return;
        postTraversal(node.left);
        postTraversal(node.right);
        System.out.print(node.data + "\t");
    }

    public static void inTraversal(BTreeNode node){
        if (node == null) return;
        inTraversal(node.left);
        System.out.print(node.data + "\t");
        inTraversal(node.right);
    }

    public static void levelOrderTraversal(BTreeNode node){
        Queue<BTreeNode> queue = new ArrayDeque<>();
        queue.add(node);

        while(queue.size() > 0){
            int size = queue.size();
            for(int i = 0; i< size ; i++){
                BTreeNode n = queue.remove();
                System.out.print(n.data+"\t");

                if(n.left != null) queue.add(n.left);
                if(n.right != null) queue.add(n.right);

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {50, 25, 12, null, null, 37, 30,
                null, null, null, 75, 62, null,
                70, null,null, 87, null, null};
        BTreeNode root = create(arr);
        System.out.println("Pre Order");
        preTraversal(root);
        System.out.println();
        System.out.println("In Order");
        inTraversal(root);
        System.out.println();
        System.out.println("Post Order");
        postTraversal(root);

        System.out.println();
        System.out.println("Level Order Traversal");
        levelOrderTraversal(root);
    }
}
