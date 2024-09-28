class Solution {
 
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
       
        Arrays.sort(nums);

        for(int i=0; i<nums.length-3; i++){
            for(int j=i+1; j<nums.length-2; j++){
                long res=nums[i]+nums[j];
                long remaining=target-res;

                int k=j+1;
                int l=nums.length-1;
                
                
                while(k<l){
                long sum=nums[k]+nums[l];
                if(sum==remaining){
                    ArrayList<Integer>temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    temp.add(nums[l]);
                    if(!ans.contains(temp))ans.add(temp);
                   
                    k++;
                    l--;
                }else if(sum<remaining)k++;
                else if(sum>remaining) l--;
                }
            }
        }
        
        return ans;
    }
}