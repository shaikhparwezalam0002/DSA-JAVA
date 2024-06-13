//Arrays--Chocolate Distribution Problem
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        long min=Long.MAX_VALUE;
        for (int i = 0; i+m-1 < a.size(); i++) {
           long diff= a.get(i+m-1)- a.get(i);
           min=Math.min(min,diff);
        }
        return min;
    }
}
