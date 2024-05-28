
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