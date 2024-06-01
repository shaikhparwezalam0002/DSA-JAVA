
import java.util.Scanner;

public class PalindromPattern{
    public static void printPattern(int n){
        int sp=n-1;
        int count=1;
        int loop=1;
        for(int i=1;i<=n+(n-1);i++){
            //for spaces
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=loop+(loop-1);j++){
                System.out.print(count);
                if(j<loop){
                    count++;
                }
                else{
                    count--;
                }
            }
            System.out.println("");
            count=1;
            if (i<n) {
                sp--;
                loop++;
            }
            else{
                sp++;
                loop--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        printPattern(line);
    }
}

/*
>PS D:\Sigma 3.0\assignment\Day 16> java PalindromPattern.java
5
    1
   121
  12321
 1234321
123454321
 1234321
  12321
   121
    1
>PS D:\Sigma 3.0\assignment\Day 16> java PalindromPattern.java
2
 1
121
 1
>PS D:\Sigma 3.0\assignment\Day 16> java PalindromPattern.java
6
     1
    121
   12321
  1234321
 123454321
12345654321
 123454321
  1234321
   12321
    121
     1
*/
