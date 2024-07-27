import java.util.*;
import java.util.Random;

public class App {
    public static int arr[] = new int[100];

    public void bubbleSort() {
        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void Selection() {

        for (int i = 0; i < arr.length; i++) {
            int mmin = i;
            int min = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mmin = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mmin];
            arr[mmin] = temp;
        }
        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        App obj = new App();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println("Generated Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        obj.bubbleSort();
        obj.Selection();
    }
}
