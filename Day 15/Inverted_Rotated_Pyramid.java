
import java.util.Scanner;

public class Inverted_Rotated_Pyramid{
    public static void invRotPy(int rows){
        int sp=rows-1;
        for(int i=1;i<=rows;i++){
            for(int k=1;k<=sp;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            sp--;
            System.out.println("");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
      //  int cols=sc.nextInt();
        Inverted_Rotated_Pyramid.invRotPy(rows);

    }
}