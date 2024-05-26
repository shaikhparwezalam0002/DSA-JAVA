import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args) {
        int number,even=0,odd=0,choice=0;
        Scanner sc=new Scanner(System.in);
        do { 
            System.out.println("Enter Number: ");
            number=sc.nextInt();
            if( number%2==0){
                even+=number;
            }
            else{
                odd+=number;
            }
            System.out.println("Press 0 for continue, 1 for exit...");
            choice=sc.nextInt();
        } while (choice!=1);
        System.out.println("Even sum is "+even);
        System.out.println("Odd sum is "+odd);
    }
}