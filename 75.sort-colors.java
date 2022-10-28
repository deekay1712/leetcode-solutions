class Solution {
    public void sortColors(int[] nums) {
        int low, high, mid;
        low = 0;
        high = nums.length - 1;
        mid = 0;

        while(mid <= high){
            switch(nums[mid]){
                case 0:
                    swap(nums, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, high);
                    high--;
                    break;
            }
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}