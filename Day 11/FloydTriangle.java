
import java.util.Scanner;

public class FloydTriangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        int no=1;
        for(int i=1;i<=line;i++){
            for(int j=1;j<=i;j++){
                System.out.print(no+" ");
                no++;
            }
            System.out.println();
            
        }
    }
}