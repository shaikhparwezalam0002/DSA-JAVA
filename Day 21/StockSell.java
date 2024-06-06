
import java.lang.*;
import java.util.*;

public class StockSell{
    public static void stockBuySell(int[] stock){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i =0;i<stock.length;i++){
            if(buyPrice<stock[i]){
                int profit=stock[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                buyPrice=stock[i];
            }
        }
        System.out.println(maxProfit);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int stock[]=new int[len];
        for(int i=0;i<len;i++){
            stock[i]=sc.nextInt();
        }
        stockBuySell(stock);
    }
}