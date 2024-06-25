//152. Maximum Product Subarray -- leetcode
class Solution {
    public int maxProduct(int[] arr) {
       double max=Integer.MIN_VALUE;
		int n=arr.length;
        double pre=1,post=1;
        for(int i=0;i<n;i++){

            pre=pre==0?1:pre;
            post=post == 0 ? 1 : post;

            pre*=arr[i];
            post*=arr[n-i-1];

            max=Math.max(max,Math.max(pre,post));

        }
        return (int)max;
    }
}
