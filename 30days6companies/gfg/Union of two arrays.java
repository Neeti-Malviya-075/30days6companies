class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
       TreeSet<Integer> set = new TreeSet<>();
         
       
        for (int i : a)
            set.add(i);
       
        
        for (int i : b)
            set.add(i);
       
      
        ArrayList<Integer> list  = new ArrayList<>();
        
        for (int i : set)
            list.add(i);
 
        return list.size();
    }
}