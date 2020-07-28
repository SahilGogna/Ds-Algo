package binarytrees;

import java.util.ArrayList;
import java.util.Stack;

public class Q92 {

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

    public static ArrayList<BTreeNode> list;

    public static boolean find(BTreeNode node, int data) {
        if (node == null) {
            return false;
        }

        if (node.data == data) {
            list.add(node);
            return true;
        }

        boolean foundInLeftChild = find(node.left, data);
        if (foundInLeftChild) {
            list.add(node);
            return true;
        }

        boolean foundInRightChild = find(node.right, data);
        if (foundInRightChild) {
            list.add(node);
            return true;
        }

        return false;

    }

    public static void printKLevelsDown(BTreeNode node, int level, BTreeNode blocker) {
        if (node == null || level < 0 || node == blocker) {
            return;
        }
        if (level == 0) {
            System.out.print(node.data + "\t");
        }
        printKLevelsDown(node.left, level - 1, blocker);
        printKLevelsDown(node.right, level - 1, blocker);
    }

    public static void printKNodesFar(BTreeNode node, int data, int k) {
        list = new ArrayList<>();
        find(node, data);
        for (int i = 0; i < list.size(); i++) {
            printKLevelsDown(list.get(i), k - i, i == 0 ? null : list.get(i - 1));
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {50,25, 12, null ,null, 37, null, null, 75, 62, null ,null ,87, null, null};
        BTreeNode root = create(arr);

        printKNodesFar(root, 25,2);
    }


}
