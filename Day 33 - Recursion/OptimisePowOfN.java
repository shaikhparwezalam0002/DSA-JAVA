public class OptimisePowOfN{
    public static int p=1;
    public static int pow(int x,int n){
        
        if(n==0){
            return 1;
        }
        p=pow(x,n/2)* pow(x, (n/2));
        if(n%2!=0){
            p=p*x;
        }
        return p;
    }
    public static void main(String[] args) {
        System.out.println(pow(2,10));
    }
}