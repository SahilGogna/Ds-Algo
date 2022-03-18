package binarytrees;

public class BTreeNode {

    int data;
    BTreeNode left;
    BTreeNode right;

    BTreeNode(int data, BTreeNode left, BTreeNode right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
