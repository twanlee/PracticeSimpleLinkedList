public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("===========Testing=========");
        MyLinkedList list = new MyLinkedList(10);
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.add(2,9);
        list.printList();
    }
}
