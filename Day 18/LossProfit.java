
import java.util.Scanner;

public class LossProfit{
    static public void profitCheck(int cp,int sp){
        System.out.println((cp<sp)?(sp-cp)+" profit": (cp-sp)+" loss");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sp=sc.nextInt();
        int cp=sc.nextInt();
        LossProfit.profitCheck(cp,sp);
    }
}