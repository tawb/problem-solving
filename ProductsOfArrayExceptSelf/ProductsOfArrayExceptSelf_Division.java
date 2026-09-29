class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro=1;
        int zeroCount=0;
        int len = nums.length;
        for (int num:nums){
            if(num!=0){
                pro*=num;
            }
            else{
                zeroCount+=1;
            }

        }
        if (zeroCount>1){
            return new int [len];
        }

        int [] res=new int[len];
        for (int i=0;i<len;i++){
            if(zeroCount>0){
                if (nums[i]==0){
                     res[i]=pro;
            }else{
                res[i]=0;
            }

            }else{
                res[i]=pro/nums[i];
            }
           
        }
    return res;
        
    }
}  
