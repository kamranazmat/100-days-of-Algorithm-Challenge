/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node MergeLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method 
    Node currentA = new Node();
    Node currentB = new Node();
    Node previousA = new Node();
    currentA = headA;
    currentB = headB;
    
    if (currentA == null) {
        return headB;
    }
    else if (currentB == null) {
        return headA;
    }
    else {
        while (currentA != null) { 
            if (currentB == null) {
                break;
            }
            else if (currentA.data >= currentB.data) {
                Node newNode = new Node();
                newNode.data = currentB.data;
                newNode.next = currentA;
                
                if (previousA.next == null)
                    headA = newNode;
                
                previousA.next = newNode;
                previousA = newNode;
                currentB = currentB.next;
            }
            else {
                previousA = currentA;
                currentA = currentA.next;            
            }
        }
        currentA = previousA;
        
        // add rest elements of list B to the end of list A
        while (currentB != null) {
            Node newNode = new Node();
            newNode.data = currentB.data;
            currentA.next = newNode;
            currentA = currentA.next;
            newNode.next = null;
            currentB = currentB.next;
        }
                
        return headA;
    }
}