
import java.util.Scanner;
public class Fibonacci{
    public static int fiboSeries(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibnm1=fiboSeries(n-1);
        int fibnm2=fiboSeries(n-2);
        int fibn=fibnm1+fibnm2;
        return fibn;
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fiboSeries(n));
    }
}