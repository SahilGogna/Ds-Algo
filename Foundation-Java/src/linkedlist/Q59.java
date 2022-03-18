package linkedlist;

public class Q59 {

    public static CustomLinkedList push(int val, CustomLinkedList list){
        CustomLinkedList updatedList = CustomLinkedList.addFirst(val,list);
        return updatedList;
    }

    public static CustomLinkedList.Node pop(CustomLinkedList list){
        return CustomLinkedList.removeFirst(list);
    }

    public static int size(CustomLinkedList list){
        return list.size;
    }

    public static CustomLinkedList.Node top(CustomLinkedList list){
        return CustomLinkedList.getFirst(list);
    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list = push(5,list);
        list = push(4,list);
        list = push(6,list);
        list = push(7,list);
        CustomLinkedList.printLinkedList(list);
        System.out.println();
        System.out.println(top(list).val);
        System.out.println(pop(list).val);
        CustomLinkedList.printLinkedList(list);
    }
}
