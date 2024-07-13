//Sum of all divisors from 1 to n-gfg

class Solution{
    static long sumOfDivisors(int n){
        // code here
        long sum=0;
        int prefix=0;
        for(int i=1;i<=n;i++){
            sum+= (i*(n/i));
        }
        return sum;
    }
}
