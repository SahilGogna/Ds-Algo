package leetcode;

import java.util.*;

public class Q160 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        Node root = constructTree(arr, 0, new Node(),0);
//        int reqLevel = getLevel(root, 1, 0);
//        System.out.print(getSameLevelElements(root,1,reqLevel));
        int[] a = getSolution(root,6);
        for(int e:a){
            System.out.print(e+"\t");
        }
    }

    public static void printLevelOrder(Node root){
        ArrayDeque<Node> q = new ArrayDeque<>();
        q.add(root);

        while(q.size() > 0){
            Node n = q.removeFirst();
            System.out.print(n.data + "\t" + "->"+n.level+"\t");
            if(n.left != null){
                q.add(n.left);
            }
            if(n.right != null){
                q.add(n.right);
            }
        }
    }

    public static ArrayList<Integer> getSameLevelElements(Node root, int data, int reqLevel){
        if(root.level == 0){
            ArrayList<Integer> l = new ArrayList<>();
            l.add(-1);
            return l;
        }
        ArrayDeque<Node> q = new ArrayDeque<>();
        q.add(root);
        ArrayList<Integer> list = new ArrayList<>();
        int size;
        while(!q.isEmpty()) {
            size = q.size();
            while (size > 0) {
                Node n = q.removeFirst();
                if (n.level == reqLevel && n.data != data) {
                    list.add(n.data);
                }
                if (n.left != null) {
                    q.add(n.left);
                }
                if (n.right != null) {
                    q.add(n.right);
                }
                --size;
            }
        }

        return list;
    }

    public static int[] getSolution(Node node, int element){
        ArrayDeque<Node> q = new ArrayDeque<>();
        q.add(node);
        int size;
        boolean flag = false;
        while(!q.isEmpty()){
            size = q.size();
            int[] arr = new int[size];
            int i = 0;
            while(size > 0){
                Node n = q.removeFirst();
                if(n.data != element){
                    arr[i] = n.data;
                    i++;
                }else {
                    flag = true;
                }
                if(n.left != null){
                    q.add(n.left);
                }
                if(n.right != null){
                    q.add(n.right);
                }
                size--;
            }
            if(flag){
                int[] retArray = new int[arr.length - 1];
                for(int k = 0; k<retArray.length; k++){
                    retArray[k] = arr[k];
                }
                return retArray;
            }
        }
        return null;
    }


    public static void printInorder(Node node){
        if(node == null){
            return;
        }
        printInorder(node.left);
        System.out.print(node.data+"\t");
        printInorder(node.right);
    }
    public static class Node{
        int data;
        Node left;
        Node right;
        int level;

        Node(){}

        Node(int data,int level){
            this.data = data;
            this.left = null;
            this.right = null;
            this.level = level;
        }
    }
    public static Node constructTree(int[] arr, int level, Node node, int index){
        if(index < arr.length){
            node = new Node(arr[index],level);
            node.left = constructTree(arr,level + 1, node.left,2*index + 1 );
            node.right = constructTree(arr,level + 1, node.right, 2*index + 2);
        }
        return node;
    }
    public static int getLevel(Node node, int data, int level){
        if(node == null){
            return -1;
        }
        if(data == node.data) {
            return level;
        }
        int leftLevel = getLevel(node.left, data, level+1);
        if(leftLevel != -1){
            return leftLevel;
        }
        return getLevel(node.right,data,level +1);
    }

}
