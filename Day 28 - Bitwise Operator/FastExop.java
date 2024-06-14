public class FastExop{
    public static int calculateExpo(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)==1){
                ans=ans*a;
            }
            a*=a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(calculateExpo(3, 5));
    }
}