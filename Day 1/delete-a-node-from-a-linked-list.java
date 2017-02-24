/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
    // Complete this method    
    Node current = new Node();
    Node previous = new Node();
    current = head;
    
    int counter = 0;
    while (counter != position) {
        previous = current;
        current = current.next;
        counter ++;
    }
    
    if (head == null)
        return head;
    else {        
        if (position == 0)
            head = head.next;
        else
            previous.next = current.next;
        return head;        
    }
}

