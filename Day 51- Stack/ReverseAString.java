//Reverse a string using stack data structure.
import java.util.Stack;

public class ReverseAstring{
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        String s="Parwez";
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++){
            stack.push(""+s.charAt(i));
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        s=sb.toString();
        System.out.print(s);
    }
}
