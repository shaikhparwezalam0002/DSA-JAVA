//169. Majority Element - Leetcode
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int maj=nums.length/2;
        int len=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<len;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        Set<Integer> keys=map.keySet();
        int max=-1;
        int ocr=Integer.MIN_VALUE;
        for(Integer i: keys){
            if(map.get(i)>=maj && ocr<=map.get(i)){
                ocr=map.get(i);
                max=i;
            }
        }
        return max;

    }
}
