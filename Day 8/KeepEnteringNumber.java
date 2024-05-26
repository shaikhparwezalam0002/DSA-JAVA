
import java.util.Scanner;

public class KeepEnteringNumber{
    public static void main(String[] args) {
        //Keep entering a numbers till user enters a multiple of 10.
        Scanner sc=new Scanner(System.in);
        int number=0;
        do{
        number=sc.nextInt();
        System.out.println("Enter number is:"+number);
        }while(number%10!=0);
        System.out.print("Exit");
    }
}