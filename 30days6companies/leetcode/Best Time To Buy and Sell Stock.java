class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxprof=0;
        for(int i=1; i<prices.length; i++){
            maxprof=Math.max(maxprof,prices[i]-min);
            min=Math.min(prices[i],min);
        }
        return maxprof;
    }
}