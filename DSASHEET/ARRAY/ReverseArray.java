//Q: https://docs.google.com/spreadsheets/d/1hXserPuxVoWMG9Hs7y8wVdRCJTcj3xMBAEYUOXQ5Xag/edit#gid=0 - GFG
import java.util.Scanner;
public class ReverseArray
{ 
    public static void reverseArray(int arr[],int N) 
    {
        int i=0,j=N-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        
    }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    reverseArray(arr,n);
    for(int i:arr){
        System.out.print(i+" ");
    }
  }
}
