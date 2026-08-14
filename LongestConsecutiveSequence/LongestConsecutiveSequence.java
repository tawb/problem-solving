class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> nset=new HashSet<>();
        for (int num:nums){
            nset.add(num);
        }
        int longest=0;
        for(int num:nset){
            if(!nset.contains(num-1)){
                int len=0;
                while(nset.contains(num+len)){
                    len++;
                }
                longest=Math.max(longest,len);
            }
        }
        return longest;
    }
}
