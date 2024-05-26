import  java.util.Scanner;
public class Palindrome{
    boolean palindromeNumber(int num){
        int rev=0;
        int palindrome=num;
        while(num!=0){
            rev=rev*10+num%10;
            num/=10;
        }
        if(palindrome==rev){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Palindrome p=new Palindrome();
        int num=sc.nextInt();
        boolean result=p.palindromeNumber(num);
        if(result){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}