class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
     
        
       int []temp=new int[n];
       int j=0;
       
       for(int i=0; i<n; i++){
           if(arr[i]>=0){
               temp[j]=arr[i];
               j++;
           }
       }
      
        for(int k=0; k<n; k++){
            if(arr[k]<0){
                temp[j]=arr[k];
                j++;
            }
        }
         System.arraycopy(temp, 0, arr, 0, n);
        }
     }