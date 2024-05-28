//Parwez Alam
import java.util.Scanner;
public class NameFirstLetter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        int p=line%2+line/2;
        for(int i=1;i<=line;i++){
            for(int j=1;j<=line;j++){
                if(i==1 || j==1  || i==p){
                    System.out.print("*");
                }
                else if(j==line && i<p){
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

