class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    
    	Node t=head;
    	int count=1;
    	while(t.next!=null){
    	    count++;
    	    t=t.next;
    	}
    	n=count-n;
        t=head;
        if(n<0)return -1;
        while(n!=0){
            head=head.next;
            n--;
        }
        return head.data;
    
    
    
    }
}