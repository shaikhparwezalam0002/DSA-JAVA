import java.util.*;
public class SelectionSortAsc{
    public static void selectionSortAsc(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int pos=i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[pos]>arr[j]){
                    pos=j;
                }
            }
            if(pos!=i){
                int temp=arr[i];
                arr[i]=arr[pos];
                arr[pos]=temp;
            }
        }
    }
    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        selectionSortAsc(arr);
        printArray(arr);
    }
}