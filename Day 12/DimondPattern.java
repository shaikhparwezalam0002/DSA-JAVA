
import java.util.Scanner;

public class DimondPattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sp=n-1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=sp;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
            sp--;
        }
        sp=1;
        for(int i=n-1;i>=1;i--){
            //for space
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            //for star
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println("");
            sp++;
        }
    }
}
