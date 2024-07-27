import java.util.*;

public class App {
    private static int[] stack = new int[6];
    private static int top1 = -1;

    public static void push(int a) {

        if (top1 + 1 < 6) {
            top1++;
            stack[top1] = a;
            System.out.println("Value pushed in stack");
        } else {
            System.out.println("Stack is full");
        }
    }

    public static int pop() {
        if (top1 < 0) {
            System.out.println("Stack is empty");
            return -666;
        } else {
            int a = stack[top1];
            top1--;
            return a;
        }
    }

    public static void reverse() {
        if (top1 > -1) {
            int x = stack[top1];
            top1--;
            reverse();
            insertAtBottom(x);
        }
    }

    public static void insertAtBottom(int x) {
        if (top1 < 0) {
            top1++;
            stack[top1] = x;
        } else {
            int a = stack[top1];
            top1--;
            insertAtBottom(x);
            top1++;
            stack[top1] = a;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int ch = 0;
        while (ch != 4) {
            System.out
                    .println("Choose: \n 1.PUSH\n 2.POP\n 3.Reverse Stack\n 4.EXIT");
            ch = in.nextInt();
            int i;
            if (ch == 1) {
                System.out.println("Enter value to push");
                i = in.nextInt();
                push(i);
            } else if (ch == 2) {
                i = pop();
                if (i != -666) {
                    System.out.println("Popped value is " + i);
                }
            } else if (ch == 3) {
                reverse();
                System.out.println("Stack reversed");

            } else if (ch != 5) {
                System.out.println("Invalid choice");
            }
        }
    }
}
