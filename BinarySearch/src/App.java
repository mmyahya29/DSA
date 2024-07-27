import java.util.Scanner;
import java.math.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter Values in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int key;
        System.out.println("Enter Value to search");
        key = in.nextInt();
        int first = arr.length - (arr.length - 1);
        int last = arr.length - 1;
        for (; first != last;) {
            int mid = (first + last) / 2;
            if (arr[mid] > key) {
                last = mid;
            } 
            else if (arr[mid] < key) {
                first = mid;
            } 
            else if(arr[mid]==key){
                System.out.println("Value found at index " + mid);
                break;
            }
            else if (first > last) {
                System.out.println("Value not found");
                 break;
            }
        
        }

    }
}
