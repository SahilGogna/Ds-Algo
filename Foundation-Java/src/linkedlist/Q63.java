package linkedlist;

public class Q63 {

    public static CustomLinkedList linkedList;

    public static CustomLinkedList.Node findMidNode(CustomLinkedList.Node head, CustomLinkedList.Node tail){
        CustomLinkedList.Node slow = head;
        CustomLinkedList.Node fast = tail;

        while(fast!=tail && fast.next!=tail){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static CustomLinkedList mergeSort(CustomLinkedList.Node head, CustomLinkedList.Node tail){
        if(head == tail){
            return CustomLinkedList.addLast(head.val,new CustomLinkedList());
        }

        CustomLinkedList.Node midNode = findMidNode(head,tail);
        CustomLinkedList firstSortedHalf = mergeSort(head, midNode);
        CustomLinkedList secondSortedHalf = mergeSort(midNode.next, tail);

        return CustomLinkedList.mergeTwoSortedLists(firstSortedHalf,secondSortedHalf);

    }

    public static void main(String[] args) {
        linkedList = CustomLinkedList.prepareLinkedList();
        CustomLinkedList.printLinkedList(linkedList);
        System.out.println();
        linkedList = mergeSort(linkedList.head, linkedList.tail);
        CustomLinkedList.printLinkedList(linkedList);
    }
}
