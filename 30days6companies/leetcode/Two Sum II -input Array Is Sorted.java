class Solution {
    public int[] twoSum(int[] arr, int target) {
            int n=arr.length;
            int []ans=new int[2];
            int j=0;
            int k=n-1;
            
            while(j<k){
                int sum=arr[j]+arr[k];

                if(sum==target){
                   ans[0]=j+1;
                   ans[1]=k+1;
                   return ans;
                }

                else if(sum>target)
                    k--;
                
                
                else if(sum<target)
                   j++;
            }
            
            

        return ans;
        
    }
}