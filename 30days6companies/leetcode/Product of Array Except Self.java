class Solution {
    public int[] productExceptSelf(int[] nums) {
      int []ans=new int[nums.length];
      int profit=1;
      int countzero=0;

      for(int n: nums){
          if(n==0){
              countzero++;
          }
          else{
              profit*=n;
          }
      } 
      if(countzero ==0){
          for(int i=0; i<nums.length; i++)
            ans[i]=profit/nums[i];
      }
      else if(countzero ==1){
          for(int i=0; i<nums.length; i++){
              if(nums[i]==0)
                ans[i]=profit;
          }
        }
          return ans;
      }
}