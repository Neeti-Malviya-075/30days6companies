public static Node reverseDLL(Node head) {
    Node current = head;
    Node prev = null;

    while (current != null) {
        Node next = current.next;
        current.next = prev;
        current.prev = next;
        prev = current;
        current = next;
    }

    // Update the head pointer
    head = prev;
    return head;
}
