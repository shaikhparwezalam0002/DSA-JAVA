
import java.util.Scanner;

public class IsEven{
    public static boolean isEven(int n){
        if(n%2==0 && n!=0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(IsEven.isEven(n)){
            System.out.print(n+" is a even number.");
        }
        else{
            System.out.print("Number can't be zero or odd");
        }
    }
}