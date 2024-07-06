
//Second Largest -- gfg

class Solution {
    public int print2largest(List<Integer> arr) {
        // Code Here
        if(arr.size()<=1){
            return -1;
        }
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.size();i++){
            if(max<arr.get(i)){
                secMax=max;
                max=arr.get(i);
            }
            else if(arr.get(i)>secMax && max !=arr.get(i) ){
                secMax=arr.get(i);
            }
        }
        return (secMax==Integer.MIN_VALUE)?-1 : secMax;
        
    }
}
