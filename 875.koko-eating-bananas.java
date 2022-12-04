class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 1000000000;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canFinish(piles, h, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private boolean canFinish(int[] piles, int h, int k) {
        int time = 0;
        for (int pile : piles) {
            time += (pile - 1) / k + 1;
        }
        return time <= h;
    }
}