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

    public static Node getFirst(CustomLinkedList list){
        if(list.size == 0){
            return null;
        }else{
            return list.head;
        }
    }

    public static Node removeFirst(CustomLinkedList list){
        if(list.size == 0){
            return null;
        }else {
            Node temp = list.head;
            list.head = list.head.next;
            return temp;
        }

    }

    public static CustomLinkedList addFirst(int val, CustomLinkedList list){
        Node temp = new Node();
        temp.val = val;

        if(list.size == 0){
            temp.next = null;
        }else{
            temp.next = list.head;
        }
        list.head = temp;
        list.size++;
        return list;
    }

    public static CustomLinkedList addLast(int val, CustomLinkedList list){
        Node temp = new Node();
        temp.val = val;

        if(list.size == 0){
            temp.next = null;
            list.head = list.tail = temp;
        }else{
            list.tail.next = temp;
            list.tail = temp;
        }
        list.size++;
        return list;
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
        list = insertData(list,14);
        list = insertData(list,23);
        list = insertData(list,36);
        list = insertData(list,63);
        list = insertData(list,78);
        list = insertData(list,421);
        list = insertData(list,4);
        list = insertData(list,806);

        return list;
    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list = addFirst(5,list);
        list = addFirst(2,list);
        list = addFirst(1,list);

        printLinkedList(list);

        System.out.println();
        System.out.println(getFirst(list).val);
        System.out.println(removeFirst(list).val);
        printLinkedList(list);
    }

}
