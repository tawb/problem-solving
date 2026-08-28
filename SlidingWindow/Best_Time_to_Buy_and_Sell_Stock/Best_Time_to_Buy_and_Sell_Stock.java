class Solution {
    public int maxProfit(int[] prices) {
        int r=1;
        int l=0;
        int max=0;
        while (r<prices.length){
            if (prices[l]< prices[r]){
                int p=prices[r]-prices[l];
                max=Math.max(max,p);
            }else{
                l=r;
            }
            r=r+1;
        }
        return max;
        
    }
}
