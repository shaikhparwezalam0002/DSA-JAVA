class Solution {
    public int largestRectangleArea(int[] hist) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < hist.length; i++) {
            int count = 0;
            int left = i;
            int right = i;
            while (left >= 0) {
                if (left == i) {
                    left--;
                    continue;
                } else if (hist[left] < hist[i]) {
                    break;
                }
                count++;
                left--;
            }
            while (right < hist.length) {
                if (i == right) {
                    right++;
                    continue;
                } else if (hist[right] < hist[i]) {
                    break;
                }
                count++;
                right++;
            }
            int cal = (hist[i] * (count + 1));
            max = Math.max(cal, max);
        }
        return max;
    }
}
