
import java.util.Scanner;

public class NumberPyramid{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sp=n-1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=sp;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println("");
            sp--;
        }
    }
}

/*
PS D:\Sigma 3.0\assignment\Day 12> java NumberPyramid.java
5
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 
PS D:\Sigma 3.0\assignment\Day 12> java NumberPyramid.java
9
        1 
       2 2 
      3 3 3
     4 4 4 4
    5 5 5 5 5
   6 6 6 6 6 6
  7 7 7 7 7 7 7
 8 8 8 8 8 8 8 8
9 9 9 9 9 9 9 9 9
*/
