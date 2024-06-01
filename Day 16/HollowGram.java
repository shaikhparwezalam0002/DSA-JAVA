
import java.util.Scanner;

public class HollowGram{
    static public void printHollow(int n){
        int osp=n-1;
        int st=1;
        int isp=-1;
        int loop;
        if(n%2==0){
            loop=n+1;
        }
        else{
            loop=n+2;
        }
        for(int i=1;i<=loop;i++){
            for(int j=1;j<=osp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*");
            }
            if(isp>0){
                for(int j=1;j<=isp;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=st;j++){
                    System.out.print("*");
                }
            }
            System.out.println("");
            if (i<=(n%2+n/2)) {
                isp+=2;
                osp--;
            }
            else{
                isp-=2;
                osp++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printHollow(n);
    }
}