package linkedlist;

public class CustomLinkedList {

    Node head;
    Node tail;
    int size = 0;

    // inner class made static so that main can access it
    // this is a linked list node
    static class Node {
        int val;
        Node next;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // takes linkedlist as a parameter and append the item at the last
    public static CustomLinkedList insertData(CustomLinkedList linkedList, int data) {
        Node newNode = new Node(data);

        if (linkedList.head == null) {
            linkedList.head = newNode;
        } else {
            Node temp = linkedList.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        linkedList.tail = newNode;
        linkedList.size++;
        return linkedList;
    }

    public static void printLinkedList(CustomLinkedList linkedList) {
        Node temp = linkedList.head;
        while (temp != null) {
            System.out.print(temp.val + "\t");
            temp = temp.next;
        }
    }

    public static CustomLinkedList prepareLinkedList(){
        CustomLinkedList list = new CustomLinkedList();
        list = insertData(list,4);
        list = insertData(list,2);
        list = insertData(list,3);
        list = insertData(list,6);
        list = insertData(list,7);
        list = insertData(list,41);
        list = insertData(list,24);
        list = insertData(list,86);

        return list;
    }

    public static void main(String[] args) {
        CustomLinkedList list = prepareLinkedList();
        printLinkedList(list);
        System.out.println("Size of linked list is: "+ list.size);
        System.out.println("Head of linked list is: "+ list.head.val);
        System.out.println("Tail of linked list is: "+ list.tail.val);
    }

}
