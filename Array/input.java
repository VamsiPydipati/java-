import java.util.*;
public class input{
    public static void main(String [] a){
        Scanner in = new Scanner(System.in);
        int arr[] =new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=4;
        System.out.println(arr[2]);
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        
        }
         for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
         }
        

    }
}