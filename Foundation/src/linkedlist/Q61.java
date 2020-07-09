package linkedlist;

import java.util.Scanner;

public class Q61 {

    public static void main(String[] args) {
        CustomLinkedList list = CustomLinkedList.prepareLinkedList();
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        CustomLinkedList.printLinkedList(list);

        CustomLinkedList.Node temp1 = list.head;
        CustomLinkedList.Node temp2 = list.head;

        for(int i=0; i<k ; i++){
            temp2 = temp2.next;
        }
        while (temp2!=null){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        System.out.println();
        System.out.println("Element is "+temp1.val);
    }
}
