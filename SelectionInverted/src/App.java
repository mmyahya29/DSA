import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter Values in array");
        for (int i = 0; i <= 4; i++) {
            arr[i] = in.nextInt();
        }
        int max = 0;
        for (int i = 4; i >= 0; i--) {

            int maxVerstappen = arr[i];
            for (int j = i; j >= 0; j--) {
                if (arr[j] > maxVerstappen) {
                    maxVerstappen = arr[j];
                    max=j;
                }
                
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
        System.out.println("Sorted Array:");
        for (int i = 0; i <= 4; i++) {
            System.out.println(arr[i]);
        };
    }
}
