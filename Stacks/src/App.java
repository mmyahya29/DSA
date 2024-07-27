import java.util.*;

public class App {
    private static int[] stack = new int[6];
    private static int top1 = -1;
    private static int top2 = 6;

    public static void push1(int a) {

        if ((top1 > 5) || ((top1 + 1) == top2)) {
            System.out.println("Stack is full");
        } else {
            top1++;
            stack[top1] = a;
            System.out.println("Value pushed in stack");
        }
    }

    public static void push2(int a) {

        if ((top2 < 0) || ((top2 - 1) == top1)) {
            System.out.println("Stack is full");
        } else {
            top2--;
            stack[top2] = a;
            System.out.println("Value pushed in stack");
        }
    }

    public static int pop1() {
        if (top1 < 0) {
            System.out.println("Stack is empty");
            return -666;
        } else {
            int a = stack[top1];
            top1--;
            return a;
        }
    }

    public static int pop2() {
        if (top2 > 5) {
            System.out.println("Stack is empty");
            return -666;
        } else {
            int a = stack[top2];
            top2++;
            return a;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int ch = 0;
        while (ch != 5) {
            System.out
                    .println("Choose: \n 1.PUSH(stack 1)\n 2.POP(stack 1)\n 3.PUSH(stack 2)\n 4.POP(stack 2)\n 5.EXIT");
            ch = in.nextInt();
            int i;
            if (ch == 1) {
                System.out.println("Enter value to push");
                i = in.nextInt();
                push1(i);
            } else if (ch == 2) {
                i = pop1();
                if (i != -666) {
                    System.out.println("Popped value is " + i);
                }
            } else if (ch == 3) {
                System.out.println("Enter value to push");
                i = in.nextInt();
                push2(i);
            } else if (ch == 4) {
                i = pop2();
                if (i != -666) {
                    System.out.println("Popped value is " + i);
                }

            } else if (ch != 5) {
                System.out.println("Invalid choice");
            }

        }
    }
}
