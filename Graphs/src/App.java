import java.util.*;
public class App {
    App(int x, int y){
        Scanner in =new Scanner(System.in);
        int arr[][]=new int[x][y]; 
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                arr[i][j]=0;
            }
        }
        int ch=0;
        do{
        System.out.println("Enter choice: \n1. Add Edge\n2. Continue");
        ch=in.nextInt();
        if (ch==1) {
            arr=addedge(arr);
        }else if(ch==2){
            System.out.println("Invalid Choice");
        }
        }while(ch!=2);
        System.out.println("Adjency Matrix:");
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    public int[][] addedge(int arr[][]){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter Edge tuple");
        int r=in.nextInt(); 
        int c=in.nextInt();
        arr[r][c]=1;
        return arr;
    }

    public static void main(String[] args) throws Exception {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter rows and columns of matrix");
        int r=in.nextInt(); 
        int c=in.nextInt();
        App obj=new App(r,c);
    }
}
