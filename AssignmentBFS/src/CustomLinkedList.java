public class CustomLinkedList {
    private Node head;

    public CustomLinkedList() {
    }

    public void insert(int x) {
        Node newnode = new Node(x);
        if (this.head == null) {
            head = newnode;
        } else {
            Node currentnode = head;
            while (currentnode.getNextNode() != null) {
                currentnode = currentnode.getNextNode();
            }
            currentnode.setNextNode(newnode);
            newnode.setPrevNode(currentnode);
        }
    }

    public void insertHead(int data) {
        Node newNode = new Node(data);
        newNode.setNextNode(head);
        if (head != null) {
            head.setPrevNode(newNode);
        }
        head = newNode;
    }

    public void insertAt(int index, int data, int x) {
        Node nodeToBeInserted = new Node(data);
        Node node = head;
        if (x == 1) {
            for (int i = 0; i < index - 1; i++) {
                node = node.getNextNode();
            }
            nodeToBeInserted.setNextNode(node.getNextNode());
            node.setNextNode(nodeToBeInserted);
        } else if (x == 2) {
            for (int i = index - 2; i > -1; i++) {
                node = node.getPrevNode();
            }
            nodeToBeInserted.setPrevNode(node.getPrevNode());
            node.setPrevNode(nodeToBeInserted);
        }
    }

    public int getNodeAt(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNextNode();
        }
        return node.getData();
    }

    public void deleteNodeAt(int index) {
        Node node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.getNextNode();
        }
        node.setNextNode(node.getNextNode().getNextNode());
    }

    public int size() {
        int size = 0;
        Node node = head;
        while (node != null) {
            size++;
            node = node.getNextNode();
        }
        return size;
    }

    public void removeFirst() {
        head = head.getNextNode();
    }

    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.getData() + " ");
            node = node.getNextNode();
        }
        System.out.println();
    }
}
