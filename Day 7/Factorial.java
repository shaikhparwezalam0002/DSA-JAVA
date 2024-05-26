
import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fact= sc.nextInt();
        int sum=1;
        for(int i=1;i<=fact;i++){
            sum *= i;
        }
        System.err.println(sum);
    }
}
