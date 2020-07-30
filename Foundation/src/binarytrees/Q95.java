package binarytrees;

import java.util.Stack;

public class Q95 {

    public static BTreeNode create(Integer[] arr) {

        BTreeNode node = new BTreeNode(arr[0], null, null);
        Q86.Pair pair = new Q86.Pair(node, 1);
        Stack<Q86.Pair> stack = new Stack<>();
        stack.push(pair);
        int index = 0;

        while (stack.size() > 0) {

            Q86.Pair top = stack.peek();

            if (top.state == 1) {
                index++;
                if (arr[index] != null) {
                    top.node.left = new BTreeNode(arr[index], null, null);
                    Q86.Pair p = new Q86.Pair(top.node.left, 1);
                    stack.push(p);
                } else {
                    top.node.left = null;
                }
                top.state++;
            } else if (top.state == 2) {
                index++;
                if (arr[index] != null) {
                    top.node.right = new BTreeNode(arr[index], null, null);
                    Q86.Pair p = new Q86.Pair(top.node.right, 1);
                    stack.push(p);
                } else {
                    top.node.right = null;
                }
                top.state++;
            } else {
                stack.pop();
            }
        }

        return node;
    }

    public static void printSingleChildNodes(BTreeNode node, BTreeNode parent) {
        if (node == null) return;
        if (parent != null && parent.left == node && parent.right == null) {
            System.out.print(node.data + "\t");
        } else if (parent != null && parent.right == node && parent.left == null) {
            System.out.print(node.data + "\t");
        }
        printSingleChildNodes(node.left, node);
        printSingleChildNodes(node.right, node);
    }

    public static void main(String[] args) {
        Integer[] arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, 60, null, null, null, null};
        BTreeNode root = create(arr);
        printSingleChildNodes(root, null);
    }
}
