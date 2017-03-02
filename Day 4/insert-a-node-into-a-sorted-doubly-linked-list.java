/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node SortedInsert(Node head, int data) {
    
    Node newNode = new Node();
    newNode.data = data;
    
    if (head == null) { 
        return newNode;
    }
    
    Node current = head;
    Node previous = null;
        
    while (current != null && data > current.data) {
        previous = current;
        current = current.next;
    }
    
    if (current == null) {
        newNode.prev = previous;
        previous.next = newNode;
        return head;
    }
    
    newNode.next = current;
    newNode.prev = current.prev;
    
    current.prev = newNode;
    
    if (current == head) 
        return newNode;
    else {
        newNode.prev.next = newNode;
    }
    
    return head;
}