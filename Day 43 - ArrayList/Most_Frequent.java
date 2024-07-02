//2190. Most Frequent Number Following Key In an Array
class Solution {
    public int mostFrequent(int[] nums, int key) {
        //int max=Integer.MIN_VALUE;
        int idx=0,max_frq=0;
        int[] freq =new int[1001];
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1 && key==nums[i]){
                freq[nums[i+1]]++;
            }
        }
        for(int i=0;i<freq.length;i++){
           max_frq=Math.max(max_frq,freq[i]);
           if(max_frq==freq[i]){
            idx=i;
           }
        }
        return idx;
    }
}
