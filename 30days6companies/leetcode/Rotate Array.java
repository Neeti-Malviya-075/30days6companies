class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        if(k<0){
            k=k+nums.length;
        }
        
        reverseArray(nums,0, nums.length-1);
        reverseArray(nums, 0, k-1);
        reverseArray(nums,k, nums.length-1);
        
    }
    public void reverseArray(int[] a, int start, int end){
        while(start<end){
        int temp=a[start];
        a[start]=a[end];
        a[end]=temp;
        start++;
        end--;
        }
    }
}