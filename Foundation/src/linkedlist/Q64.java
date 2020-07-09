package linkedlist;

public class Q64 {

    public static CustomLinkedList removeDuplicate(CustomLinkedList list){
        CustomLinkedList finalList = new CustomLinkedList();
        while (list.size > 0){
            int val = CustomLinkedList.getFirst(list).val;
            CustomLinkedList.removeFirst(list);

            if(finalList.size ==0 || finalList.tail.val != val){
                finalList = CustomLinkedList.addLast(val,finalList);
            }
        }
        return finalList;
    }

    public static void main(String[] args) {
        CustomLinkedList.printLinkedList(removeDuplicate(CustomLinkedList.l1()));
    }
}
