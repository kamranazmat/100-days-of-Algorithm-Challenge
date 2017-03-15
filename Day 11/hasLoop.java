boolean hasCycle(Node head) {
    if(head == null)
        return false;
    
    Node Slow = head;
    Node Fast = head.next.next;
    while (Fast != null && Slow != Fast) {
        Slow = Slow.next;
        Fast = Fast.next.next;
    }
    if(Slow == Fast)
        return true;
    return false;
}