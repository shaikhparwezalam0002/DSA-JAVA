
import java.util.Scanner;

public class DigitToNum{
    public static void numToDigit(int n){
        String[] num={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        if(n==0){
            return;
        }
        
        numToDigit(n/10);
        int x= n % 10;
        System.out.print(num[x]+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        numToDigit(n);
    }
}