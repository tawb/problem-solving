class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> num = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            num.put(nums[i], i); }
        for (int i = 0; i < nums.length; i++) {
            int diff=target - nums[i];
            if (num.containsKey(diff) && num.get(diff) !=i) {
                int[] result ={i, num.get(diff)};
                return result;
            }
        }
        return new int[0];
    }
}

