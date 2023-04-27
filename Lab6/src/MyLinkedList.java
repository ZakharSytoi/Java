
public class MyLinkedList<T> {

    private Node head;

    public class Node {
        private T value;
        private Node nextNode;

        private Node(T value) {
            this.value = value;
            this.nextNode = null;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public boolean hasNext() {
            return nextNode != null;
        }

        public Node next() {
            return nextNode;
        }
    }

    public MyLinkedList() {
        head = null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void add(T value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node currentNode = head;
            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(new Node(value));
        }
    }

    public Iterator iterator() {
        return new Iterator();
    }

    public boolean contains(T value) {
        MyLinkedList<T>.Iterator iter = this.iterator();
        while (iter.hasNext()) {
            if (iter.next().getValue() == value) return true;
        }
        return false;
    }

    public class Iterator {
        Node currentNode;

        Iterator() {
            currentNode = new Node(null);
            currentNode.nextNode = head;
        }

        public boolean hasNext() {
            if (currentNode == null) {
                return false;
            }
            return currentNode.hasNext();
        }

        public Node next() {
            if (currentNode == null) {
                return null;
            }

            currentNode = currentNode.nextNode;
            return currentNode;
        }
    }
}
