
import java.util.Scanner;

public class InvertedRotated{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        int sp=line-1;
        for(int i=1;i<=line;i++){
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
            sp--;
        }
    }
}