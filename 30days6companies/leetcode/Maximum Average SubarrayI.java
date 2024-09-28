class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int ans=0;
        for(int i=0; i<k; i++){
            ans+=nums[i];
        }
        int maxAns=ans;
        for(int i=k; i<nums.length;i++){
            ans+=nums[i]-nums[i-k];
            maxAns=Math.max(maxAns,ans);
        }
       
            
        
        return (double)maxAns/k;
    }
}