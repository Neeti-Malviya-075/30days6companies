class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         Node temp=head;
         int count=1;
         while(temp.next!=null){
             count++;
             temp=temp.next;
         }
        
        int d=get((count/2)+1, head);
        return d;
         
    }
    int get(int n, Node head){
         Node t=head;
        for(int i=1; i<n; i++){
           t=t.next;
        }
        return t.data;
    }
}