class Solution
{
    //Function to remove duplicates from unsorted linked list.
   public Node removeDuplicates(Node head) {
    if (head == null || head.next == null) {
        return head; // No duplicates to remove
    }

    Set<Integer> seen = new HashSet<>();
    Node current = head;
    Node prev = null;

    while (current != null) {
        if (seen.contains(current.data)) {
            // Duplicate found, remove current node
            prev.next = current.next;
        } else {
            // Not a duplicate, add to the set
            seen.add(current.data);
            prev = current;
        }
        current = current.next;
    }

    return head;
}