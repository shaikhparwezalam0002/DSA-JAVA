
import java.util.Scanner;

public class Palindrome{
    public static int isReverse(int num){
        int s=0;
        while(num>0){
            s=s*10+num%10;
            num/=10;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num==isReverse(num)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}