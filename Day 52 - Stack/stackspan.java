//gfg
import java.util.Stack;

public class StockSpan{
    public static void stockSpan(int []stock){
        Stack<Integer> stack=new Stack<>();
        int[] span=new int[stock.length];
        span[0]=1; //
        stack.push(0);//index 
        int j=1;
        for(int i=1;i<stock.length;i++){
            int curr=stock[i];
            //int prevHigh=stack.peek();
            while( !stack.isEmpty() && stock[stack.peek()]<=curr ){
                stack.pop();
            }
            if(stack.isEmpty()==true){
                span[j]=i+1;
            }
            else{
                span[j]=i-stack.peek();
            }
            j++;
            stack.push(i);
        }

        for(int i : span){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={100,80,60,70,60,85,100};
        stockSpan(arr);
    }
}
