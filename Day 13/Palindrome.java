
import java.util.Scanner;

public class Palindrome{
    static public int rotateNumber(int num){
        int r=0;
        while(num>0){
            r=r*10+num%10;
            num/=10;
        }
        return r;
    }
    public static boolean IsPalindrome(int n){
        if(n<0){
            return false;
        }
        else{
            if(n==rotateNumber(n)){
                return true;
            }
            else{
                return false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(IsPalindrome(num)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}

/*
PS D:\Sigma 3.0\assignment\Day 13> java Palindrome.java
212
Palindrome
PS D:\Sigma 3.0\assignment\Day 13> java Palindrome.java
432
Not a palindrome
*/
