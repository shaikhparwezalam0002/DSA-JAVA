
import java.util.Scanner;

public class SumOfEvenNumbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        int sum=0;
        for(int i=0;i<=number;i++){
            sum += (i%2==0)? i:0;
        }
        System.err.println(sum);
    }
}