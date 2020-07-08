package linkedlist;

/**
 * Reverse a LinkedList - Pointer Iterative
 */
public class Q58 {

    public static CustomLinkedList reverse(CustomLinkedList list){

        if(list.size == 0){
            System.out.println("Invalid List");
        }else{
            CustomLinkedList.Node hp = list.head;
            CustomLinkedList.Node temp = hp;
            CustomLinkedList.Node tem2 = hp.next;

            while (tem2 != null){

            }
        }
        return list;
    }
    public static void main(String[] args) {
        CustomLinkedList list = CustomLinkedList.prepareLinkedList();

    }
}
