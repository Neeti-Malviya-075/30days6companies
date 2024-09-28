class Solution {
    public boolean increasingTriplet(int[] nums) {
        int l=Integer.MAX_VALUE;
        int m=Integer.MAX_VALUE;

        for(int big : nums){
            if(big<=l){
                l=big;
            }
            else if(big<=m){
                m=big;
            }
            else{
                return true;
            }
            
        }
        return false;
    }
}