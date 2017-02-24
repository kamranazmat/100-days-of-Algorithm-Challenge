/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/    

Node InsertNth(Node head, int data, int position) {    
    // This is a "method-only" submission. 
    // You only need to complete this method. 
    Node current = new Node();
    Node previous = new Node();
    current = head;
    
    int counter = 0;
    while (counter != position) {
        previous = current;
        current = current.next;
        counter ++;
    }
        
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = current;
    
    if (position == 0)
        head = newNode;
    else {
        previous.next = newNode;
    }
    
    return head;
}
