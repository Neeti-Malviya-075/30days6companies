class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
       int count=0;
       Map<Integer, Integer>map=new HashMap<>();
       
       for(int i=0; i<n; i++){
           int sum=k-arr[i];
           if(map.containsKey(sum)){
               count+=map.get(sum);
           }
           map.put(arr[i],map.getOrDefault(arr[i],0)+1);
       }
        
        return count;
    }
}
