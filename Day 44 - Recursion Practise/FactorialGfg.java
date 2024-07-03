//GFG - Find all factorial numbers less than or equal to n - Brute force approach
import java.util.*;
public class Factorial
{
    public static long fact(long f){
        if(f==1){
            return f;
        }
        return f*fact(f-1);
    }
    public static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> al=new ArrayList<>();
        for(int i=1;i<=n;i++){
            long f=fact((long) i);
            if(f<=n){
                al.add(f);
            }
        }
        return al;
    }
	public static void main(String[] args) {
		ArrayList al=factorialNumbers(6);
	    System.out.print(al);
	}
}
