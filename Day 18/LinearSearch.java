
import java.util.Scanner;

public class LinearSearch{
    static public int linearSearch(int n[],int key){
        for(int i=0;i<n.length;i++){
            if(n[i]==key){
                return i;
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

        int result=linearSearch(num,key);//call by reference.
        System.out.println((result>-1)?"found at "+result:"Not found");
    }
}