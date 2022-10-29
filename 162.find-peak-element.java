class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0, high = nums.length - 1;

        while(low < high){
            int mid = (low + high) / 2;
            if(mid == 0 ){
                return nums[mid] > nums[mid + 1]? mid : mid + 1;
            }else if(mid == nums.length - 1 && nums[mid] > nums[mid - 1]){
                return mid;
            }else if(nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]){
                return mid;
            }else if(nums[mid] < nums[mid - 1]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return low;
    }
}