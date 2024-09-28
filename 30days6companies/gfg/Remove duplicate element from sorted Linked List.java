class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head) {
    Node current = head;
    while (current != null && current.next != null) {
        if (current.data == current.next.data) {
            // Skip the next duplicate node
            current.next = current.next.next;
        } else {
            // Move to the next non-duplicate node
            current = current.next;
        }
    }
    return head;
}
}
