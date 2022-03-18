package binarytrees;

import java.util.Stack;

public class Q97 {

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

    public static int tilt;

    public static int calcTilt(BTreeNode node){

        if(node == null) return 0;

        // will return left's sum and change tilt for left side
        int ls = calcTilt(node.left);

        // will return right's sum and change tilt for right side
        int rs = calcTilt(node.right);

        int localTilt = Math.abs(ls - rs);

        tilt += localTilt;

        return ls + rs + node.data;
    }

    public static void main(String[] args) {
        Integer[] arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, 60, null, null, null, null};
        BTreeNode root = create(arr);
        tilt = 0;

        calcTilt(root);
        System.out.println(tilt);

    }
}
