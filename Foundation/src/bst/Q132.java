package bst;

public class Q132 {

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

    public static int size(Node node){
        if(node == null) return 0;

        int leftSize = size(node.left);
        int rightSize = size(node.right);
        int size = leftSize + rightSize + 1;

        return size;
    }

    public static int sum(Node node) {
        if (node == null) return 0;
        int leftSum = sum(node.left);
        int rightSum = sum(node.right);
        int sum = leftSum + rightSum + node.data;

        return sum;
    }

    public static int max(Node node){
        if( node.right == null) return node.data;
        else return max(node.right);
    }

    public static int min(Node node){
        if( node.left == null) return node.data;
        else return min(node.left);
    }

    public static boolean find(Node node, int data){
        if(node == null) return false;
        else if(data == node.data) return true;
        else if( data < node.data) return find(node.left, data);
        else return find(node.right, data);
    }
    public static void main(String[] args) {
        int[] arr = {12, 25, 37, 50, 62, 75, 87};
        Node root = create(arr, 0, arr.length - 1);
        System.out.println(find(root,63));
    }
}
