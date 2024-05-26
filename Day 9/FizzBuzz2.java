
import java.util.Scanner;

public class FizzBuzz2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println((num%15==0)?"FizzBuzz":(num%3==0)?"Fizz":(num%5==0)?"Buzz":num);
    }
}