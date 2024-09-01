import java.util.*;
public class Main{
    public static String reverseStr(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        String rev=reverseStr(word);
        if(word.equalsIgnoreCase(rev)){
            System.out.print("Pallindrome");
        }
        else{
            System.out.print("Not a Pallindrome");
        }
    }
}
