package bst;

public class Q135 {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static Node create(int[] arr, int low, int high) {
        if (low > high) return null;

        int mid = (low + high) / 2;

        int data = arr[mid];
        Node left = create(arr, low, mid - 1);
        Node right = create(arr, mid + 1, high);

        Node node = new Node(data, left, right);
        return node;
    }

    public static void printInRange(Node node, int lr, int rr){
        if(node == null) return;

        if( node.data > lr){
            printInRange(node.left, lr, rr);
        }
        if( lr < node.data && rr > node.data)
        System.out.print(node.data + "\t");
        if( node.data < rr){
            printInRange(node.right, lr, rr);
        }

    }

    public static void main(String[] args) {
        int[] arr = {12, 25, 37, 50, 62, 75, 87};
        Node root = create(arr, 0, arr.length - 1);
        printInRange(root, 13, 77);
    }
}
