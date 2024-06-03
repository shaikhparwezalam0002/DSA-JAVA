
import java.util.Scanner;

public class LargestNumber{
    static public int findLargestNumber(int n[]){
        int largest=n[0];
        for(int i=1;i<n.length;i++){
            if(largest<n[i]){
                largest=n[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num[]=new int[5];
        System.out.println("Enter the elements:");
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        System.out.println(findLargestNumber(num));
    }
}