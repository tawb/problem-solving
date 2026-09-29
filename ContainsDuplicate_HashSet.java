class Solution {
    public boolean hasDuplicate(int[] nums) {
        SetInteger duplicate= new HashSet();
        for (int i =0;inums.length;i++){
            if (duplicate.contains(nums[i])){
                return true;
            }
            duplicate.add(nums[i]);
        }
        return false;
        
    }
}