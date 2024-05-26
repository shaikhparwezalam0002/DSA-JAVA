
import java.util.Scanner;

public class Armstrong{
    static boolean armstrongNumber(int number){
        if(number<=0){
            return  false;
        }
        int dup=0;
        int arm=number;

        int digit= String.valueOf(number).length();

        while(number!=0){
            dup+=(int)Math.pow((number%10),digit);
            number/=10;
        }
        if(dup==arm){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        boolean result=Armstrong.armstrongNumber(number);
        if(result){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }
    }
}
