
import java.util.Scanner;

public class Vowel{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        checkVowel cv=new checkVowel();
        int count=cv.countVowel(s);
        System.out.println(count);
    }
}

class checkVowel{
    public int countVowel(String name){
        int count=0;
        for(int i=0;i<name.length();i++){
            char c=name.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                count++;
            }
        }
        return count;
    }
}
