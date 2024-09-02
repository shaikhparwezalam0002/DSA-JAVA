import java.util.*;
class Main{
    
    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            System.out.print("Not an Anagram");
            return false;
        }
        
        char[] s=str1.toCharArray();
        char[] s1=str2.toCharArray();
        Arrays.sort(s);
        Arrays.sort(s1);
        for(int i=0;i<s.length;i++){
            if(s[i]!=s1[i]){
                System.out.print("Not an Anagram");
                return false;
            }
        }
        System.out.print("Anagram");
        return true;
    }
    public static void main (String[] args) {
        String s1="abce";
        String s2="ecba";
        isAnagram(s1,s2);
    }
}
