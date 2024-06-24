
import java.util.Scanner;

public class DescNumPrint{
    public static void descPrintNum(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);//10 9
        descPrintNum(n-1);//call 9 call 8
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        descPrintNum(n);
    }
}