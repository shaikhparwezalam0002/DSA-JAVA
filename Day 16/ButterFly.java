
import java.util.Scanner;

public class ButterFly{
    public static void printButterFly(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=n-1;i>=1;i--){
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        printButterFly(line);
    }
}

/*
PS D:\Sigma 3.0\assignment\Day 16> java ButterFly.java
4
*      *
**    **
***  ***
********
***  ***
**    **
*      *
PS D:\Sigma 3.0\assignment\Day 16> java ButterFly.java
6
*          *
**        **
***      ***
****    ****
*****  *****
************
*****  *****
****    ****
***      ***
**        **
*          *
*/
