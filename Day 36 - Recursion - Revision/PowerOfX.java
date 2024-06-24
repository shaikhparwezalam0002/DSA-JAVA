
import java.util.Scanner;

public class PowerOfX{
    public static int xOfPower(int x,int n){
        if(n==0){
            return 1;
        }
        return x*xOfPower(x,n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(xOfPower(2,3));
    }
}