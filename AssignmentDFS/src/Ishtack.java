import java.util.*;

public class Ishtack {
    private static int[] stack = new int[15];
    private static int top1 = -1;

    public static void push(int a) {

        if ((top1 > 14)) {
            System.out.println("Stack is full");
        } else {
            top1++;
            stack[top1] = a;
        }
    }

    public static boolean isEmpty(){
        if (top1 < 0) {
            return true;
        }
        return false;
    }

    public static int pop() {
        if (isEmpty()==true) {
            System.out.println("Stack is empty");
            return -666;
        } else {
            int a = stack[top1];
            top1--;
            return a;
        }
    }
}
