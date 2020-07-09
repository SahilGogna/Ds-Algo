package linkedlist;

public class Q62 {

    public static void main(String[] args) {
        CustomLinkedList list = CustomLinkedList.prepareLinkedList();
        CustomLinkedList.printLinkedList(list);

        CustomLinkedList.Node slow = list.head;
        CustomLinkedList.Node fast = list.head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println();
        System.out.println(slow.val);
    }
}
