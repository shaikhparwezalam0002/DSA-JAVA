
import java.util.Scanner;

public class KeepFiltering10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=0;
        do { 
            number=sc.nextInt();
            if(number%10==0){
                continue;
            }
            else if(number==101){
                break;
            }
            System.out.println("Number is: "+number);
        } while (true);
        System.out.println("Exit");
    }
}