//2220. Minimum Bit Flips to Convert Number
class MinimumBitFlips {
    public int minBitFlips(int start, int goal) {
        int res=start ^ goal;
        int count=0;
        while(res>0){
            res=res & (res-1);  
            count++;
        }
        return count;
    }
}
