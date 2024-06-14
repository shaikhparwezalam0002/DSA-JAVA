
import java.util.Scanner;

public class AddOne{
    public static int usingBitWiseNot(int n){
        return -~n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(usingBitWiseNot(n));
    }
}
