import java.util.*;

public class App {
    private static int[] arr = new int[6];
    private static int in = -1;

    public static void enQueue(int x) {
        if (in < 5) {
            in++;
            arr[in] = x;
        } else {
            System.out.println("Queue is full");
        }
    }

    public static int deQueue() {
        int x;
        if (in > -1) {
            x = arr[0];
            for (int i = 0; i < in; i++) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            in--;
            return x;
        } else {
            System.out.println("Queue is empty");
            return -6969;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int ch = 0;
        while (ch != 3) {
            System.out
                    .println("Choose:\n 1.Enter in queue\n 2.Get from Queue\n 3.Exit");
            ch = in.nextInt();
            int i;
            if (ch == 1) {
                System.out.println("Enter value ");
                i = in.nextInt();
                enQueue(i);
            } else if (ch == 2) {
                i = deQueue();
                if (i == -6969) {
                    System.out.println("Queue is empty");
                } else {
                    System.out.println("Got Value from Queue: " + i);
                }
            } else if (ch != 3) {
                System.out.println("Invalid Choice");
            }
        }
    }
}
