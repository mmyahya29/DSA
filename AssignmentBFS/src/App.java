import java.util.Scanner;

public class App {

    CustomLinkedList arr[] = new CustomLinkedList[8];

    App() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            arr[i] = new CustomLinkedList();
        }

        int ch = 0;
        do {
            System.out.println("Enter choice: \n1. Add Edge\n2. Continue");
            ch = in.nextInt();
            if (ch == 1) {
                System.out.println("Enter source and destination");
                int s = in.nextInt();
                int d = in.nextInt();
                addedge(d, arr[s]);
                addedge(s, arr[d]);
            } else if (ch < 2) {
                System.out.println("Invalid Choice");
            }
        } while (ch != 2);

        System.out.println("Adjacency List:");
        for (int i = 0; i < 8; i++) {
            System.out.print(i + " linked to: ");
            arr[i].printList();
        }
    }

    public void BFS(int start) {
        Kiyun queue = new Kiyun();
        boolean vis[] = new boolean[8];
        for (int i = 0; i < 8; i++) {
            vis[i] = false;
        }
        queue.enQueue(start);
        vis[start] = true;
        System.out.println();
        System.out.println("Visited:");
        int current;
        while (!queue.isEmpty()) {
            current = queue.deQueue();
            System.out.print(current + " ");
            for (int i = 0; i < arr[current].size(); i++) {
                int adj = arr[current].getNodeAt(i);
                if (!vis[adj]) {
                    vis[adj] = true;
                    queue.enQueue(adj);
                }
            }
        }
        System.out.println();
    }

    public void addedge(int d, CustomLinkedList list) {
        list.insert(d);
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        App obj = new App();
        obj.BFS(1);
    }
}
