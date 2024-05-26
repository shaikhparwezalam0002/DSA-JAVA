
import java.util.Scanner;

public class ReverseNumber{
    static int reverseNumber(int num){
        int rev=0;
        while(num!=0){
            rev=rev*10+(num%10);
            num/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter Number:");
        int number=sc.nextInt();
        int rev=ReverseNumber.reverseNumber(number);
        System.err.println(rev);
    }
}