import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
        //print first 5 fibonacci series.
        int first = 0,sec = 1,third =0;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();

        for(int i=1; i<=n;i++){
            System.out.println(third);
            first=sec;
            sec=third;
            third= first + sec;
        }
    }
}