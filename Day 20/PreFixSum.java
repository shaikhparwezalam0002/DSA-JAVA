// max sum of sub array using prefix approach.
import java.util.Scanner;
public class PreFixSum{
    public static void preFixSum(int[] arr){
        int preFixArray[]=new int[arr.length];
        int max=Integer.MIN_VALUE;
        int sum=0;
        preFixArray[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            preFixArray[i]=preFixArray[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            //int st=i;
            for(int j=i;j<arr.length;j++){
               // int end=j;
                sum=(i==0)?preFixArray[j]:preFixArray[j]-preFixArray[i-1];
            }
            if(max<sum){
                max=sum;
            }
            sum=0;
        }
       System.out.println("Max value is "+ max);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){ 
            arr[i]=sc.nextInt();
        }
        preFixSum(arr);
    }
}
