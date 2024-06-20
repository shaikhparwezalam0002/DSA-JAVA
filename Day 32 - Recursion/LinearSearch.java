import java.util.*;
public class LinearSearch{
    public static void findIndex(int[] arr, int key,int n){
        if(arr.length-1==n){
            if(arr[n]==key){
                System.out.println(n);
            }
            return;
        }
        else{
            if(arr[n]==key){
                System.out.println(n);
            }
            n++;
            findIndex(arr,key,n);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){ 
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        findIndex(arr,key,0);
        
    }
}