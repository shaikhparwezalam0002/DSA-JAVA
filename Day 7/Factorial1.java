
import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fact= sc.nextInt();
        int sum=1,i=1;
        while(i<=fact){
            sum *= i;
            i++;
        }
        System.err.println(sum);
    }
}