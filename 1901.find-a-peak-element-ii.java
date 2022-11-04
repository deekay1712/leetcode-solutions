/*
 * @lc app=leetcode id=1901 lang=java
 *
 * [1901] Find a Peak Element II
 */

// @lc code=start
class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int[] res = new int[2];
        int l = 0;
        int r = m - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            int[] max = findMax(mat[mid]);
            if (mid == 0) {
                if (mat[mid][max[1]] > mat[mid + 1][max[1]]) {
                    res[0] = mid;
                    res[1] = max[1];
                    return res;
                } else {
                    l = mid + 1;
                }
            } else if (mid == m - 1) {
                if (mat[mid][max[1]] > mat[mid - 1][max[1]]) {
                    res[0] = mid;
                    res[1] = max[1];
                    return res;
                } else {
                    r = mid - 1;
                }
            } else {
                if (mat[mid][max[1]] > mat[mid - 1][max[1]] && mat[mid][max[1]] > mat[mid + 1][max[1]]) {
                    res[0] = mid;
                    res[1] = max[1];
                    return res;
                } else if (mat[mid][max[1]] < mat[mid - 1][max[1]]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        int[] max = findMax(mat[l]);
        res[0] = l;
        res[1] = max[1];
        return res;
    }

    private int[] findMax(int[] arr) {
        int[] res = new int[2];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                res[0] = max;
                res[1] = i;
            }
        }
        return res;
    }
}
// @lc code=end

