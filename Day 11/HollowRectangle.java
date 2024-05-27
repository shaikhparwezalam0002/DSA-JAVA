
import java.util.Scanner;

public class HollowRectangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        for(int i=1;i<=line;i++){
            if(i==1 || i==line){
                for(int st=1;st<=line+1;st++){
                    System.out.print("*");
                }
            }
            else{
                    for(int k=1;k<=line+1;k++){
                        if(k==1 || k==line+1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                }
            }
            System.out.println();
        }
    }
}

