//485. Max Consecutive Ones - Leetcode
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
            }
            else{
                max=Math.max(max,c);
                c=0;
            }
        }
        max=Math.max(c,max);
        return max;
    }
}
