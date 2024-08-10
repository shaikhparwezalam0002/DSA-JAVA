//Longest Sub-Array with Sum K

class Solution{
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        int n = A.length; // size of the array.

        Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;
        for (int i = 0; i < N; i++) {
            //calculate the prefix sum till index i:
            sum += A[i];
            if (sum == K) {
                maxLen = Math.max(maxLen, i + 1);
            }

            long rem = sum - K;

            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }
    
    
}
