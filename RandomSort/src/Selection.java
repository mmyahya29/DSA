public class Selection extends App {
    public  void Selection(){
        for (int i = 0; i <=4; i++) {
            int mmin=i;
            int min = arr[i];
            for (int j = i ; j <=4; j++) {
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
        for (int i = 0; i <= 4; i++) {
            System.out.println(arr[i]);
        }
    }
}
