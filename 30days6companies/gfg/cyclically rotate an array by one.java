class Compute {
    private void reverse(int s, int e, int[]arr){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    
    public void rotate(int arr[], int n)
    {
       int k=n-1;
        reverse(0,k-1,arr);
        reverse(k,n-1,arr);
        reverse(0,n-1,arr);
    }
}