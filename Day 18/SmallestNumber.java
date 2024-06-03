
import java.util.Scanner;

public class SmallestNumber{
    static public int findSmallestNumber(int n[]){
        int smallest=n[0];
        for(int i=1;i<n.length;i++){
            if(smallest>n[i]){
                smallest=n[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num[]=new int[5];
        System.out.println("Enter the elements:");
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        System.out.println(findSmallestNumber(num));
    }
}