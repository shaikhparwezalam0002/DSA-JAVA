import java.util.*;
import java.io.*;

class Solution{
    public static int power(int i,int a, int b){
        int sum=0;
        for(int k=0;k<=i;k++){
            sum+=Math.pow(2,k)*b;
        }
        return sum+a;
    }
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int res=1;
            for(int j=0;j<n;j++){
                res=power(j,a,b);
                System.out.print(res+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
