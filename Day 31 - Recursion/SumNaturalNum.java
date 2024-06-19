
import java.util.Scanner;

public class SumNaturalNum{
    private static int sum=0;
    public static int sumNaturalNumber(int n){
        if(n==1){
            return sum+=n;
        }
        sumNaturalNumber(n-1);
        //sum+=n;
        return sum+=n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(sumNaturalNumber(num));
    }
}
