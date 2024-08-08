//High Security Strings - Hacker Rank
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'getStrength' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING password
     *  2. INTEGER weight_a
     */

    public static int getStrength(String password, int weight_a) {
    // Complete the function
        HashMap<Character,Integer> map=new HashMap<>();
        int c=weight_a;
        int ch=97;
        for(int i=1;i<=26;i++){
            map.put((char)ch,c);
            ch++;
            c++;
            if(c==26){
                c=0;
            }  
        }
        int sum=0;
        for(int i=0;i<password.length();i++){
            char x=password.charAt(i);
            sum+=map.get(x);
        }
        return sum;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String password = bufferedReader.readLine();

        int weight_a = Integer.parseInt(bufferedReader.readLine().trim());

        int strength = Result.getStrength(password, weight_a);

        bufferedWriter.write(String.valueOf(strength));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
