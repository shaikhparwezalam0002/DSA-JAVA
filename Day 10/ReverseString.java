
import java.util.Scanner;

public class ReverseString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String reverse="";
        for( int i=s.length()-1 ;i>=0; i-- ){
            reverse+=s.charAt(i);
        }
        System.out.println(reverse);
    }
} 