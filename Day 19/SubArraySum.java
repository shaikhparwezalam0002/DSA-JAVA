import java.util.*;

public class SubArraySum{
    static public void pnSubArraySum(int arr[]){
        int sum=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int pair=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                System.out.print("( ");
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    System.out.print(arr[k]+" ");
                }
                pair++;
                System.out.print(") = "+sum+"\n");
                if(min>sum){
                    min=sum;
                }
                if (max<sum) {
                    max=sum;
                }
                sum=0;
            }
            System.out.println();
        }
        System.out.println("minimum value is: "+min);
        System.out.println("maximum value is: "+max);
        System.out.println("total pair is: "+pair);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        pnSubArraySum(arr);
    }
}
