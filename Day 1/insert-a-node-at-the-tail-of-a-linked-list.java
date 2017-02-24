/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
    // This is a "method-only" submission. 
    // You only need to complete this method.
    Node current = new Node();
    current = head;    
    while (current.next != null) {
        current = current.next;
    }
    
    Node newNode = new Node();
    
    current.next = newNode;
    newNode.data = data;
    newNode.next = null;
    
    return head;
}
