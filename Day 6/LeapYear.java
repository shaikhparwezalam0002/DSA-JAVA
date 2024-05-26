
import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year= sc.nextInt();
        if(year %4==0 && year % 100 ==0 && year % 400==0){
            System.err.println("Leap year...");
        }
        else{
            System.err.println("Not a leap year...");
        }
    }
}