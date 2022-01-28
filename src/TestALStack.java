import java.util.LinkedList;

public class TestALStack {
    public static void main(String[] args) {
        Stack myStack = new ALStack();
        for (int i = 1; i < 10; i++) {
            myStack.push(i);
        }
        System.out.println(myStack.search(5));
        for (int i = 1; i < 10; i++) {
            System.out.println(myStack.pop());
        }
        System.out.println(myStack.search(11));
        System.out.println(myStack.peek());


        LinkedList<KeyValue>[] buckets = new LinkedList[100];
        // Array
        // of Linked Lists
        // and each Linked List, contains KeyValue objects.
        System.out.println(buckets[0]);
        buckets[0] = new LinkedList<>();
        buckets[0].add(new KeyValue(5, 10));
        for (KeyValue kv : buckets[0]) {
            System.out.println(kv.getKey());
            System.out.println(kv.getValue());
        }
    }
}
