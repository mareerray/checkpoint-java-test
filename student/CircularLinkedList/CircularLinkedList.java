public class CircularLinkedList implements LinkedList {
    private Node head;
    private int size;

    private class Node {
        int value;
        Node next;
        Node(int value) { this.value = value; }
    }

    @Override
    public int at(int index) {
        if (index < 0 || size == 0) return -1;
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = next(current); // prints "Go to next node"
        }
        return current.value;
    }

    @Override
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            newNode.next = head; // forms the circle
        } else {
            Node current = head;
            while (current.next != head) {
                current = next(current);
            }
            current.next = newNode;
            newNode.next = head; // new tail points to head
        }
        size++;
    }

    @Override
    public void remove(int index) {
        if (size == 0 || index < 0) return;

        // Normalize index to the range (due to circularity)
        index = index % size;

        if (size == 1 && index == 0) {
            head = null;
            size = 0;
            return;
        }

        if (index == 0) {
            // Remove head: find the tail to fix the circle
            Node tail = head;
            while (tail.next != head) {
                tail = next(tail);
            }
            head = head.next;
            tail.next = head;
        } else {
            // Remove node at index: find previous node
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = next(prev);
            }
            prev.next = next(prev.next);
        }
        size--;
    }

    @Override
    public int size() { return size; }

    private Node next(Node node) {
        System.out.println("Go to next node");
        return node.next;
    }
}
