class Solution {
    public int maxProfit(int[] prices) {
       int n=prices.length;
       int[] rightMax=new int[n];
       rightMax[n-1]=0;
       int i=n-1;
       int j=n-2;
       int max=0;
       while(i>=0 && j>=0){
            max=Math.max(prices[i],max);
            rightMax[j]=max;
            j--;
            i--;
       }
       max=0;
       for(int x=0;x<n;x++){
        max=Math.max(max,rightMax[x]-prices[x]);
       }
       return max;
    }
}
