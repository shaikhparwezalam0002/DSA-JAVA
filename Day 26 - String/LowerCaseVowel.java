
import java.util.Scanner;

public class LowerCaseVowel{
    public static int countVowel(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'|| ch=='e' || ch=='i'|| ch=='o' || ch=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        //Count how many times lower case vowels occurred in a String entered by the user.
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(countVowel(str));
    }
}