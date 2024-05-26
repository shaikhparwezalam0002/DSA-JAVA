
import java.util.Scanner;

public class FizzBuzz1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //2nd approach 
        int num=sc.nextInt();
        if(num%15==0){
            System.out.println("FizzBuzz");
        }
        else if(num%5==0){
            System.out.println("Buzz");
        }
        else if(num%3==0){
            System.out.println("Fizz");
        }
        else{
            System.out.println(num);
        }
    }
}