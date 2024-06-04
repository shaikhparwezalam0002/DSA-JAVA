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

/*
>PS D:\Sigma 3.0\assignment\Day 19> java SubArraySum.java
5
2 4 6 8 10

( 2 ) = 2
( 2 4 ) = 6
( 2 4 6 ) = 12
( 2 4 6 8 ) = 20
( 2 4 6 8 10 ) = 30

( 4 ) = 4
( 4 6 ) = 10
( 4 6 8 ) = 18
( 4 6 8 10 ) = 28

( 6 ) = 6
( 6 8 ) = 14
( 6 8 10 ) = 24

( 8 ) = 8
( 8 10 ) = 18

( 10 ) = 10

minimum value is: 2
maximum value is: 30
total pair is: 15
*/
