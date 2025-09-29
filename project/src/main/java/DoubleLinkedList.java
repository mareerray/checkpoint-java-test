public class DoubleLinkedList implements LinkedList {
    private Node head, tail;
    private int size;

    private class Node {
        int value;
        Node next, prev;
        Node (int value) { this.value = value; }
    }

    private Node next(Node node) {
        System.out.println("Go to next node");
        return node.next;
    }
    private Node prev(Node node) {
        System.out.println("Go to previous node");
        return node.prev;
    }

    private Node getNode(int index) {
        if (index < (size + 1)/2) {
            Node current = head;
            for (int i = 0; i < index; i++) current = next(current);
            return current;
        } else {
            Node current = tail;
            for (int i = size-1; i > index; i--) current = prev(current);
            return current;
        }
    }

    @Override
    public int at(int index) {
        if (index < 0 || index >= size) return -1;
        return getNode(index).value;
    }

    @Override
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) head = tail = newNode;
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) return;
        if (index == 0) {
            if (head == tail) head = tail = null;
            else {
                head = head.next;
                head.prev = null; }
        } else if (index == size-1) {
            tail = tail.prev;
            tail.next = null;
        } else {
            Node current = getNode(index);
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
    }

    @Override
    public int size() { return size; }
}

//public class DoubleLinkedList implements LinkedList {
//    private Node head;
//    private Node tail;
//    private int size;
//
//    private class Node {
//        int value;
//        Node next;
//        Node prev;
//
//        Node (int value) {
//            this.value = value;
//            this.next = null;
//            this.prev = null;
//        }
//    }
//
//    @Override
//    public int at(int index) {
//        if (index < 0 || index >= size) return -1;
//        // Adjust the dividing line: for size 3, next used for index 0, 1; for size 4, next used for index 0,1
//        if (index <= (size - 1) / 2) {
//            Node current = head;
//            int count = 0;
//            while (current != null) {
//                if (count == index) return current.value;
//                current = next(current);
//                count++;
//            }
//        } else {
//            Node current = tail;
//            int count = size - 1;
//            while (current != null) {
//                if (count == index) return current.value;
//                current = prev(current);
//                count--;
//            }
//        }
//        return -1;
//    }
//
//    @Override
//    public void add(int value) {
//        Node newNode = new Node(value);
//        if (head == null) {
//            head = newNode;
//            tail = newNode;
//        } else {
//            tail.next = newNode; // Connect old tail → new node
//            newNode.prev = tail;  // Connect new node ← old tail
//            tail = newNode;     // Update tail to new node
//        }
//        size++;
//    }
//
//    @Override
//    public void remove(int index) {
//        if (index < 0 || index >= size) {
//            // Do nothing if out of bounds (no error message required)
//            return;
//        }
//        if (index == 0) { // Remove head
//            if (head == tail) { // Only one node
//                head = null;
//                tail = null;
//            } else {
//                head = head.next; // Move head to next node
//                if (head != null) head.prev = null;
//            }
//        } else if (index == size - 1) { // Remove tail
//            tail = tail.prev; // Move tail to prev node
//            if (tail != null) tail.next = null;
//        } else { // Remove in the middle
//            Node current;
//            if (index < (size + 1) / 2) {
//                current = head;
//                for (int i = 0; i < index; i++) {
//                    current = next(current); // "Go to next node"
//                }
//            } else {
//                current = tail;
//                for (int i = size - 1; i > index; i--) {
//                    current = prev(current); // "Go to previous node"
//                }
//            }
////            Node current = head;
////            for (int i = 0; i < index; i++) {
////                current = next(current);
////            }
//            // Connect previous and next nodes, removing current
//            current.prev.next = current.next;
//            current.next.prev = current.prev;
//        }
//        size--;
//    }
//
//    @Override
//    public int size() {
//        return size;
//    }
//
//    private Node next(Node node) {
//        System.out.println("Go to next node");
//        return node.next;
//    }
//
//    private Node prev(Node node) {
//        System.out.println("Go to previous node");
//        return node.prev;
//    }
//}