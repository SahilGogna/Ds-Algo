package linkedlist;

public class Q60 {

    public static int size(CustomLinkedList list){
        return list.size;
    }

    public static CustomLinkedList enqueue(int val,CustomLinkedList list){
        CustomLinkedList updatedList = CustomLinkedList.addLast(val,list);
        return updatedList;
    }

    public static CustomLinkedList.Node dequeue(CustomLinkedList list){
        return CustomLinkedList.removeFirst(list);
    }

    public static CustomLinkedList.Node peek(CustomLinkedList list){
        return CustomLinkedList.getFirst(list);
    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list = enqueue(5,list);
        list = enqueue(4,list);
        list = enqueue(6,list);
        list = enqueue(7,list);
        CustomLinkedList.printLinkedList(list);
        System.out.println();
        System.out.println(peek(list).val);
        System.out.println(dequeue(list).val);
        CustomLinkedList.printLinkedList(list);
    }
}
