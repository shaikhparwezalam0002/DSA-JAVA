
import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int last= sc.nextInt();
        int a=0,b=1,c=0;
        for(int i=0;i<=last;i++){
            System.err.print(c+" ");
            a=b;
            b=c;
            c=a+b;
        }
    }
}