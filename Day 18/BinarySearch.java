
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch{
    public static int binarySearchOperation(int n[],int key){
        Arrays.sort(n);
        int end=n.length-1;
        int st=0;
        while(st<=end){
            int mid=(st+end)/2;
            if(n[mid]==key){
                return mid;
            }
            else if(n[mid]>key){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] num=new int[5];
        System.out.println("Enter the elements:");
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("Enter the searching key:");
        int key=sc.nextInt();
        int index=binarySearchOperation(num,key);
        System.out.println((index>-1)?"found at "+index:"Not found");
    }
}