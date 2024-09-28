class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        int indx=Integer.MAX_VALUE;
        HashSet<Integer> set=new HashSet<>();
        
        for(int i=n-1; i>=0; i--){
            if(set.contains(arr[i])){
               if(indx>i){
                  indx=i;
                }
            }
            else{
                set.add(arr[i]);
            }
        }
        if(indx==Integer.MAX_VALUE){
            return -1;
         }
        
        return indx+1;
    }
}
