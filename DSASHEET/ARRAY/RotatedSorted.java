//33. Search in Rotated Sorted Array on leetcode
class RotatedSorted {
    public int search(int[] nums, int target) {
        //Arrays.sort(nums);
        int result=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                result=i;
                break;
            }
        }
        return result;
    }
}
