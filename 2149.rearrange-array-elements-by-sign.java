class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int posIndex=0, negIndex=1;
        int[] res = new int[n];

        for(int x: nums){
            if(x > 0){
                res[posIndex] = x;
                posIndex+=2;
            }
            else{
                res[negIndex] = x;
                negIndex+=2;
            }
        }

        return res;
    }
}
