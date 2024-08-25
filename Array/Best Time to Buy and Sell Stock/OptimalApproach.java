class Solution {
    public int maxProfit(int[] prices) {
       int n=prices.length;
       int max=0;
       int sellMax=0;
       for(int i=n-1;i>=0;i--){
        sellMax=Math.max(sellMax,max-prices[i]);
        max=Math.max(prices[i],max);
       }
       return sellMax;
    }
}
