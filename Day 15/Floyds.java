import java.util.Scanner;
public class Floyds{
    public static void floyds(int rows){
        int c=1;
        for(int i=1;i<=rows;i++){
            for(int col=1;col<=i;col++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        floyds(line);
    }
}