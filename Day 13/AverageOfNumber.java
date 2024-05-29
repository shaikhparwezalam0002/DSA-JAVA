
import java.util.Scanner;

public class AverageOfNumber{
    public int averageCalculator(int n,int m,int o){
        return (n+m+o)/3;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        AverageOfNumber aon=new AverageOfNumber();
        int avg=aon.averageCalculator(a, b, c);
        System.out.println("Average is:"+avg);
    }
}