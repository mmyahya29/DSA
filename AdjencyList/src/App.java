import java.util.*;
public class App {
    App(int ver){
        Scanner in =new Scanner(System.in);
        LinkedList arr[]=new LinkedList[ver];
        for(int i=0; i<ver;i++){
            LinkedList<Integer> list=new LinkedList<>(); 
            arr[i]=list;
        }

        int ch=0;
        do{
        System.out.println("Enter choice: \n1. Add Edge\n2. Continue");
        ch=in.nextInt();
        if (ch==1) {
            System.out.println("Enter source and destination");
            int s=in.nextInt();
            int d=in.nextInt();
            arr[s]=addedge(d,arr[s]);
            arr[d]=addedge(s,arr[d]);
        }else if(ch==2){
            System.out.println("Invalid Choice");
        }
        }while(ch!=2);

        System.out.println("Adjency List:");
        for(int i=0;i<ver;i++){
              System.out.println(i+"Linked to"+arr[i]);
            }

    }

    public LinkedList addedge( int d, LinkedList list){
        list.add(d);
        return list;
    }
    public static void main(String[] args) throws Exception {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter Number of vertices");
        int ver=in.nextInt(); 
        App obj=new App(ver);
    }
}
