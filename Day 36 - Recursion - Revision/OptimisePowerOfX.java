
import java.util.Scanner;

public class OptimisePowerOfX{

    public static int xOfPower(int x,int n){
        if(n==0){
            return 1;
        }
        int pow= xOfPower(x, n/2)*xOfPower(x, n/2);
        if(n%2!=0){
            pow*=x;
        }
        return pow;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(xOfPower(x,n));
    }
}