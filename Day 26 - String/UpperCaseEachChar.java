
import java.util.Scanner;

public class UpperCaseEachChar{
    public static String PrintUpperCase(String str){
        StringBuffer sb=new StringBuffer("");
        sb.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i <str.length()){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(PrintUpperCase(str));
    }
}