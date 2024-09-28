class Solution {
    int[] sumClosest(int[] arr, int x) {
        // code here 
        int i=0;
        int j=arr.length-1;
        int n=arr.length;
        int[] res=new int[2];
        res[0]=arr[0];
        res[1]=arr[1];
        int prevSum=arr[0]+arr[1];
        while(i<j){
        int sum=arr[i]+arr[j];
        int a=Math.abs(x-sum);
        int b=Math.abs(x-prevSum);
            if(a<b){
                 prevSum=sum;
                
                 res[0]=arr[i];
                 res[1]=arr[j];
            }
            if(sum<x){
                i++;
            }else{
                j--;
            }
               
        }
        return res;
    }
}