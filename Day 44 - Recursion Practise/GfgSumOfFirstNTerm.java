//Sum of first n terms
class Solution {
    public static long sum;
    long sumOfSeries(long n) {
        // code here
        if(n==1){
            return (long)Math.pow(n,3);
        }
        
        return (long)Math.pow(n,3)+sumOfSeries(n-1);
    }
}
