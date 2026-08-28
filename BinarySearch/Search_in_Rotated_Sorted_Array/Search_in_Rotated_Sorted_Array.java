class Solution {
    public int search(int[] nums, int target) {
        int r=nums.length-1;
        int l=0;
        while(l<=r){
            int m=l+(r-l)/2;
            if (target == nums[m]){
                return m;
            }
            // if iam in the left
            if(nums[m]>=nums[l]){
                if (target>nums[m]|| target<nums[l]){
                    l=m+1;
                }else{
                    r=m-1;
                }
            
            // else in the right half
            }else{
                if (target<nums[m]|| target>nums[r]){
                    r=m-1;
                }else{
                    l=m+1;
                }


            }
        }
        return -1;
        
    }
}
