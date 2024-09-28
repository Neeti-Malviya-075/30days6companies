class Solution
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
	// Your code here
	if(head==null && x==0)return null;
	if(x==1){
	    head=head.next;
	    head.prev=null;
	    return head;
	}
	Node temp=head;
	int c=0;
	while(temp!=null && temp.next!=null && c!=x){
	     c++;
	     if(c!=x){
	    temp=temp.next;
	     }
	}
	if(temp.next==null){
	    temp.prev.next=null;
	    temp.prev=null;
	}
	else{
	    temp.prev.next=temp.next;
	    temp.next.prev=temp.prev;
	    temp=null;
	}
	
	return head;
    }
}
