class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c=0;
        int l=flowerbed.length;
        for(int i=0; i<l; i++){
            if(flowerbed[i]==0 && (i==0 ||flowerbed[i-1]==0)&&(i==l-1 || flowerbed[i+1]==0)){
                flowerbed[i]=1;
                c++;
            }
        }
        return c>=n;
    }
}