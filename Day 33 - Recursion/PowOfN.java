public class PowOfN{
    public static int p=1;
    public static int pow(int x,int n){
        
        if(n==0){
            return 1;
        }
        p*=x*pow(x,n-1);
        return p;
    }
    public static void main(String[] args) {
        System.out.println(pow(13,7));
    }
}