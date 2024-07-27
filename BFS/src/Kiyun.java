import java.util.*;

public class Kiyun {
    private static int[] arr = new int[15];
    private static int in = -1;

    public static void enQueue(int x) {
        if (in < 14) {
            in++;
            arr[in] = x;
        } else {
            System.out.println("Queue is full");
        }
    }

    public static boolean isEmpty(){
        if(in<0){
            return true;
        }
        return false;
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
            return -6969;
        }
    }
}
