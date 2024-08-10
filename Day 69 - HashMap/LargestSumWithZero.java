//Largest subarray with 0 sum - gfg
class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            else{
                int idx=map.get(sum);
                int len=i-idx;
                max=Math.max(max,len);
            }
        }
        return (max==Integer.MIN_VALUE)?0:max;
    }
}
