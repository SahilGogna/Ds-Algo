package generictrees;


import java.util.Stack;

public class Q69 {

    public static Node formGenericTree(int[] arr) {
        Node root = new Node();
        Stack<Node> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                stack.pop();
            } else {
                Node node = new Node();
                node.data = arr[i];

                if (stack.size() > 0) {
                    stack.peek().children.add(node);
                } else {
                    root = node;
                }
                stack.push(node);
            }
        }
        return root;
    }

    public static void zigzagTraversal(Node node){
        Stack<Node> ms = new Stack<>();
        Stack<Node> cs = new Stack<>();
        boolean flag = true;
        ms.add(node);

        while( ms.size() > 0){
            Node n = ms.pop();
            System.out.print(n.data + "\t");
            if(flag){
                // normal addition
                for(Node child: n.children){
                    cs.add(child);
                }
            }else{
                // reverse addition
                for(int i = n.children.size()-1; i >=0 ; i--){
                    cs.add(n.children.get(i));
                }
            }
            if(ms.size() == 0){
                System.out.println();
                ms = cs;
                cs = new Stack<>();
                flag = !flag;
            }

        }


    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1,
                80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        Node root = formGenericTree(arr);
        zigzagTraversal(root);

    }
}
