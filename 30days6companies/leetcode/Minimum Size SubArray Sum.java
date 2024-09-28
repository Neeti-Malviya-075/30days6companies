class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int minLen=Integer.MAX_VALUE;
        int i=0;
        int j=0;
        while(j<nums.length){
            sum+=nums[j];

            while(sum>=target){
                minLen=Math.min(minLen,j-i+1);
                sum-=nums[i];
                i++;
            }
         j++;
        }
        return minLen==Integer.MAX_VALUE?0:minLen; 
    }
}