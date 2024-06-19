
import java.util.Scanner;


public class PrintDec{
    public static void printDesc(int n){
        if(n>=1){
            System.out.print(n+" ");
            printDesc(n-1);
        }
        else{
            return;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        printDesc(num);
    }
}