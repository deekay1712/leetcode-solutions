class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = 1000000;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canDivide(nums, threshold, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean canDivide(int[] nums, int threshold, int divisor) {
        int sum = 0;
        for (int num : nums) {
            sum += (int)Math.ceil((double)num / divisor);
        }
        return sum <= threshold;
    }
}

