class Solution {
    void rearrange(int arr[], int n) {
        // code here
        

          
        Stack<Integer> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();
        
        for(int i=n-1; i>=0; i--){
            if(arr[i]<0)stk1.push(arr[i]);
            else stk2.push(arr[i]);
        }
        
        int i=0;
        
        while(!stk1.isEmpty() || !stk2.isEmpty()){
            if(i%2==0 && !stk2.isEmpty()) arr[i] = stk2.pop();
            else if(i%2==1 && !stk1.isEmpty()) arr[i] = stk1.pop();
            else if(!stk1.isEmpty()) arr[i]=stk1.pop();
            else if (!stk2.isEmpty()) arr[i]=stk2.pop();
            i++;
        }
    }
}