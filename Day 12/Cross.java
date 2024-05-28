
import java.util.Scanner;

public class Cross{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        for(int i=1;i<=line;i++){
            for(int j=1;j<=line; j++){
                if(i==j || i+j==line+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

/*

PS D:\Sigma 3.0\assignment\Day 12> java cross.java
5
*   *
 * * 
  *  
 * * 
*   *
PS D:\Sigma 3.0\assignment\Day 12> java cross.java
9
*       *
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
*       *

*/
