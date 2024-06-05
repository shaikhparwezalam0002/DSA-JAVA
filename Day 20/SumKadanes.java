//Maximum sum of Sub Array using Kadane's approach
import java.util.Scanner;
public class SumKadanes{
    public static void sumKadan(int arr[]){
        int cs=0;
        int ms=0;
        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            cs=cs<0?0:cs;
            ms=ms<cs?cs:ms;
        }
        System.out.println("Max sum is:"+ ms);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sumKadan(arr);
    }
}
