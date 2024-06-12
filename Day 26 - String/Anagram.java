import java.util.*;
public class Anagram{
    public static boolean isAnagram(String str,String str1){
        char ch[]=str.toCharArray();
        char ch1[]=str1.toCharArray();// convert string into character array
       // System.out.println(ch1.length);
        if(str.length()==str1.length()){
            Arrays.sort(ch);
            Arrays.sort(ch1);
            // for(int i=0;i<ch.length;i++){
            //     if(ch[i]!=ch1[i]){
            //         return false;
            //     }
            // }
            boolean result = Arrays.equals(ch, ch1);  //compare two array value and return boolean value
            if(!result){
                return false;
            }
        }
        else{
            return false;
        }

        // for(char c: ch){
        //     System.out.print(c+" ");
        // }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1=sc.next();
        System.out.println(isAnagram(str,str1));
    }
}
