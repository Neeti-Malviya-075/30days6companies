class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
        return BST( nums,0,nums.length-1);
    }
     TreeNode BST(int[] nums,int start, int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        TreeNode n=new TreeNode(nums[mid]);
        n.left= BST( nums,start,mid-1);
        n.right=BST( nums,mid+1,end);
        return n;
    }
}