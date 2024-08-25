class Solution {

    // Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Long> arr, int k) {
        for(int i=0;i<arr.size();i+=k){
            int left=i;
            int right=Math.min(i+k-1,arr.size()-1);
            
            while(left<right){
                long temp=arr.get(left);
                arr.set(left,arr.get(right));
                arr.set(right,temp);
                left++;
                right--;
            }
        }
        return ;
    }
    
}
