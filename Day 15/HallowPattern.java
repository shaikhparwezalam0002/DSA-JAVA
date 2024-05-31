import java.util.Scanner;

public class HallowPattern{
    public static void hallowPattern(int rows,int cols){
            for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                if(i==1 || j==1 ||i==rows ||j==cols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Total rows:");
        int rows=sc.nextInt();
        System.out.println("Total cols:");
        int cols=sc.nextInt();
        HallowPattern.hallowPattern(rows, cols);
    }
}