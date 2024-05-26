import java.util.Scanner;
public class FizzBuzz{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%3==0){
            if(num%3 ==0 && num %5==0){
                System.out.print("FizzBuzz");
                return;
            } 
            System.out.print("Fizz");   
        }
        else if(num % 5==0){
            if(num%3 ==0 && num %5==0){
                System.out.print("FizzBuzz");
                return;
            }
            System.out.print("Buzz");
        }
        else{
            System.out.print(num);
        }
    }
}
