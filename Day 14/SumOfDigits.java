
import java.util.Scanner;

public class SumOfDigits{
    public static int sumDigits(int num){
        int sum=0;
        while (num>0) { 
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(sumDigits(num));
    }
}