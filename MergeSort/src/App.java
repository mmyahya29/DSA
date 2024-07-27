import java.util.*;

public class App {

    public static int[] merge(int left[], int right[]) {
        int[] merged = new int[left.length + right.length];
        int leftin = 0;
        int rightin = 0;
        int i = 0;
        while ((leftin < left.length) && (rightin < right.length)) {
            if (left[leftin] < right[rightin]) {
                merged[i++] = left[leftin++];
            } else {
                merged[i++] = right[rightin++];
            }
        }
        while (leftin < left.length) {
            merged[i++] = left[leftin++];
        }
        while (rightin < right.length) {
            merged[i++] = right[rightin++];
        }
        return merged;
    }

    public static int[] mergeSort(int arr[]) {
        if (arr.length <= 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter Values in Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        arr = mergeSort(arr);
        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
