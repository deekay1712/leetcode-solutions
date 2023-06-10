class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        permute(nums, 0, res, new ArrayList<Integer>());
        return res;
    }

    public void permute(int[] nums, int start, List<List<Integer>> res, List<Integer> tempList) {
        res.add(new ArrayList<>(tempList));

        for(int i=start; i<nums.length; i++){
            if(i>start && nums[i]==nums[i-1])
                continue;

            tempList.add(nums[i]);
            permute(nums, i+1, res, tempList);
            tempList.remove(tempList.size()-1);
        }
    }
}


