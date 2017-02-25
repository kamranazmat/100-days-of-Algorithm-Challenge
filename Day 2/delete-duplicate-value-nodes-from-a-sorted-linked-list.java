/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
    // This is a "method-only" submission. 
    // You only need to complete this method. 
    if (head == null) {
        return head;
    }
    else {
        Node current = new Node();
        Node Next = new Node();
        current = head;
        Next = current.next;
        while (Next != null) {
            if (current.data == Next.data) {
                current.next = Next.next;
                Next = current.next;
            }
            else {
                current = Next;
                Next = Next.next;
            }
        }
        return head;
    }
}
