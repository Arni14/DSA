public class TestLinkedList {
    public static void main(String [] args) {
        MyLinkedList ll = new MyLinkedList();
        System.out.println(ll.size());
        for (int i = 0; i < 10; i++) {
            ll.add(i);
        }
        ll.remove(5);
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }
    }
}
