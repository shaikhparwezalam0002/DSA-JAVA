
import java.util.Scanner;

public class Star_printing{
    public static void printingStars(int n){
        int sp=n-1;
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" "+"*");
            }
            System.out.println("");
            sp--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        printingStars(line);
    }
}