import java.util.*;

public class SelectionInverted {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter Values in array");
        for (int i = 0; i <= 4; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 4; i >= 0; i--) {
            int mmax = i;
            int max = arr[i];
            for (int j = i; j >= 0; j--) {
                if (arr[j] > max) {
                    max = arr[j];
                    mmax = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mmax];
            arr[mmax] = temp;
        }
        System.out.println("Sorted Array:");
        for (int i = 0; i <= 4; i++) {
            System.out.println(arr[i]);
        }

    }
}
