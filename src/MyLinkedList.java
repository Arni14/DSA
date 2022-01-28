public class MyLinkedList {

    /**
     * Class to represent a Node in our Linked List.
     */
    private class Node {
        int value;
        Node next;
        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private int size;

    /**
     * Constructor for the LinkedList Object
     */
    public MyLinkedList() {
        // We initialize a RANDOM-VALUED head that means nothing. This head points to the
        // first value of the list.
        this.head = new Node(420, null);
        this.size = 0;
    }

    /**
     * Returns the ith value of our LinkedList.
     * @param i the index
     * @return the value at index i.
     */
    public int get(int i) {
        // TODO: Fill this in!
        int j = 0;
        int value = -1;
        for (Node curr = this.head.next; curr != null; curr = curr.next) {
            if (j == i) {
                value = curr.value;
                break;
            }
            j += 1;
        }
        return value;
    }

    /**
     * Adds the value to the end of our linked list.
     * @param value the value to be appended.
     */
    public void add(int value) {
        // TODO: Fill this in!
        Node curr = this.head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(value, null);
        this.size += 1;
    }

    public int size() {
        return this.size;
    }

    /**
     * Remove the value at index i in our linked list.
     * @param i the index at which to remove.
     */
    public void remove(int i) {
        // TODO: Fill this in!
        if (i < 0 || i >= this.size()) {
            throw new IllegalArgumentException("Index i is out of range");
        }
        Node curr = this.head;
        int j = 0;
        while (j < i) {
            curr = curr.next;
            j += 1;
        }
        curr.next = curr.next.next;
        this.size -= 1;
    }

}
