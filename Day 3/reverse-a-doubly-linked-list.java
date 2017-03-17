Node Reverse(Node head) {
    Node newHead = head;
    while (head != null) {        
        Node copy = head.prev; // New copy = head;
        
        head.prev = head.next;
        head.next = copy; // head.next; 
        // Why is it not working in above commented case !!!!!
        
        newHead = head;
        head = head.prev;        
    }
    
    return newHead;
}