import java.util.Scanner;

public class App {

    public Node root;

    App() {
        Scanner in = new Scanner(System.in);
        int ch = 0;
        do {
            System.out.println(
                    "Enter choice: \n1. Add Node \n2. In-order Traversal \n3. Pre-order Traversal \n4. Post-order Traversal \n5. Exit");
            ch = in.nextInt();
            if (ch == 1) {
                System.out.println("Enter Element");
                int el = in.nextInt();
                fin(el);
            } else if (ch == 2) {
                System.out.println("In-Order Traversal:");
                inorder(root);
            } else if (ch == 3) {
                System.out.println("Pre-Order Traversal:");
                preorder(root);
            } else if (ch == 4) {
                System.out.println("Post-Order Traversal:");
                postorder(root);
            } else if (ch < 5) {
                System.out.println("Invalid Choice");
            }
        } while (ch != 2);
    }

    
    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.getLeft());
        System.out.print(root.getData()+" ");
        inorder(root.getRight());
    }

    
    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.getData()+" ");
        preorder(root.getLeft());
        preorder(root.getRight());
    }

    public void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.getLeft());
        postorder(root.getRight());
        System.out.println(root.getData()+" ");
    }

    public void fin(int el){
        root=addnode(el, root);
    }

    public Node addnode(int el, Node root) {
        Node newnode = new Node(el);
        if (root == null) {
            root = newnode;
            return root;
        }
        if (el < root.getData()) {
            root.setLeft(addnode(el, root.getLeft()));
            
        } else if (el > root.getData()) {
            root.setRight(addnode(el, root.getRight()));
        }
        return root;
    }

    public static void main(String[] args) throws Exception {
        App obj = new App();
    }
}
