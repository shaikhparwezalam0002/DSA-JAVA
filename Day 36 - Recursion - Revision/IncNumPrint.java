
import java.util.Scanner;

public class IncNumPrint{
    public static void printNumInc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printNumInc(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printNumInc(n);
    }
}