package bst;

public class Q133 {
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

    public static Node addNode(Node node, int data) {

        if (node == null) {
            return new Node(data, null, null);
        }
        if (data < node.data) {
            node.left = addNode(node.left, data);
        } else if (data > node.data) {
            node.right = addNode(node.right, data);
        } else {
            // do nothing
        }
        return node;
    }

    public static int max(Node node){
        if( node.right == null) return node.data;
        else return max(node.right);
    }

    public static Node remove(Node node, int data){
        if( node == null){
            return null;
        }

        if( node.data < data){
            node.right = remove(node.right,data);
        }else if(node.data > data){
            node.left = remove(node.left, data);
        }else {
            // do removal part here
            if(node.left != null && node.right != null){
                int lmax = max(node.left);
                node.data = lmax;
                node.left = remove(node.left, lmax);
                return node;
            }else if( node.left != null){
                return node.left;
            }else if(node.right != null){
                return node.right;
            }else {
                return null;
            }
        }

        return node;
    }

    public static void main(String[] args) {
        int[] arr = {12, 25, 37, 50, 62, 75, 87};
        Node root = create(arr, 0, arr.length - 1);
        display(root);
        remove(root,25);
        display(root);

    }
}
