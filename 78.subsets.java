class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> ogList = new ArrayList<List<Integer>> ();
        List<Integer> tempList = new ArrayList<Integer>();
        recur(nums, 0, ogList, tempList);
        return ogList;
    }
    
    public void recur(int[] nums, int i, ArrayList<List<Integer>> ogList, List<Integer> tempList){
        
        if(i==(nums.length)){
            ogList.add(new ArrayList<>(tempList));
            return;
        }
        tempList.add(nums[i]);
        recur(nums, i+1, ogList, tempList);
        
        tempList.remove(tempList.size()-1);
        recur(nums, i+1, ogList, tempList);
    }
}