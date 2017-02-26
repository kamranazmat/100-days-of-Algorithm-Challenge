/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method.
    Node currentA = headA;
    Node currentB = headB;
    
    int ans = 0;
    
    while (currentB != null) {
        while (currentA != null) {
            if (currentA.next == currentB.next) {
                ans = currentA.next.data;
                return ans;
            }
            currentA = currentA.next;
        }
        currentB = currentB.next;
        currentA = headA;
    }
    return ans;
}
