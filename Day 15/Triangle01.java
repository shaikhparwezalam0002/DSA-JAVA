
import java.util.Scanner;

public class Triangle01{
    public static void printTriangle(int rows){
        int flag=1;
        for(int i=1;i<=rows;i++){
            flag=(i%2==0)?0:1;
            for(int j=1;j<=i;j++){
                System.out.print(flag);      
                flag=1-flag;    
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        printTriangle(line);
    }
}

/*
>PS D:\Sigma 3.0\assignment\Day 15> java Triangle01.java
5
1
01
101
0101
10101
*/
