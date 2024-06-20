public class Fibonacci{
    public static int a=0,b=1,c=0;
    public static void fiboSeries(int n,int i){
        if(n<=1){
            System.out.println(0);
            return;
        }
        else if(n==2){
            System.out.println("1 2");
            return;
        }
        
        System.out.print(c+" ");
        a=b;
        b=c;
        c=a+b;
        i++;
        if(i<n){
            fiboSeries(n, i);
        }

    }
    public static void main(String[] args) {
        fiboSeries(0,0);
    }
}
