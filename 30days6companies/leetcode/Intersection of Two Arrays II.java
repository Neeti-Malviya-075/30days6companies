class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer>arr=new ArrayList<Integer>();
        int j=0, i=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                arr.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                i++;
            }
        
        }
        int []ans=new int[arr.size()];
        int k=0;
        while(k<arr.size()){
            ans[k]=arr.get(k);
            k++;
        }
         return ans;
    }   
}