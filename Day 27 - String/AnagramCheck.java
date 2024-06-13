
import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck{
    public static boolean countAnagram(String str,String str1){
        char[] arr=str.toCharArray();
        char[] arr1=str1.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);

        if(Arrays.equals(arr, arr1)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1=sc.next();
        System.out.println(countAnagram(str,str1));
    }
}
