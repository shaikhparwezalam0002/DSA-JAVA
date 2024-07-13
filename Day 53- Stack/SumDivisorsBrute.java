class Solution{
    static long sumOfDivisors(int n){
        // code here
        long sum=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    sum=sum+j;
                }
            }
        }
        return sum;
    }
}
