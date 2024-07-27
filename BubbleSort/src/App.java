import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter Values in array");
        for (int i = 0; i <= 4; i++) {
            arr[i] = in.nextInt();
        }
        int mmin = 0;

        for (int i = 0; i <= 4; i++) {
            for (int j = i; j <= 4; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        System.out.println("Sorted Array:");
        for (int i = 0; i <= 4; i++) {
            System.out.println(arr[i]);
        }

    }
}
