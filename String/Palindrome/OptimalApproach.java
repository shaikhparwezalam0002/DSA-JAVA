import java.util.*;
public class Main{
    public static boolean reverseStr(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            char st=str.charAt(i);
            char end=str.charAt(j);
            if(st!=end){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        if(reverseStr(word)){
            System.out.print("Pallindrome");
        }
        else{
            System.out.print("Not a Pallindrome");
        }
    }
}
