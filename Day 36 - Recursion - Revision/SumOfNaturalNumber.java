
import java.util.Scanner;

public class SumOfNaturalNumber{
    public static int sumNatural(int n){
        if(n==1){
            return 1;
        }
        return n+sumNatural(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumNatural(n));
    }
}