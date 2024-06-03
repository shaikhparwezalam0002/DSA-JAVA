
import java.util.*;
public class ReverseArray{
    public static int[] arrayReverse(int n[]){
        int i=0;
        int j=n.length-1;
        int temp=Integer.MIN_VALUE;
        while(i!=j){
            temp=n[i];
            n[i]=n[j];
            n[j]=temp;
            i++;
            j--;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] num=new int[5];
        System.out.println("Enter the elements:");
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        num=arrayReverse(num);
        for(int i: num){
            System.out.print(i+" ");
        }
    }
}