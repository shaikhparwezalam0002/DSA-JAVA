//136. Single Number - Leetcode - BruteForce
class Solution {
    public int singleNumber(int[] nums) {
        //Arrays.sort(nums);
        int count=0;
        int s=0;
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j] && i!=j){
                    count++;
                }
            }
            if(count==0){
                s=nums[i];
            }
        }
        return s;
        
    }
}
