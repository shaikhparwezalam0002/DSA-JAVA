
import java.util.Scanner;

public class CountSortAsc{
    public static void countingSort(int[] arr){
        int max=Integer.MIN_VALUE;
        //find the max value present inside the array.
        for(int i=0;i<arr.length;i++){
            max=Math.max(max, arr[i]);
        }
        //max+1 is becoz array value starts from 0 index.
        int countFreq[]=new int[max+1];
        //arr[i]- given the value 
        //and countFreq array use that value as an index.
        for(int i=0;i<arr.length;i++){
            countFreq[arr[i]]++;
        }
        //now sorting in ascending order 
        int j=0;
        for(int i=0;i<countFreq.length;i++){
            while(countFreq[i]>0){
                arr[j]=i;
                countFreq[i]--;
                j++;
            }
        }
    }
    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        countingSort(arr);
        printArray(arr);
    }
}