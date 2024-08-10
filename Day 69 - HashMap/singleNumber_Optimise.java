class Solution {
    public int singleNumber(int[] nums) {
        //optimise solution
        int res=0;
        for(int i : nums){
            res=i ^ res;
        }
        return res;
    }
}
