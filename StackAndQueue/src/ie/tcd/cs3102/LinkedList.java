package ie.tcd.cs3102;

/**
 * Created by brian on 31/01/2017.
 */
public class LinkedList<AnyType extends Comparable<AnyType>> {
    private Node head;
    private Node last;

    /**
     * Constructor
     */
    public LinkedList() {
        head = null;
        last = null;
    }

    /**
     * Insert specified value at the start of the linked list
     *
     * @param newValue the new value to push
     */
    public void push(AnyType newValue) {
        Node node = new Node(newValue, head);
        head = node;
        if (last == null) {
            last = node;
        }
    }

    /**
     * Remove the element on top of the stack (if any)
     */
    public AnyType removeFirst() {
        if (head != null) {
            Node node = head;
            head = head.next;
            return (AnyType) node.value;
        }
        return null;
    }

    public AnyType lookFirst() {
        if (head != null) {
            return (AnyType) head.value;
        }
        return null;
    }

    /**
     *
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Insert specified value at the end of the linked list
     *
     * @param newValue the new value to append
     */
    public void append(AnyType newValue) {
        Node node = new Node(newValue, null);
        if (head == null) {
            head = node;
        }
        if (last != null) {
            last.next = node;
        }
        last = node;
    }

    /**
     * Insert a new value in the correct sorted position
     * Assume ascending
     *
     * @param newValue the new value to insert
     */
    public void insert(AnyType newValue) {
        // Provide your implementation here
    }

    /**
     *
     * @param value
     * @return true if present, false otherwise
     */
    public boolean isPresent(AnyType value) {
        Node current = head;
        while (current != null) {
            if (current.value.equals(value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void delete(AnyType value) {
        Node current = head, previous = null;
        while (current != null) {
            if (current.value.equals(value)) {
                // Found value to remove
                if (previous == null) {
                    // Means value being deleted is first value in list
                    head = current.next;
                } else {
                    // Link predecessor to successor, removing node in between
                    previous.next = current.next;
                }

            }
            previous = current;
            current = current.next;
        }
    }

    @Override
    public String toString() {
        Node current = head;
        StringBuilder sb = new StringBuilder("[");
        while (current != null) {
            sb.append(current.value);
            current = current.next;
            if (current != null) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // Private inner class encapsulating value
    protected static class Node<AnyType extends Comparable<AnyType>> {
        AnyType value;
        Node next;

        Node(AnyType value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
