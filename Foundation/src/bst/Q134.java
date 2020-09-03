package bst;

public class Q134 {

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

    public static void display(Node node) {
        if (node == null) return;
        String str = "";
        str += node.left == null ? "." : node.left.data + "";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data + "";

        System.out.println(str);

        display(node.left);
        display(node.right);

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

    public static void main(String[] args) {
        int[] arr = {12, 25, 37, 50, 62, 75, 87};
        Node root = create(arr, 0, arr.length - 1);
        display(root);
        rws(root);
        display(root);
    }
    static int sum =0;
    public static void rws(Node node){
        if( node == null) return;
        rws(node.right);
        int od = node.data;
        node.data = sum;
        sum += od;
        rws(node.left);
    }
}
