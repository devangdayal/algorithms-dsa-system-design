public class InitMyLinkedList {
    public static void main(String[] args) {

        int index = 1;
        int val = 2;

        MyLinkedList obj = new MyLinkedList();

        obj.addAtHead(val);      // 2
        obj.addAtTail(val);      // 2 -> 2
        obj.addAtIndex(index, val); // 2 -> 2 -> 2
        obj.deleteAtIndex(index);   // 2 -> 2

        int param_1 = obj.get(index);
        System.out.println(param_1);
    }
}