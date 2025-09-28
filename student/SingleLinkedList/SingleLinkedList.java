public class SingleLinkedList implements LinkedList {
    private Node head;
    private int size;

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    @Override
    public int at(int index) {
        if (index < 0 || index >= size) return -1;
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.value;
            }
            current = next(current);
            count++;
        }
        return -1;
    }

    @Override
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;  // List is empty; new node is head
        } else {
            Node current = head;
            while (current.next != null) {  // Traces down the list until it finds the last node.
                current = next(current);
            }
            current.next = newNode;  // Attach to end of list
        }
        size++;  // Increase size every time you add.
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bound");
            return;
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index -1; i++) {
                current = next(current);
            }
            current.next = next(current.next);
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    private Node next(Node node) {
        System.out.println("Go to next node");
        return node.next;
    }
}