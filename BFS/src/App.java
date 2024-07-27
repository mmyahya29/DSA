import java.util.*;

public class App {

    LinkedList<Integer> arr[] = new LinkedList[8];

    App() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            arr[i] = new LinkedList<>();
        }

        int ch = 0;
        do {
            System.out.println("Enter choice: \n1. Add Edge\n2. Continue");
            ch = in.nextInt();
            if (ch == 1) {
                System.out.println("Enter source and destination");
                int s = in.nextInt();
                int d = in.nextInt();
                arr[s] = addedge(d, arr[s]);
                arr[d] = addedge(s, arr[d]);
            } else if (ch < 2) {
                System.out.println("Invalid Choice");
            }
        } while (ch != 2);

        System.out.println("Adjency List:");
        for (int i = 0; i < 8; i++) {
            System.out.println(i + "Linked to" + arr[i]);
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
        System.out.println("Visited :");
        int current;
        while (!queue.isEmpty()) {
            current = queue.deQueue();
            System.out.print(current);
            for (int adj : arr[current]) {
                if (!vis[adj]) {
                    vis[adj] = true;
                    queue.enQueue(adj);
                }
            }
        }
    }

    public LinkedList addedge(int d, LinkedList list) {
        list.add(d);
        return list;
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        App obj = new App();
        obj.BFS(1);

    }
}
