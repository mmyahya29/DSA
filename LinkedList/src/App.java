import java.util.*;

public class App {
    public static class Node {
        private int data;
        private Node nextNode;
        private Node prevNode;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public Node getPrevNode() {
            return nextNode;
        }

        public void setPrevNode(Node nextNode) {
            this.nextNode = nextNode;
        }
    }

    public static class CustomLinkedList {
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
                currentnode.setPrevNode(currentnode);
            }
        }

        public void insertHead(int data) {
            Node newNode = new Node(data);
            newNode.setNextNode(head);
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
            for (int i = 0; i < index - 1; i++) {
                node = node.getNextNode();
            }
            int x = node.getData();
            return x;
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

        public void printList(CustomLinkedList list) {
            Node node = list.head;
            while (node != null) {
                System.out.print(node.getData() + " ");
                node = node.getNextNode();
            }
            System.out.println();
        }

        public static void main(String[] args) throws Exception {
            Scanner in = new Scanner(System.in);
            CustomLinkedList list = new CustomLinkedList();
            int a;
            int ch = 0;
            while (ch != 6) {
                System.out.println(
                        "Enter Choice: \n1.Insert at head \n2.Insert at tail \n3.Insert at Index \n4.Delete node at \n5.Get value of Index \n6.Exit");
                ch = in.nextInt();
                if (ch == 1) {
                    System.out.println("Enter a Value");
                    a = in.nextInt();
                    list.insert(a);
                } else if (ch == 2) {
                    System.out.println("Enter a Value");
                    a = in.nextInt();
                    list.insertHead(a);
                } else if (ch == 3) {
                    System.out.println("Enter a Value");
                    a = in.nextInt();
                    int s = list.size();
                    System.out.println("Enter a Index between 1-" + s);
                    int i = in.nextInt();
                    System.out.println("Enter a way to access \n1. singly\n2. doubly");
                    int w = in.nextInt();
                    if (i > s || i < 1) {
                        System.out.println("Invalid Index");
                    } else {
                        list.insertAt(i, a, w);
                    }
                } else if (ch == 4) {
                    int s = list.size();
                    System.out.println("Enter an Index 1-" + s);
                    int i = in.nextInt();
                    if (i > s || i < 1) {
                        System.out.println("Invalid Index");
                    } else {
                        list.deleteNodeAt(i);
                    }
                } else if (ch == 5) {
                    int s = list.size();
                    System.out.println("Enter an Index  between 1-" + s);
                    int i = in.nextInt();
                    int x = 0;
                    if (i > s || i < 1) {
                        System.out.println("Invalid Index");
                    } else {
                        x = list.getNodeAt(i);
                    }
                    System.out.println("Value at this index is" + x);
                } else if (ch > 6) {
                    System.out.println("Invalid Choice");
                }
            }
        }
    }
}