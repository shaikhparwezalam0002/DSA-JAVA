//brute force approach
import java.util.Scanner;
public class MaxSubArray{
    public static void sumOfMaxSubArray(int arr[]){
        int max=Integer.MIN_VALUE;
        int sum=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length;i++){
            for(int j=i;j<=arr.length;j++){
                for(int k=i;k<j;k++){
                    sum+=arr[k];
                    //System.out.print(arr[k]);
                }
                //System.out.println("");
                if(max<sum){
                    max=sum;
                }
                sum=0;
            }
            //System.out.println("");
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sumOfMaxSubArray(arr);
    }
}
